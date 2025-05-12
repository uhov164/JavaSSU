package ssu.java.hungryStudent.repository

import org.springframework.stereotype.Repository
import ssu.java.hungryStudent.model.database.DatabaseClient
import ssu.java.hungryStudent.model.domain.Client

@Repository
interface ClientRepository : AbstractRepository<DatabaseClient, Client>