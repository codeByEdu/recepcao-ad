package ad.recepcao.controller

import ad.recepcao.model.Visitante
import ad.recepcao.model.VisitanteDTO
import ad.recepcao.service.VisitanteService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class VisitanteController(
    private val criaVisitanteService: VisitanteService
) {

    @PostMapping("/visitante")
    fun addVisitante(@RequestBody body: VisitanteDTO): ResponseEntity<String> {
        return runCatching {
            criaVisitanteService.registraVisitante(body)
            ResponseEntity.ok("Visitante criado com sucesso.")
        }.getOrElse {
            ResponseEntity.unprocessableEntity().body("Erro ao criar visitante: ${it.message}")
        }
    }

    @GetMapping("/listaVisitantes")
    fun buscaVisitantes(): ResponseEntity<List<Visitante>>{

        return null
    }
}