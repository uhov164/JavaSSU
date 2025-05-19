package ssu.java.hungryStudent.model

import jakarta.persistence.*

@Entity
@Table(name = "clients")
data class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false, unique = true)
    val username: String,

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    val cart: List<Position> = emptyList()
)