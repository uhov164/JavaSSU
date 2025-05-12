package ssu.java.hungryStudent.model
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import ssu.java.hungryStudent.model.database.DatabasePosition
import ssu.java.hungryStudent.model.domain.Position
import ssu.java.hungryStudent.model.mapper.PositionMapper

class PositionMapperTest {
    private val mapper = PositionMapper()

    @Test
    fun `toDomain maps DatabasePosition to Position correctly`() {
        val dbPosition = DatabasePosition(
            id = 1L,
            title = "Pizza",
            price = 500.0,
            description = "Cheese pizza"
        )
        val expected = Position(
            id = 1L,
            title = "Pizza",
            price = 500.0,
            description = "Cheese pizza"
        )
        val result = mapper.toDomain(dbPosition)
        assertEquals(expected, result)
    }

    @Test
    fun `toDatabase maps Position to DatabasePosition correctly`() {
        val position = Position(
            id = 2L,
            title = "Burger",
            price = 300.0,
            description = "Beef burger"
        )
        val expected = DatabasePosition(
            id = 2L,
            title = "Burger",
            price = 300.0,
            description = "Beef burger"
        )

        val result = mapper.toDatabase(position)
        assertEquals(result, expected)
    }
}
