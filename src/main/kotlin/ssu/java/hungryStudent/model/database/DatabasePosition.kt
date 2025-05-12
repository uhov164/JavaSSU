package ssu.java.hungryStudent.model.database

import lombok.Data

@Data
class DatabasePosition(
    val id: Long,
    val title: String,
    val price: Double,
    val description: String = "",
)