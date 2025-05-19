package ssu.java.hungryStudent.model

import jakarta.persistence.*

@Entity
@Table(name = "couriers")
data class Courier(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false, unique = true)
    val username: String
)