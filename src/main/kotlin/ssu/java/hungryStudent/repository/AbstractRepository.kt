package ssu.java.hungryStudent.repository

import java.util.*

/**
 * В рамках репозиториев я хочу ожидать, что результатом запросов я буду сразу получать Domain модели,
 * поэтому добавляю свои методы. В будущем реализую их через предоставленные от CrudRepository методами
 */
interface AbstractRepository<DatabaseModel, DomainModel> /*: CrudRepository<DatabaseModel, Long> */{
    fun selectAll(): List<DomainModel>
    fun selectAllById(id: Long): List<DomainModel>
    fun selectById(id: Long): DomainModel?

    fun insert(model: DomainModel): DomainModel
}