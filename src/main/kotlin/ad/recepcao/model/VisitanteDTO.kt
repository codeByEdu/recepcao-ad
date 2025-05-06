package ad.recepcao.model

import java.time.LocalDate

data class VisitanteDTO(
     val nome:String,
     val isEvangelico: Boolean,
     val igreja: String,
     val dataCulto: LocalDate,
     val quemConvidou: String
)