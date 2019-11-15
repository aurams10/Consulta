package Compenssar


import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class homeuno extends Simulation {

  val httpProtocol = http
    .baseUrl("https://prucorporativo.compensar.com")
    //.inferHtmlResources()
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.120 Safari/537.36")

 // val bodyList=""""""

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "none",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_1 = Map("Sec-Fetch-Mode" -> "no-cors")

  val headers_9 = Map(
    "Intervention" -> """<https://www.chromestatus.com/feature/5718547946799104>; level="warning"""",
    "Sec-Fetch-Mode" -> "no-cors")

  val headers_10 = Map(
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors")

  val headers_17 = Map(
    "ACCEPT" -> "application/json;odata=verbose",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_42 = Map(
    "Accept" -> "application/json; odata=verbose",
    "Content-Type" -> "text/plain",
    "Sec-Fetch-Mode" -> "cors",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_43 = Map(
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "X-RequestDigest" -> "0x9695F98592B266B512023E571C8FFB89964ECE916200B8F715D5CAD63FFC7227B1D98A7DF84876BBC68DCC428776FD0144FBE8BBB433A175F505FB77E854FC35,25 Oct 2019 22:00:48 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_70 = Map(
    "Accept" -> "application/xml, text/xml, */*; q=0.01",
    "Content-Type" -> """text/xml;charset="UTF-8"""",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_71 = Map(
    "Accept" -> "application/xml, text/xml, */*; q=0.01",
    "Content-Type" -> "text/xml;charset='UTF-8'",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "X-Requested-With" -> "XMLHttpRequest")

  val uri1 = "https://www.google-analytics.com"
  val uri2 = "https://c.oracleinfinity.io/acs"
  val uri3 = "https://service.maxymiser.net/cg/v5us"
  val uri4 = "https://www.compensar.com/img/2016"
  val uri5 = "https://www.googletagmanager.com/gtm.js"
  val uri7 = "https://dc.oracleinfinity.io/awlorq1lmp/dcs.gif"

  val scn = scenario("home")
    .exec(http("home_htmlhome_html")
      .get("/")
      .headers(headers_0)
      .resources(
        http("Estilos de pagina")
        .get("/_catalogs/masterpage/starter/searchv15.css")
        .headers(headers_1),
        http("Estilos de pagina")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_1),
        http("JS de pagina")
          .get("/Style%20Library/webparts/productosDestacados/ProductosDestacados.min.js?v=1")
          .headers(headers_1),
        http("https://www.googletagmanager.com/gtm.js")
          .get(uri5 + "?id=GTM-5GF54C6")
          .headers(headers_1),
        http("https://www.google-analytics.com")
          .get(uri1 + "/analytics.js")
          .headers(headers_1),
        http("https://www.google-analytics.com")
          .get(uri1 + "/collect?v=1&_v=j79&a=921701936&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2F&ul=es-es&de=UTF-8&dt=Compensar%20Caja%20de%20Compensaci%C3%B3n%20Familiar%20home&sd=24-bit&sr=1366x768&vp=1366x408&je=0&_u=QACAAEAB~&jid=&gjid=&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&gtm=2wgaa05GF54C6&z=84471837")
          .headers(headers_1),
        http("https://service.maxymiser.net")
          .get(uri3 + "/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252F%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&pd=-175198244%7CKwAAAApVAwDcYaCCPxIDZAABEgABQgCFdZ%2BHAwCZ6XGullnXSMUHQGJSUtdIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBSBICAAEAAAAAAAAA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAAAAAAAAAFF&bid=nycvwcgus10&srv=nycvwcgus10")
          .headers(headers_9),
        http("Fuentes de la pagina")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_10),
        http("Fuentes de la pagina")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_10),
        http("Fuentes de la pagina")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_10),
        http("JS de pagina")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D")
          .headers(headers_1),
        http("https://c.oracleinfinity.io/acs")
          .get(uri2 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("Fuentes de la pagina")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_10),
        http("JS de pagina")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D")
          .headers(headers_1),
        http("api_contextinfo")
          .post("/_api/contextinfo")
          .headers(headers_17),
        http("api_contextinfo")
          .post("/_api/contextinfo")
          .headers(headers_17),
        http("bannerhome.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_bannerhome.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("group_content.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("bannerhome.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_bannerhome.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("enlacesinteres_nuevo.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_enlacesinteres_nuevo.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("enlacesinteres_nuevo.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_enlacesinteres.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("tendencias.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("tendencias.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("enlacedirectos2.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_enlacedirectos2.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("api_contextinfo")
          .post("/_api/contextinfo")
          .headers(headers_17),
        http("api_contextinfo")
          .post("/_api/contextinfo")
          .headers(headers_17),
        http("enlacesdirectos.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_enlacesdirectos.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("novedades.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_novedades.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("novedades.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_novedades.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("noticias.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_noticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("noticias.js")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_noticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("api_contextinfo")
          .post("/_api/contextinfo")
          .headers(headers_17),
        http("api_contextinfo")
          .post("/_api/contextinfo")
          .headers(headers_17),
        http("Redes_Sociales")
          .get(uri4 + "/icon-face.png")
          .headers(headers_1),
        http("Redes_Sociales")
          .get(uri4 + "/icon-twitter.png")
          .headers(headers_1),
        http("Redes_Sociales")
          .get(uri4 + "/icon-youtube.png")
          .headers(headers_1),
        http("Redes_Sociales")
          .get(uri4 + "/icon-linkedin.png")
          .headers(headers_1),
        http("Redes_Sociales")
          .get(uri4 + "/icon-instagram.png")
          .headers(headers_1),
        http("imagenes")
          .get("/Style%20Library/images/dashLine.png")
          .headers(headers_1),
        http("items")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_42),
        http("ProcessQuery")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_43)
          //.body(RawFileBody("/home/0043_request.dat")),
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        http("Estilos de pagina")
          .get("/style%20library/css/compensar.tendencias.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("ProcessQuery")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_43)
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        // .body(RawFileBody("/home/0045_request.dat")),
        http("JS de pagina")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D")
          .headers(headers_1),
        http("JS de pagina")
          .get("/style%20library/js/compensar.carruseldebanners.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("ProcessQuery")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_43)
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        //.body(RawFileBody("/home/0048_request.dat")),
        http("JS de pagina")
          .get("/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("https://c.oracleinfinity.io/acs")
          .get(uri2 + "/common/js/0.0.19/common.js")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/style%20library/css/compensar.compstandard.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/style%20library/css/compensar.enlacesdirectos.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("JS de pagina")
          .get("/style%20library/js/compensar.novedades.min.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("modulonoticias.js")
          .get("/style%20library/js/compensar.modulonoticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("ProcessQuery")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_43)
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        //.body(RawFileBody("/home/0055_request.dat")),
        http("https://c.oracleinfinity.io/acs")
          .get(uri2 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_1),
        http("JS de pagina")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D")
          .headers(headers_1),
        http("ProcessQuery")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_43)
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        // .body(RawFileBody("/home/0058_request.dat")),
        http("JS de pagina")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D")
          .headers(headers_1),
        http("ProcessQuery")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_43)
          //.body(RawFileBody("/home/0060_request.dat")),
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        http("Estilos de pagina")
          .get("/Style%20Library/css/compensar.carruselDeBanners.min.css")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/Style%20Library/vendor/slick.css")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/Style%20Library/vendor/slick-theme.css")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/Style%20Library/css/compensar.carouselTheme.min.css")
          .headers(headers_1),
        http("https://c.oracleinfinity.io/acs")
          .get(uri2 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/Style%20Library/css/compensar.enlacesDeInteres.min.css")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/Style%20Library/css/compensar.moduloNoticias.min.css")
          .headers(headers_1),
        http("imagenes")
          .get("/PUBLISHINGIMAGES/TENDENCIAS/TENDENCIA-REVISTA-COMPENSAR-CESANTIAS-500X250.JPG?RenditionID=105")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/Style%20Library/css/compensar.compStandard.min.css")
          .headers(headers_1),
        http("Webs.asmx")
          .post("/_vti_bin/Webs.asmx")
          .headers(headers_70)
          .body(StringBody("""<soap:Envelope xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:soap='http://schemas.xmlsoap.org/soap/envelope/'><soap:Body><WebUrlFromPageUrl xmlns='http://schemas.microsoft.com/sharepoint/soap/' ><pageUrl>https://prucorporativo.compensar.com/</pageUrl></WebUrlFromPageUrl></soap:Body></soap:Envelope>""")),
        //.body(RawFileBody("/home/0070_request.dat")),
        http("Lists.asmx")
          .post("/_vti_bin/Lists.asmx")
          .headers(headers_71)
          .body(StringBody("""<soap:Envelope xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:soap='http://schemas.xmlsoap.org/soap/envelope/'><soap:Body><GetListItems xmlns='http://schemas.microsoft.com/sharepoint/soap/'><listName>Productos Destacados</listName><viewName></viewName><query><Query><OrderBy><FieldRef Name='Orden' Ascending='True'/></OrderBy></Query></query><viewFields><ViewFields Properties='True' /></viewFields><rowLimit>0</rowLimit><queryOptions><QueryOptions></QueryOptions></queryOptions></GetListItems></soap:Body></soap:Envelope>""")),
        http("imagenes")
          .get("/PublishingImages/Destacados/cirugia-estetica-compensar.png?RenditionID=107")
          .headers(headers_1),
        http("imagenes")
          .get("/PublishingImages/Destacados/credito-libre-inversion-compensar.png?RenditionID=107")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/Style%20Library/css/compensar.novedades.min.css")
          .headers(headers_1),
        http("imagenes")
          .get("/PublishingImages/Destacados/09-abril-2015-salud-oral.jpg?RenditionID=107")
          .headers(headers_1),
        http("JS de pagina")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("https://c.oracleinfinity.io/acs")
          .get(uri2 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_1),
        http("https://dc.oracleinfinity.io/awlorq1lmp/dcs.gif")
          .get(uri7 + "?dcsdat=1572040860030&dcssip=prucorporativo.compensar.com&dcsuri=/&wt.tz=-5&wt.bh=17&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Compensar%2520Caja%2520de%2520Compensaci%25C3%25B3n%2520Familiar%2520home&wt.js=Yes&wt.bs=1366x408&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252F&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&wt.co_f=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_1),
        http("Estilos de pagina")
          .get("/Style%20Library/vendor/ajax-loader.gif")
          .headers(headers_1)))
  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
 // setUp(scn.inject(constantUsersPerSec(3) during(20 seconds)))

}