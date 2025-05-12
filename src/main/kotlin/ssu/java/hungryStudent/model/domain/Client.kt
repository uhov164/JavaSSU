package ssu.java.hungryStudent.model.domain

data class Client(
    val id: Long,
    val username: String,
    val cart: List<Position> = emptyList()
)