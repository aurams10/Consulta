package Compenssar




import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.concurrent.duration._

class ConcultaCliente extends Simulation{


   val data = csv("data/data.csv").circular

    val mapRequest = Map("SecurityHeader" -> "{\"Header\":{\"SecurityHeader\":{\"User\":\"CuentaCompensar\",\"Password\":\"Pass\", \"Username\": \"CuentaCompensar\",\"Token\":\"U1ZDQ09CUkFOWkExNTcxNjYwMTAzMDg1\" },\"System\": {\"InputSystem\": \"01\", \"ApplicationID\": \"SWPR142\", \"TransactionID\": \"20190829F0001\",\"IPAddress\": \"0.0.0.0\", \"Branch\":\"0\",\"TerminalID\": \"011\"}}}")

    val httpConf= http
      .baseUrl("https://server309.compensar.com")
      .headers(mapRequest)


    val scn=scenario(scenarioName = "SmokeTest")
      .feed(data)
      .exec(http(requestName="SmokeTest").get("/Compensar/SecurityProxy/InformacionUsuario/DatosInformacion?TipoIdentificacion=${TipoIdentificacion}&NumeroIdentificacion=${NumeroIdentificacion}")
        .check(bodyString.saveAs("myresponse")))
      .exec {session =>
        val response1 = session("myresponse").as[String]
        println(response1)
        session}

  setUp(scn.inject(atOnceUsers(1))).protocols(httpConf)
    //setUp(scn.inject(constantConcurrentUsers(6)during  (1200)).protocols(httpConf)).maxDuration(1200)
    //setUp(scn.inject(constantUsersPerSec(6) during  (1200)).protocols(httpConf)).maxDuration(1200)

}
