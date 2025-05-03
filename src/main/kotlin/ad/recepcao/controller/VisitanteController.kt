package ad.recepcao.controller

import ad.recepcao.model.VisitanteDTO
import ad.recepcao.service.CriaVisitanteService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class VisitanteController(
    private val criaVisitanteService: CriaVisitanteService
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
}