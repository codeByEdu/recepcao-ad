package ad.recepcao.model

import java.time.LocalDate

data class VisitanteDTO(
     val nome:Array<String>,
     val isEvangelico: Boolean,
     val igreja: String,
     val dataCulto: LocalDate
){

}