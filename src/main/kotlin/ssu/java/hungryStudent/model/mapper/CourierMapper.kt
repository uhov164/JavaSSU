package ssu.java.hungryStudent.model.mapper

import org.springframework.stereotype.Component
import ssu.java.hungryStudent.model.database.DatabaseCourier
import ssu.java.hungryStudent.model.domain.Courier


@Component
class CourierMapper: Mapper<DatabaseCourier, Courier> {
    override fun toDomain(database: DatabaseCourier) = with(database) {
        Courier(
            id = id,
            username = username
        )
    }

    override fun toDatabase(domain: Courier) = with(domain) {
        DatabaseCourier(
            id = id,
            username = username
        )
    }
}