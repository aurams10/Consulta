package Compenssar

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.concurrent.duration._

class ConcultaCliente extends Simulation{


   val data = csv("data/data.csv").circular

  val mapRequest = Map("SecurityHeader" -> "{\"Header\":{\"SecurityHeader\":{\"User\":\"CuentaCompensar\",\"Password\":\"Pass\", \"Username\": \"CuentaCompensar\",\"Token\":\"U1ZDQ09CUkFOWkExNTcxODQ2MzAzMzc1\" },\"System\": {\"InputSystem\": \"01\", \"ApplicationID\": \"SWPR142\", \"TransactionID\": \"20190829F0001\",\"IPAddress\": \"0.0.0.0\", \"Branch\":\"0\",\"TerminalID\": \"011\"}}}")


    val httpConf= http
      .baseUrl("https://server309.compensar.com")
      .headers(mapRequest)


    val scn=scenario(scenarioName = "ConsultaClientes")
      .feed(data)
      .exec(http(requestName="ConsultaClientes").get("/Compensar/SecurityProxy/InformacionUsuario/DatosInformacion?TipoIdentificacion=${TipoIdentificacion}&NumeroIdentificacion=${NumeroIdentificacion}")
            .check(status in 200))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpConf)

  //setUp(scn.inject(constantUsersPerSec(100) during  (300)).protocols(httpConf)).maxDuration(300)
    //setUp(scn.inject(constantUsersPerSec(250) during  (1200)).protocols(httpConf)).maxDuration(1200)

    /*
    setUp(
        scn.inject(
            nothingFor(2 seconds),
            atOnceUsers(10),
            rampUsers(10) during (20 minutes),
            constantUsersPerSec(20) during (15 seconds),
            constantUsersPerSec(20) during (15 seconds) randomized,
            rampUsersPerSec(10) to 20 during (15 minutes),
            rampUsersPerSec(10) to 20 during (15 minutes) randomized,
            heavisideUsers(1000) during (60 seconds)
        ).protocols(httpConf)
    )
    */


    //setUp(scn.inject(constantConcurrentUsers(250)during  (1200)).protocols(httpConf)).maxDuration(1200)
   // setUp(scn.inject(rampConcurrentUsers(5)to (25)during(3600)).protocols(httpConf)).maxDuration(3600)
       // setUp(scn.inject(constantConcurrentUsers(5) during(10 seconds), rampConcurrentUsers(5) to (25) during(1200 seconds)))
     // .protocols(httpConf).maxDuration(100 seconds)
      //.assertions(global.successfulRequests.percent.is(100))

}
