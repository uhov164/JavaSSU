package ssu.java.hungryStudent.model.domain

data class Position(
    val id: Long,
    val title: String,
    val price: Double,
    val description: String = "",
)