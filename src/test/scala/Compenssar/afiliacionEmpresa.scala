package Compenssar


import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class afiliacionEmpresa extends Simulation {

  val httpProtocol = http
    .baseUrl("https://prucorporativo.compensar.com")
    .inferHtmlResources()
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.120 Safari/537.36")

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "none",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_1 = Map("Sec-Fetch-Mode" -> "no-cors")

  val headers_60 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_76 = Map(
    "Intervention" -> """<https://www.chromestatus.com/feature/5718547946799104>; level="warning"""",
    "Sec-Fetch-Mode" -> "no-cors")

  val headers_79 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_80 = Map(
    "ACCEPT" -> "application/json;odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_108 = Map(
    "Accept" -> "application/json; odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> "text/plain",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_110 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-RequestDigest" -> "0x263124145E4EDEA6823DF8F3AB9C7F33CB509647121462803C80A58FBF84B1A947E5C3EF1742DCAF0EEC96F96DD1151228A249EC5BE9DCFFDD185E38E8CA9143,25 Oct 2019 21:34:33 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_128 = Map(
    "Accept" -> "application/xml, text/xml, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> """text/xml;charset="UTF-8"""",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_129 = Map(
    "Accept" -> "application/xml, text/xml, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> "text/xml;charset='UTF-8'",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_147 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_255 = Map(
    "ACCEPT" -> "application/json;odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_261 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "sec-fetch-mode" -> "nested-navigate",
    "sec-fetch-site" -> "cross-site",
    "upgrade-insecure-requests" -> "1",
    "x-client-data" -> "CIy2yQEIo7bJAQjAtskBCKmdygEI2p/KAQjiqMoBCMuuygEIyq/KAQjOsMoBCPW0ygE=")

  val headers_269 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-RequestDigest" -> "0x3252C2E7F048A9BDEF247C700832D9B7141C039E1ECCD96EA034AB5C7717CC62BD2461427711131EE0031ACB6A18ECD74EAFEB9A6ED3E7891231E4A1086BF9B4,25 Oct 2019 21:34:41 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_275 = Map(
    "Origin" -> "https://www.google.com",
    "Sec-Fetch-Mode" -> "cors")

  val headers_277 = Map("Sec-Fetch-Mode" -> "same-origin")

  val headers_396 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-RequestDigest" -> "0xBB41E1066C332DBBAAA54F8D5F019BA768E4CF8F9E415F4BAE9A8B42E7590D17618EAF32DB431349D84D352AB92FB4D16CC7841CE6A4B90B257333BDEADD1E99,25 Oct 2019 21:34:51 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_418 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "content-type" -> "application/x-www-form-urlencoded;charset=UTF-8",
    "origin" -> "https://www.google.com",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-client-data" -> "CIy2yQEIo7bJAQjAtskBCKmdygEI2p/KAQjiqMoBCMuuygEIyq/KAQjOsMoBCPW0ygE=")

  val headers_427 = Map(
    "ACCEPT" -> "application/json;odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> "application/json",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val uri01 = "https://www.google-analytics.com"
  val uri02 = "https://c.oracleinfinity.io/acs"
  val uri03 = "https://service.maxymiser.net"
  val uri04 = "https://stats.g.doubleclick.net/r/collect"
  val uri05 = "https://www.compensar.com/img/2016"
  val uri06 = "https://www.cesarcancino.com/codigos/js/base_64.js"
  val uri07 = "https://www.googletagmanager.com/gtm.js"
  val uri08 = "https://www.google.com"
  val uri10 = "https://fonts.gstatic.com/s/roboto/v18"
  val uri11 = "https://www.gstatic.com/recaptcha"
  val uri12 = "https://dc.oracleinfinity.io/awlorq1lmp/dcs.gif"

  val scn = scenario("afiliacionEmpresa")
    .exec(http("request_0")
      .get("/")
      .headers(headers_0)
      .resources(http("request_1")
        .get("/_catalogs/masterpage/starter/minisp.min.js")
        .headers(headers_1),
        http("request_2")
          .get("/_layouts/15/init.js?rev=ZwTQYqYlNTyyuMWaLlhwSg%3D%3D")
          .headers(headers_1),
        http("request_3")
          .get("/style%20library/vendor/jquery-3.1.1.min.js")
          .headers(headers_1),
        http("request_4")
          .get("/style%20library/js/datalayercorporativo.min.js")
          .headers(headers_1),
        http("request_5")
          .get("/style%20library/vendor/bluebird.min.js")
          .headers(headers_1),
        http("request_6")
          .get("/style%20library/vendor/bootstrap.min.js")
          .headers(headers_1),
        http("request_7")
          .get("/style%20library/js/jquery.spservices-2014.02.min.js")
          .headers(headers_1),
        http("request_8")
          .get("/Style%20Library/vendor/knockout-3.4.1.min.js?v=1")
          .headers(headers_1),
        http("request_9")
          .get("/style%20library/vendor/ko.sp-1.0.min.js")
          .headers(headers_1),
        http("request_10")
          .get("/style%20library/vendor/slick.min.js")
          .headers(headers_1),
        http("request_11")
          .get("/style%20library/vendor/rangeslider.min.js")
          .headers(headers_1),
        http("request_12")
          .get("/style%20library/vendor/ion.rangeslider.min.js")
          .headers(headers_1),
        http("request_13")
          .get("/style%20library/vendor/picturefill.min.js")
          .headers(headers_1),
        http("request_14")
          .get("/style%20library/vendor/validate.min.js")
          .headers(headers_1),
        http("request_15")
          .get("/style%20library/vendor/jquery.validate.min.js")
          .headers(headers_1),
        http("request_16")
          .get("/style%20library/vendor/croppie.min.js")
          .headers(headers_1),
        http("request_17")
          .get("/style%20library/js/afiliaciones.config.js")
          .headers(headers_1),
        http("request_18")
          .get("/Style%20Library/js/compTools.min.js?v=1")
          .headers(headers_1),
        http("request_19")
          .get("/style%20library/js/compensar.script.min.js")
          .headers(headers_1),
        http("request_20")
          .get("/style%20library/js/compensar.actualizarcorreo.min.js")
          .headers(headers_1),
        http("request_21")
          .get("/style%20library/js/sjcl/sjcl.min.js")
          .headers(headers_1),
        http("request_22")
          .get("/Style%20Library/js/compensar.loadComponents.min.js?v=1")
          .headers(headers_1),
        http("request_23")
          .get("/Style%20Library/js/compensar.tiempoInactividad.min.js?v=1")
          .headers(headers_1),
        http("request_24")
          .get("/Style%20Library/js/compensar.enModoEdicion.min.js?v=1")
          .headers(headers_1),
        http("request_25")
          .get("/Style%20Library/js/compensar.detectarAncho.min.js?v=1")
          .headers(headers_1),
        http("request_26")
          .get("/Style%20Library/js/compensar.deferImages.min.js?v=1")
          .headers(headers_1),
        http("request_27")
          .get("/Style%20Library/js/compensar.agregarTitulowebparts.min.js?v=1")
          .headers(headers_1),
        http("request_28")
          .get("/Style%20Library/js/compensar.menuDesplegable.min.js?v=1")
          .headers(headers_1),
        http("request_29")
          .get("/Style%20Library/js/compensar.miCompensarPerfil.min.js?v=1")
          .headers(headers_1),
        http("request_30")
          .get("/Style%20Library/js/compensar.controlPestanas.min.js?v=1")
          .headers(headers_1),
        http("request_31")
          .get("/Style%20Library/js/compensar.controlAcordeon.min.js?v=1")
          .headers(headers_1),
        http("request_32")
          .get("/Style%20Library/js/compensar.filtroControlerVivienda.min.js?v=1")
          .headers(headers_1),
        http("request_33")
          .get("/Style%20Library/js/mainContent.min.js?v=1")
          .headers(headers_1),
        http("request_34")
          .get("/Style%20Library/js/headerNav.min.js?v=1")
          .headers(headers_1),
        http("request_35")
          .get("/Style%20Library/js/ko/modeloMenuAux.min.js?v=1")
          .headers(headers_1),
        http("request_36")
          .get("/Style%20Library/js/compensar.menuSecundario.min.js?v=1")
          .headers(headers_1),
        http("request_37")
          .get("/Style%20Library/js/compensar.quitarLoading.min.js?v=1")
          .headers(headers_1),
        http("request_38")
          .get("/Style%20Library/js/compensar.componenteEmailController.min.js?v=1")
          .headers(headers_1),
        http("request_39")
          .get("/Style%20Library/js/compensar.componentePopUpController.min.js?v=1")
          .headers(headers_1),
        http("request_40")
          .get("/style%20library/js/compensar.notificaciones.min.js")
          .headers(headers_1),
        http("request_41")
          .get("/style%20library/js/customcanales.min.js")
          .headers(headers_1),
        http("request_42")
          .get("/_layouts/15/compensar.portal.farm/customactioncall.js")
          .headers(headers_1),
        http("request_43")
          .get("/ScriptResource.axd?d=DbBIHdj-QC5CO88xwauS5dkoqIs6nZmS0i8rusZB1q2JCx1O17otX38Pbo9-Co9QXf_ywgPOgCaWxydR-v-KO_BCuip-vRkoHzjnd81XPEqYhrrZRFvD28DBse-3zjaVmjdm2hC17AQqDXfxT3KoyoLs-sQ7qPLfqrjuPJokLcOn_d3Dmrsd446-Hg6mDbff0&t=72e85ccd")
          .headers(headers_1),
        http("request_44")
          .get("/_layouts/15/blank.js?rev=ZaOXZEobVwykPO9g8hq%2F8A%3D%3D")
          .headers(headers_1),
        http("request_45")
          .get("/ScriptResource.axd?d=LzPGXWTyY4NfgAzL7AVGti8jNkeNvyxE7t2p3M-3BPJvKFvvkBUGxbbcxESn55TFNOUl8xW6SvygFDc-U8cavgouTpfnyDz3b86dyb2Q1b12B-B2zqJbKL3UrhnjJpkL79pBm9zX4FVDPUA4BsjrvCFATMYLp3cyBtLpIkBKZKUxDrfJga0vw4ZjurZ0mn1o0&t=72e85ccd")
          .headers(headers_1),
        http("request_46")
          .get("/_layouts/15/sp.init.js?rev=jvJC3Kl5gbORaLtf7kxULQ%3D%3D")
          .headers(headers_1),
        http("request_47")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=SP%2ERes&rev=DoAHv8R6TO7rl33LcYBJTA%3D%3D")
          .headers(headers_1),
        http("request_48")
          .get("/_layouts/15/sp.runtime.js?rev=5f2WkYJoaxlIRdwUeg4WEg%3D%3D")
          .headers(headers_1),
        http("request_49")
          .get("/_layouts/15/sp.search.js?rev=dMkPlEXpdY6iJ%2FsY5RsB0g%3D%3D")
          .headers(headers_1),
        http("request_50")
          .get("/_layouts/15/clientrenderer.js?rev=PWwV4FATEiOxN90BeB5Hzw%3D%3D")
          .headers(headers_1),
        http("request_51")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=Srch%2EResources&rev=GVo354neq7eNTurLgIdpJQ%3D%3D")
          .headers(headers_1),
        http("request_52")
          .get("/_layouts/15/search.clientcontrols.js?rev=8Q15HW2EU2aXBktJq5YW%2FA%3D%3D")
          .headers(headers_1),
        http("request_53")
          .get("/_layouts/15/search.cbs.js?rev=S5EegsQhNKgWxVFmcqr5dQ%3D%3D")
          .headers(headers_1),
        http("request_54")
          .get("/PublishingImages/favicon.ico?rev=23")
          .headers(headers_1),
        http("request_55")
          .get("/_layouts/15/images/spcommon.png?rev=23")
          .headers(headers_1),
        http("request_56")
          .get("/PublishingImages/logo_compensar.png?rev=23")
          .headers(headers_1),
        http("request_57")
          .get("/WebResource.axd?d=hcspxoKGngdkW0b6xYvFftMD9L7tgVctZKvxUqyhcPMOX4gSlmQgLLYGJ7F9lMuasHqe9Mv5x6g7VZmrwkJEQmLxw_pNwohGyqmgqyaeGpA1&t=635792838349294682")
          .headers(headers_1),
        http("request_58")
          .get("/PublishingImages/logo_compensar.png")
          .headers(headers_1),
        http("request_59")
          .get(uri07 + "?id=GTM-5GF54C6")
          .headers(headers_1),
        http("request_60")
          .get("/PublishingImages/logo-compensar-gris.svg")
          .headers(headers_60),
        http("request_61")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_62")
          .get("/_layouts/15/images/searchresultui.png?rev=23")
          .headers(headers_1),
        http("request_63")
          .get("/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_1),
        http("request_64")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_1),
        http("request_65")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_1),
        http("request_66")
          .get(uri03 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_1),
        http("request_67")
          .get("/Style%20Library/js/datalayerCorporativo.js")
          .headers(headers_1),
        http("request_68")
          .get(uri06)
          .headers(headers_1),
        http("request_69")
          .get("/Style%20Library/js/browsers/jquery.mb.browser.js")
          .headers(headers_1),
        http("request_70")
          .get("/Style%20Library/webparts/productosDestacados/productosDestacados.min.css?v=1")
          .headers(headers_1),
        http("request_71")
          .get("/Style%20Library/webparts/productosDestacados/ProductosDestacados.min.js?v=1")
          .headers(headers_1),
        http("request_72")
          .get("/PublishingImages/40-anos/banner-200.jpg")
          .headers(headers_1),
        http("request_73")
          .get(uri01 + "/analytics.js")
          .headers(headers_1),
        http("request_74")
          .get("/PublishingImages/banner-firma-digital-prospectados.png")
          .headers(headers_1),
        http("request_75")
          .get(uri01 + "/collect?v=1&_v=j79&a=1360420776&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2F&ul=es-es&de=UTF-8&dt=Compensar%20Caja%20de%20Compensaci%C3%B3n%20Familiar%20home&sd=24-bit&sr=1366x768&vp=1366x400&je=0&_u=QACAAEAB~&jid=&gjid=&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&gtm=2wgaa05GF54C6&z=17292919")
          .headers(headers_1),
        http("request_76")
          .get(uri03 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252F%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&pd=-723455442%7CFgAAAApVAwDcYaCCPxIDZAABEgABQgCFdZ%2BHAwAe7yUak1nXSMUHQGJSUtdIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBSBICAAEAAAAAAAAA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAAAAAAAAAFF&bid=nycvwcgus05&srv=nycvwcgus05")
          .headers(headers_76),
        http("request_77")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D")
          .headers(headers_1),
        http("request_78")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D")
          .headers(headers_1),
        http("request_79")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_79),
        http("request_80")
          .post("/_api/contextinfo")
          .headers(headers_80),
        http("request_81")
          .post("/_api/contextinfo")
          .headers(headers_80),
        http("request_82")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_bannerhome.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_83")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_84")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_bannerhome.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_85")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_enlacesinteres_nuevo.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_86")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_enlacesinteres.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_87")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_88")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_89")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_enlacedirectos2.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_90")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_enlacesdirectos.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_91")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_novedades.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_92")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_novedades.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_93")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_noticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_94")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_noticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_95")
          .post("/_api/contextinfo")
          .headers(headers_80),
        http("request_96")
          .post("/_api/contextinfo")
          .headers(headers_80),
        http("request_97")
          .post("/_api/contextinfo")
          .headers(headers_80),
        http("request_98")
          .get(uri05 + "/icon-face.png")
          .headers(headers_1),
        http("request_99")
          .get(uri05 + "/icon-twitter.png")
          .headers(headers_1),
        http("request_100")
          .get("/Style%20Library/images/dashLine.png")
          .headers(headers_1),
        http("request_101")
          .get(uri05 + "/icon-youtube.png")
          .headers(headers_1),
        http("request_102")
          .get(uri05 + "/icon-linkedin.png")
          .headers(headers_1),
        http("request_103")
          .get(uri05 + "/icon-instagram.png")
          .headers(headers_1),
        http("request_104")
          .post("/_api/contextinfo")
          .headers(headers_80),
        http("request_105")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_79),
        http("request_106")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_79),
        http("request_107")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_79),
        http("request_108")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_108),
        http("request_109")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_110")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_110)
          .body(RawFileBody("/afiliacionempresa/0110_request.dat")),
        http("request_111")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_110)
          .body(RawFileBody("/afiliacionempresa/0111_request.dat")),
        http("request_112")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_110)
          .body(RawFileBody("/afiliacionempresa/0112_request.dat")),
        http("request_113")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D")
          .headers(headers_1),
        http("request_114")
          .get("/style%20library/js/compensar.carruseldebanners.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_115")
          .get("/style%20library/css/compensar.tendencias.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_116")
          .get("/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_117")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_110)
          .body(RawFileBody("/afiliacionempresa/0117_request.dat")),
        http("request_118")
          .get("/style%20library/css/compensar.compstandard.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_119")
          .get("/style%20library/css/compensar.enlacesdirectos.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_120")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_110)
          .body(RawFileBody("/afiliacionempresa/0120_request.dat")),
        http("request_121")
          .get("/style%20library/js/compensar.novedades.min.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_122")
          .get("/style%20library/js/compensar.modulonoticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_123")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D")
          .headers(headers_1),
        http("request_124")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_110)
          .body(RawFileBody("/afiliacionempresa/0124_request.dat")),
        http("request_125")
          .get(uri02 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_1),
        http("request_126")
          .get(uri02 + "/common/js/0.0.19/common.js")
          .headers(headers_1),
        http("request_127")
          .get("/Style%20Library/css/compensar.compStandard.min.css")
          .headers(headers_1),
        http("request_128")
          .post("/_vti_bin/Webs.asmx")
          .headers(headers_128)
          .body(RawFileBody("/afiliacionempresa/0128_request.dat")),
        http("request_129")
          .post("/_vti_bin/Lists.asmx")
          .headers(headers_129)
          .body(RawFileBody("/afiliacionempresa/0129_request.dat")),
        http("request_130")
          .get("/PublishingImages/Destacados/cirugia-estetica-compensar.png?RenditionID=107")
          .headers(headers_1),
        http("request_131")
          .get("/PublishingImages/Destacados/credito-libre-inversion-compensar.png?RenditionID=107")
          .headers(headers_1),
        http("request_132")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D")
          .headers(headers_1),
        http("request_133")
          .get("/PublishingImages/Destacados/09-abril-2015-salud-oral.jpg?RenditionID=107")
          .headers(headers_60),
        http("request_134")
          .get("/Style%20Library/css/compensar.carruselDeBanners.min.css")
          .headers(headers_1),
        http("request_135")
          .get("/Style%20Library/vendor/slick.css")
          .headers(headers_1),
        http("request_136")
          .get("/Style%20Library/vendor/slick-theme.css")
          .headers(headers_1),
        http("request_137")
          .get("/Style%20Library/css/compensar.carouselTheme.min.css")
          .headers(headers_1),
        http("request_138")
          .get("/Style%20Library/css/compensar.enlacesDeInteres.min.css")
          .headers(headers_1),
        http("request_139")
          .get("/Style%20Library/css/compensar.moduloNoticias.min.css")
          .headers(headers_1),
        http("request_140")
          .get("/Style%20Library/css/compensar.novedades.min.css")
          .headers(headers_1),
        http("request_141")
          .get("/PUBLISHINGIMAGES/TENDENCIAS/TENDENCIA-REVISTA-COMPENSAR-CESANTIAS-500X250.JPG?RenditionID=105")
          .headers(headers_1),
        http("request_142")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D")
          .headers(headers_1),
        http("request_143")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_144")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_145")
          .get(uri12 + "?dcsdat=1572039285794&dcssip=prucorporativo.compensar.com&dcsuri=/&wt.tz=-5&wt.bh=16&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Compensar%2520Caja%2520de%2520Compensaci%25C3%25B3n%2520Familiar%2520home&wt.js=Yes&wt.bs=1366x400&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252F&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&wt.co_f=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_1),
        http("request_146")
          .get("/Style%20Library/vendor/ajax-loader.gif")
          .headers(headers_1)))
    .pause(4)
    .exec(http("request_147")
      .get("/afiliaciones")
      .headers(headers_147)
      .resources(http("request_148")
        .get("/_catalogs/masterpage/starter/minisp.min.js")
        .headers(headers_1),
        http("request_149")
          .get("/_layouts/15/init.js?rev=ZwTQYqYlNTyyuMWaLlhwSg%3D%3D")
          .headers(headers_1),
        http("request_150")
          .get("/style%20library/vendor/jquery-3.1.1.min.js")
          .headers(headers_1),
        http("request_151")
          .get("/style%20library/js/datalayercorporativo.min.js")
          .headers(headers_1),
        http("request_152")
          .get("/style%20library/vendor/bluebird.min.js")
          .headers(headers_1),
        http("request_153")
          .get("/style%20library/vendor/bootstrap.min.js")
          .headers(headers_1),
        http("request_154")
          .get("/style%20library/js/jquery.spservices-2014.02.min.js")
          .headers(headers_1),
        http("request_155")
          .get("/Style%20Library/vendor/knockout-3.4.1.min.js?v=1")
          .headers(headers_1),
        http("request_156")
          .get("/style%20library/vendor/ko.sp-1.0.min.js")
          .headers(headers_1),
        http("request_157")
          .get("/style%20library/vendor/slick.min.js")
          .headers(headers_1),
        http("request_158")
          .get("/style%20library/vendor/rangeslider.min.js")
          .headers(headers_1),
        http("request_159")
          .get("/style%20library/vendor/ion.rangeslider.min.js")
          .headers(headers_1),
        http("request_160")
          .get("/style%20library/vendor/picturefill.min.js")
          .headers(headers_1),
        http("request_161")
          .get("/style%20library/vendor/validate.min.js")
          .headers(headers_1),
        http("request_162")
          .get("/style%20library/vendor/jquery.validate.min.js")
          .headers(headers_1),
        http("request_163")
          .get("/style%20library/vendor/croppie.min.js")
          .headers(headers_1),
        http("request_164")
          .get("/style%20library/js/afiliaciones.config.js")
          .headers(headers_1),
        http("request_165")
          .get("/Style%20Library/js/compTools.min.js?v=1")
          .headers(headers_1),
        http("request_166")
          .get("/style%20library/js/compensar.script.min.js")
          .headers(headers_1),
        http("request_167")
          .get("/style%20library/js/compensar.actualizarcorreo.min.js")
          .headers(headers_1),
        http("request_168")
          .get("/style%20library/js/sjcl/sjcl.min.js")
          .headers(headers_1),
        http("request_169")
          .get("/Style%20Library/js/compensar.loadComponents.min.js?v=1")
          .headers(headers_1),
        http("request_170")
          .get("/Style%20Library/js/compensar.tiempoInactividad.min.js?v=1")
          .headers(headers_1),
        http("request_171")
          .get("/Style%20Library/js/compensar.enModoEdicion.min.js?v=1")
          .headers(headers_1),
        http("request_172")
          .get("/Style%20Library/js/compensar.detectarAncho.min.js?v=1")
          .headers(headers_1),
        http("request_173")
          .get("/Style%20Library/js/compensar.deferImages.min.js?v=1")
          .headers(headers_1),
        http("request_174")
          .get("/Style%20Library/js/compensar.agregarTitulowebparts.min.js?v=1")
          .headers(headers_1),
        http("request_175")
          .get("/Style%20Library/js/compensar.menuDesplegable.min.js?v=1")
          .headers(headers_1),
        http("request_176")
          .get("/Style%20Library/js/compensar.miCompensarPerfil.min.js?v=1")
          .headers(headers_1),
        http("request_177")
          .get("/Style%20Library/js/compensar.controlPestanas.min.js?v=1")
          .headers(headers_1),
        http("request_178")
          .get("/Style%20Library/js/compensar.controlAcordeon.min.js?v=1")
          .headers(headers_1),
        http("request_179")
          .get("/Style%20Library/js/compensar.filtroControlerVivienda.min.js?v=1")
          .headers(headers_1),
        http("request_180")
          .get("/Style%20Library/js/mainContent.min.js?v=1")
          .headers(headers_1),
        http("request_181")
          .get("/Style%20Library/js/headerNav.min.js?v=1")
          .headers(headers_1),
        http("request_182")
          .get("/Style%20Library/js/ko/modeloMenuAux.min.js?v=1")
          .headers(headers_1),
        http("request_183")
          .get("/Style%20Library/js/compensar.menuSecundario.min.js?v=1")
          .headers(headers_1),
        http("request_184")
          .get("/Style%20Library/js/compensar.quitarLoading.min.js?v=1")
          .headers(headers_1),
        http("request_185")
          .get("/Style%20Library/js/compensar.componenteEmailController.min.js?v=1")
          .headers(headers_1),
        http("request_186")
          .get("/Style%20Library/js/compensar.componentePopUpController.min.js?v=1")
          .headers(headers_1),
        http("request_187")
          .get("/style%20library/js/compensar.notificaciones.min.js")
          .headers(headers_1),
        http("request_188")
          .get("/style%20library/js/customcanales.min.js")
          .headers(headers_1),
        http("request_189")
          .get("/_layouts/15/compensar.portal.farm/customactioncall.js")
          .headers(headers_1),
        http("request_190")
          .get("/ScriptResource.axd?d=DbBIHdj-QC5CO88xwauS5dkoqIs6nZmS0i8rusZB1q2JCx1O17otX38Pbo9-Co9QXf_ywgPOgCaWxydR-v-KO_BCuip-vRkoHzjnd81XPEqYhrrZRFvD28DBse-3zjaVmjdm2hC17AQqDXfxT3KoyoLs-sQ7qPLfqrjuPJokLcOn_d3Dmrsd446-Hg6mDbff0&t=72e85ccd")
          .headers(headers_1),
        http("request_191")
          .get("/_layouts/15/blank.js?rev=ZaOXZEobVwykPO9g8hq%2F8A%3D%3D")
          .headers(headers_1),
        http("request_192")
          .get("/ScriptResource.axd?d=LzPGXWTyY4NfgAzL7AVGti8jNkeNvyxE7t2p3M-3BPJvKFvvkBUGxbbcxESn55TFNOUl8xW6SvygFDc-U8cavgouTpfnyDz3b86dyb2Q1b12B-B2zqJbKL3UrhnjJpkL79pBm9zX4FVDPUA4BsjrvCFATMYLp3cyBtLpIkBKZKUxDrfJga0vw4ZjurZ0mn1o0&t=72e85ccd")
          .headers(headers_1),
        http("request_193")
          .get("/_layouts/15/sp.init.js?rev=jvJC3Kl5gbORaLtf7kxULQ%3D%3D")
          .headers(headers_1),
        http("request_194")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=SP%2ERes&rev=DoAHv8R6TO7rl33LcYBJTA%3D%3D")
          .headers(headers_1),
        http("request_195")
          .get("/_layouts/15/sp.runtime.js?rev=5f2WkYJoaxlIRdwUeg4WEg%3D%3D")
          .headers(headers_1),
        http("request_196")
          .get("/_layouts/15/sp.search.js?rev=dMkPlEXpdY6iJ%2FsY5RsB0g%3D%3D")
          .headers(headers_1),
        http("request_197")
          .get("/_layouts/15/clientrenderer.js?rev=PWwV4FATEiOxN90BeB5Hzw%3D%3D")
          .headers(headers_1),
        http("request_198")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=Srch%2EResources&rev=GVo354neq7eNTurLgIdpJQ%3D%3D")
          .headers(headers_1),
        http("request_199")
          .get("/_layouts/15/search.clientcontrols.js?rev=8Q15HW2EU2aXBktJq5YW%2FA%3D%3D")
          .headers(headers_1),
        http("request_200")
          .get("/_layouts/15/search.cbs.js?rev=S5EegsQhNKgWxVFmcqr5dQ%3D%3D")
          .headers(headers_1),
        http("request_201")
          .get("/PublishingImages/favicon.ico?rev=23")
          .headers(headers_1),
        http("request_202")
          .get("/_layouts/15/images/spcommon.png?rev=23")
          .headers(headers_1),
        http("request_203")
          .get("/PublishingImages/logo_compensar.png?rev=23")
          .headers(headers_1),
        http("request_204")
          .get("/WebResource.axd?d=hcspxoKGngdkW0b6xYvFftMD9L7tgVctZKvxUqyhcPMOX4gSlmQgLLYGJ7F9lMuasHqe9Mv5x6g7VZmrwkJEQmLxw_pNwohGyqmgqyaeGpA1&t=635792838349294682")
          .headers(headers_1),
        http("request_205")
          .get("/PublishingImages/logo_compensar.png")
          .headers(headers_1),
        http("request_206")
          .get("/_layouts/15/images/searchresultui.png?rev=23")
          .headers(headers_1),
        http("request_207")
          .get(uri07 + "?id=GTM-5GF54C6")
          .headers(headers_1),
        http("request_208")
          .get("/Style%20Library/css/compensar.menuSecundario.css")
          .headers(headers_1),
        http("request_209")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_210")
          .get("/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_1),
        http("request_211")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_1),
        http("request_212")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_1),
        http("request_213")
          .get(uri03 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_1),
        http("request_214")
          .get(uri08 + "/recaptcha/api.js?onload=captchaReady&render=explicit")
          .headers(headers_1),
        http("request_215")
          .get("/PublishingImages/logo-compensar-gris.svg")
          .headers(headers_60),
        http("request_216")
          .get("/Style%20Library/js/ecmascript.array.find.min.js?v=1")
          .headers(headers_1),
        http("request_217")
          .get("/Style%20Library/js/ecmascript.string.includes.js?v=3")
          .headers(headers_1),
        http("request_218")
          .get("/Style%20Library/js/globant.validator.js?v=1")
          .headers(headers_1),
        http("request_219")
          .get("/Style%20Library/js/compensar.reanudarSolicitud.min.js?v=12")
          .headers(headers_1),
        http("request_220")
          .get("/Style%20Library/css/compensar.reanudarSolicitud.min.css")
          .headers(headers_1),
        http("request_221")
          .get("/WebResource.axd?d=VE1LltKE1dXL7-UbkAp-bt6ljn4Brx0V3X9hDRsD8jSFT9qB8YndTHVisocnrFQ8rNfw3OXiDn_Fb7iUlcK8bUIBKyIA1h_3y1b4G2-c7f01&t=635792838349294682")
          .headers(headers_1),
        http("request_222")
          .get("/_layouts/15/images/nodearrow.png")
          .headers(headers_1),
        http("request_223")
          .get("/afiliaciones/PublishingImages/ArticulosKenzo_001.jpg")
          .headers(headers_1),
        http("request_224")
          .get("/afiliaciones/PublishingImages/Eventos_002.jpg")
          .headers(headers_1),
        http("request_225")
          .get("/afiliaciones/PublishingImages/PracticasLibres_003.jpg")
          .headers(headers_1),
        http("request_226")
          .get("/Afiliaciones/PublishingImages/Pintura_001.jpg")
          .headers(headers_1),
        http("request_227")
          .get("/Afiliaciones/PublishingImages/Natacion.jpg")
          .headers(headers_1),
        http("request_228")
          .get("/afiliaciones/PublishingImages/Hoteles_006.jpg")
          .headers(headers_1),
        http("request_229")
          .get("/afiliaciones/PublishingImages/Boleteria_007.jpg")
          .headers(headers_1),
        http("request_230")
          .get("/afiliaciones/PublishingImages/Golfito_008.jpg")
          .headers(headers_1),
        http("request_231")
          .get(uri01 + "/analytics.js")
          .headers(headers_1),
        http("request_232")
          .get(uri03 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252F%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fafiliaciones%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&pd=-795268750%7CFwAAAApVAwDcYaCCPxIDZAABEgABQgCFdZ%2BHAwCyiX0gk1nXSMUHQGJSUtdIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBSBICAAEAAAAAAAAA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAAAAAAAAAFF&bid=nycvwcgus05&srv=nycvwcgus05")
          .headers(headers_76),
        http("request_233")
          .get(uri01 + "/r/collect?v=1&_v=j79&a=1216707132&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2Fafiliaciones&ul=es-es&de=UTF-8&dt=Afiliaciones%20Inicio&sd=24-bit&sr=1366x768&vp=1366x400&je=0&_u=QACAAEAB~&jid=1713997043&gjid=1708386454&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&_r=1&gtm=2wgaa05GF54C6&z=134852900")
          .headers(headers_1),
        http("request_234")
          .get("/Style%20Library/images/dashLine.png")
          .headers(headers_1),
        http("request_235")
          .get(uri04 + "?v=1&aip=1&t=dc&_r=3&tid=UA-90763271-1&cid=974125059.1571241288&jid=1713997043&_gid=622444644.1572016093&gjid=1708386454&_v=j79&z=134852900"),
        http("request_236")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_79),
        http("request_237")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_79),
        http("request_238")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_239")
          .get("/Style%20Library/fonts/roboto/roboto_bold/Roboto-Bold-webfont.woff")
          .headers(headers_79),
        http("request_240")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_79),
        http("request_241")
          .get("/Style%20Library/fonts/glyphicons-halflings-regular.woff2")
          .headers(headers_79),
        http("request_242")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D")
          .headers(headers_1),
        http("request_243")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D")
          .headers(headers_1),
        http("request_244")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_79),
        http("request_245")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_bannerhome.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_246")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_247")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_bannerhome.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_248")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_249")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_250")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_noticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_251")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_noticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_252")
          .post("/Afiliaciones/_api/contextinfo")
          .headers(headers_80),
        http("request_253")
          .post("/Afiliaciones/_api/contextinfo")
          .headers(headers_80),
        http("request_254")
          .post("/Afiliaciones/_api/contextinfo")
          .headers(headers_80),
        http("request_255")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=((Seccion%20eq%20%27General%27)%20and%20(Nombre%20eq%20%27URL_SeguimientoTramites%27))")
          .headers(headers_255),
        http("request_256")
          .get("/_api/web/lists/GetByTitle('Configuraci%C3%B3n')/items?$select=Valor,Nombre,Seccion&$filter=(Nombre%20eq%20%27URLLogin%27)%20and%20(Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27)")
          .headers(headers_255),
        http("request_257")
          .get("/_api/web/lists/GetByTitle('Mensajes%20Visuales')/items?$select=MSG_ClaseUI,MSG_Titulo,MSG_CuerpoTexto&$filter=(Title%20eq%20%27Error_General_Servicios%27)%20and%20(MSG_Modulo%20eq%20%27General%27)")
          .headers(headers_255),
        http("request_258")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=((Seccion%20eq%20%27Autenticaci%C3%B3n%27)%20and%20(Nombre%20eq%20%27GoogleCaptchaKey%27))")
          .headers(headers_255),
        http("request_259")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_108),
        http("request_260")
          .get("/Afiliaciones/_api/web/lists/GetByTitle('Tipos%20Identificaci%C3%B3n')/items?$select=CodigoAfiliaciones,NombreAfiliaciones,AbreviacionAfiliaciones,EstadoAfiliaciones,FormulariosAfiliaciones&$filter=FormulariosAfiliaciones%20eq%20%27Formulario%20Reanudar%20Solicitud%20Afiliaci%C3%B3n%27")
          .headers(headers_255),
        http("request_261")
          .get(uri08 + "/recaptcha/api2/anchor?ar=1&k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI&co=aHR0cHM6Ly9wcnVjb3Jwb3JhdGl2by5jb21wZW5zYXIuY29tOjQ0Mw..&hl=es&v=5fbZx3NV5xhaMoMLrZV3TkN4&size=normal&cb=3f7b2xxjuzvq")
          .headers(headers_261),
        http("request_262")
          .get(uri02 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_1),
        http("request_263")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D")
          .headers(headers_1),
        http("request_264")
          .get("/style%20library/js/compensar.carruseldebanners.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_265")
          .get("/style%20library/css/compensar.tendencias.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_266")
          .get("/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_267")
          .get(uri02 + "/common/js/0.0.19/common.js")
          .headers(headers_1),
        http("request_268")
          .get("/style%20library/js/compensar.modulonoticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_269")
          .post("/Afiliaciones/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_269)
          .body(RawFileBody("/afiliacionempresa/0269_request.dat")),
        http("request_270")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/styles__ltr.css")
          .headers(headers_1),
        http("request_271")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_272")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D")
          .headers(headers_1),
        http("request_273")
          .post("/Afiliaciones/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_269)
          .body(RawFileBody("/afiliacionempresa/0273_request.dat")),
        http("request_274")
          .get(uri11 + "/api2/logo_48.png")
          .headers(headers_1),
        http("request_275")
          .get(uri10 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
          .headers(headers_275),
        http("request_276")
          .get(uri08 + "/js/bg/FImcmxIydQ5zO5X4JWmfILYA5Uks6S5qhuxO7imXJic.js")
          .headers(headers_1),
        http("request_277")
          .get(uri08 + "/recaptcha/api2/webworker.js?hl=es&v=5fbZx3NV5xhaMoMLrZV3TkN4")
          .headers(headers_277),
        http("request_278")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D")
          .headers(headers_1),
        http("request_279")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_280")
          .post("/Afiliaciones/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_269)
          .body(RawFileBody("/afiliacionempresa/0280_request.dat")),
        http("request_281")
          .get("/Style%20Library/css/compensar.carruselDeBanners.min.css")
          .headers(headers_1),
        http("request_282")
          .get("/Style%20Library/vendor/slick.css")
          .headers(headers_1),
        http("request_283")
          .get("/Style%20Library/vendor/slick-theme.css")
          .headers(headers_1),
        http("request_284")
          .get("/Style%20Library/css/compensar.carouselTheme.min.css")
          .headers(headers_1),
        http("request_285")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_286")
          .get("/PUBLISHINGIMAGES/TENDENCIAS/TENDENCIA-REVISTA-COMPENSAR-CESANTIAS-500X250.JPG?RenditionID=105")
          .headers(headers_1),
        http("request_287")
          .get("/Style%20Library/css/compensar.moduloNoticias.min.css")
          .headers(headers_1),
        http("request_288")
          .get("/AGENCIA-EMPLEO/PUBLISHINGIMAGES/NOTICIAS/NOTICIA-VESTIR.JPG")
          .headers(headers_1),
        http("request_289")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D")
          .headers(headers_1),
        http("request_290")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_291")
          .get(uri08 + "/recaptcha/api2/bframe?hl=es&v=5fbZx3NV5xhaMoMLrZV3TkN4&k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI&cb=7byc1i64w7rl")
          .headers(headers_261),
        http("request_292")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/styles__ltr.css")
          .headers(headers_1),
        http("request_293")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_294")
          .get(uri10 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
          .headers(headers_275),
        http("request_295")
          .get(uri12 + "?dcsdat=1572039292633&dcssip=prucorporativo.compensar.com&dcsuri=/afiliaciones&dcsref=https://prucorporativo.compensar.com/&wt.tz=-5&wt.bh=16&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Afiliaciones%2520Inicio&wt.js=Yes&wt.bs=1366x400&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252Fafiliaciones&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&wt.co_f=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_1)))
    .pause(7)
    .exec(http("request_296")
      .get("/afiliaciones/independiente")
      .headers(headers_147)
      .resources(http("request_297")
        .get("/_catalogs/masterpage/starter/minisp.min.js")
        .headers(headers_1),
        http("request_298")
          .get("/_layouts/15/init.js?rev=ZwTQYqYlNTyyuMWaLlhwSg%3D%3D")
          .headers(headers_1),
        http("request_299")
          .get("/style%20library/vendor/jquery-3.1.1.min.js")
          .headers(headers_1),
        http("request_300")
          .get("/style%20library/js/datalayercorporativo.min.js")
          .headers(headers_1),
        http("request_301")
          .get("/style%20library/vendor/bluebird.min.js")
          .headers(headers_1),
        http("request_302")
          .get("/style%20library/vendor/bootstrap.min.js")
          .headers(headers_1),
        http("request_303")
          .get("/style%20library/js/jquery.spservices-2014.02.min.js")
          .headers(headers_1),
        http("request_304")
          .get("/Style%20Library/vendor/knockout-3.4.1.min.js?v=1")
          .headers(headers_1),
        http("request_305")
          .get("/style%20library/vendor/ko.sp-1.0.min.js")
          .headers(headers_1),
        http("request_306")
          .get("/style%20library/vendor/slick.min.js")
          .headers(headers_1),
        http("request_307")
          .get("/style%20library/vendor/rangeslider.min.js")
          .headers(headers_1),
        http("request_308")
          .get("/style%20library/vendor/ion.rangeslider.min.js")
          .headers(headers_1),
        http("request_309")
          .get("/style%20library/vendor/picturefill.min.js")
          .headers(headers_1),
        http("request_310")
          .get("/style%20library/vendor/validate.min.js")
          .headers(headers_1),
        http("request_311")
          .get("/style%20library/vendor/jquery.validate.min.js")
          .headers(headers_1),
        http("request_312")
          .get("/style%20library/vendor/croppie.min.js")
          .headers(headers_1),
        http("request_313")
          .get("/style%20library/js/afiliaciones.config.js")
          .headers(headers_1),
        http("request_314")
          .get("/Style%20Library/js/compTools.min.js?v=1")
          .headers(headers_1),
        http("request_315")
          .get("/style%20library/js/compensar.script.min.js")
          .headers(headers_1),
        http("request_316")
          .get("/style%20library/js/compensar.actualizarcorreo.min.js")
          .headers(headers_1),
        http("request_317")
          .get("/style%20library/js/sjcl/sjcl.min.js")
          .headers(headers_1),
        http("request_318")
          .get("/Style%20Library/js/compensar.loadComponents.min.js?v=1")
          .headers(headers_1),
        http("request_319")
          .get("/Style%20Library/js/compensar.tiempoInactividad.min.js?v=1")
          .headers(headers_1),
        http("request_320")
          .get("/Style%20Library/js/compensar.enModoEdicion.min.js?v=1")
          .headers(headers_1),
        http("request_321")
          .get("/Style%20Library/js/compensar.detectarAncho.min.js?v=1")
          .headers(headers_1),
        http("request_322")
          .get("/Style%20Library/js/compensar.deferImages.min.js?v=1")
          .headers(headers_1),
        http("request_323")
          .get("/Style%20Library/js/compensar.agregarTitulowebparts.min.js?v=1")
          .headers(headers_1),
        http("request_324")
          .get("/Style%20Library/js/compensar.menuDesplegable.min.js?v=1")
          .headers(headers_1),
        http("request_325")
          .get("/Style%20Library/js/compensar.miCompensarPerfil.min.js?v=1")
          .headers(headers_1),
        http("request_326")
          .get("/Style%20Library/js/compensar.controlPestanas.min.js?v=1")
          .headers(headers_1),
        http("request_327")
          .get("/Style%20Library/js/compensar.controlAcordeon.min.js?v=1")
          .headers(headers_1),
        http("request_328")
          .get("/Style%20Library/js/compensar.filtroControlerVivienda.min.js?v=1")
          .headers(headers_1),
        http("request_329")
          .get("/Style%20Library/js/mainContent.min.js?v=1")
          .headers(headers_1),
        http("request_330")
          .get("/Style%20Library/js/headerNav.min.js?v=1")
          .headers(headers_1),
        http("request_331")
          .get("/Style%20Library/js/ko/modeloMenuAux.min.js?v=1")
          .headers(headers_1),
        http("request_332")
          .get("/Style%20Library/js/compensar.menuSecundario.min.js?v=1")
          .headers(headers_1),
        http("request_333")
          .get("/Style%20Library/js/compensar.quitarLoading.min.js?v=1")
          .headers(headers_1),
        http("request_334")
          .get("/Style%20Library/js/compensar.componenteEmailController.min.js?v=1")
          .headers(headers_1),
        http("request_335")
          .get("/Style%20Library/js/compensar.componentePopUpController.min.js?v=1")
          .headers(headers_1),
        http("request_336")
          .get("/style%20library/js/compensar.notificaciones.min.js")
          .headers(headers_1),
        http("request_337")
          .get("/style%20library/js/customcanales.min.js")
          .headers(headers_1),
        http("request_338")
          .get("/_layouts/15/compensar.portal.farm/customactioncall.js")
          .headers(headers_1),
        http("request_339")
          .get("/ScriptResource.axd?d=DbBIHdj-QC5CO88xwauS5dkoqIs6nZmS0i8rusZB1q2JCx1O17otX38Pbo9-Co9QXf_ywgPOgCaWxydR-v-KO_BCuip-vRkoHzjnd81XPEqYhrrZRFvD28DBse-3zjaVmjdm2hC17AQqDXfxT3KoyoLs-sQ7qPLfqrjuPJokLcOn_d3Dmrsd446-Hg6mDbff0&t=72e85ccd")
          .headers(headers_1),
        http("request_340")
          .get("/_layouts/15/blank.js?rev=ZaOXZEobVwykPO9g8hq%2F8A%3D%3D")
          .headers(headers_1),
        http("request_341")
          .get("/ScriptResource.axd?d=LzPGXWTyY4NfgAzL7AVGti8jNkeNvyxE7t2p3M-3BPJvKFvvkBUGxbbcxESn55TFNOUl8xW6SvygFDc-U8cavgouTpfnyDz3b86dyb2Q1b12B-B2zqJbKL3UrhnjJpkL79pBm9zX4FVDPUA4BsjrvCFATMYLp3cyBtLpIkBKZKUxDrfJga0vw4ZjurZ0mn1o0&t=72e85ccd")
          .headers(headers_1),
        http("request_342")
          .get("/_layouts/15/sp.init.js?rev=jvJC3Kl5gbORaLtf7kxULQ%3D%3D")
          .headers(headers_1),
        http("request_343")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=SP%2ERes&rev=DoAHv8R6TO7rl33LcYBJTA%3D%3D")
          .headers(headers_1),
        http("request_344")
          .get("/_layouts/15/sp.runtime.js?rev=5f2WkYJoaxlIRdwUeg4WEg%3D%3D")
          .headers(headers_1),
        http("request_345")
          .get("/_layouts/15/sp.search.js?rev=dMkPlEXpdY6iJ%2FsY5RsB0g%3D%3D")
          .headers(headers_1),
        http("request_346")
          .get("/_layouts/15/clientrenderer.js?rev=PWwV4FATEiOxN90BeB5Hzw%3D%3D")
          .headers(headers_1),
        http("request_347")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=Srch%2EResources&rev=GVo354neq7eNTurLgIdpJQ%3D%3D")
          .headers(headers_1),
        http("request_348")
          .get("/_layouts/15/search.clientcontrols.js?rev=8Q15HW2EU2aXBktJq5YW%2FA%3D%3D")
          .headers(headers_1),
        http("request_349")
          .get("/_layouts/15/search.cbs.js?rev=S5EegsQhNKgWxVFmcqr5dQ%3D%3D")
          .headers(headers_1),
        http("request_350")
          .get("/PublishingImages/favicon.ico?rev=23")
          .headers(headers_1),
        http("request_351")
          .get("/_layouts/15/images/spcommon.png?rev=23")
          .headers(headers_1),
        http("request_352")
          .get("/PublishingImages/logo_compensar.png?rev=23")
          .headers(headers_1),
        http("request_353")
          .get("/WebResource.axd?d=hcspxoKGngdkW0b6xYvFftMD9L7tgVctZKvxUqyhcPMOX4gSlmQgLLYGJ7F9lMuasHqe9Mv5x6g7VZmrwkJEQmLxw_pNwohGyqmgqyaeGpA1&t=635792838349294682")
          .headers(headers_1),
        http("request_354")
          .get("/PublishingImages/logo_compensar.png")
          .headers(headers_1),
        http("request_355")
          .get("/_layouts/15/images/searchresultui.png?rev=23")
          .headers(headers_1),
        http("request_356")
          .get("/WebResource.axd?d=VE1LltKE1dXL7-UbkAp-bt6ljn4Brx0V3X9hDRsD8jSFT9qB8YndTHVisocnrFQ8rNfw3OXiDn_Fb7iUlcK8bUIBKyIA1h_3y1b4G2-c7f01&t=635792838349294682")
          .headers(headers_1),
        http("request_357")
          .get("/_layouts/15/images/nodearrow.png")
          .headers(headers_1),
        http("request_358")
          .get(uri07 + "?id=GTM-5GF54C6")
          .headers(headers_1),
        http("request_359")
          .get("/Style%20Library/css/compensar.menuSecundario.css")
          .headers(headers_1),
        http("request_360")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_361")
          .get("/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_1),
        http("request_362")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_1),
        http("request_363")
          .get(uri03 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_1),
        http("request_364")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_1),
        http("request_365")
          .get(uri08 + "/recaptcha/api.js?render=explicit")
          .headers(headers_1),
        http("request_366")
          .get("/PublishingImages/logo-compensar-gris.svg")
          .headers(headers_60),
        http("request_367")
          .get("/Style%20Library/js/compensar.popovers.min.js")
          .headers(headers_1),
        http("request_368")
          .get(uri01 + "/analytics.js")
          .headers(headers_1),
        http("request_369")
          .get(uri01 + "/collect?v=1&_v=j79&a=444360969&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2Fafiliaciones%2Findependiente&ul=es-es&de=UTF-8&dt=Afiliarse%20en%20l%C3%ADnea%20como%20Independiente%20a%20Compensar%20Caja%20de%20Compensaci%C3%B3n&sd=24-bit&sr=1366x768&vp=1366x400&je=0&_u=QACAAEAB~&jid=&gjid=&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&gtm=2wgaa05GF54C6&z=700952256")
          .headers(headers_1),
        http("request_370")
          .get(uri03 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fafiliaciones%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fafiliaciones%252Findependiente%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&pd=-841000904%7CGAAAAApVAwDcYaCCPxIDZAABEgABQgCFdZ%2BHAwCnKPEkk1nXSMUHQGJSUtdIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBSBICAAEAAAAAAAAA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAAAAAAAAAFF&bid=nycvwcgus05&srv=nycvwcgus05")
          .headers(headers_76),
        http("request_371")
          .get("/WebResource.axd?d=hcspxoKGngdkW0b6xYvFftMD9L7tgVctZKvxUqyhcPMOX4gSlmQgLLYGJ7F9lMuasHqe9Mv5x6g7VZmrwkJEQmLxw_pNwohGyqmgqyaeGpA1&t=635792838349294682")
          .headers(headers_1),
        http("request_372")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_373")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D")
          .headers(headers_1),
        http("request_374")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D")
          .headers(headers_1),
        http("request_375")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_afiliacion_validar_usuario.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_376")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_377")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_afiliacion_validar_usuario.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_378")
          .get("/Style%20Library/images/dashLine.png")
          .headers(headers_1),
        http("request_379")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_79),
        http("request_380")
          .get("/_api/web/lists/GetByTitle('PopOvers')/items?$select=TituloPopOver,PosicionPopOver,UrlsPopOvers,TextoAyudaPopOver,TextoBoton,IdentificadorPopOver,SeccionFormularioPops,CampoFormularioPops")
          .headers(headers_255),
        http("request_381")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_79),
        http("request_382")
          .post("/Afiliaciones/_api/contextinfo")
          .headers(headers_80),
        http("request_383")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_79),
        http("request_384")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_79),
        http("request_385")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_386")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_108),
        http("request_387")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D")
          .headers(headers_1),
        http("request_388")
          .get("/style%20library/css/compensar.afiliacionrequisitos.min.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_389")
          .get("/style%20library/css/compensar.afiliacioninicio.min.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_390")
          .get("/style%20library/js/compensar.afiliacionpopupdocumentos.min.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_391")
          .get("/style%20library/js/compensar.afiliacionvalidarusuario.min.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_392")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D")
          .headers(headers_1),
        http("request_393")
          .get(uri02 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_1),
        http("request_394")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D")
          .headers(headers_1),
        http("request_395")
          .get(uri02 + "/common/js/0.0.19/common.js")
          .headers(headers_1),
        http("request_396")
          .post("/Afiliaciones/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_396)
          .body(RawFileBody("/afiliacionempresa/0396_request.dat")),
        http("request_397")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D")
          .headers(headers_1),
        http("request_398")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_399")
          .get("/_api/web/lists/GetByTitle('Mensajes%20Visuales')/items?$select=MSG_ClaseUI,MSG_Titulo,MSG_CuerpoTexto&$filter=(Title%20eq%20%27Error_General_Servicios%27)%20and%20(MSG_Modulo%20eq%20%27General%27)")
          .headers(headers_255),
        http("request_400")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_401")
          .get("/Afiliaciones/_api/web/lists/GetByTitle('Modalidades%20Afiliaci%C3%B3n')/items?$select=CodigoAfiliaciones,NombreAfiliaciones,TipoAfiliacion_ListTipoAfiliaciones/Id_Afiliaciones&$expand=TipoAfiliacion_ListTipoAfiliaciones&$filter=TipoAfiliacion_ListTipoAfiliaciones/Id_Afiliaciones%20eq%203")
          .headers(headers_255),
        http("request_402")
          .get("/Afiliaciones/_api/web/lists/GetByTitle('Tipos%20Identificaci%C3%B3n')/items?$select=CodigoAfiliaciones,NombreAfiliaciones,AbreviacionAfiliaciones,EstadoAfiliaciones&$filter=FormulariosAfiliaciones%20eq%20%27Formulario%20Validar%20Usuario%20Prev%20Solicitud%20Afilia%27")
          .headers(headers_255),
        http("request_403")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=((Seccion%20eq%20%27Autenticaci%C3%B3n%27)%20and%20(Nombre%20eq%20%27GoogleCaptchaKey%27))")
          .headers(headers_255),
        http("request_404")
          .get("/Style%20Library/fonts/roboto/roboto_bold/Roboto-Bold-webfont.woff")
          .headers(headers_79),
        http("request_405")
          .get(uri12 + "?dcsdat=1572039302726&dcssip=prucorporativo.compensar.com&dcsuri=/afiliaciones/independiente&dcsref=https://prucorporativo.compensar.com/afiliaciones&wt.tz=-5&wt.bh=16&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Afiliarse%2520en%2520l%25C3%25ADnea%2520como%2520Independiente%2520a%2520Compensar%2520Caja%2520de%2520Compensaci%25C3%25B3n&wt.js=Yes&wt.bs=1366x400&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252Fafiliaciones%252Findependiente&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&wt.co_f=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_1),
        http("request_406")
          .get(uri08 + "/recaptcha/api2/anchor?ar=1&k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI&co=aHR0cHM6Ly9wcnVjb3Jwb3JhdGl2by5jb21wZW5zYXIuY29tOjQ0Mw..&hl=es&v=5fbZx3NV5xhaMoMLrZV3TkN4&size=normal&cb=v0t085cabtu3")
          .headers(headers_261),
        http("request_407")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/styles__ltr.css")
          .headers(headers_1),
        http("request_408")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_409")
          .get(uri11 + "/api2/logo_48.png")
          .headers(headers_1),
        http("request_410")
          .get(uri10 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
          .headers(headers_275),
        http("request_411")
          .get(uri08 + "/js/bg/S9fUSTxhhOdrtoorjI9LLu91aXsPVT7Js_3UUxt2SGg.js")
          .headers(headers_1),
        http("request_412")
          .get(uri08 + "/recaptcha/api2/webworker.js?hl=es&v=5fbZx3NV5xhaMoMLrZV3TkN4")
          .headers(headers_277),
        http("request_413")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_414")
          .get(uri08 + "/recaptcha/api2/bframe?hl=es&v=5fbZx3NV5xhaMoMLrZV3TkN4&k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI&cb=e3q7m6bc2b3g")
          .headers(headers_261),
        http("request_415")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/styles__ltr.css")
          .headers(headers_1),
        http("request_416")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_417")
          .get(uri10 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
          .headers(headers_275)))
    .pause(38)
    .exec(http("request_418")
      .post(uri08 + "/recaptcha/api2/reload?k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI")
      .headers(headers_418)
      .formParam("v", "5fbZx3NV5xhaMoMLrZV3TkN4")
      .formParam("reason", "fi")
      .formParam("c", "03AOLTBLT74MeOz1wDYOt0nKEu14lyvKw32ImXJF-myTLT7oIAeFkMc8S-bcZ8Oevdza0WhkzW_phqBSvJE6gE7a-fIo6fu04ArIVx76w-9UAF3mrc1QBat6LZYpgAF2W6sxYrs56WJOJ8ytfU82mMGIoGS82MQA_ExvrSPYG1Cf13IXua6_zTxNvGYQM1mtiaCL7t25n8iG6s_2jqy_tB6xoOAxUDur24vKcuQy_umA6a3Zfh2IyV1gM7wLfDPTF9iSrq-xqJUiNMRUqTWav7WWXq0xuU6iOCiyizhldjwKa1GPW5BHOccNTEApotcQxdTf_XzHOxFcFQk_clJOaIR8WXi3Y4yJuqeZcMZDYcv3AtmGDS9z3ycZ-vwMlh9frK7bF0g8zbTV-wVJKkupu3T1G_B64GPWeJnWDW29Hue8MhGE6ouOZPv4I")
      .formParam("chr", "[87,86,3]")
      .formParam("vh", "-258675724")
      .formParam("bg", "!5OKg4sNHpa6RvAbdDSBd0hJb2lekeRwHAAABXVcAAADUnAxuegBoYo5CYfDls9El7CQTxmtnO0_8VJwvOiitpN8WrSyvPQPXke5q0qM2eDi_NZY11YbGCEMmXYlP3nvy-kh7j2ezB2Aj98959RMbfqtqu3pmKN3mro8VcHC7I8POTdhA2tdeH0R3OKngxrJ-n3DPYZ76sRS_d-TBU2jQqDuIrCt4TvwW0cdhS3XwIizhW4vebIW05a5__mN4FZ04zj1JDb5lPAkgW2V78T8YYmUKaF07HaYwwvv5h87loTQdft66r_5IeknlX_CZgQBOLBLaE1VZ7KmzzTUEkVlFndwRT4vnO5vrqlI73rBiJZzxUsZEW_Ccri-3-zfkVvKYt_SXj950FVLb_F79L7f1qtlkB4eiDSUIn3RXF0lVLZ3UAjt86xbNW-SeQftOqDee2LEUza23tFKnDc5rn1edEBSsWWGFn-izh4DkJvFW8TmMmzXVurXaTxXCeP8NQLmIEE7TCTCV-X38SVa8-72b0Cdaw-fjuzN1yEoQ8NPsyovvfqoRCnJpIgTHNci2qArdpeQYrzeXnyX7Vdzrp9a4ReNiW5th3fwJ-oMH7FiXLwSxB9g82PFTkBWkGYqqDEDH0BWCpeFEp4sRXdKX2vRRqeaKoKc4axackwW_qD7BYckMySWiw4arYF8CYTI9URsh7c4W5DM_8NoYEConzEJsiCRdx84UOQwybh7y-BKvHWy_wu-ca34ArcYJF4OGNXXxu1B1UANeqz8XIIJCoVKSQk9A9GgNPdNXICWrquxpMG9Dt2GSFNr5e9ZrSc0F-_zdQfaAUuR56385WLVBDzD464GpzzH4BsSKI8RhldhwAgIwdQpPgPP1e1OiJK72BWsPwb0ixT-nR-CinsSubFHc3OkWT6zdt-OvSTyrTsEzDLk7E6Aff2ZYe6LcPlhU0lMmkKQszsrgUxYr1MP8E6witd3X0sk6vTf1_0gN2uv31fOKyps6GAk-tAEEXKKToKXL81t3Ku_LJqUbMJiRhuPupPfHWpQfuhdysfWLax4AZjv8006WUO8BC-H5x2_jNXNBKNLYsjOoMG7gjvLYQ25JNiWqTtJkViBwTg-pAc4TXmf_j_8nuEIS52wpQJYDxbdNu9Y5LE0k-pzqgLd-E9sPHpYcd_H0oyfyA3rKkwKjt5IQPsWfmHJeYAM9Pl_PfIhoc5ONd_stSpWMjqnDpRTuB6YvFQgoRINctWD3Fm9J2pxmLJXQdpby996NQMdVvvvsBrbH3IXeFH3WVBqohmU-L2OthdT3EvStR3E9e8jQaQGh77nY800W3avR3zRZj2QZn8AxdjyvgfxlJ2Wxssj_-XhelsOc9et3GL4rGfTGIOat_wykr1BZLR-aGHrOR3Y74gZBQ7GUp6OJu557HE7k3aDWOgEDIAg-FfQ5zr75lYzuZ_MnR0Tk2DaO_5jsa_UWAwjM60Y7u0ZrGVU5fzvX33VhJ1gbRt0A69ChZcvg3Gk1bOm8QlMsTXxX_tksAyTQac_dInEJom8OqV1MUMPVRCY-ta8QXUVz2fNfgUFLYqhqDVaTf84Op7aouDhsX-cpFaeWOQYjt3vynkacRcobiWwFBLuL88z1DLgPrruDVQBB8wWcgqCqiHwtb8nu7tqOxvt-txMSLtBbk7YieDl9DGeCOvqXH0g4f8j3HP0K5dmNLmdjcvnh--xkKMZdYclGgDrKsg-i7ygf_h18r5i-XsT7uezfeKyzeiwTj4eAe4rdJ5gy22F_uczU2poCti6M9BTChzLjjcOFjcdW-j39psWG_vnybvR2xcYptfP_oPXRc0VY02jyKNUB3AryNci4kFRHM9L3Zeg5y5ZoiIrNHys8DjaJa_P64xDHqc6Lh5_THvAbIijaPbjA2Tx2xmnd3zEBBpcVG-mrJhGkFkd1erHGUxWcDf2IxD7GhkA4arUUBvo9PBPCj1RvEMTr4SpRWWGHvPijOet4HzkN3jmovFipRpEKX9Qzua7a-gFD5xjlwhq8XdfL6_e8NphzaIhahpFPF8-VqPD7j1LBmdk8Gibm-TJGyBApD10FVcNGx8Q07Y5tAeXM6aexjLOMjumfA13L6yDTUqAcnwN_u8dG8-JCZ1IdzTLic1YEyOpo8c16KTs4v1Pu_oBsV_iHWWC72IBeFvUJ26BhmNlzJts4ug_UOjTYGDh0Q-Lp2z116FyYroeJKjhHZs4ft1iaGIoZSlngj0Y4KkuAzWB2z_hj1oGdX6jwQCMlPhr8pInzjEYeVlsqCY43oQtck_16W8XvQf05gf8byryIKcYShJ7kaoT-oFXAatlRp1zzQ72x1bA22IySYap3g9y3Xgo-pW2ji4BjCY1qEch8_ybwib1HdX9LZnITkEN1NXbdWu27jXrw7xwvZuad8XHxDn9VXfN9k3hTpfOZzbUc492zbqwJZesLJHnn5aID2KsKnLZ6YIgyQxvFwO1M4AKjhJy2JTtK_cPuyHsivfJxVJW8puyBT0ZJEma2vs1Q6gTJHl4RkxenuvN3BmuNXkzrUcYNRvASW2md4-zg_9hRj5Ecrx6ICpKSddGTBP8-QigJW4biOt6doZM8vHU77bkNoPhFbY46wtvX2irvh2MhvPcoWrjYnTpHP9kiZ45GoAf_PSBqWV0Hu-AnDzZlublZ_0p5e8I097WXnBpJuw4Yh2tbPVoi3qtGkPjh80wg6iMd5rBAPKWvM7PRmNNHbp_cxBVVFOWiPNdsc3ekVog4IPD0dqu-qsmZM5GsJLS86r-G-KzZAI5yyo1rqi2i7w_YYdjcW318hcOM1cless9YLfrXmbXXXzAEmlR_Yhgy4q5q7raW1XCCDMa2Qa4UMwbpElCuXVY2ZQoHLnh9ZHo8ZsqkIAeWnJ6Nz4Az7y-um3OIMO4haTf-MwCetxaCYPSjjtSyNRxfcaquGqijc6BidDUAv6nWf97AwIYBQZWxdDp-xEVWFM7SygJczigBbAl_acOA1dRWIW1WoxMNVjfIacpk4XKrOlGQPVI1vLIASgBSyP90qcim63lkCuwnn925hWIKSOejxlYeTJl1QttwXWzagzewrOHkAl3CdpGv8Q0QPb8Wlf51ps0YxkYfePDOl40aYPLK0HvRZO5wyHh2nbF__VffWCbIOO4j8iJL9jKjCMEAYlaJxDgAkeFkUigZ456R_Sh3nmXKhHHso__Q1puZnyTaQkZMKF6Id5sYPt1ZxP2iPEh_wNNs9iQ7OxDMsXNLh43iWlpJTYum2euX5yxYF0eF8adKmO0pf_S26cMNJ9pjED2uZUjNEDQj7i5EtsnmGjZwGX0_D_-lSgQCBg6pxTG6xEYc_67qzLfBWNUT6Fl3LY6CWsMQkIIpEBhIVx05si2sqyYOUT_xkUcaY9wFCS2IeYc6Dc9994bs537V40sYE93zQR3WvRS2sKFWebobfU_2lLh5izZ2EmSWOXnr5MQT8z7Y_bjA4a7x6yThMeQ9E8COQqBJzPkuVAdmUfAxlNJAtlCDY_eQnLk9lZJ0QbbLJDPLGyCN0YLk4ZCNXw16f6-f-YU33E8qyf95C3cLhY5o27Nh9hwRyAS0obIR_cq1MdzKiM1VxKDhbYsj2tnvai42q0lnktlhkoNu5_k2ubOg31ecfNfu9fbklfBPjcktoZI7jPO0vhBKLhKooWJUCGoxJFSYiY7MowMG8WrLph6WVUiA4UKsqPIFCKB4bWDnhr7Ra0aPRf9dny2gtut6waCgL4VyeGG2WP2wHCFU2ahrPZoMOfEKz96KAU_xCeSmrhjN2gAV9I_NXGjn3CvVOspXa6C6jZA0d4aQ1gHlKuk20FIy2ijJhT_1oMX2wTOCKGsHpFL24OS7_dOG1bDufHO9fmEx3DBrdD-AaFay2-r3ov28iYGJS-ur9J-XmcbzpW5Fc39hGursxn9axLw1QTkOFRVGYGJpqgI0gkpUr_S0CmclNmdEs8NxhUTS4NlX1x1xcIUR6q3izSCRoMp5BXb3NwWicc4VZVUGz7HYEPj-i2793eq9CiaXK4hzjV8QAtOMeHpV2eK5BRwKrYS4bAmQUOfhIOFUOK0kUQF0fr46DyhLJPuB3MQsgbajm09DxVyeEp7QKRyag1edTb-JOaZuI4Yp_X8I23Ag4CZLmMdR6fPwADMYLBCS71zIcZB_H6s0PnHP1qSbkEfjJhhvy07vKHK461nNFFiHXKXzVqvzwzNP3Oeizu7j25YJjtg1Gj1xBXcrNUaVoToA5dOxbN6BqiDh65QT0e2ganzsR06jEHw")
      .resources(http("request_419")
        .get(uri08 + "/js/bg/FImcmxIydQ5zO5X4JWmfILYA5Uks6S5qhuxO7imXJic.js")
        .headers(headers_1),
        http("request_420")
          .get(uri10 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
          .headers(headers_275),
        http("request_421")
          .get(uri11 + "/api2/refresh_2x.png")
          .headers(headers_1),
        http("request_422")
          .get(uri11 + "/api2/audio_2x.png")
          .headers(headers_1),
        http("request_423")
          .get(uri11 + "/api2/info_2x.png")
          .headers(headers_1),
        http("request_424")
          .get(uri11 + "/api2/image_2x.png")
          .headers(headers_1),
        http("request_425")
          .get(uri11 + "/api2/undo_2x.png")
          .headers(headers_1),
        http("request_426")
          .post(uri08 + "/recaptcha/api2/userverify?k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI")
          .headers(headers_418)
          .formParam("v", "5fbZx3NV5xhaMoMLrZV3TkN4")
          .formParam("c", "03AOLTBLQIbYwWxn2ipnEmKYLEPC_lrFbRX07kNqHSrwlrLJ4rmT59JWQf918xlp8NBabBvjVjFZArggQ_vYeIT1guyzmAwIMsRYGugzmv_llnP80hsZXrdpb-jUMoCCrQytEBPtOoAb16xTqRXvSwAkq-QQv3OoW37fn2ufoTfA8pJCJCd1T1UOF74SOOSTeWmVKfWNw2p5q98qnhyhnafdfdvAkf1De5tJjF26egfqe7OC-opu5lE0sxl8Urle_FXBP46ENXoH2iT1Kd61fGiZf-e8vsgfpeE2x_tJ7EiptBI2dDxGXx3JzNuHz3XAZzLI1pWBFyFG7mufUEjB49CRJdm0yjq3IX7TRfFoUrev7usNxW3kE4-3l1F9eG91XCqm0yrUDsWxyXs7aA5sLIlyP3WBpeXgBkWAGUI5v6K3LBzMPduBZWmg6zpl-7_1AFjFb7hN7sj39EAOujgE-OZ02Wv_tnLSaXJuSi02XPbYvgLu1TspvbgDkHII-lX0g6cAOA5rJZiaAMnEoUcVZIL1_hD6FuG7vuwpAalCqoLwaUHqeia8FDt1qqC5X6wRm_U85wnDFH7682h5ochs32u8hfaeCQiSaUj4XjYddGuIMe4B6tC99-2Y5wscQErksP34kZeOvujxAYZojscfUJPDc0_xZt2bzbdGa1JeQ4iSN6_nr6fOC5rSlVDakSDB1dhJ5sYf01SNilpwyyLEAyuoXErzd6IqdXk_8P51hzzm1j-9MrUQmks84kvpUxKtJe15-zr4c3YefqxPFDAA_cHm2wYqz18ZOFtqhfeiBRfotpfYQpyjbXL18gIDxTXirLZDYc8LrklYCbsrAgWkLiknkZmQ7fgJw9D4_J4ROi0ypsEwwDA07qUMO00J8rN5FfIcNr20qhIcLSwH1ZiQ6rcpJ1d-igKFcnKu8NuNWpvcK0PGKuILgg2ERb43D8iS55Jo8iVz0SGLGYr0VzL0KZMeXpfAh7iIaBdf_einA3Xkg1hJbex6n4iLqYO_CwQCRkqLT8XHBYK6FMWz2J7jn99BWLiYYK7w8lqSastkG5jKFtMUqgIYpH7W8b8K3f52jzykMiyQrmfljFFS_kvStlx1eWAQM7SpckbO3ZZgGuaet8PLmHYhuljfK_SN6vVZGtVtVTGo3sG8DdOCkdJJ2A5CJwExnuiuJcyAQdXXYkw9fv1RwZyHDBVJ5yXzls4ctPs3PtBW_zKB020flJ0QnTIRuUz5K8PUNSLZJNiLIB1GUF6IP8543BEpSfZ7PYXMEKLp_8qWDWIjVhAWrTehgjammmAFQgSjO2k76QLAPNOOtlm7-JgG4Qfghbk8OHyl0kGCbJ4g_DhYPx1oLgKZGwCn0bAHambrm_sqDtQsMuoFJkftOJckvnpQalpCc8_lebV7oMGiMGOzU51-ygYJF2oDMICIff_iV0-NWirZXWZm3DWSzgF0G6KStZuZLjB0t42JPR2AY9GUYQ8fNZXhnvkyRgY1t9Lrtj6HVOBoPhaLHPZawOXTBOTL-zJ-yJWQi-HZBohRYbv3AGAJzgc7L-QmYWKY09ZpeCaaFAkNrPVDqeW2fa26tyhbjpnOdkxVFa34ibOwUIXgGKAvbfhuF-DOjYYIKR_KzlpHbIQgzqxHFNlfeqHtgmZ6lm_NZcD7Hnq_BWtcvGWJm1__PzjnC09As2NS3kJ2Ui81ib6yXhHfoqZJVVQeDNzoDgwYpPcqwVZEXfjfERvEVka2VVLHANp4M_WSOyJAJbAKi-m7pq0GgyjcubwafOJlosOIXVEOUnPMxnAAZPNuyCAvKfM7_QA7nwPkZVx8hziFY2xQ252hA5PE916CVRbF9EySgwIQFtY8Zc-zRYDu36Jv1R9WSpNNX6ZGWkDWNnv3io03vuygHL58m4acx2rVtZDIRpMRIU95oWsB25PPq8sVkV6DVqZ9NZXExLhr1sAtZzNSDdd8CdJrB36uchmNl2YSG7mgaK0oYHWR4YddDr")
          .formParam("response", "eyJyZXNwb25zZSI6IiIsInMiOiI0ODE5IiwiZSI6IkJoSVV1cXcifQ..")
          .formParam("t", "553")
          .formParam("ct", "553")
          .formParam("bg", "!BgCgACFHXnq9dcxfculdhHGzMnglqusHAAAAYVcAAAC5nAPwyKrPLIIj_l2z0v1yOiSZ7Da5pRG8euAh3mJQ7Xn9V2s5jixykuUxWfDix2WRm4Lc03ZjskJUTYQ7Riuz9sDX3nEO11XC9d2-hfUVnF0lbNvTghi0PU5e7dSrJA5EE-GeV4wRHsZyWLlPoJd0BnwmGd2tUOGRk9sElEKNyCP47DLdxHG_CsGoNzWtdEqY_TVsNCQ-B8lud5JsaNrhzKFdT9lk9d08qXOmWKkRVd7B3fCBQOTiYhXKeTB3dNphQ7Y5SU_T1-kfF6XMyHURjjFFccUcHVMivCT8d4HzTDuM6iRai57foFseCEm6Xc0iKpYX-E62YFb7kGt27EaA90Os-y3dWp_HQMGqj05GdBx_e7Cpn9I02aQ2lmWFYPeSSPA2aYJ8WYxII6Aa8pjZQa2Lgrsz9WDi5KzduZGwPxjxOuurR5EggyiixZoCD0MEBS5l4vAIoZh0IEz8Ktxg4daTmgeofr3hx7VKJdAJTDfo7LgSGbJAGqmE5oibUCC-4zaBiAX4WaCzTIW9rIxDcUsu8Zpyp2dcxh2rgD5nbMYH-1sMRz21ErVQzTDYYQzzfpYDjKeGuQ5cwT9RHyDc-P9e-68fXrwqmNFoCVJGDfn07RG1pidEDi0-Z5tzY6ylH4wtGdnLK2au5SLyqt3VH9Im2eXdS82ieyceBB26rZ1qALXPmckJxEs5z7rLsnfrh96szTmUuHzPTK7k2QPFXgMAUwUxH4DbUhzT-X5C-PgAa_l2ejwv2ZawbZohQS-qw5XaZJmEwQBnRj3lE2jXEC96ceyWo8Qw67Nc1as0yiiSmxTUU0pLznCfKF0hXdAuA5JR_joae2S_8MMGbPC_caB7A1Y42B-62Jag5PvUbFrLrBLS9O98BUs4MTWmd3E1ponodqGNJbveDM-chVPRw4cIzrdMZQNSQNV6-LpNzHVrfDqOGFrczkHJIjvUTo8LNWzaIZmYzvJAFmeTCWYEdntsFkl0cQLxd0srEpMkCxqCcCophSXDJDkQDmQ83vfLxw58PAi4T7cOSder_516AhbeIxAQlz06JMvV67Jej-b3K5F1sgqe-Ro8twDbxpuUaGEmZIntLwwVSDLbp3W7SPbYUrseF3ZWwrryikqItxJfTPtSeAMZn-cipnV3awZhmC36gRsggNWrxYR_VYVCcOG4TkEippIfZ7cx7oLXq0pZ18PTZvxUd8y2tNQXxvpbk_uBZoTkf6gJ4EvnVsRZbaZVsjkT_J9vDJ5rYn_2TzcZhTJW0TMf1XFTOjR7LGQvL7FnvpUxcQbGS9ScmiTLu5gUdIiP0JqxPO5DPs23zDRZHSWZqm1ad8wMvAP-y2zG-kDe")))
    .pause(1)
    .exec(http("request_427")
      .post("/_vti_bin/afiliaciones/ServicioAfiliaciones.svc/GetValidarVinculacionAfiliacion")
      .headers(headers_427)
      .body(RawFileBody("/afiliacionempresa/0427_request.json"))
      .resources(http("request_428")
        .post("/_vti_bin/afiliaciones/ServicioAfiliaciones.svc/PostActualizarAfiliacion")
        .headers(headers_427)
        .body(RawFileBody("/afiliacionempresa/0428_request.json")),
        http("request_429")
          .get("/Afiliaciones/_api/web/lists/GetByTitle('Pasos%20Afiliaci%C3%B3n')/items?$select=Id_PasoAfiliaciones,NombreAfiliaciones,DescripcionAfiliaciones,url_pagPasoAfiliacion,TipoAfiliacion_ListTipoAfiliaciones/NombreAfiliaciones,TipoAfiliacion_ListTipoAfiliaciones/Id_Afiliaciones&$expand=TipoAfiliacion_ListTipoAfiliaciones")
          .headers(headers_255),
        http("request_430")
          .get("/_api/web/lists/GetByTitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_255)))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
