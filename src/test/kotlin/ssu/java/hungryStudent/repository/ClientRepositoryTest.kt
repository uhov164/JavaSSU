package ssu.java.hungryStudent.repository

import org.assertj.core.api.Assertions.assertThat
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import ssu.java.hungryStudent.model.Client
import ssu.java.hungryStudent.model.Position
import kotlin.test.Test

@DataJpaTest
class ClientRepositoryTest @Autowired constructor(
    val clientRepository: ClientRepository,
    val positionRepository: PositionRepository
) {

    @Test
    fun `should save and retrieve client with cart`() {
        val position = positionRepository.insert(
            Position(id = 1L, title = "Burger", price = 5.99)
        )

        val client = clientRepository.insert(
            Client(
                id = 1L,
                username = "test_user",
                cart = listOf(position)
            )
        )

        val found = clientRepository.selectById(client.id)
        assertThat(found?.cart?.size == 1)
    }

    @Test
    fun `should cascade delete positions`() {
        val client = clientRepository.insert(
            Client(
                id = 2L,
                username = "temp_user",
                cart = listOf(
                    Position(id = 2L, title = "Pizza", price = 10.99)
                )
            )
        )

        clientRepository.deleteById(client.id)
        assertThat(positionRepository.findAll()).isEmpty()
    }
}
