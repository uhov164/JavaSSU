package ssu.java.hungryStudent.repository

import org.springframework.stereotype.Repository
import ssu.java.hungryStudent.model.Position

@Repository
interface PositionRepository: AbstractRepository<Position> {}