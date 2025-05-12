package ssu.java.hungryStudent.model.mapper

import org.springframework.stereotype.Component
import ssu.java.hungryStudent.model.database.DatabasePosition
import ssu.java.hungryStudent.model.domain.Position

@Component
class PositionMapper: Mapper<DatabasePosition, Position> {
    override fun toDomain(databasePosition: DatabasePosition) = with(databasePosition) {
        Position(
            id = id,
            title = title,
            price = price,
            description = description
        )
    }

    override fun toDatabase(position: Position) = with(position) {
        DatabasePosition(
            id = id,
            title = title,
            price = price,
            description = description
        )
    }
}