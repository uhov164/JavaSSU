package ssu.java.hungryStudent.repository

import org.springframework.stereotype.Repository
import ssu.java.hungryStudent.model.database.DatabasePosition
import ssu.java.hungryStudent.model.domain.Position

@Repository
interface PositionRepository: AbstractRepository<DatabasePosition, Position> {}