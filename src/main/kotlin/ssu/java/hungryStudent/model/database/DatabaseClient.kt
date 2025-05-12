package ssu.java.hungryStudent.model.database

import lombok.Data

@Data
class DatabaseClient(
    val id: Long,
    val username: String,
    val cart: List<DatabasePosition>
)
