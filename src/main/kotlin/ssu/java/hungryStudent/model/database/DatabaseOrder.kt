package ssu.java.hungryStudent.model.database

import lombok.Data

@Data
class DatabaseOrder(
    val id: Long,
    val client: DatabaseClient,
    val courier: DatabaseCourier?,
    val positions: List<DatabasePosition>,
)