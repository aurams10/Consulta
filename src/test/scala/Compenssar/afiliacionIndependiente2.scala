package Compenssar


import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class afiliacionIndependiente2 extends Simulation {

  val httpProtocol = http
    .baseUrl("https://corporativo.compensar.com")
   // .inferHtmlResources()
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.97 Safari/537.36")

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "none",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_78 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_81 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Origin" -> "https://corporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_95 = Map(
    "ACCEPT" -> "application/json;odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
    "Origin" -> "https://corporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_103 = Map(
    "Accept" -> "application/json; odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "text/plain",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_104 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://corporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-RequestDigest" -> "0x5434970891C1A742F7459FF24D6A87E12F51254D7DF5E37EC3BC98F51437254DCA2B0A710D65AE4EA991C9455398E5527FE8D5E07CF29B5AE7F31EB075B01BA7,14 Nov 2019 15:46:24 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_105 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_106 = Map(
    "ACCEPT" -> "application/json;odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_107 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://corporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-RequestDigest" -> "0x107B4EABC72E9770153DCA77B91F3FAC6A797C6D8A26B4A5F5F4EBC95B2A47389448FE008B6E5CF70BC1CF3610A15C4C58353D7B71449EFA9011514CEDB653A7,14 Nov 2019 15:46:25 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_117 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "sec-fetch-mode" -> "nested-navigate",
    "sec-fetch-site" -> "cross-site",
    "upgrade-insecure-requests" -> "1",
    "x-client-data" -> "CLC1yQEIkrbJAQiltskBCMS2yQEIqZ3KAQjiqMoBCMuuygEIvLDKAQjOsMoBCOqxygEI97TKARirpMoB")

  val headers_123 = Map("Origin" -> "https://www.google.com")

  val headers_134 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_136 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://corporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-RequestDigest" -> "0xCCA72E17F126C2D0FC1BCFA96BD237C747E154C7C01CDFAAE17FD8A0DD9A1E735DC0723E3C863AA6B5F8DED4DFD8211086EB5C1645C7397BF04FBC1EC8FBD205,14 Nov 2019 15:46:26 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_154 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "nested-navigate",
    "Sec-Fetch-Site" -> "cross-site",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_155 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "x-client-data" -> "CLC1yQEIkrbJAQiltskBCMS2yQEIqZ3KAQjiqMoBCMuuygEIvLDKAQjOsMoBCOqxygEI97TKARirpMoB")

  val headers_156 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_158 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_193 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://corporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-RequestDigest" -> "0x1C321C03B65101C9D9A5639ED84C7A36837932C3C9236F07E45070B918D245415DB3ADE69D73E97A59C93718A177051041F38B7E6D2727648ED2982F6EE0B056,14 Nov 2019 15:46:43 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_200 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://corporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-RequestDigest" -> "0xCA289454E6B24D97D1351D9F37C5365E1BD2A34622091F5104E59AC5F49F4C2507F690EE5214CBC37BBFA1A943044F1C45D8B5AF40CF17F11C48D6FD542C471B,14 Nov 2019 15:46:44 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val uri01 = "https://c.la1-c1-iad.salesforceliveagent.com/content/g/js/41.0/deployment.js"
  val uri02 = "https://www.google-analytics.com"
  val uri03 = "https://stats.g.doubleclick.net/r/collect"
  val uri04 = "https://cdnjs.cloudflare.com/ajax/libs"
  val uri05 = "https://cm.g.doubleclick.net/pixel"
  val uri06 = "https://www.googletagmanager.com/gtm.js"
  val uri07 = "https://d.la2-c2-ph2.salesforceliveagent.com/chat/rest/Visitor/Settings.jsonp"
  val uri08 = "https://www.google.com"
  val uri09 = "https://tags.crwdcntrl.net/c/4540/cc.js"
  val uri10 = "https://bcp.crwdcntrl.net"
  val uri11 = "https://fonts.gstatic.com/s/roboto/v18/KFOmCnqEu92Fr1Mu4mxK.woff2"
  val uri12 = "https://ajax.aspnetcdn.com/ajax"
  val uri13 = "https://www.gstatic.com/recaptcha"
  val uri15 = "https://www.google.com.co/ads/ga-audiences"

  val scn = scenario("afiliacionIndependiente2")
    .exec(http("home_afiliacionIndependiente2")
      .get("/afiliaciones/")
      .headers(headers_0)
      .resources(http("afiliacionIndependiente2")
        .get("/_catalogs/masterpage/starter/minisp.min.js"),
        http("https://ajax.aspnetcdn.com")
          .get(uri12 + "/jQuery/jquery-3.4.1.min.js"),
        http("https://ajax.aspnetcdn.com")
          .get(uri12 + "/bootstrap/3.3.7/bootstrap.min.js"),
        http("https://cdnjs.cloudflare.com")
          .get(uri04 + "/bluebird/3.7.0/bluebird.min.js"),
        http("https://cdnjs.cloudflare.com")
          .get(uri04 + "/jquery.SPServices/2014.02/jquery.SPServices-2014.02.min.js"),
        http("https://ajax.aspnetcdn.com")
          .get(uri12 + "/knockout/knockout-2.2.1.js"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/init.js?rev=ZCyl%2Bj%2B4NZLoeodWTEXQ0Q%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/style%20library/js/datalayercorporativo.min.js"),
        http("afiliacionIndependiente2")
          .get("/style%20library/vendor/ko.sp-1.0.min.js"),
        http("afiliacionIndependiente2")
          .get("/style%20library/vendor/slick.min.js"),
        http("afiliacionIndependiente2")
          .get("/style%20library/vendor/rangeslider.min.js"),
        http("afiliacionIndependiente2")
          .get("/style%20library/vendor/ion.rangeslider.min.js"),
        http("afiliacionIndependiente2")
          .get("/style%20library/vendor/picturefill.min.js"),
        http("afiliacionIndependiente2")
          .get("/style%20library/vendor/validate.min.js"),
        http("afiliacionIndependiente2")
          .get("/style%20library/vendor/jquery.validate.min.js"),
        http("afiliacionIndependiente2")
          .get("/style%20library/vendor/croppie.min.js"),
        http("afiliacionIndependiente2")
          .get("/style%20library/js/afiliaciones.config.js"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compTools.min.js?v=2"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.script.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/style%20library/js/compensar.actualizarcorreo.min.js"),
        http("afiliacionIndependiente2")
          .get("/style%20library/js/sjcl/sjcl.min.js"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.loadComponents.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.tiempoInactividad.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.enModoEdicion.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.detectarAncho.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.deferImages.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.agregarTitulowebparts.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.menuDesplegable.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.miCompensarPerfil.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.controlPestanas.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.controlAcordeon.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.filtroControlerVivienda.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/mainContent.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/headerNav.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/ko/modeloMenuAux.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.menuSecundario.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.quitarLoading.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.componenteEmailController.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.footer.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.componentePopUpController.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/style%20library/js/compensar.notificaciones.min.js"),
        http("afiliacionIndependiente2")
          .get("/style%20library/js/customcanales.min.js"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/compensar.portal.farm/customactioncall.js"),
        http("afiliacionIndependiente2")
          .get("/ScriptResource.axd?d=8_mZajhRqcSf2wVlbG1mh2ESnrMn6lDds2rFmICyPvLKuFBf0VOIz5MQhP4rTpwAFE9R1iS_lS2z7pHaSCFuypk8EPvDZfC-4clAVyUeI3YwoyCYUCijP8S0s7HyXjSEta4vC7lOe5sy9ud_2L45j41YMHzkDeXdsVKlel3QZ1NumE4BX94ibAlpWWTh1X5y0&t=2b48f70a"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/blank.js?rev=ZaOXZEobVwykPO9g8hq%2F8A%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/ScriptResource.axd?d=zOmheHpOaQmAR94fpc-YkBJqXtSStWpPrGRdzJWP8U93rhgPrpBncBalIn8zp1NbJRuXJF4QtyrnlujeetDj5ZIOUjbMmzMUFqAZ4XiDj3Tr-hrZ0WiV2jTg_QGLTZwPJT_az_P2PXiGBFbWpzIBUyFA8INKO5g7HVKtzyVs0qJz4SzSuoLtjoIN7YVKjJk40&t=2b48f70a"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/sp.init.js?rev=QI1yUCfCoUkadL93jNZLOg%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=SP%2ERes&rev=DoAHv8R6TO7rl33LcYBJTA%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/sp.runtime.js?rev=5f2WkYJoaxlIRdwUeg4WEg%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/sp.search.js?rev=uZlrSmuyYGO8yQWFVg%2BIdw%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/clientrenderer.js?rev=PWwV4FATEiOxN90BeB5Hzw%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=Srch%2EResources&rev=GVo354neq7eNTurLgIdpJQ%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/search.clientcontrols.js?rev=4CdfNbT3fyiqGDFCn59UyA%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/search.cbs.js?rev=S5EegsQhNKgWxVFmcqr5dQ%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/favicon.ico?rev=23"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/images/spcommon.png?rev=23"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/logo_compensar.png?rev=23"),
        http("afiliacionIndependiente2")
          .get("/WebResource.axd?d=iCtY9x_A3-OUIbZHD3f2zM_c6G6r7Doau6ITM0R0e_NRvyVYpC7iHKVbwCtnyRJdBfCAiT-k7crFFQyHwwDmt-fGk4_Pp8PP8BmmZD9ycv41&t=636767428042202005"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/logo_compensar.png"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/images/searchresultui.png?rev=23"),
        http("https://www.googletagmanager.com")
          .get(uri06 + "?id=GTM-N2Z9VMC"),
        http("afiliacionIndependiente2")
          .get("/WebResource.axd?d=GzVBTRChjFlbBOhSSX3E6E37FqgIM8TNOdxp2X_G0Ytie1bk08q3r13LRBU8Nhtn5JW4OeWL8449IEadbVcsBKD5WZ6x_-nLkn3SAMYC63M1&t=636767428042202005"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/images/nodearrow.png"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/chat/chatCompensar.js"),
        http("afiliacionIndependiente2")
          .get("/afiliaciones/PublishingImages/ArticulosKenzo_001.jpg"),
        http("afiliacionIndependiente2")
          .get("/afiliaciones/PublishingImages/Eventos_002.jpg"),
        http("afiliacionIndependiente2")
          .get("/afiliaciones/PublishingImages/PracticasLibres_003.jpg"),
        http("afiliacionIndependiente2")
          .get("/Afiliaciones/PublishingImages/Pintura_001.jpg"),
        http("afiliacionIndependiente2")
          .get("/Afiliaciones/PublishingImages/Natacion.jpg"),
        http("afiliacionIndependiente2")
          .get("/afiliaciones/PublishingImages/Hoteles_006.jpg"),
        http("afiliacionIndependiente2")
          .get("/afiliaciones/PublishingImages/Boleteria_007.jpg"),
        http("afiliacionIndependiente2")
          .get("/afiliaciones/PublishingImages/Golfito_008.jpg"),
        http("https://www.google.com")
          .get(uri08 + "/recaptcha/api.js?onload=captchaReady&render=explicit"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/ecmascript.array.find.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/ecmascript.string.includes.min.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/globant.validator.js?v=1"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.reanudarSolicitud.min.js?v=1"),
        http("https://c.la1-c1-iad.salesforceliveagent.com")
          .get(uri01)
          .headers(headers_78),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/releases/75nbHAdFrusJCwoMVGTXoHoM/recaptcha__es_419.js"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/images/dashLine.png"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_81),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_81),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_81),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_81),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/fonts/glyphicons-halflings-regular.woff2")
          .headers(headers_81),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/sp.ui.dialog.js?rev=0xf6wCIW4E1pN83I9nSIJQ%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_bannerhome.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_bannerhome.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_noticias.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_noticias.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .post("/afiliaciones/_api/contextinfo")
          .headers(headers_95),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/fonts/roboto/roboto_bold/Roboto-Bold-webfont.woff")
          .headers(headers_81),
        http("https://www.google-analytics.com")
          .get(uri02 + "/analytics.js"),
        http("https://tags.crwdcntrl.net")
          .get(uri09 + "?ns=_cc4540"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/Chat/bt-chat-offline.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/Chat/bt-inicio.png"),
        http("afiliacionIndependiente2")
          .post("/afiliaciones/_api/contextinfo")
          .headers(headers_95),
        http("afiliacionIndependiente2")
          .post("/afiliaciones/_api/contextinfo")
          .headers(headers_95),
        http("afiliacionIndependiente2")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_103),
        http("afiliacionIndependiente2")
          .post("/afiliaciones/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_104)
          .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
      // .body(RawFileBody("/afiliacionindependiente2/0104_request.dat")),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/logo-compensar-gris.svg")
          .headers(headers_105),
        http("afiliacionIndependiente2")
          .get("/_api/web/lists/GetByTitle('Configuraci%C3%B3n')/items?$select=Valor,Nombre,Seccion&$filter=(Nombre%20eq%20%27URLLogin%27)%20and%20(Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27)")
          .headers(headers_106),
        http("afiliacionIndependiente2")
          .post("/afiliaciones/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_107)
          //.body(RawFileBody("/afiliacionindependiente2/0107_request.dat")),
          .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
      http("afiliacionIndependiente2")
          .post("/afiliaciones/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_107)
        .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
      //  .body(RawFileBody("/afiliacionindependiente2/0108_request.dat")),
        http("afiliacionIndependiente2")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=((Seccion%20eq%20%27General%27)%20and%20(Nombre%20eq%20%27URL_SeguimientoTramites%27))")
          .headers(headers_106),
        http("afiliacionIndependiente2")
          .get("/_api/web/lists/GetByTitle('Mensajes%20Visuales')/items?$select=MSG_ClaseUI,MSG_Titulo,MSG_CuerpoTexto&$filter=(Title%20eq%20%27Error_General_Servicios%27)%20and%20(MSG_Modulo%20eq%20%27General%27)")
          .headers(headers_106),
        http("afiliacionIndependiente2")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=((Seccion%20eq%20%27Autenticaci%C3%B3n%27)%20and%20(Nombre%20eq%20%27GoogleCaptchaKey%27))")
          .headers(headers_106),
        http("afiliacionIndependiente2")
          .get("/afiliaciones/_api/web/lists/GetByTitle('Tipos%20Identificaci%C3%B3n')/items?$select=CodigoAfiliaciones,NombreAfiliaciones,AbreviacionAfiliaciones,EstadoAfiliaciones,FormulariosAfiliaciones&$filter=FormulariosAfiliaciones%20eq%20%27Formulario%20Reanudar%20Solicitud%20Afiliaci%C3%B3n%27")
          .headers(headers_106),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/style%20library/js/compensar.modulonoticias.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/style%20library/js/compensar.carruseldebanners.js?ctag=6602$$15.0.5131.1000"),
        http("https://www.google.com")
          .get(uri08 + "/recaptcha/api2/anchor?ar=1&k=6LfGFSMUAAAAAA3ffI1K_A7UDJyGNuvhkXZPZHXd&co=aHR0cHM6Ly9jb3Jwb3JhdGl2by5jb21wZW5zYXIuY29tOjQ0Mw..&hl=es-419&v=75nbHAdFrusJCwoMVGTXoHoM&size=normal&cb=8igigseozt58")
          .headers(headers_117),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/sp.js?rev=L6VKbbOLs9hQPATorPc5Sw%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/core.js?rev=%2FmcwmyWAFSbQRHlXU4BIBg%3D%3D"),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/releases/75nbHAdFrusJCwoMVGTXoHoM/styles__ltr.css"),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/releases/75nbHAdFrusJCwoMVGTXoHoM/recaptcha__es_419.js"),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/api2/logo_48.png"),
        http("https://fonts.gstatic.com/s/roboto")
          .get(uri11)
          .headers(headers_123),
        http("https://www.google.com")
          .get(uri08 + "/js/bg/1m6xrReGxg3M-FZlpW1PAMIbRFhkd0dCPjsaq9I2L9Y.js"),
        http("https://www.google.com")
          .get(uri08 + "/recaptcha/api2/webworker.js?hl=es-419&v=75nbHAdFrusJCwoMVGTXoHoM"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/css/compensar.carruselDeBanners.min.css"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/vendor/slick.css"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/vendor/slick-theme.css"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/css/compensar.carouselTheme.min.css"),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/releases/75nbHAdFrusJCwoMVGTXoHoM/recaptcha__es_419.js"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/css/compensar.moduloNoticias.min.css"),
        http("afiliacionIndependiente2")
          .get("/PUBLISHINGIMAGES/TENDENCIAS/DALE-VALOR-A-TU-SUBSIDIO-TENDENCIA500X250.JPG?RenditionID=105"),
        http("afiliacionIndependiente2")
          .get("/PUBLISHINGIMAGES/TENDENCIAS/CAJA-SIN-FRONTERAS-TENDENCIA500X250.JPG?RenditionID=105"),
        http("https://www.google-analytics.com")
          .get(uri02 + "/r/collect?v=1&_v=j79&a=1471711319&t=pageview&_s=1&dl=https%3A%2F%2Fcorporativo.compensar.com%2Fafiliaciones%2F&ul=es-419&de=UTF-8&dt=Afiliaciones%20Inicio&sd=24-bit&sr=1366x768&vp=1349x172&je=0&_u=QCCACEABB~&jid=384027521&gjid=1794143218&cid=2020315946.1573058361&tid=UA-117093312-21&_gid=2077898482.1573563542&_r=1&gtm=2wgav3N2Z9VMC&z=574384949")
          .headers(headers_134),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/sp.core.js?rev=b89b6nnwOk%2FeDkJa0KhP5w%3D%3D"),
        http("afiliacionIndependiente2")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_136)
          .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
      // .body(RawFileBody("/afiliacionindependiente2/0136_request.dat")),
        http("https://stats.g.doubleclick.net")
          .get(uri03 + "?v=1&aip=1&t=dc&_r=3&tid=UA-117093312-5&cid=2020315946.1573058361&jid=1405845225&_gid=2077898482.1573563542&gjid=92704516&_v=j79&z=1458161541")
          .headers(headers_134),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/proveedores.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/proyectosSociales.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/agenciaEmpleo.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/miplanilla.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/logos_certificaciones1.1.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/logos_certificaciones1.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/logos_certificaciones3.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/logos_certificaciones2.png"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/starter/corev15.css"),
        http("https://www.google.com")
          .get(uri08 + "/ads/ga-audiences?v=1&aip=1&t=sr&_r=4&tid=UA-117093312-5&cid=2020315946.1573058361&jid=1405845225&_v=j79&z=1458161541")
          .headers(headers_134),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/releases/75nbHAdFrusJCwoMVGTXoHoM/styles__ltr.css"),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/releases/75nbHAdFrusJCwoMVGTXoHoM/recaptcha__es_419.js"),
        http("https://fonts.gstatic.com/s/roboto")
          .get(uri11)
          .headers(headers_123),
        http("https://www.google.com.co")
          .get(uri15 + "?v=1&aip=1&t=sr&_r=4&tid=UA-117093312-24&cid=2020315946.1573058361&jid=394313687&_v=j79&z=1528216363&slf_rd=1&random=213641303")
          .headers(headers_134),
        http("https://www.google.com.co")
          .get(uri15 + "?v=1&aip=1&t=sr&_r=4&tid=UA-117093312-21&cid=2020315946.1573058361&jid=384027521&_v=j79&z=574384949&slf_rd=1&random=1607860833")
          .headers(headers_134),
        http("https://www.google.com.co")
          .get(uri15 + "?v=1&aip=1&t=sr&_r=4&tid=UA-117093312-5&cid=2020315946.1573058361&jid=1405845225&_v=j79&z=1458161541&slf_rd=1&random=1659449514")
          .headers(headers_134),
        http("https://bcp.crwdcntrl.net")
          .get(uri10 + "/5/c=4540/rand=719087783/pv=y/int=%23OpR%2342095%23corporativo.com%20%3A%20Total%20Site%20Traffic/int=%23OpR%2342096%23compensar.com%20%3A%20Site%20Section%20%3A%20afiliaciones/rt=ifr")
          .headers(headers_154),
        http("https://cm.g.doubleclick.net")
          .get(uri05 + "?google_nid=lotameddp&google_cm")
          .headers(headers_155),
        http("https://bcp.crwdcntrl.net")
          .get(uri10 + "/gmap/?google_gid=CAESECkwGpvHVe0G5jWb3YMHizw&google_cver=1")
          .headers(headers_156),
        http("https://d.la2-c2-ph2.salesforceliveagent.com")
          .get(uri07 + "?sid=6d499aaf-7e10-4c95-b450-bf70db5de740&Settings.prefix=Visitor&Settings.buttonIds=[5736A000000H2uD]&Settings.updateBreadcrumb=1&Settings.urlPrefix=undefined&callback=liveagent._.handlePing&deployment_id=5726A000000HI4w&org_id=00D6A000001UfII&version=41")
          .headers(headers_78)))
    .pause(13)
    .exec(http("afiliacionIndependiente2")
      .get("/Afiliaciones/independiente")
      .headers(headers_158)
      .resources(http("https://www.googletagmanager.com")
        .get(uri06 + "?id=GTM-N2Z9VMC"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/css/compensar.menuSecundario.css"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/starter/searchv15.css"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/css/customcanales.css"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/starter/corev15.css"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/css/styles.min.css"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/compensar.popovers.min.js"),
        http("https://www.google-analytics.com")
          .get(uri02 + "/analytics.js"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_81),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_81),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_81),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/releases/75nbHAdFrusJCwoMVGTXoHoM/recaptcha__es_419.js"),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_81),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/images/dashLine.png"),
        http("https://tags.crwdcntrl.net")
          .get(uri09 + "?ns=_cc4540"),
        http("https://www.google-analytics.com")
          .get(uri02 + "/collect?v=1&_v=j79&a=1600814408&t=pageview&_s=1&dl=https%3A%2F%2Fcorporativo.compensar.com%2FAfiliaciones%2Findependiente&ul=es-419&de=UTF-8&dt=Afiliarse%20en%20l%C3%ADnea%20como%20Independiente%20a%20Compensar%20Caja%20de%20Compensaci%C3%B3n&sd=24-bit&sr=1366x768&vp=1349x539&je=0&_u=QACAAEAB~&jid=&gjid=&cid=2020315946.1573058361&tid=UA-117093312-5&_gid=2077898482.1573563542&gtm=2wgav3N2Z9VMC&z=1399629097")
          .headers(headers_134),
        http("https://www.google-analytics.com")
          .get(uri02 + "/collect?v=1&_v=j79&a=1600814408&t=pageview&_s=1&dl=https%3A%2F%2Fcorporativo.compensar.com%2FAfiliaciones%2Findependiente&ul=es-419&de=UTF-8&dt=Afiliarse%20en%20l%C3%ADnea%20como%20Independiente%20a%20Compensar%20Caja%20de%20Compensaci%C3%B3n&sd=24-bit&sr=1366x768&vp=1349x539&je=0&_u=QCCACEABB~&jid=&gjid=&cid=2020315946.1573058361&tid=UA-117093312-21&_gid=2077898482.1573563542&gtm=2wgav3N2Z9VMC&z=1137321027")
          .headers(headers_134),
        http("https://www.google-analytics.com")
          .get(uri02 + "/collect?v=1&_v=j79&a=1600814408&t=pageview&_s=1&dl=https%3A%2F%2Fcorporativo.compensar.com%2FAfiliaciones%2Findependiente&ul=es-419&de=UTF-8&dt=Afiliarse%20en%20l%C3%ADnea%20como%20Independiente%20a%20Compensar%20Caja%20de%20Compensaci%C3%B3n&sd=24-bit&sr=1366x768&vp=1349x539&je=0&_u=QCCACEABB~&jid=&gjid=&cid=2020315946.1573058361&tid=UA-117093312-24&_gid=2077898482.1573563542&gtm=2wgav3N2Z9VMC&z=1172187068")
          .headers(headers_134),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/sp.ui.dialog.js?rev=0xf6wCIW4E1pN83I9nSIJQ%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_afiliacion_validar_usuario.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_afiliacion_validar_usuario.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/_api/web/lists/GetByTitle('PopOvers')/items?$select=TituloPopOver,PosicionPopOver,UrlsPopOvers,TextoAyudaPopOver,TextoBoton,IdentificadorPopOver,SeccionFormularioPops,CampoFormularioPops")
          .headers(headers_106),
        http("afiliacionIndependiente2")
          .post("/afiliaciones/_api/contextinfo")
          .headers(headers_95),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/js/chat/style.css"),
        http("afiliacionIndependiente2")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_103),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/Chat/bt-chat-offline.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/Chat/bt-inicio.png"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/style%20library/css/compensar.afiliacionrequisitos.min.css?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/style%20library/css/compensar.afiliacioninicio.min.css?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/style%20library/js/compensar.afiliacionpopupdocumentos.min.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .get("/style%20library/js/compensar.afiliacionvalidarusuario.min.js?ctag=6602$$15.0.5131.1000"),
        http("afiliacionIndependiente2")
          .post("/afiliaciones/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_193)
          .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
      // .body(RawFileBody("/afiliacionindependiente2/0193_request.dat")),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/sp.js?rev=L6VKbbOLs9hQPATorPc5Sw%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/core.js?rev=%2FmcwmyWAFSbQRHlXU4BIBg%3D%3D"),
        http("afiliacionIndependiente2")
          .post("/_api/contextinfo")
          .headers(headers_95),
        http("afiliacionIndependiente2")
          .get("/_layouts/15/sp.core.js?rev=b89b6nnwOk%2FeDkJa0KhP5w%3D%3D"),
        http("afiliacionIndependiente2")
          .get("/_catalogs/masterpage/starter/corev15.css"),
        http("afiliacionIndependiente2")
          .get("/_api/web/lists/GetByTitle('Mensajes%20Visuales')/items?$select=MSG_ClaseUI,MSG_Titulo,MSG_CuerpoTexto&$filter=(Title%20eq%20%27Error_General_Servicios%27)%20and%20(MSG_Modulo%20eq%20%27General%27)")
          .headers(headers_106),
        http("afiliacionIndependiente2")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_200)
          .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
      // .body(RawFileBody("/afiliacionindependiente2/0200_request.dat")),
        http("afiliacionIndependiente2")
          .get("/Style%20Library/fonts/roboto/roboto_bold/Roboto-Bold-webfont.woff")
          .headers(headers_81),
        http("afiliacionIndependiente2")
          .get("/afiliaciones/_api/web/lists/GetByTitle('Tipos%20Identificaci%C3%B3n')/items?$select=CodigoAfiliaciones,NombreAfiliaciones,AbreviacionAfiliaciones,EstadoAfiliaciones&$filter=FormulariosAfiliaciones%20eq%20%27Formulario%20Validar%20Usuario%20Prev%20Solicitud%20Afilia%27")
          .headers(headers_106),
        http("https://bcp.crwdcntrl.net")
          .get(uri10 + "/5/c=4540/rand=389626298/pv=y/int=%23OpR%2342095%23corporativo.com%20%3A%20Total%20Site%20Traffic/int=%23OpR%2342096%23compensar.com%20%3A%20Site%20Section%20%3A%20Afiliaciones/rt=ifr")
          .headers(headers_154),
        http("afiliacionIndependiente2")
          .get("/afiliaciones/_api/web/lists/GetByTitle('Modalidades%20Afiliaci%C3%B3n')/items?$select=CodigoAfiliaciones,NombreAfiliaciones,TipoAfiliacion_ListTipoAfiliaciones/Id_Afiliaciones&$expand=TipoAfiliacion_ListTipoAfiliaciones&$filter=TipoAfiliacion_ListTipoAfiliaciones/Id_Afiliaciones%20eq%203")
          .headers(headers_106),
        http("afiliacionIndependiente2")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=((Seccion%20eq%20%27Autenticaci%C3%B3n%27)%20and%20(Nombre%20eq%20%27GoogleCaptchaKey%27))")
          .headers(headers_106),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/nuestraOrganizacion.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/proveedores.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/proyectosSociales.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/agenciaEmpleo.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/miplanilla.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/logos_certificaciones1.1.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/logos_certificaciones1.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/logos_certificaciones3.png"),
        http("afiliacionIndependiente2")
          .get("/PublishingImages/logos_certificaciones2.png"),
        http("https://cm.g.doubleclick.net")
          .get(uri05 + "?google_nid=lotameddp&google_cm")
          .headers(headers_155),
        http("https://bcp.crwdcntrl.net")
          .get(uri10 + "/gmap/?google_gid=CAESECkwGpvHVe0G5jWb3YMHizw&google_cver=1")
          .headers(headers_156),
        http("https://www.google.com")
          .get(uri08 + "/recaptcha/api2/anchor?ar=1&k=6LfGFSMUAAAAAA3ffI1K_A7UDJyGNuvhkXZPZHXd&co=aHR0cHM6Ly9jb3Jwb3JhdGl2by5jb21wZW5zYXIuY29tOjQ0Mw..&hl=es-419&v=75nbHAdFrusJCwoMVGTXoHoM&size=normal&cb=iqz1pw812ir3")
          .headers(headers_117),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/releases/75nbHAdFrusJCwoMVGTXoHoM/styles__ltr.css"),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/releases/75nbHAdFrusJCwoMVGTXoHoM/recaptcha__es_419.js"),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/api2/logo_48.png"),
        http("https://fonts.gstatic.com/s/roboto")
          .get(uri11)
          .headers(headers_123),
        http("https://www.google.com")
          .get(uri08 + "/js/bg/1m6xrReGxg3M-FZlpW1PAMIbRFhkd0dCPjsaq9I2L9Y.js"),
        http("https://www.google.com")
          .get(uri08 + "/recaptcha/api2/webworker.js?hl=es-419&v=75nbHAdFrusJCwoMVGTXoHoM"),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/releases/75nbHAdFrusJCwoMVGTXoHoM/recaptcha__es_419.js"),
        http("https://d.la2-c2-ph2.salesforceliveagent.com")
          .get(uri07 + "?sid=6d499aaf-7e10-4c95-b450-bf70db5de740&Settings.prefix=Visitor&Settings.buttonIds=[5736A000000H2uD]&Settings.updateBreadcrumb=1&Settings.urlPrefix=undefined&callback=liveagent._.handlePing&deployment_id=5726A000000HI4w&org_id=00D6A000001UfII&version=41")
          .headers(headers_78),
        http("https://www.google.com")
          .get(uri08 + "/recaptcha/api2/bframe?hl=es-419&v=75nbHAdFrusJCwoMVGTXoHoM&k=6LfGFSMUAAAAAA3ffI1K_A7UDJyGNuvhkXZPZHXd&cb=1q81h33acyj3")
          .headers(headers_117),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/releases/75nbHAdFrusJCwoMVGTXoHoM/styles__ltr.css"),
        http("https://www.gstatic.com/recaptcha")
          .get(uri13 + "/releases/75nbHAdFrusJCwoMVGTXoHoM/recaptcha__es_419.js"),
        http("https://fonts.gstatic.com/s/roboto")
          .get(uri11)
          .headers(headers_123)))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}