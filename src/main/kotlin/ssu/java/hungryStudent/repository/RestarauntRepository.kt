package ssu.java.hungryStudent.repository

import org.springframework.stereotype.Repository
import ssu.java.hungryStudent.model.Restaurant

@Repository
interface RestarauntRepository : AbstractRepository<Restaurant> {
    fun findAllByTitleAndTags(title: String, tags: List<String>): List<Restaurant>
}