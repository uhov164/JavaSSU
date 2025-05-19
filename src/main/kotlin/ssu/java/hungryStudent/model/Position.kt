package ssu.java.hungryStudent.model

import jakarta.persistence.*


@Entity
@Table(name = "positions")
data class Position(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val price: Double,

    @Column(columnDefinition = "TEXT")
    val description: String = ""
)