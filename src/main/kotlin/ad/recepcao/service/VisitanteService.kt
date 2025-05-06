package ad.recepcao.service

import ad.recepcao.model.Visitante
import ad.recepcao.model.VisitanteDTO
import ad.recepcao.repository.VisitanteDAO
import org.springframework.stereotype.Service

@Service
class VisitanteService (
    private val visitanteDAO: VisitanteDAO
) {
    fun registraVisitante(visitante: VisitanteDTO){
        val visitante:Visitante =  DTOtoEntity(visitante)
        visitanteDAO.registraVisitante(visitante)
    }

    private  fun DTOtoEntity(visitanteDTO: VisitanteDTO): Visitante {
        return Visitante(null , visitanteDTO.nome,visitanteDTO.igreja,visitanteDTO.isEvangelico,
            visitanteDTO.quemConvidou, visitanteDTO.dataCulto.toString())
        }
}