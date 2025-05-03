package ad.recepcao.service

import ad.recepcao.model.VisitanteDTO
import ad.recepcao.repository.VisitanteRepository
import org.springframework.stereotype.Service

@Service
class CriaVisitanteService(
    private val visitanteRepository: VisitanteRepository
) {
    fun registraVisitante(visitante: VisitanteDTO){
        visitanteRepository.registraVisitante(visitante)
    }

}