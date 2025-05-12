package ssu.java.hungryStudent.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever
import ssu.java.hungryStudent.model.database.DatabaseClient
import ssu.java.hungryStudent.model.database.DatabaseCourier
import ssu.java.hungryStudent.model.database.DatabaseOrder
import ssu.java.hungryStudent.model.database.DatabasePosition
import ssu.java.hungryStudent.model.domain.Order
import ssu.java.hungryStudent.model.domain.Client
import ssu.java.hungryStudent.model.domain.Position
import ssu.java.hungryStudent.model.domain.Courier
import ssu.java.hungryStudent.model.mapper.ClientMapper
import ssu.java.hungryStudent.model.mapper.CourierMapper
import ssu.java.hungryStudent.model.mapper.OrderMapper
import ssu.java.hungryStudent.model.mapper.PositionMapper

//class OrderMapperTest {
//    private val positionMapper: PositionMapper = mock()
//    private val clientMapper: ClientMapper = mock()
//    private val courierMapper: CourierMapper = mock()
//    private val mapper = OrderMapper(positionMapper, clientMapper, courierMapper)
//
//    @Test
//    fun `toDomain maps DatabaseOrder to Order correctly`() {
//        val dbClient = mock<DatabaseClient>()
//        val client = mock<Client>()
//        whenever(clientMapper.toDomain(dbClient)).thenReturn(client)
//
//        val dbPosition = mock<DatabasePosition>()
//        val position = mock<Position>()
//        whenever(positionMapper.toDomain(dbPosition)).thenReturn(position)
//
//        val dbCourier = mock<DatabaseCourier>()
//        val courier = mock<Courier>()
//        whenever(courierMapper.toDomain(dbCourier)).thenReturn(courier)
//
//        val dbOrder = DatabaseOrder(
//            id = 1L,
//            client = dbClient,
//            positions = listOf(dbPosition),
//            courier = dbCourier
//        )
//        val expected = Order(
//            id = 1L,
//            client = client,
//            positions = listOf(position),
//            courier = courier
//        )
//        val result = mapper.toDomain(dbOrder)
//        assertEquals(expected, result)
//    }
//
//    @Test
//    fun `toDatabase maps Order to DatabaseOrder correctly`() {
//        val client = mock<Client>()
//        val dbClient = mock<DatabaseClient>()
//        whenever(clientMapper.toDatabase(client)).thenReturn(dbClient)
//
//        val position = mock<Position>()
//        val dbPosition = mock<DatabasePosition>()
//        whenever(positionMapper.toDatabase(position)).thenReturn(dbPosition)
//
//        val courier = mock<Courier>()
//        val dbCourier = mock<DatabaseCourier>()
//        whenever(courierMapper.toDatabase(courier)).thenReturn(dbCourier)
//
//        val order = Order(
//            id = 2L,
//            client = client,
//            positions = listOf(position),
//            courier = courier
//        )
//        val expected = DatabaseOrder(
//            id = 2L,
//            client = dbClient,
//            positions = listOf(dbPosition),
//            courier = dbCourier
//        )
//        val result = mapper.toDatabase(order)
//        assertEquals(expected, result)
//    }
//}
//
