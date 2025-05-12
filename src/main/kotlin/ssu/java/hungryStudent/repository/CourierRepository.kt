package ssu.java.hungryStudent.repository

import org.springframework.stereotype.Repository
import ssu.java.hungryStudent.model.database.DatabaseCourier
import ssu.java.hungryStudent.model.domain.Courier

@Repository
interface CourierRepository: AbstractRepository<DatabaseCourier, Courier>