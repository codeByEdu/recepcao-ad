package ad.recepcao.repository

import ad.recepcao.model.Visitante

class VisitanteDAO(private val visitanteRepository: VisitanteRepository) {

    fun registraVisitante(visitante: Visitante){
        visitanteRepository.save<Visitante>(visitante)
    }

    fun listaTodosVisitantes(): List<Visitante?> {
        return visitanteRepository.findAll()
    }
}