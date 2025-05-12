package ssu.java.hungryStudent.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import ssu.java.hungryStudent.model.database.DatabaseCourier
import ssu.java.hungryStudent.model.domain.Courier
import ssu.java.hungryStudent.model.mapper.CourierMapper

class CourierMapperTest {
    private val mapper = CourierMapper()

    @Test
    fun `toDomain maps DatabaseCourier to Courier correctly`() {
        val dbCourier = DatabaseCourier(id = 1L, username = "courier1")
        val expected = Courier(id = 1L, username = "courier1")
        val result = mapper.toDomain(dbCourier)
        assertEquals(expected, result)
    }

    @Test
    fun `toDatabase maps Courier to DatabaseCourier correctly`() {
        val courier = Courier(id = 2L, username = "courier2")
        val expected = DatabaseCourier(id = 2L, username = "courier2")
        val result = mapper.toDatabase(courier)
        assertEquals(expected, result)
    }
}

