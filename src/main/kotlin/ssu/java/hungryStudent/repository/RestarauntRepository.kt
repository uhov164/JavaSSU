package ssu.java.hungryStudent.repository

import org.springframework.stereotype.Repository
import ssu.java.hungryStudent.model.database.DatabaseRestaraunt
import ssu.java.hungryStudent.model.domain.Restaraunt

@Repository
interface RestarauntRepository : AbstractRepository<DatabaseRestaraunt, Restaraunt> {
    fun findAllByTitleAndTags(title: String, tags: List<String>): List<Restaraunt>
}