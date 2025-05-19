package ssu.java.hungryStudent.model

import jakarta.persistence.*

@Entity
@Table(name = "restaurants")
data class Restaurant(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false)
    val title: String,

    @ElementCollection
    val tags: List<String> = emptyList(),

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    val positions: List<Position> = emptyList()
)