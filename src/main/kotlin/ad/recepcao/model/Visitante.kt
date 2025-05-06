package ad.recepcao.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name="visitantes")
data class Visitante(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = 0,
    val nome: String,
    val igrejaOrigem: String?,
    val evangelico: Boolean,
    val quemConvidou: String?,
    val dataVisita: String
)