package ad.recepcao.repository

import ad.recepcao.model.Visitante
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VisitanteRepository: JpaRepository<Visitante, Long> {
}