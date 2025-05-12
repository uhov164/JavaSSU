package ssu.java.hungryStudent.model.domain

data class Restaraunt(
    val id: Long,
    val title: String,
    val tags: List<String> = emptyList(),
    val positions: List<Position> = emptyList()
)
