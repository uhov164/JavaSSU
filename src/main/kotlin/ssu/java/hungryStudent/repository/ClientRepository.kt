package ssu.java.hungryStudent.repository

import org.springframework.stereotype.Repository
import ssu.java.hungryStudent.model.Client

@Repository
interface ClientRepository : AbstractRepository<Client>