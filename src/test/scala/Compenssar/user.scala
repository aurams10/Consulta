package Compenssar

  import io.gatling.core.Predef._
  import io.gatling.http.Predef._
 import scala.concurrent.duration._


class user extends Simulation{



    //val mapRequest = Map("X-RapidAPI-Host" -> "restcountries-v1.p.rapidapi.com", "X-RapidAPI-Key" -> "32be28d259msh884ed6959c99c47p1cedc8jsnb3c0afe1aa1d","Content-Type" -> "application/json")

    val httpConf= http
      .baseUrl("https://reqres.in")
    // .headers(mapRequest)


    val scn=scenario(scenarioName = "SmokeTest").exec(http(requestName="SmokeTest").get("/api/users")
      .check(bodyString.saveAs("myresponse")))
      .exec {session =>
        val response1 = session("myresponse").as[String]
        println(response1)
        session}


  //  setUp(scn.inject(atOnceUsers(1))).protocols(httpConf)

  /*setUp(
    scn.inject(
      nothingFor(2 seconds),
      atOnceUsers(2),
      rampUsers(3) during (10 minutes),
      constantUsersPerSec(1) during (15 seconds),
      constantUsersPerSec(1) during (15 seconds) randomized,
      rampUsersPerSec(1) to 3 during (5 minutes),
      rampUsersPerSec(1) to 3 during (5 minutes) randomized,
      heavisideUsers(5) during (60 seconds)
    ).protocols(httpConf)
  )
*/


setUp(
    scn.inject (
      incrementUsersPerSec (5)
        . times (5)
        .eachLevelLasting (10 seconds)
        .separatedByRampsLasting (300 seconds)
        .startingFrom (10))
        .protocols(httpConf)
        )

  }

