package ssu.java.hungryStudent.repository

import org.springframework.data.repository.CrudRepository
import java.util.*

/**
 * В рамках репозиториев я хочу ожидать, что результатом запросов я буду сразу получать Domain модели,
 * поэтому добавляю свои методы. В будущем реализую их через предоставленные от CrudRepository методами
 */
interface AbstractRepository<DomainModel> : CrudRepository<DomainModel, Long> {
    fun selectAll(): List<DomainModel>
    fun selectAllById(id: Long): List<DomainModel>
    fun selectById(id: Long): DomainModel?

    fun insert(model: DomainModel): DomainModel
}