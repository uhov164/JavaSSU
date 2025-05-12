package ssu.java.hungryStudent.model.mapper

interface Mapper<Database, Domain> {
    // Сделать из домейн модельки в database всегда можно,
    // наоборот - нет (нет нужного объекта по айдишнику)
    fun toDomain(database: Database): Domain?
    fun toDatabase(domain: Domain): Database
}