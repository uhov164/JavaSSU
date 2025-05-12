package ssu.java.hungryStudent.model


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`
import org.mockito.kotlin.whenever
import ssu.java.hungryStudent.model.database.DatabaseClient
import ssu.java.hungryStudent.model.database.DatabasePosition
import ssu.java.hungryStudent.model.domain.Client
import ssu.java.hungryStudent.model.domain.Position
import ssu.java.hungryStudent.model.mapper.ClientMapper
import ssu.java.hungryStudent.model.mapper.PositionMapper

//class ClientMapperTest {
//    private val positionMapper = PositionMapper()
//    private val mapper = ClientMapper(positionMapper)
//
//    @Test
//    fun `toDomain maps DatabaseClient to Client correctly`() {
//        val dbPosition = mock<DatabasePosition>()
//        val position = Position(1L, "Pizza", 500.0, "Cheese pizza")
//        whenever(positionMapper.toDomain(dbPosition)).thenReturn(position)
//
//        val dbClient = DatabaseClient(
//            id = 1L,
//            username = "client1",
//            cart = listOf(dbPosition)
//        )
//        val expected = Client(
//            id = 1L,
//            username = "client1",
//            cart = listOf(position)
//        )
//        val result = mapper.toDomain(dbClient)
//        assertEquals(expected, result)
//    }
//
//    @Test
//    fun `toDatabase maps Client to DatabaseClient correctly`() {
//        val position = Position(1L, "Pizza", 500.0, "Cheese pizza")
//        val dbPosition = mock<DatabasePosition>()
//        whenever(positionMapper.toDatabase(position)).thenReturn(dbPosition)
//
//        val client = Client(
//            id = 2L,
//            username = "client2",
//            cart = listOf(position)
//        )
//        val expected = DatabaseClient(
//            id = 2L,
//            username = "client2",
//            cart = listOf(dbPosition)
//        )
//        val result = mapper.toDatabase(client)
//        assertEquals(expected, result)
//    }
//}
