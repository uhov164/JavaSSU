package ssu.java.hungryStudent.model

import jakarta.persistence.*

@Entity
@Table(name = "orders")
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    val client: Client,

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    val positions: List<Position>,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courier_id")
    val courier: Courier? = null,

    val isReady: Boolean = false
)