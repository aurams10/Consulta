package Compenssar

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class sede200adultoautenticado extends Simulation {

  val httpProtocol = http
    .baseUrl("https://prucorporativo.compensar.com")
    //.inferHtmlResources()
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:70.0) Gecko/20100101 Firefox/70.0")

  val headers_8 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_52 = Map("TE" -> "Trailers")

  val headers_58 = Map("Accept" -> "text/css,*/*;q=0.1")

  val headers_71 = Map("Accept" -> "image/webp,*/*")

  val headers_76 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/json;odata=verbose",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=utf-8",
    "Origin" -> "https://prucorporativo.compensar.com",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_93 = Map(
    "Accept" -> "image/webp,*/*",
    "TE" -> "Trailers")

  val headers_100 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/json; odata=verbose",
    "Content-Type" -> "text/plain",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_104 = Map(
    "ADRUM" -> "isAjax:true",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "X-RequestDigest" -> "0xCCB043E1CE6BC19ADE0DAE0A51D26021F4DD0DD6C201D826D04A2F0739690633622FD9CC0A93B10E992ABAE1F0DABE403CB6FF2C180BD7778D9565E1706040A0,15 Nov 2019 20:27:26 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_108 = Map(
    "ADRUM" -> "isAjax:true",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "X-RequestDigest" -> "0xB51C3BAF9870F161234B3B62C308B6334AF8155AACEFB436DCFA39C4D5CD29B34BAE4EAC87EEC435959615DF7FC6A88B9524B69C0B55A0491E200CC3AF0D7409,15 Nov 2019 20:27:25 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_131 = Map(
    "Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
    "Accept-Encoding" -> "identity")

  val headers_135 = Map("Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8")

  val headers_145 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
    "Origin" -> "https://presso.compensar.com",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_241 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/json;odata=verbose",
    "Origin" -> "https://prucorporativo.compensar.com")

  val headers_251 = Map(
    "ADRUM" -> "isAjax:true",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "X-RequestDigest" -> "0x4132446D64767DA090EB746F09C3C1B7E4FC5B2F9CF23781D99C153382F60245C8614324A9963D728A2ACD995F5FA8E19BF678BD74DADD3C2C44F688B58F82C1,15 Nov 2019 20:27:51 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_253 = Map(
    "ADRUM" -> "isAjax:true",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "X-RequestDigest" -> "0x9699A0C5F6DD4402A3E32CB760CC455DB87BFFABCA8093FB0F46912FCBE49763DAA9A01C551B331E4171F71A5A76D678A3ED45C551C560392E36C131C7C6FEB6,15 Nov 2019 20:27:52 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_254 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/json;odata=verbose")

  val headers_255 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_261 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/json; odata=verbose",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_275 = Map(
    "Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
    "Accept-Encoding" -> "identity",
    "Origin" -> "https://prucorporativo.compensar.com")

  val uri01 = "https://maps.googleapis.com"
  val uri02 = "https://www.google-analytics.com"
  val uri03 = "https://c.oracleinfinity.io/acs"
  val uri04 = "https://service.maxymiser.net"
  val uri05 = "https://stats.g.doubleclick.net/r/collect"
  val uri06 = "https://presso.compensar.com"
  val uri07 = "https://www.googletagmanager.com/gtm.js"
  val uri08 = "https://cdn.appdynamics.com/adrum-ext.396a4a3598e4fdd54b8073a93c951462.js"
  val uri10 = "https://fonts.gstatic.com/s/roboto/v20"
  val uri11 = "https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
  val uri12 = "https://dc.oracleinfinity.io/awlorq1lmp/dcs.gif"

  val scn = scenario("sede200adultoautenticado")
    .exec(http("request_0")
      .get("/_catalogs/masterpage/starter/minisp.min.js")
      .resources(http("request_1")
        .get("/_layouts/15/init.js?rev=ZwTQYqYlNTyyuMWaLlhwSg%3D%3D"),
        http("request_2")
          .get("/style%20library/vendor/jquery-3.1.1.min.js"),
        http("request_3")
          .get("/style%20library/js/datalayercorporativo.min.js"),
        http("request_4")
          .get("/style%20library/vendor/bluebird.min.js"),
        http("request_5")
          .get("/style%20library/vendor/bootstrap.min.js"),
        http("request_6")
          .get("/style%20library/js/jquery.spservices-2014.02.min.js"),
        http("request_7")
          .get("/Style%20Library/vendor/knockout-3.4.1.min.js?v=1"),
        http("request_8")
          .get("/sedes/calle-220")
          .headers(headers_8),
        http("request_9")
          .get("/style%20library/vendor/ko.sp-1.0.min.js"),
        http("request_10")
          .get("/style%20library/vendor/slick.min.js"),
        http("request_11")
          .get("/style%20library/vendor/rangeslider.min.js"),
        http("request_12")
          .get("/style%20library/vendor/ion.rangeslider.min.js"),
        http("request_13")
          .get("/style%20library/vendor/picturefill.min.js"),
        http("request_14")
          .get("/style%20library/vendor/validate.min.js"),
        http("request_15")
          .get("/style%20library/vendor/jquery.validate.min.js"),
        http("request_16")
          .get("/style%20library/vendor/croppie.min.js"),
        http("request_17")
          .get("/Style%20Library/js/afiliaciones.config.js?v=5"),
        http("request_18")
          .get("/Style%20Library/js/compTools.min.js?v=1"),
        http("request_19")
          .get("/style%20library/js/compensar.script.min.js"),
        http("request_20")
          .get("/style%20library/js/compensar.actualizarcorreo.min.js"),
        http("request_21")
          .get("/style%20library/js/sjcl/sjcl.min.js"),
        http("request_22")
          .get("/Style%20Library/js/compensar.loadComponents.min.js?v=1"),
        http("request_23")
          .get("/Style%20Library/js/compensar.tiempoInactividad.min.js?v=1"),
        http("request_24")
          .get("/Style%20Library/js/compensar.enModoEdicion.min.js?v=1"),
        http("request_25")
          .get("/Style%20Library/js/compensar.detectarAncho.min.js?v=1"),
        http("request_26")
          .get("/Style%20Library/js/compensar.deferImages.min.js?v=1"),
        http("request_27")
          .get("/Style%20Library/js/compensar.agregarTitulowebparts.min.js?v=1"),
        http("request_28")
          .get("/Style%20Library/js/compensar.menuDesplegable.min.js?v=1"),
        http("request_29")
          .get("/Style%20Library/js/compensar.miCompensarPerfil.min.js?v=1"),
        http("request_30")
          .get("/Style%20Library/js/compensar.controlPestanas.min.js?v=1"),
        http("request_31")
          .get("/Style%20Library/js/compensar.controlAcordeon.min.js?v=1"),
        http("request_32")
          .get("/Style%20Library/js/compensar.filtroControlerVivienda.min.js?v=1"),
        http("request_33")
          .get("/Style%20Library/js/mainContent.min.js?v=1"),
        http("request_34")
          .get("/Style%20Library/js/headerNav.min.js?v=1"),
        http("request_35")
          .get("/Style%20Library/js/ko/modeloMenuAux.min.js?v=1"),
        http("request_36")
          .get("/Style%20Library/js/compensar.menuSecundario.min.js?v=1"),
        http("request_37")
          .get("/Style%20Library/js/compensar.quitarLoading.min.js?v=1"),
        http("request_38")
          .get("/Style%20Library/js/compensar.componenteEmailController.min.js?v=1"),
        http("request_39")
          .get("/Style%20Library/js/compensar.footer.min.js?v=1"),
        http("request_40")
          .get("/Style%20Library/js/compensar.componentePopUpController.min.js?v=1"),
        http("request_41")
          .get("/style%20library/js/compensar.notificaciones.min.js"),
        http("request_42")
          .get("/style%20library/js/customcanales.min.js"),
        http("request_43")
          .get("/_layouts/15/compensar.portal.farm/customactioncall.js"),
        http("request_44")
          .get("/ScriptResource.axd?d=DbBIHdj-QC5CO88xwauS5dkoqIs6nZmS0i8rusZB1q2JCx1O17otX38Pbo9-Co9QXf_ywgPOgCaWxydR-v-KO_BCuip-vRkoHzjnd81XPEqYhrrZRFvD28DBse-3zjaVmjdm2hC17AQqDXfxT3KoyoLs-sQ7qPLfqrjuPJokLcOn_d3Dmrsd446-Hg6mDbff0&t=2b48f70a"),
        http("request_45")
          .get("/_layouts/15/blank.js?rev=ZaOXZEobVwykPO9g8hq%2F8A%3D%3D"),
        http("request_46")
          .get("/ScriptResource.axd?d=LzPGXWTyY4NfgAzL7AVGti8jNkeNvyxE7t2p3M-3BPJvKFvvkBUGxbbcxESn55TFNOUl8xW6SvygFDc-U8cavgouTpfnyDz3b86dyb2Q1b12B-B2zqJbKL3UrhnjJpkL79pBm9zX4FVDPUA4BsjrvCFATMYLp3cyBtLpIkBKZKUxDrfJga0vw4ZjurZ0mn1o0&t=2b48f70a"),
        http("request_47")
          .get("/_layouts/15/sp.init.js?rev=jvJC3Kl5gbORaLtf7kxULQ%3D%3D"),
        http("request_48")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=SP%2ERes&rev=DoAHv8R6TO7rl33LcYBJTA%3D%3D"),
        http("request_49")
          .get("/_layouts/15/sp.runtime.js?rev=5f2WkYJoaxlIRdwUeg4WEg%3D%3D"),
        http("request_50")
          .get("/_layouts/15/sp.search.js?rev=dMkPlEXpdY6iJ%2FsY5RsB0g%3D%3D"),
        http("request_51")
          .get("/_layouts/15/clientrenderer.js?rev=PWwV4FATEiOxN90BeB5Hzw%3D%3D"),
        http("request_52")
          .get(uri04 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_52),
        http("request_53")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=Srch%2EResources&rev=GVo354neq7eNTurLgIdpJQ%3D%3D"),
        http("request_54")
          .get("/_layouts/15/search.clientcontrols.js?rev=8Q15HW2EU2aXBktJq5YW%2FA%3D%3D"),
        http("request_55")
          .get("/_layouts/15/search.cbs.js?rev=S5EegsQhNKgWxVFmcqr5dQ%3D%3D"),
        http("request_56")
          .get("/WebResource.axd?d=hcspxoKGngdkW0b6xYvFftMD9L7tgVctZKvxUqyhcPMOX4gSlmQgLLYGJ7F9lMuasHqe9Mv5x6g7VZmrwkJEQmLxw_pNwohGyqmgqyaeGpA1&t=636767428042202005"),
        http("request_57")
          .get(uri07 + "?id=GTM-5GF54C6"),
        http("request_58")
          .get("/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_58),
        http("request_59")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_58),
        http("request_60")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_58),
        http("request_61")
          .get("/style%20library/Parqueaderos/css/estilos.css")
          .headers(headers_58),
        http("request_62")
          .get("/style%20library/js/ParqueaderosV2.js"),
        http("request_63")
          .get(uri01 + "/maps/api/js?key=AIzaSyBQs4JbPCHOPygyJzKnUYgsAm35jOpmshk"),
        http("request_64")
          .get("/style%20library/css/compensar.detallevivienda.min.css?ctag=5143$$15.0.4927.1000")
          .headers(headers_58),
        http("request_65")
          .get("/Style%20Library/js/mainContentInterno.js"),
        http("request_66")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_58),
        http("request_67")
          .get(uri04 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fsedes%252Fcalle-220%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&ids=1%3D9999805063371246&pd=-952475881%7CSwAAAApVAwDpQ2hfXBL3TBA5OTk5ODA1MDYzMzcxMjQ2ARIAAUIAsQQVmAYAwbPoMwpq10i%2BSfagHWnXSAAAAAD%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwAGRGlyZWN0AVwSBgAAAAAAAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwUAQwsBAH4ZW7cRXBIA%2F%2F%2F%2F%2FwFcEl0S%2F%2F80AAABAAAAAAEBcAIATbEDAACgCQEALHIDGOddEgD%2F%2F%2F%2F%2FAV0SXRL%2F%2FxQAAAEAAAAAAZlrAgB3rQMAAIwMAQCcCwv6J10SAP%2F%2F%2F%2F8BXRJdEv%2F%2FAgAAAQAAAAABj3MCAJK1AwAA6QkBAAjAt%2FKmXRIA%2F%2F%2F%2F%2FwFdEl0S%2F%2F8CAAABAAAAAAFUbAIAuKwDAADoCQEAKHv0gGFdEgD%2F%2F%2F%2F%2FAV0SXRL%2F%2FwEAAAEAAAAAAVNsAgCyrAMAAAAAAAAAAUU%3D&bid=nycvwcgus05&srv=nycvwcgus05")
          .headers(headers_52),
        http("request_68")
          .get(uri04 + "/platform/us/api/mmpackage-1.17.js"),
        http("request_69")
          .get(uri04 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fsedes%252Fcalle-220%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B2%5D&ri=2&lto=-300&jrt=s&ids=1%3D9999805063371246&pd=229607954%7CTAAAAApVAwDpQ2hfXBL3TBA5OTk5ODA1MDYzMzcxMjQ2ARIAAUIAsQQVmAYAgUAOOgpq10i%2BSfagHWnXSAAAAAD%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwAGRGlyZWN0AVwSBgAAAAAAAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwUAQwsBAH4ZW7cRXBIA%2F%2F%2F%2F%2FwFcEl0S%2F%2F81AAABAAAAAAEBcAIATbEDAACgCQEALHIDGOddEgD%2F%2F%2F%2F%2FAV0SXRL%2F%2FxQAAAEAAAAAAZlrAgB3rQMAAIwMAQCcCwv6J10SAP%2F%2F%2F%2F8BXRJdEv%2F%2FAgAAAQAAAAABj3MCAJK1AwAA6QkBAAjAt%2FKmXRIA%2F%2F%2F%2F%2FwFdEl0S%2F%2F8CAAABAAAAAAFUbAIAuKwDAADoCQEAKHv0gGFdEgD%2F%2F%2F%2F%2FAV0SXRL%2F%2FwEAAAEAAAAAAVNsAgCyrAMAAAAAAAAAAUU%3D&bid=nycvwcgus05&srv=nycvwcgus05&pageid=&pp=MDY4MDcy")
          .headers(headers_52),
        http("request_70")
          .get("/_layouts/15/blank.js?rev=ZaOXZEobVwykPO9g8hq%2F8A%3D%3D"),
        http("request_71")
          .get("/PublishingImages/logo-compensar-gris.svg")
          .headers(headers_71),
        http("request_72")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D"),
        http("request_73")
          .get(uri02 + "/analytics.js"),
        http("request_74")
          .get("/PublishingImages/favicon.ico?rev=23")
          .headers(headers_71),
        http("request_75")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D"),
        http("request_76")
          .post("/_api/contextinfo")
          .headers(headers_76),
        http("request_77")
          .post("/_api/contextinfo")
          .headers(headers_76),
        http("request_78")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=22842$$15.0.5131.1000"),
        http("request_79")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22842$$15.0.5131.1000"),
        http("request_80")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=22842$$15.0.5131.1000"),
        http("request_81")
          .get("/_catalogs/masterpage/item_compensar_testdetallesede.js?ctag=22842$$15.0.5131.1000"),
        http("request_82")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_testdetallesede.js?ctag=22842$$15.0.5131.1000"),
        http("request_83")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_novedades.js?ctag=22842$$15.0.5131.1000"),
        http("request_84")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_novedades.js?ctag=22842$$15.0.5131.1000"),
        http("request_85")
          .post("/_api/contextinfo")
          .headers(headers_76),
        http("request_86")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D"),
        http("request_87")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D"),
        http("request_88")
          .get("/style%20library/css/compensar.tendencias.css?ctag=22842$$15.0.5131.1000")
          .headers(headers_58),
        http("request_89")
          .get("/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22842$$15.0.5131.1000"),
        http("request_90")
          .get("/style%20library/css/compensar.detallesedes.min.css?ctag=22842$$15.0.5131.1000")
          .headers(headers_58),
        http("request_91")
          .get("/style%20library/js/compensar.detallesedes.min.js?ctag=22842$$15.0.5131.1000"),
        http("request_92")
          .get("/style%20library/js/compensar.novedades.min.js?ctag=22842$$15.0.5131.1000"),
        http("request_93")
          .get(uri02 + "/collect?v=1&_v=j79&a=1652809182&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2Fsedes%2Fcalle-220&ul=es-es&de=UTF-8&dt=Sedes&sd=24-bit&sr=1366x768&vp=1349x184&je=0&_u=QACAAEAB~&jid=&gjid=&cid=1982219005.1573748045&tid=UA-90763271-1&_gid=5704781.1573748045&gtm=2wgav35GF54C6&z=1587162589")
          .headers(headers_93),
        http("request_94")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D"),
        http("request_95")
          .post("/_api/contextinfo")
          .headers(headers_76),
        http("request_96")
          .get(uri04 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_52),
        http("request_97")
          .get(uri03 + "/account/awlorq1lmp/js/main/odc.js"),
        http("request_98")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D"),
        http("request_99")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_71),
        http("request_100")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_100),
        http("request_101")
          .get(uri08),
        http("request_102")
          .get(uri03 + "/common/js/0.0.19/common.js"),
        http("request_103")
          .get(uri03 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js"),
        http("request_104")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_104)
          .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
        http("request_105")
          .get(uri03 + "/account/awlorq1lmp/js/main/odc.js"),
        http("request_106")
          .get(uri12 + "?dcsdat=1573849663267&dcssip=prucorporativo.compensar.com&dcsuri=/sedes/calle-220&wt.tz=-5&wt.bh=15&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Sedes&wt.js=Yes&wt.bs=1366x184&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252Fsedes%252Fcalle-220&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=23b3056a-fdf0-4f91-9825-753516697db8&wt.co_f=23b3056a-fdf0-4f91-9825-753516697db8&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_71),
        http("request_107")
          .get(uri03 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js"),
        http("request_108")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_108)
          .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
        http("request_109")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_108)
          .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
        http("request_110")
          .get("/Style%20Library/css/compensar.novedades.min.css")
          .headers(headers_58),
        http("request_111")
          .get("/Style%20Library/vendor/slick.css")
          .headers(headers_58),
        http("request_112")
          .get("/Style%20Library/vendor/slick-theme.css")
          .headers(headers_58),
        http("request_113")
          .get("/Style%20Library/css/compensar.carouselTheme.min.css")
          .headers(headers_58),
        http("request_114")
          .get("/_trust/default.aspx?trust=IdentityServer&ReturnUrl=/sedes/calle-220")
          .headers(headers_8),
        http("request_115")
          .get(uri06 + "/Content/eyesClass.css")
          .headers(headers_58),
        http("request_116")
          .get(uri06 + "/Content/fonts?v=Y7MRUdvwE1hUsovmZYz9T7_41CMp95gKZ_Q9iYUO2O81")
          .headers(headers_58),
        http("request_117")
          .get(uri11)
          .headers(headers_58),
        http("request_118")
          .get(uri06 + "/scripts/ui/resetValidation.js"),
        http("request_119")
          .get(uri06 + "/content/modules?v=SqDhzDYakMzJp-M-gCcQFj4vc5izybzoH2OW-2is2fY1")
          .headers(headers_58),
        http("request_120")
          .get(uri06 + "/bundles/jqueryval?v=GkCXUO1MPqHDkNoDt8-shdnQEI8KGbNadRAAUqm2VOA1"),
        http("request_121")
          .get(uri06 + "/scripts/ui/utils.js"),
        http("request_122")
          .get(uri06 + "/Content/css?v=udBLYkNkikBQ6JWixlUMiJYcZz7DRJzdxBJZ-rKFDsg1")
          .headers(headers_58),
        http("request_123")
          .get(uri06 + "/scripts/ui/modal.js"),
        http("request_124")
          .get(uri06 + "/scripts/ui/loading.js"),
        http("request_125")
          .get(uri06 + "/scripts/ui/sessionchecker.js"),
        http("request_126")
          .get(uri06 + "/bundles/modernizr?v=inCVuEFe6J4Q07A0AcRsbJic_UE5MwpRMNGcOtk94TE1"),
        http("request_127")
          .get(uri06 + "/bundles/bootstrap?v=02I37B8URpB7hqkZrxMEO7o6VbDywYH_vuXan7A7mR81"),
        http("request_128")
          .get(uri06 + "/bundles/jquery?v=JL596WEzEYSLK79KRL4It4N63VXpRlW4A824KHlhVLc1"),
        http("request_129")
          .get(uri06 + "/Content/images/logo-compensar-blanco.svg")
          .headers(headers_71),
        http("request_130")
          .get(uri06 + "/Content/images/loadingCompensar.gif")
          .headers(headers_71),
        http("request_131")
          .get(uri06 + "/Content/font-awesome-4.7.0/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_131)
          .check(status.is(404)),
        http("request_132")
          .get(uri06 + "/fonts/glyphicons-halflings-regular.woff")
          .headers(headers_131)
          .check(status.is(404)),
        http("request_133")
          .get(uri07 + "?id=GTM-5GF54C6"),
        http("request_134")
          .get(uri04 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_52),
        http("request_135")
          .get(uri06 + "/fonts/glyphicons-halflings-regular.ttf")
          .headers(headers_135)
          .check(status.is(404)),
        http("request_136")
          .get(uri03 + "/account/awlorq1lmp/js/main/odc.js"),
        http("request_137")
          .get(uri06 + "/favicon.ico")
          .headers(headers_71),
        http("request_138")
          .get(uri02 + "/analytics.js"),
        http("request_139")
          .get(uri03 + "/common/js/0.0.19/common.js"),
        http("request_140")
          .get(uri03 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js"),
        http("request_141")
          .get(uri02 + "/collect?v=1&_v=j79&a=412492922&t=pageview&_s=1&dl=https%3A%2F%2Fpresso.compensar.com%2Fsso%2Flogin%2Ff0b252536aa16b42832b1952dfa78c40&dr=https%3A%2F%2Fprucorporativo.compensar.com%2F&ul=es-es&de=UTF-8&dt=Autenticaci%C3%B3n%20Compensar&sd=24-bit&sr=1366x768&vp=1349x184&je=0&_u=QACAAEAB~&jid=&gjid=&cid=1982219005.1573748045&tid=UA-90763271-1&_gid=5704781.1573748045&gtm=2wgav35GF54C6&z=1536460800")
          .headers(headers_93),
        http("request_142")
          .get(uri03 + "/account/awlorq1lmp/js/main/odc.js"),
        http("request_143")
          .get(uri03 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js"),
        http("request_144")
          .get(uri12 + "?dcsdat=1573849666530&dcssip=presso.compensar.com&dcsuri=/sso/login/f0b252536aa16b42832b1952dfa78c40&dcsref=https://prucorporativo.compensar.com/&wt.tz=-5&wt.bh=15&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Autenticaci%25C3%25B3n%2520Compensar&wt.js=Yes&wt.bs=1366x184&wt.dl=0&wt.ssl=1&wt.es=presso.compensar.com%252Fsso%252Flogin%252Ff0b252536aa16b42832b1952dfa78c40&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=146edc10-d3e9-43d1-a2a8-ea655d56c57a&wt.co_f=146edc10-d3e9-43d1-a2a8-ea655d56c57a&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_71))
      .check(css("#formLogin","action").saveAs("token"))
      .check(css("[name=\"__RequestVerificationToken\"]","value").saveAs("verificar")))
    .exec { session =>
      val tk = session("token").as[String]
      println(tk)
      println("token")
      session
    }
        .pause(15)
    .exec(http("request_145")
      .post(uri06 + """${token}""")
      //.post(uri06 + "/sso/login/f0b252536aa16b42832b1952dfa78c40")
      .headers(headers_145)
      //.formParam("__RequestVerificationToken", "yDzmuMiWscLLQzXEfG81ptI4t52BkBCKPozHpJAxuMSjEEIsMHNxyQ78v5WWath7xxSHZhcxNbkm4KvniTCia-dmsHZFv-QzONvb4hqIDpM1")
      .formParam("__RequestVerificationToken", """${verificar}""")
      .formParam("DocumentType", "1")
      .formParam("DocumentID", "13718105")
      .formParam("Password", "Ab123456")
      .formParam("GoogleCaptchaToken", "")
      .resources(http("request_146")
        .post("/_trust/default.aspx?trust=IdentityServer&ReturnUrl=/")
        .headers(headers_145)
        .formParam("wa", "wsignin1.0")
        .formParam("wresult", """<trust:RequestSecurityTokenResponseCollection xmlns:trust="http://docs.oasis-open.org/ws-sx/ws-trust/200512"><trust:RequestSecurityTokenResponse Context="https://prucorporativo.compensar.com/sedes/calle-220"><wsp:AppliesTo xmlns:wsp="http://schemas.xmlsoap.org/ws/2004/09/policy"><wsa:EndpointReference xmlns:wsa="http://www.w3.org/2005/08/addressing"><wsa:Address>https://prucorporativo.compensar.com/_trust/</wsa:Address></wsa:EndpointReference></wsp:AppliesTo><trust:RequestedSecurityToken><saml:Assertion MajorVersion="1" MinorVersion="1" AssertionID="_df76bcbe-8ee9-4af8-bd91-e842355e8a68" Issuer="https://presso.compensar.com" IssueInstant="2019-11-15T20:27:47.519Z" xmlns:saml="urn:oasis:names:tc:SAML:1.0:assertion"><saml:Conditions NotBefore="2019-11-15T20:27:47.519Z" NotOnOrAfter="2019-11-15T22:27:47.519Z"><saml:AudienceRestrictionCondition><saml:Audience>https://prucorporativo.compensar.com/_trust/</saml:Audience></saml:AudienceRestrictionCondition></saml:Conditions><saml:AttributeStatement><saml:Subject><saml:NameIdentifier>1|008@13718105-000-00</saml:NameIdentifier><saml:SubjectConfirmation><saml:ConfirmationMethod>urn:oasis:names:tc:SAML:1.0:cm:bearer</saml:ConfirmationMethod></saml:SubjectConfirmation></saml:Subject><saml:Attribute AttributeName="userid" AttributeNamespace="http://schemas.wingtip.com/sharepoint/2009/08/claims"><saml:AttributeValue>008@13718105-000-00</saml:AttributeValue></saml:Attribute><saml:Attribute AttributeName="name" AttributeNamespace="http://schemas.xmlsoap.org/ws/2005/05/identity/claims"><saml:AttributeValue>DIEGO JULIAN JONES NAVAS</saml:AttributeValue></saml:Attribute><saml:Attribute AttributeName="givenname" AttributeNamespace="http://schemas.xmlsoap.org/ws/2005/05/identity/claims"><saml:AttributeValue>DIEGO JULIAN</saml:AttributeValue></saml:Attribute><saml:Attribute AttributeName="emailaddress" AttributeNamespace="http://schemas.xmlsoap.org/ws/2005/05/identity/claims"><saml:AttributeValue>DIEGOJONES7X@XACR4.GOV4.CO</saml:AttributeValue></saml:Attribute><saml:Attribute AttributeName="surname" AttributeNamespace="http://schemas.xmlsoap.org/ws/2005/05/identity/claims"><saml:AttributeValue>JONES NAVAS</saml:AttributeValue></saml:Attribute><saml:Attribute AttributeName="mobilephone" AttributeNamespace="http://schemas.xmlsoap.org/ws/2005/05/identity/claims"><saml:AttributeValue>7112446563</saml:AttributeValue></saml:Attribute><saml:Attribute AttributeName="role" AttributeNamespace="http://schemas.microsoft.com/ws/2008/06/identity/claims"><saml:AttributeValue>Contratante PCE Afiliado Salud</saml:AttributeValue><saml:AttributeValue>Cotizante PBS Salud</saml:AttributeValue></saml:Attribute><saml:Attribute AttributeName="Group" AttributeNamespace="http://schemas.xmlsoap.org/claims"><saml:AttributeValue>{"Group":"Contratante PCE Afiliado Salud","Role":"Contratante PCE Afiliado Salud"}</saml:AttributeValue><saml:AttributeValue>{"Group":"Cotizante PBS Salud","Role":"Cotizante PBS Salud"}</saml:AttributeValue></saml:Attribute></saml:AttributeStatement><saml:AuthenticationStatement AuthenticationMethod="urn:oasis:names:tc:SAML:1.0:am:password" AuthenticationInstant="2019-11-15T20:27:47.519Z"><saml:Subject><saml:NameIdentifier>1|008@13718105-000-00</saml:NameIdentifier><saml:SubjectConfirmation><saml:ConfirmationMethod>urn:oasis:names:tc:SAML:1.0:cm:bearer</saml:ConfirmationMethod></saml:SubjectConfirmation></saml:Subject></saml:AuthenticationStatement><Signature xmlns="http://www.w3.org/2000/09/xmldsig#"><SignedInfo><CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#" /><SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256" /><Reference URI="#_df76bcbe-8ee9-4af8-bd91-e842355e8a68"><Transforms><Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature" /><Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#" /></Transforms><DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256" /><DigestValue>VILsMVwFHbPiSMsniHc+0xvxCbsZCxwLWTTaujJ1f+g=</DigestValue></Reference></SignedInfo><SignatureValue>BO4+lxHnBSVw5POiILfVatEtpvrDYY32750I+4z4ILBzk6NPC00XPbeAVsSFoejftdQGKYW2+IikI5B4bVACL5RO8pUcBHNo3Srpz6XhwU5AFbYSd1yylgMmVMR5Giz8yvP0iO3uKJOjc3T/IR9oFawWJ7iV/lKt9oC8nkGmlXydUd+GQCrLioN/7spLNmX+5OS1HTxc5kpLOuGuEUBtywt5RyYFsaBov8HOJ4Sw3bnKNJEtsvxEyZlGLlQgLFJvU2D6v91gqkPjH+sKOGZNaVf9o3pX7SaRmd95SVJsRXv7BlaIehHZAYaQ+uwrDkLmO6/e+eRSkqUDHSnpczPaMw==</SignatureValue><KeyInfo><X509Data><X509Certificate>MIIFITCCBAmgAwIBAgIQBBcG13KsibT9EJqpxMwgfjANBgkqhkiG9w0BAQsFADBNMQswCQYDVQQGEwJVUzEVMBMGA1UEChMMRGlnaUNlcnQgSW5jMScwJQYDVQQDEx5EaWdpQ2VydCBTSEEyIFNlY3VyZSBTZXJ2ZXIgQ0EwHhcNMTcxMTI4MDAwMDAwWhcNMTkxMjEyMTIwMDAwWjBtMQswCQYDVQQGEwJDTzEPMA0GA1UEBxMGQm9nb3RhMRcwFQYDVQQKEw5Db21wZW5zYXIgTHRkYTEVMBMGA1UECxMMQ3VuZGluYW1hcmNhMR0wGwYDVQQDExRwcmVzc28uY29tcGVuc2FyLmNvbTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAJcxbmdUlWhcvMyBx4vZd9gSociUZ/Oky/y8VaY/NzB8bdY/MYVbJD5qA/GIZGQm7zmWRwJlj0tyyngrVAuCUaQB11Hyd8llC0hMsuFu36X3TYUJzH0Rrgn/CmyLuKN+K40zvZvIVprzv37mx/56CU+GtTClkH4/DNYc9oJb29qxyUGSfbqnBJJ2zQiHOMr9/7ONNn359U3zZqOYu4Iz/lgwW+ysg1pCl8Z/2q/iPt5HPoKrbxTwOGukkeTde1Q0d6glbqt3jwoN+9rWIh3ySm2rgN1V8w6gWZv5w3Y3XolKoPNY5nKaj2Z1trQOm/OeXAAxTzowRiBmiXa9jmgvRBkCAwEAAaOCAdswggHXMB8GA1UdIwQYMBaAFA+AYRyCMWHVLyjnjUY4tCzhxtniMB0GA1UdDgQWBBSYnU89Gb+qmbnZA5Q0gysgpdF0zzAfBgNVHREEGDAWghRwcmVzc28uY29tcGVuc2FyLmNvbTAOBgNVHQ8BAf8EBAMCBaAwHQYDVR0lBBYwFAYIKwYBBQUHAwEGCCsGAQUFBwMCMGsGA1UdHwRkMGIwL6AtoCuGKWh0dHA6Ly9jcmwzLmRpZ2ljZXJ0LmNvbS9zc2NhLXNoYTItZzYuY3JsMC+gLaArhilodHRwOi8vY3JsNC5kaWdpY2VydC5jb20vc3NjYS1zaGEyLWc2LmNybDBMBgNVHSAERTBDMDcGCWCGSAGG/WwBATAqMCgGCCsGAQUFBwIBFhxodHRwczovL3d3dy5kaWdpY2VydC5jb20vQ1BTMAgGBmeBDAECAjB8BggrBgEFBQcBAQRwMG4wJAYIKwYBBQUHMAGGGGh0dHA6Ly9vY3NwLmRpZ2ljZXJ0LmNvbTBGBggrBgEFBQcwAoY6aHR0cDovL2NhY2VydHMuZGlnaWNlcnQuY29tL0RpZ2lDZXJ0U0hBMlNlY3VyZVNlcnZlckNBLmNydDAMBgNVHRMBAf8EAjAAMA0GCSqGSIb3DQEBCwUAA4IBAQDF89Hs4PvtVeErCaIxiEExkYKYVjrTk+qJlBsElUVDCW0icLCr2os3kKFDslUJMZShiTk1jepWqR8EAyyhtyvW3Bo9ISfGFw/ny1rM4hKnqCsL81iI8xm6J6w93qXAvLEZTExy5yAuA7sooBe1c1Zu0ow7LMitn4IXp4Ew0wlAkCMOp0OuaxeqLUMI6+xxAeZ0q8DFYHaa+l0zKdGYyNFg8EEu4Yw+D8wm9jdRTXXhWdszSL3Ozt8KS3gId/pW/xTfPfxVpQvA7b2fJmAFqp3mYNx1l9F7Fqy9g5VTLp3OV1wS+bOiMSwqeeJCg58B4BaVnf/ZgsZyAd598OS0Fwse</X509Certificate></X509Data></KeyInfo></Signature></saml:Assertion></trust:RequestedSecurityToken></trust:RequestSecurityTokenResponse></trust:RequestSecurityTokenResponseCollection>""")
        .formParam("wctx", "https://prucorporativo.compensar.com/sedes/calle-220"),
        http("request_147")
          .get("/_catalogs/masterpage/starter/minisp.min.js"),
        http("request_148")
          .get("/_layouts/15/init.js?rev=ZwTQYqYlNTyyuMWaLlhwSg%3D%3D"),
        http("request_149")
          .get("/style%20library/vendor/jquery-3.1.1.min.js"),
        http("request_150")
          .get("/style%20library/js/datalayercorporativo.min.js"),
        http("request_151")
          .get("/style%20library/vendor/bluebird.min.js"),
        http("request_152")
          .get("/style%20library/vendor/bootstrap.min.js"),
        http("request_153")
          .get("/style%20library/js/jquery.spservices-2014.02.min.js"),
        http("request_154")
          .get("/Style%20Library/vendor/knockout-3.4.1.min.js?v=1"),
        http("request_155")
          .get("/style%20library/vendor/ko.sp-1.0.min.js"),
        http("request_156")
          .get("/style%20library/vendor/slick.min.js"),
        http("request_157")
          .get("/style%20library/vendor/rangeslider.min.js"),
        http("request_158")
          .get("/style%20library/vendor/ion.rangeslider.min.js"),
        http("request_159")
          .get("/style%20library/vendor/picturefill.min.js"),
        http("request_160")
          .get("/style%20library/vendor/validate.min.js"),
        http("request_161")
          .get("/style%20library/vendor/jquery.validate.min.js"),
        http("request_162")
          .get("/style%20library/vendor/croppie.min.js"),
        http("request_163")
          .get("/Style%20Library/js/afiliaciones.config.js?v=5"),
        http("request_164")
          .get("/Style%20Library/js/compTools.min.js?v=1"),
        http("request_165")
          .get("/style%20library/js/compensar.script.min.js"),
        http("request_166")
          .get("/style%20library/js/compensar.actualizarcorreo.min.js"),
        http("request_167")
          .get("/style%20library/js/sjcl/sjcl.min.js"),
        http("request_168")
          .get("/Style%20Library/js/compensar.loadComponents.min.js?v=1"),
        http("request_169")
          .get("/Style%20Library/js/compensar.tiempoInactividad.min.js?v=1"),
        http("request_170")
          .get("/Style%20Library/js/compensar.enModoEdicion.min.js?v=1"),
        http("request_171")
          .get("/Style%20Library/js/compensar.detectarAncho.min.js?v=1"),
        http("request_172")
          .get("/Style%20Library/js/compensar.deferImages.min.js?v=1"),
        http("request_173")
          .get("/Style%20Library/js/compensar.agregarTitulowebparts.min.js?v=1"),
        http("request_174")
          .get("/Style%20Library/js/compensar.menuDesplegable.min.js?v=1"),
        http("request_175")
          .get("/Style%20Library/js/compensar.miCompensarPerfil.min.js?v=1"),
        http("request_176")
          .get("/Style%20Library/js/compensar.controlPestanas.min.js?v=1"),
        http("request_177")
          .get("/Style%20Library/js/compensar.controlAcordeon.min.js?v=1"),
        http("request_178")
          .get("/Style%20Library/js/compensar.filtroControlerVivienda.min.js?v=1"),
        http("request_179")
          .get("/Style%20Library/js/mainContent.min.js?v=1"),
        http("request_180")
          .get("/Style%20Library/js/headerNav.min.js?v=1"),
        http("request_181")
          .get("/Style%20Library/js/ko/modeloMenuAux.min.js?v=1"),
        http("request_182")
          .get("/Style%20Library/js/compensar.menuSecundario.min.js?v=1"),
        http("request_183")
          .get("/Style%20Library/js/compensar.quitarLoading.min.js?v=1"),
        http("request_184")
          .get("/Style%20Library/js/compensar.componenteEmailController.min.js?v=1"),
        http("request_185")
          .get("/Style%20Library/js/compensar.footer.min.js?v=1"),
        http("request_186")
          .get("/Style%20Library/js/compensar.componentePopUpController.min.js?v=1"),
        http("request_187")
          .get("/style%20library/js/compensar.notificaciones.min.js"),
        http("request_188")
          .get("/style%20library/js/customcanales.min.js"),
        http("request_189")
          .get("/_layouts/15/compensar.portal.farm/customactioncall.js"),
        http("request_190")
          .get("/ScriptResource.axd?d=DbBIHdj-QC5CO88xwauS5dkoqIs6nZmS0i8rusZB1q2JCx1O17otX38Pbo9-Co9QXf_ywgPOgCaWxydR-v-KO_BCuip-vRkoHzjnd81XPEqYhrrZRFvD28DBse-3zjaVmjdm2hC17AQqDXfxT3KoyoLs-sQ7qPLfqrjuPJokLcOn_d3Dmrsd446-Hg6mDbff0&t=2b48f70a"),
        http("request_191")
          .get("/_layouts/15/blank.js?rev=ZaOXZEobVwykPO9g8hq%2F8A%3D%3D"),
        http("request_192")
          .get("/ScriptResource.axd?d=LzPGXWTyY4NfgAzL7AVGti8jNkeNvyxE7t2p3M-3BPJvKFvvkBUGxbbcxESn55TFNOUl8xW6SvygFDc-U8cavgouTpfnyDz3b86dyb2Q1b12B-B2zqJbKL3UrhnjJpkL79pBm9zX4FVDPUA4BsjrvCFATMYLp3cyBtLpIkBKZKUxDrfJga0vw4ZjurZ0mn1o0&t=2b48f70a"),
        http("request_193")
          .get("/_layouts/15/sp.init.js?rev=jvJC3Kl5gbORaLtf7kxULQ%3D%3D"),
        http("request_194")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=SP%2ERes&rev=DoAHv8R6TO7rl33LcYBJTA%3D%3D"),
        http("request_195")
          .get("/_layouts/15/sp.runtime.js?rev=5f2WkYJoaxlIRdwUeg4WEg%3D%3D"),
        http("request_196")
          .get("/_layouts/15/sp.search.js?rev=dMkPlEXpdY6iJ%2FsY5RsB0g%3D%3D"),
        http("request_197")
          .get("/_layouts/15/clientrenderer.js?rev=PWwV4FATEiOxN90BeB5Hzw%3D%3D"),
        http("request_198")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=Srch%2EResources&rev=GVo354neq7eNTurLgIdpJQ%3D%3D"),
        http("request_199")
          .get("/_layouts/15/search.clientcontrols.js?rev=8Q15HW2EU2aXBktJq5YW%2FA%3D%3D"),
        http("request_200")
          .get("/_layouts/15/search.cbs.js?rev=S5EegsQhNKgWxVFmcqr5dQ%3D%3D"),
        http("request_201")
          .get("/WebResource.axd?d=hcspxoKGngdkW0b6xYvFftMD9L7tgVctZKvxUqyhcPMOX4gSlmQgLLYGJ7F9lMuasHqe9Mv5x6g7VZmrwkJEQmLxw_pNwohGyqmgqyaeGpA1&t=636767428042202005"),
        http("request_202")
          .get("/style%20library/js/ParqueaderosV2.js"),
        http("request_203")
          .get(uri04 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_52),
        http("request_204")
          .get(uri01 + "/maps/api/js?key=AIzaSyBQs4JbPCHOPygyJzKnUYgsAm35jOpmshk"),
        http("request_205")
          .get("/Style%20Library/js/mainContentInterno.js"),
        http("request_206")
          .get(uri07 + "?id=GTM-5GF54C6"),
        http("request_207")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_58),
        http("request_208")
          .get("/style%20library/Parqueaderos/css/estilos.css")
          .headers(headers_58),
        http("request_209")
          .get("/style%20library/css/compensar.detallevivienda.min.css?ctag=5143$$15.0.4927.1000")
          .headers(headers_58),
        http("request_210")
          .get("/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_58),
        http("request_211")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_58),
        http("request_212")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_58),
        http("request_213")
          .get(uri04 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3Dhttps%253A%252F%252Fpresso.compensar.com%252F%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fsedes%252Fcalle-220%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&ids=1%3D9999805063371246&pd=-798768278%7CTQAAAApVAwDpQ2hfXBL3TBA5OTk5ODA1MDYzMzcxMjQ2ARIAAUIAsQQVmAYAI8w2Ogpq10i%2BSfagHWnXSAAAAAD%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwAGRGlyZWN0AVwSBgAAAAAAAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwUAQwsBAH4ZW7cRXBIA%2F%2F%2F%2F%2FwFcEl0S%2F%2F81AAABAAAAAAEBcAIATbEDAACgCQEALHIDGOddEgD%2F%2F%2F%2F%2FAV0SXRL%2F%2FxQAAAEAAAAAAZlrAgB3rQMAAIwMAQCcCwv6J10SAP%2F%2F%2F%2F8BXRJdEv%2F%2FAgAAAQAAAAABj3MCAJK1AwAA6QkBAAjAt%2FKmXRIA%2F%2F%2F%2F%2FwFdEl0S%2F%2F8CAAABAAAAAAFUbAIAuKwDAADoCQEAKHv0gGFdEgD%2F%2F%2F%2F%2FAV0SXRL%2F%2FwIAAAEAAAAAAVNsAgCyrAMAAAAAAAAAAUU%3D&bid=nycvwcgus05&srv=nycvwcgus05")
          .headers(headers_52),
        http("request_214")
          .get(uri04 + "/platform/us/api/mmpackage-1.17.js"),
        http("request_215")
          .get(uri04 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3Dhttps%253A%252F%252Fpresso.compensar.com%252F%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fsedes%252Fcalle-220%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B2%5D&ri=2&lto=-300&jrt=s&ids=1%3D9999805063371246&pd=-1693140810%7CTgAAAApVAwDpQ2hfXBL3TBA5OTk5ODA1MDYzMzcxMjQ2ARIAAUIAsQQVmAYAT2IpSQpq10i%2BSfagHWnXSAAAAAD%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwAGRGlyZWN0AVwSBgAAAAAAAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwUAQwsBAH4ZW7cRXBIA%2F%2F%2F%2F%2FwFcEl0S%2F%2F82AAABAAAAAAEBcAIATbEDAACgCQEALHIDGOddEgD%2F%2F%2F%2F%2FAV0SXRL%2F%2FxQAAAEAAAAAAZlrAgB3rQMAAIwMAQCcCwv6J10SAP%2F%2F%2F%2F8BXRJdEv%2F%2FAgAAAQAAAAABj3MCAJK1AwAA6QkBAAjAt%2FKmXRIA%2F%2F%2F%2F%2FwFdEl0S%2F%2F8CAAABAAAAAAFUbAIAuKwDAADoCQEAKHv0gGFdEgD%2F%2F%2F%2F%2FAV0SXRL%2F%2FwIAAAEAAAAAAVNsAgCyrAMAAAAAAAAAAUU%3D&bid=nycvwcgus05&srv=nycvwcgus05&pageid=&pp=MDY4MDcy")
          .headers(headers_52),
        http("request_216")
          .get("/_layouts/15/blank.js?rev=ZaOXZEobVwykPO9g8hq%2F8A%3D%3D"),
        http("request_217")
          .get("/PublishingImages/logo-compensar-gris.svg")
          .headers(headers_71),
        http("request_218")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D"),
        http("request_219")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D"),
        http("request_220")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=22842$$15.0.5131.1000"),
        http("request_221")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22842$$15.0.5131.1000"),
        http("request_222")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=22842$$15.0.5131.1000"),
        http("request_223")
          .get("/_catalogs/masterpage/item_compensar_testdetallesede.js?ctag=22842$$15.0.5131.1000"),
        http("request_224")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_testdetallesede.js?ctag=22842$$15.0.5131.1000"),
        http("request_225")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_novedades.js?ctag=22842$$15.0.5131.1000"),
        http("request_226")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_novedades.js?ctag=22842$$15.0.5131.1000"),
        http("request_227")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D"),
        http("request_228")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D"),
        http("request_229")
          .get("/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22842$$15.0.5131.1000"),
        http("request_230")
          .get("/style%20library/css/compensar.tendencias.css?ctag=22842$$15.0.5131.1000")
          .headers(headers_58),
        http("request_231")
          .get("/style%20library/js/compensar.detallesedes.min.js?ctag=22842$$15.0.5131.1000"),
        http("request_232")
          .get(uri04 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_52),
        http("request_233")
          .get(uri03 + "/account/awlorq1lmp/js/main/odc.js"),
        http("request_234")
          .get("/style%20library/css/compensar.detallesedes.min.css?ctag=22842$$15.0.5131.1000")
          .headers(headers_58),
        http("request_235")
          .get("/style%20library/js/compensar.novedades.min.js?ctag=22842$$15.0.5131.1000"),
        http("request_236")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D"),
        http("request_237")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D"),
        http("request_238")
          .post("/_api/contextinfo")
          .headers(headers_76),
        http("request_239")
          .get(uri03 + "/common/js/0.0.19/common.js"),
        http("request_240")
          .get(uri03 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js"),
        http("request_241")
          .post("/_vti_bin/General/ServicioGeneral.svc/GetZonaUsuarioNodos")
          .headers(headers_241),
        http("request_242")
          .get(uri03 + "/account/awlorq1lmp/js/main/odc.js"),
        http("request_243")
          .post("/_api/contextinfo")
          .headers(headers_76),
        http("request_244")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_71),
        http("request_245")
          .post("/_api/contextinfo")
          .headers(headers_76),
        http("request_246")
          .post("/_api/contextinfo")
          .headers(headers_76),
        http("request_247")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_100),
        http("request_248")
          .post("/_api/contextinfo")
          .headers(headers_76),
        http("request_249")
          .get(uri03 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js"),
        http("request_250")
          .get(uri12 + "?dcsdat=1573849688529&dcssip=prucorporativo.compensar.com&dcsuri=/sedes/calle-220&dcsref=https://presso.compensar.com/&wt.tz=-5&wt.bh=15&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Sedes&wt.js=Yes&wt.bs=1366x610&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252Fsedes%252Fcalle-220&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=23b3056a-fdf0-4f91-9825-753516697db8&wt.co_f=23b3056a-fdf0-4f91-9825-753516697db8&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_71),
        http("request_251")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_251)
          .body(RawFileBody("/sede200adultoautenticado/0251_request.dat")),
        http("request_252")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_251)
          .body(RawFileBody("/sede200adultoautenticado/0252_request.dat")),
        http("request_253")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_253)
          .body(RawFileBody("/sede200adultoautenticado/0253_request.dat")),
        http("request_254")
          .get("/_vti_bin/notificaciones/ServicioNotificaciones.svc/GetNotificaciones")
          .headers(headers_254),
        http("request_255")
          .get("/_vti_bin/Sincronizacion/ServicioSincUsuario.svc/ConsultaUltimaConexion/008@13718105-000-00/No?{}")
          .headers(headers_255),
        http("request_256")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_251)
          .body(RawFileBody("/sede200adultoautenticado/0256_request.dat")),
        http("request_257")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_251)
          .body(RawFileBody("/sede200adultoautenticado/0257_request.dat")),
        http("request_258")
          .get("/Style%20Library/vendor/slick.css")
          .headers(headers_58),
        http("request_259")
          .get("/Style%20Library/vendor/slick-theme.css")
          .headers(headers_58),
        http("request_260")
          .get("/Style%20Library/css/compensar.carouselTheme.min.css")
          .headers(headers_58),
        http("request_261")
          .get("/_api/web/lists/GetByTitle('Imagenes%20Sedes')/items?$select=Title,File,NombreSedeLookup_ListSedes/NombreSede&$expand=NombreSedeLookup_ListSedes,File&$top=5&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27")
          .headers(headers_261),
        http("request_262")
          .get("/_vti_bin/Clientes/ServicioClientes.svc/tipodocumento/1/documento/13718105")
          .headers(headers_254),
        http("request_263")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_ALL/common.js"),
        http("request_264")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_ALL/util.js"),
        http("request_265")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_ALL/map.js"),
        http("request_266")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_ALL/marker.js"),
        http("request_267")
          .get("/_api/web/lists/GetByTitle('Sedes%20Otros%20Servicios')/items?$select=Descripcion,Horario,NombreMultiTexto,NombreSedeLookup_ListSedes/NombreSede&$expand=NombreSedeLookup_ListSedes&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27%20and%20ContentType%20eq%20%27Tarifas%27")
          .headers(headers_261),
        http("request_268")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_ALL/geometry.js"),
        http("request_269")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_ALL/directions.js"),
        http("request_270")
          .get("/_api/web/lists/GetByTitle('Sedes%20Otros%20Servicios')/items?$select=Descripcion,Horario,NombreMultiTexto,NombreSedeLookup_ListSedes/NombreSede&$expand=NombreSedeLookup_ListSedes&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27%20and%20ContentType%20eq%20%27Alimentos%27")
          .headers(headers_261),
        http("request_271")
          .get("/Style%20Library/fonts/glyphicons-halflings-regular.woff2")
          .headers(headers_131),
        http("request_272")
          .get("/_api/web/lists/GetByTitle('Sedes%20Otros%20Servicios')/items?$select=Descripcion,Horario,NombreMultiTexto,NombreSedeLookup_ListSedes/NombreSede&$expand=NombreSedeLookup_ListSedes&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27%20and%20ContentType%20eq%20%27Otros%20Servicios%27")
          .headers(headers_261),
        http("request_273")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_ALL/onion.js"),
        http("request_274")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_ALL/infowindow.js"),
        http("request_275")
          .get(uri10 + "/KFOlCnqEu92Fr1MmWUlfBBc4.woff2")
          .headers(headers_275),
        http("request_276")
          .get(uri10 + "/KFOlCnqEu92Fr1MmSU5fBBc4.woff2")
          .headers(headers_275),
        http("request_277")
          .get("/_api/web/lists/GetByTitle('Servicios%20Sedes')/items?$select=Tramite,Horario,Ubicacion,Servicio_ListServicios/NombreTexto,NombreSedeLookup_ListSedes/NombreSede&$expand=Servicio_ListServicios,NombreSedeLookup_ListSedes&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27")
          .headers(headers_261),
        http("request_278")
          .get(uri02 + "/analytics.js"),
        http("request_279")
          .get(uri02 + "/r/collect?v=1&_v=j79&a=2040996014&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2Fsedes%2Fcalle-220&dr=https%3A%2F%2Fpresso.compensar.com%2F&ul=es-es&de=UTF-8&dt=Sedes&sd=24-bit&sr=1366x768&vp=1349x610&je=0&_u=QACAAEAB~&jid=225518787&gjid=734075769&cid=1982219005.1573748045&tid=UA-90763271-1&_gid=5704781.1573748045&_r=1&gtm=2wgav35GF54C6&z=715714177")
          .headers(headers_93),
        http("request_280")
          .get(uri05 + "?v=1&aip=1&t=dc&_r=3&tid=UA-90763271-1&cid=1982219005.1573748045&jid=225518787&_gid=5704781.1573748045&gjid=734075769&_v=j79&z=715714177")
          .headers(headers_93),
        http("request_281")
          .get("/sedes/calle-220?t=1573849687603")
          .headers(headers_71),
        http("request_282")
          .get(uri08)))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
  //setUp(scn.inject(constantUsersPerSec(2) during  (300)).protocols(httpConf)).maxDuration(300)
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
)*/
}