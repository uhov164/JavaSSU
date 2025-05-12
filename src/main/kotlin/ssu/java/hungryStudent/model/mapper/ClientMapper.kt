package ssu.java.hungryStudent.model.mapper

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import ssu.java.hungryStudent.model.database.DatabaseClient
import ssu.java.hungryStudent.model.domain.Client

@Component
class ClientMapper @Autowired constructor(
    private val positionMapper: PositionMapper
): Mapper<DatabaseClient, Client> {
    override fun toDomain(databaseClient: DatabaseClient) = with(databaseClient) {
        Client(
            id = id,
            username = username,
            cart = cart.map(positionMapper::toDomain)
        )
    }

    override fun toDatabase(client: Client) = with(client) {
        DatabaseClient(
            id = id,
            username = username,
            cart = cart.map(positionMapper::toDatabase)
        )
    }
}