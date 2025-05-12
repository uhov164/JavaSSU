package ssu.java.hungryStudent.model.mapper

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import ssu.java.hungryStudent.model.database.DatabaseOrder
import ssu.java.hungryStudent.model.domain.Order
import ssu.java.hungryStudent.repository.ClientRepository

@Component
class OrderMapper @Autowired constructor(
    private val positionMapper: PositionMapper,
    private val clientMapper: ClientMapper,
    private val courierMapper: CourierMapper
): Mapper<DatabaseOrder, Order> {

    override fun toDomain(order: DatabaseOrder): Order? {
        val client = clientMapper.toDomain(order.client)

        // TODO: добавить проверку размерности (заказ не может иметь 0 позиций)
        val positions = order.positions.map(positionMapper::toDomain)

        return with(order) {
            Order(
                id = id,
                client = client,
                positions = positions,
                courier = order.courier?.let(courierMapper::toDomain)
            )
        }
    }
    override fun toDatabase(order: Order) = with(order) {
        DatabaseOrder(
            id = id,
            client = clientMapper.toDatabase(order.client),
            courier = order.courier?.let(courierMapper::toDatabase),
            positions = order.positions.map(positionMapper::toDatabase)
        )
    }
}