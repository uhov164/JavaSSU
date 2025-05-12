package ssu.java.hungryStudent.model.domain

data class Order(
    val id: Long,
    val client: Client,
    val positions: List<Position>,
    val courier: Courier? = null,
    val isReady: Boolean = false,
)
