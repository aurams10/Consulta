package Compenssar


import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class afiliacionIndependiente extends Simulation {

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

  val headers_67 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_75 = Map(
    "Intervention" -> """<https://www.chromestatus.com/feature/5718547946799104>; level="warning"""",
    "Sec-Fetch-Mode" -> "no-cors")

  val headers_78 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_90 = Map(
    "ACCEPT" -> "application/json;odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_109 = Map(
    "Accept" -> "application/json; odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> "text/plain",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_115 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-RequestDigest" -> "0x1AC11B96D469F78873E69180158B68BA252F8056718E8A4D2EBA84335E61645A4918A9A8C0D47E34C04DA45054128D96366E9D1E1140BC5C82F368F69DC2ADD8,25 Oct 2019 21:45:15 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_129 = Map(
    "Accept" -> "application/xml, text/xml, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> """text/xml;charset="UTF-8"""",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_131 = Map(
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

  val headers_260 = Map(
    "ACCEPT" -> "application/json;odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_269 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-RequestDigest" -> "0xB3193D488283FAF9675A9CCE78B508C543D8252721CB94E825D3E15FBE23EA86067F68A2DB83DD83FE1AC715C2364A166530AA1ABC87B67E8FDD61F0D29CB0CD,25 Oct 2019 21:45:20 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_270 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "sec-fetch-mode" -> "nested-navigate",
    "sec-fetch-site" -> "cross-site",
    "upgrade-insecure-requests" -> "1",
    "x-client-data" -> "CIy2yQEIo7bJAQjAtskBCKmdygEI2p/KAQjiqMoBCMuuygEIyq/KAQjOsMoBCPW0ygE=")

  val headers_280 = Map(
    "Origin" -> "https://www.google.com",
    "Sec-Fetch-Mode" -> "cors")

  val headers_282 = Map("Sec-Fetch-Mode" -> "same-origin")

  val headers_420 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-RequestDigest" -> "0x063C459BF49BA5ECE48D12464AE805CC3770FFCAC9DE61BEB20DB28A87787529095D23ACD49703EC4BB22443870C9E93E6E57F696D390AA3ABCFC56BB7BE0CFE,25 Oct 2019 21:45:32 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val uri01 = "https://www.google-analytics.com"
  val uri02 = "https://c.oracleinfinity.io/acs"
  val uri03 = "https://service.maxymiser.net"
  val uri04 = "https://stats.g.doubleclick.net/r/collect"
  val uri05 = "https://www.compensar.com/img/2016"
  val uri06 = "https://www.cesarcancino.com/codigos/js/base_64.js"
  val uri07 = "https://www.googletagmanager.com/gtm.js"
  val uri08 = "https://www.google.com"
  val uri10 = "https://fonts.gstatic.com/s/roboto/v18/KFOmCnqEu92Fr1Mu4mxK.woff2"
  val uri11 = "https://www.gstatic.com/recaptcha"
  val uri12 = "https://dc.oracleinfinity.io/awlorq1lmp/dcs.gif"

  val scn = scenario("afiliacionIndependiente")
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
          .get("/_layouts/15/images/searchresultui.png?rev=23")
          .headers(headers_1),
        http("request_61")
          .get("/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_1),
        http("request_62")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_63")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_1),
        http("request_64")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_1),
        http("request_65")
          .get(uri03 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_1),
        http("request_66")
          .get("/Style%20Library/js/datalayerCorporativo.js")
          .headers(headers_1),
        http("request_67")
          .get("/PublishingImages/logo-compensar-gris.svg")
          .headers(headers_67),
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
          .get("/PublishingImages/banner-firma-digital-prospectados.png")
          .headers(headers_1),
        http("request_74")
          .get(uri01 + "/analytics.js")
          .headers(headers_1),
        http("request_75")
          .get(uri03 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252F%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&pd=-1790140198%7CJQAAAApVAwDcYaCCPxIDZAABEgABQgCFdZ%2BHAwD3rrJjlFnXSMUHQGJSUtdIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBSBICAAEAAAAAAAAA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAAAAAAAAAFF&bid=nycvwcgus08&srv=nycvwcgus08")
          .headers(headers_75),
        http("request_76")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D")
          .headers(headers_1),
        http("request_77")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_78")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_78),
        http("request_79")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D")
          .headers(headers_1),
        http("request_80")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_78),
        http("request_81")
          .get(uri01 + "/r/collect?v=1&_v=j79&a=1568386383&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2F&ul=es-es&de=UTF-8&dt=Compensar%20Caja%20de%20Compensaci%C3%B3n%20Familiar%20home&sd=24-bit&sr=1366x768&vp=1366x152&je=0&_u=QACAAEAB~&jid=1627025658&gjid=1125127165&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&_r=1&gtm=2wgaa05GF54C6&z=1359465667")
          .headers(headers_1),
        http("request_82")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_78),
        http("request_83")
          .get(uri05 + "/icon-face.png")
          .headers(headers_1),
        http("request_84")
          .get(uri05 + "/icon-twitter.png")
          .headers(headers_1),
        http("request_85")
          .get(uri05 + "/icon-youtube.png")
          .headers(headers_1),
        http("request_86")
          .get("/Style%20Library/images/dashLine.png")
          .headers(headers_1),
        http("request_87")
          .get(uri05 + "/icon-linkedin.png")
          .headers(headers_1),
        http("request_88")
          .get(uri05 + "/icon-instagram.png")
          .headers(headers_1),
        http("request_89")
          .get(uri04 + "?v=1&aip=1&t=dc&_r=3&tid=UA-90763271-1&cid=974125059.1571241288&jid=1627025658&_gid=622444644.1572016093&gjid=1125127165&_v=j79&z=1359465667"),
        http("request_90")
          .post("/_api/contextinfo")
          .headers(headers_90),
        http("request_91")
          .post("/_api/contextinfo")
          .headers(headers_90),
        http("request_92")
          .post("/_api/contextinfo")
          .headers(headers_90),
        http("request_93")
          .post("/_api/contextinfo")
          .headers(headers_90),
        http("request_94")
          .post("/_api/contextinfo")
          .headers(headers_90),
        http("request_95")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_bannerhome.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_96")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_97")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_bannerhome.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_98")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_enlacesinteres_nuevo.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_99")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_enlacesinteres.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_100")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_101")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_102")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_enlacedirectos2.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_103")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_enlacesdirectos.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_104")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_novedades.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_105")
          .post("/_api/contextinfo")
          .headers(headers_90),
        http("request_106")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_novedades.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_107")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_noticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_108")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_noticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_109")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_109),
        http("request_110")
          .get(uri02 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_1),
        http("request_111")
          .get(uri02 + "/common/js/0.0.19/common.js")
          .headers(headers_1),
        http("request_112")
          .get("/style%20library/css/compensar.tendencias.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_113")
          .get("/style%20library/css/compensar.compstandard.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_114")
          .get("/style%20library/css/compensar.enlacesdirectos.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_115")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_115)
          .body(RawFileBody("/afiliacionindependiente/0115_request.dat")),
        http("request_116")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_115)
          .body(RawFileBody("/afiliacionindependiente/0116_request.dat")),
        http("request_117")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D")
          .headers(headers_1),
        http("request_118")
          .get("/style%20library/js/compensar.carruseldebanners.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_119")
          .get("/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_120")
          .get("/style%20library/js/compensar.novedades.min.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_121")
          .get("/style%20library/js/compensar.modulonoticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_122")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_115)
          .body(RawFileBody("/afiliacionindependiente/0122_request.dat")),
        http("request_123")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D")
          .headers(headers_1),
        http("request_124")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D")
          .headers(headers_1),
        http("request_125")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_115)
          .body(RawFileBody("/afiliacionindependiente/0125_request.dat")),
        http("request_126")
          .get("/Style%20Library/css/compensar.compStandard.min.css")
          .headers(headers_1),
        http("request_127")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_115)
          .body(RawFileBody("/afiliacionindependiente/0127_request.dat")),
        http("request_128")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_129")
          .post("/_vti_bin/Webs.asmx")
          .headers(headers_129)
          .body(RawFileBody("/afiliacionindependiente/0129_request.dat")),
        http("request_130")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_115)
          .body(RawFileBody("/afiliacionindependiente/0130_request.dat")),
        http("request_131")
          .post("/_vti_bin/Lists.asmx")
          .headers(headers_131)
          .body(RawFileBody("/afiliacionindependiente/0131_request.dat")),
        http("request_132")
          .get("/PublishingImages/Destacados/cirugia-estetica-compensar.png?RenditionID=107")
          .headers(headers_1),
        http("request_133")
          .get("/PublishingImages/Destacados/credito-libre-inversion-compensar.png?RenditionID=107")
          .headers(headers_1),
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
          .get("/Style%20Library/css/compensar.novedades.min.css")
          .headers(headers_1),
        http("request_140")
          .get("/PublishingImages/Destacados/09-abril-2015-salud-oral.jpg?RenditionID=107")
          .headers(headers_67),
        http("request_141")
          .get("/Style%20Library/css/compensar.moduloNoticias.min.css")
          .headers(headers_1),
        http("request_142")
          .get("/PUBLISHINGIMAGES/TENDENCIAS/TENDENCIA-REVISTA-COMPENSAR-CESANTIAS-500X250.JPG?RenditionID=105")
          .headers(headers_1),
        http("request_143")
          .get(uri12 + "?dcsdat=1572039926654&dcssip=prucorporativo.compensar.com&dcsuri=/&wt.tz=-5&wt.bh=16&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Compensar%2520Caja%2520de%2520Compensaci%25C3%25B3n%2520Familiar%2520home&wt.js=Yes&wt.bs=1366x152&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252F&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&wt.co_f=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_1),
        http("request_144")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D")
          .headers(headers_1),
        http("request_145")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_146")
          .get("/Style%20Library/vendor/ajax-loader.gif")
          .headers(headers_1)))
    .pause(2)
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
          .get("/WebResource.axd?d=VE1LltKE1dXL7-UbkAp-bt6ljn4Brx0V3X9hDRsD8jSFT9qB8YndTHVisocnrFQ8rNfw3OXiDn_Fb7iUlcK8bUIBKyIA1h_3y1b4G2-c7f01&t=635792838349294682")
          .headers(headers_1),
        http("request_210")
          .get("/_layouts/15/images/nodearrow.png")
          .headers(headers_1),
        http("request_211")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_212")
          .get("/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_1),
        http("request_213")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_1),
        http("request_214")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_1),
        http("request_215")
          .get(uri03 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_1),
        http("request_216")
          .get(uri08 + "/recaptcha/api.js?onload=captchaReady&render=explicit")
          .headers(headers_1),
        http("request_217")
          .get("/PublishingImages/logo-compensar-gris.svg")
          .headers(headers_67),
        http("request_218")
          .get("/Style%20Library/js/ecmascript.array.find.min.js?v=1")
          .headers(headers_1),
        http("request_219")
          .get("/Style%20Library/js/ecmascript.string.includes.js?v=3")
          .headers(headers_1),
        http("request_220")
          .get("/Style%20Library/js/globant.validator.js?v=1")
          .headers(headers_1),
        http("request_221")
          .get("/Style%20Library/js/compensar.reanudarSolicitud.min.js?v=12")
          .headers(headers_1),
        http("request_222")
          .get("/Style%20Library/css/compensar.reanudarSolicitud.min.css")
          .headers(headers_1),
        http("request_223")
          .get("/afiliaciones/PublishingImages/ArticulosKenzo_001.jpg")
          .headers(headers_1),
        http("request_224")
          .get("/afiliaciones/PublishingImages/PracticasLibres_003.jpg")
          .headers(headers_1),
        http("request_225")
          .get("/afiliaciones/PublishingImages/Eventos_002.jpg")
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
          .get(uri01 + "/collect?v=1&_v=j79&a=1760480496&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2Fafiliaciones&ul=es-es&de=UTF-8&dt=Afiliaciones%20Inicio&sd=24-bit&sr=1366x768&vp=1366x152&je=0&_u=QACAAEAB~&jid=&gjid=&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&gtm=2wgaa05GF54C6&z=879801962")
          .headers(headers_1),
        http("request_233")
          .get(uri03 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252F%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fafiliaciones%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&pd=-698956192%7CJgAAAApVAwDcYaCCPxIDZAABEgABQgCFdZ%2BHAwAxB%2F2elFnXSMUHQGJSUtdIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBSBICAAEAAAAAAAAA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAAAAAAAAAFF&bid=lvsvwcgus11&srv=lvsvwcgus11")
          .headers(headers_75),
        http("request_234")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_78),
        http("request_235")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_236")
          .get("/Style%20Library/images/dashLine.png")
          .headers(headers_1),
        http("request_237")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_78),
        http("request_238")
          .get("/Style%20Library/fonts/glyphicons-halflings-regular.woff2")
          .headers(headers_78),
        http("request_239")
          .get("/Style%20Library/fonts/roboto/roboto_bold/Roboto-Bold-webfont.woff")
          .headers(headers_78),
        http("request_240")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_78),
        http("request_241")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D")
          .headers(headers_1),
        http("request_242")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_243")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_78),
        http("request_244")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D")
          .headers(headers_1),
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
          .headers(headers_90),
        http("request_253")
          .post("/Afiliaciones/_api/contextinfo")
          .headers(headers_90),
        http("request_254")
          .post("/Afiliaciones/_api/contextinfo")
          .headers(headers_90),
        http("request_255")
          .get("/style%20library/js/compensar.carruseldebanners.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_256")
          .get("/style%20library/css/compensar.tendencias.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_257")
          .get("/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_258")
          .get("/style%20library/js/compensar.modulonoticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_259")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_109),
        http("request_260")
          .get("/_api/web/lists/GetByTitle('Configuraci%C3%B3n')/items?$select=Valor,Nombre,Seccion&$filter=(Nombre%20eq%20%27URLLogin%27)%20and%20(Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27)")
          .headers(headers_260),
        http("request_261")
          .get("/Afiliaciones/_api/web/lists/GetByTitle('Tipos%20Identificaci%C3%B3n')/items?$select=CodigoAfiliaciones,NombreAfiliaciones,AbreviacionAfiliaciones,EstadoAfiliaciones,FormulariosAfiliaciones&$filter=FormulariosAfiliaciones%20eq%20%27Formulario%20Reanudar%20Solicitud%20Afiliaci%C3%B3n%27")
          .headers(headers_260),
        http("request_262")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=((Seccion%20eq%20%27General%27)%20and%20(Nombre%20eq%20%27URL_SeguimientoTramites%27))")
          .headers(headers_260),
        http("request_263")
          .get(uri02 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_1),
        http("request_264")
          .get("/_api/web/lists/GetByTitle('Mensajes%20Visuales')/items?$select=MSG_ClaseUI,MSG_Titulo,MSG_CuerpoTexto&$filter=(Title%20eq%20%27Error_General_Servicios%27)%20and%20(MSG_Modulo%20eq%20%27General%27)")
          .headers(headers_260),
        http("request_265")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=((Seccion%20eq%20%27Autenticaci%C3%B3n%27)%20and%20(Nombre%20eq%20%27GoogleCaptchaKey%27))")
          .headers(headers_260),
        http("request_266")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D")
          .headers(headers_1),
        http("request_267")
          .get(uri02 + "/common/js/0.0.19/common.js")
          .headers(headers_1),
        http("request_268")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D")
          .headers(headers_1),
        http("request_269")
          .post("/Afiliaciones/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_269)
          .body(RawFileBody("/afiliacionindependiente/0269_request.dat")),
        http("request_270")
          .get(uri08 + "/recaptcha/api2/anchor?ar=1&k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI&co=aHR0cHM6Ly9wcnVjb3Jwb3JhdGl2by5jb21wZW5zYXIuY29tOjQ0Mw..&hl=es&v=5fbZx3NV5xhaMoMLrZV3TkN4&size=normal&cb=ietdgz5zxf3u")
          .headers(headers_270),
        http("request_271")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D")
          .headers(headers_1),
        http("request_272")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_273")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/styles__ltr.css")
          .headers(headers_1),
        http("request_274")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_275")
          .get("/Style%20Library/css/compensar.carruselDeBanners.min.css")
          .headers(headers_1),
        http("request_276")
          .get("/Style%20Library/vendor/slick.css")
          .headers(headers_1),
        http("request_277")
          .get("/Style%20Library/vendor/slick-theme.css")
          .headers(headers_1),
        http("request_278")
          .get("/Style%20Library/css/compensar.carouselTheme.min.css")
          .headers(headers_1),
        http("request_279")
          .get(uri11 + "/api2/logo_48.png")
          .headers(headers_1),
        http("request_280")
          .get(uri10)
          .headers(headers_280),
        http("request_281")
          .get(uri08 + "/js/bg/S9fUSTxhhOdrtoorjI9LLu91aXsPVT7Js_3UUxt2SGg.js")
          .headers(headers_1),
        http("request_282")
          .get(uri08 + "/recaptcha/api2/webworker.js?hl=es&v=5fbZx3NV5xhaMoMLrZV3TkN4")
          .headers(headers_282),
        http("request_283")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D")
          .headers(headers_1),
        http("request_284")
          .post("/Afiliaciones/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_269)
          .body(RawFileBody("/afiliacionindependiente/0284_request.dat")),
        http("request_285")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_286")
          .post("/Afiliaciones/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_269)
          .body(RawFileBody("/afiliacionindependiente/0286_request.dat")),
        http("request_287")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_288")
          .get("/Style%20Library/css/compensar.moduloNoticias.min.css")
          .headers(headers_1),
        http("request_289")
          .get("/AGENCIA-EMPLEO/PUBLISHINGIMAGES/NOTICIAS/NOTICIA-VESTIR.JPG")
          .headers(headers_1),
        http("request_290")
          .get(uri12 + "?dcsdat=1572039932028&dcssip=prucorporativo.compensar.com&dcsuri=/afiliaciones&dcsref=https://prucorporativo.compensar.com/&wt.tz=-5&wt.bh=16&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Afiliaciones%2520Inicio&wt.js=Yes&wt.bs=1366x152&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252Fafiliaciones&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&wt.co_f=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_1),
        http("request_291")
          .get("/PUBLISHINGIMAGES/TENDENCIAS/TENDENCIA-REVISTA-COMPENSAR-CESANTIAS-500X250.JPG?RenditionID=105")
          .headers(headers_1),
        http("request_292")
          .get(uri08 + "/recaptcha/api2/bframe?hl=es&v=5fbZx3NV5xhaMoMLrZV3TkN4&k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI&cb=oob79el9xc5q")
          .headers(headers_270),
        http("request_293")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/styles__ltr.css")
          .headers(headers_1),
        http("request_294")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_295")
          .get(uri10)
          .headers(headers_280)))
    .pause(5)
    .exec(http("request_296")
      .get("/afiliaciones/quiero-afiliarme/caja-de-compensacion/afiliacion-independientes")
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
          .get("/PublishingImages/favicon.ico?rev=23")
          .headers(headers_1),
        http("request_343")
          .get("/_layouts/15/images/spcommon.png?rev=23")
          .headers(headers_1),
        http("request_344")
          .get("/PublishingImages/logo_compensar.png?rev=23")
          .headers(headers_1),
        http("request_345")
          .get("/WebResource.axd?d=hcspxoKGngdkW0b6xYvFftMD9L7tgVctZKvxUqyhcPMOX4gSlmQgLLYGJ7F9lMuasHqe9Mv5x6g7VZmrwkJEQmLxw_pNwohGyqmgqyaeGpA1&t=635792838349294682")
          .headers(headers_1),
        http("request_346")
          .get("/PublishingImages/logo_compensar.png")
          .headers(headers_1),
        http("request_347")
          .get("/_layouts/15/images/searchresultui.png?rev=23")
          .headers(headers_1),
        http("request_348")
          .get("/WebResource.axd?d=VE1LltKE1dXL7-UbkAp-bt6ljn4Brx0V3X9hDRsD8jSFT9qB8YndTHVisocnrFQ8rNfw3OXiDn_Fb7iUlcK8bUIBKyIA1h_3y1b4G2-c7f01&t=635792838349294682")
          .headers(headers_1),
        http("request_349")
          .get("/_layouts/15/images/nodearrow.png")
          .headers(headers_1),
        http("request_350")
          .get(uri07 + "?id=GTM-5GF54C6")
          .headers(headers_1),
        http("request_351")
          .get("/Style%20Library/css/compensar.menuSecundario.css")
          .headers(headers_1),
        http("request_352")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_353")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_1),
        http("request_354")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_1),
        http("request_355")
          .get("/Afiliaciones/PublishingImages/Afiliacion_Indepentientes.jpg")
          .headers(headers_1),
        http("request_356")
          .get(uri03 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_1),
        http("request_357")
          .get("/PublishingImages/logo-compensar-gris.svg")
          .headers(headers_67),
        http("request_358")
          .get(uri01 + "/analytics.js")
          .headers(headers_1),
        http("request_359")
          .get(uri01 + "/collect?v=1&_v=j79&a=1160283424&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2Fafiliaciones%2Fquiero-afiliarme%2Fcaja-de-compensacion%2Fafiliacion-independientes&ul=es-es&de=UTF-8&dt=Afiliaciones%20Afiliaci%C3%B3n%20independientes&sd=24-bit&sr=1366x768&vp=1366x584&je=0&_u=QACAAEAB~&jid=&gjid=&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&gtm=2wgaa05GF54C6&z=789533474")
          .headers(headers_1),
        http("request_360")
          .get(uri03 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fafiliaciones%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fafiliaciones%252Fquiero-afiliarme%252Fcaja-de-compensacion%252Fafiliacion-independientes%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&pd=-1116277246%7CJwAAAApVAwDcYaCCPxIDZAABEgABQgCFdZ%2BHAwDVuzqilFnXSMUHQGJSUtdIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBSBICAAEAAAAAAAAA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAAAAAAAAAFF&bid=lvsvwcgus11&srv=lvsvwcgus11")
          .headers(headers_75),
        http("request_361")
          .get("/Style%20Library/images/dashLine.png")
          .headers(headers_1),
        http("request_362")
          .get("/_layouts/15/sp.init.js?rev=jvJC3Kl5gbORaLtf7kxULQ%3D%3D")
          .headers(headers_1),
        http("request_363")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_78),
        http("request_364")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=SP%2ERes&rev=DoAHv8R6TO7rl33LcYBJTA%3D%3D")
          .headers(headers_1),
        http("request_365")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D")
          .headers(headers_1),
        http("request_366")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_78),
        http("request_367")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D")
          .headers(headers_1),
        http("request_368")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_78),
        http("request_369")
          .get("/Style%20Library/fonts/roboto/roboto_bold/Roboto-Bold-webfont.woff")
          .headers(headers_78),
        http("request_370")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_78),
        http("request_371")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_372")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_109),
        http("request_373")
          .get("/_layouts/15/sp.runtime.js?rev=5f2WkYJoaxlIRdwUeg4WEg%3D%3D")
          .headers(headers_1),
        http("request_374")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D")
          .headers(headers_1),
        http("request_375")
          .get(uri02 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_1),
        http("request_376")
          .get(uri02 + "/common/js/0.0.19/common.js")
          .headers(headers_1),
        http("request_377")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D")
          .headers(headers_1),
        http("request_378")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D")
          .headers(headers_1),
        http("request_379")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D")
          .headers(headers_1),
        http("request_380")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_381")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_382")
          .get(uri12 + "?dcsdat=1572039939381&dcssip=prucorporativo.compensar.com&dcsuri=/afiliaciones/quiero-afiliarme/caja-de-compensacion/afiliacion-independientes&dcsref=https://prucorporativo.compensar.com/afiliaciones&wt.tz=-5&wt.bh=16&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Afiliaciones%2520Afiliaci%25C3%25B3n%2520independientes&wt.js=Yes&wt.bs=1366x584&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252Fafiliaciones%252Fquiero-afiliarme%252Fcaja-de-compensacion%252Fafiliacion-independientes&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&wt.co_f=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_1)))
    .pause(2)
    .exec(http("request_383")
      .get("/Afiliaciones/Independiente")
      .headers(headers_147)
      .resources(http("request_384")
        .get(uri07 + "?id=GTM-5GF54C6")
        .headers(headers_1),
        http("request_385")
          .get("/Style%20Library/css/compensar.menuSecundario.css")
          .headers(headers_1),
        http("request_386")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_387")
          .get("/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_1),
        http("request_388")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_1),
        http("request_389")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_1),
        http("request_390")
          .get("/Style%20Library/js/compensar.popovers.min.js")
          .headers(headers_1),
        http("request_391")
          .get(uri01 + "/analytics.js")
          .headers(headers_1),
        http("request_392")
          .get(uri01 + "/collect?v=1&_v=j79&a=2135583467&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2FAfiliaciones%2FIndependiente&ul=es-es&de=UTF-8&dt=Afiliarse%20en%20l%C3%ADnea%20como%20Independiente%20a%20Compensar%20Caja%20de%20Compensaci%C3%B3n&sd=24-bit&sr=1366x768&vp=1366x584&je=0&_u=QACAAEAB~&jid=&gjid=&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&gtm=2wgaa05GF54C6&z=1744122070")
          .headers(headers_1),
        http("request_393")
          .get(uri03 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fafiliaciones%252Fquiero-afiliarme%252Fcaja-de-compensacion%252Fafiliacion-independientes%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252FAfiliaciones%252FIndependiente%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&pd=624822720%7CKAAAAApVAwDcYaCCPxIDZAABEgABQgCFdZ%2BHAwCllcCmlFnXSMUHQGJSUtdIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBSBICAAEAAAAAAAAA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAAAAAAAAAFF&bid=nycvwcgus11&srv=nycvwcgus11")
          .headers(headers_75),
        http("request_394")
          .get("/Style%20Library/images/dashLine.png")
          .headers(headers_1),
        http("request_395")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_396")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D")
          .headers(headers_1),
        http("request_397")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_78),
        http("request_398")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D")
          .headers(headers_1),
        http("request_399")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_78),
        http("request_400")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_78),
        http("request_401")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_78),
        http("request_402")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_403")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_afiliacion_validar_usuario.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_404")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_405")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_afiliacion_validar_usuario.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_406")
          .post("/Afiliaciones/_api/contextinfo")
          .headers(headers_90),
        http("request_407")
          .get(uri02 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_1),
        http("request_408")
          .get("/_api/web/lists/GetByTitle('PopOvers')/items?$select=TituloPopOver,PosicionPopOver,UrlsPopOvers,TextoAyudaPopOver,TextoBoton,IdentificadorPopOver,SeccionFormularioPops,CampoFormularioPops")
          .headers(headers_260),
        http("request_409")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D")
          .headers(headers_1),
        http("request_410")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D")
          .headers(headers_1),
        http("request_411")
          .get("/style%20library/css/compensar.afiliacionrequisitos.min.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_412")
          .get("/style%20library/css/compensar.afiliacioninicio.min.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_413")
          .get("/style%20library/js/compensar.afiliacionpopupdocumentos.min.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_414")
          .get("/style%20library/js/compensar.afiliacionvalidarusuario.min.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_1),
        http("request_415")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_109),
        http("request_416")
          .get(uri02 + "/common/js/0.0.19/common.js")
          .headers(headers_1),
        http("request_417")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D")
          .headers(headers_1),
        http("request_418")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D")
          .headers(headers_1),
        http("request_419")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_1),
        http("request_420")
          .post("/Afiliaciones/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_420)
          .body(RawFileBody("/afiliacionindependiente/0420_request.dat")),
        http("request_421")
          .get("/_api/web/lists/GetByTitle('Mensajes%20Visuales')/items?$select=MSG_ClaseUI,MSG_Titulo,MSG_CuerpoTexto&$filter=(Title%20eq%20%27Error_General_Servicios%27)%20and%20(MSG_Modulo%20eq%20%27General%27)")
          .headers(headers_260),
        http("request_422")
          .get("/Afiliaciones/_api/web/lists/GetByTitle('Tipos%20Identificaci%C3%B3n')/items?$select=CodigoAfiliaciones,NombreAfiliaciones,AbreviacionAfiliaciones,EstadoAfiliaciones&$filter=FormulariosAfiliaciones%20eq%20%27Formulario%20Validar%20Usuario%20Prev%20Solicitud%20Afilia%27")
          .headers(headers_260),
        http("request_423")
          .get("/Style%20Library/fonts/roboto/roboto_bold/Roboto-Bold-webfont.woff")
          .headers(headers_78),
        http("request_424")
          .get("/Afiliaciones/_api/web/lists/GetByTitle('Modalidades%20Afiliaci%C3%B3n')/items?$select=CodigoAfiliaciones,NombreAfiliaciones,TipoAfiliacion_ListTipoAfiliaciones/Id_Afiliaciones&$expand=TipoAfiliacion_ListTipoAfiliaciones&$filter=TipoAfiliacion_ListTipoAfiliaciones/Id_Afiliaciones%20eq%203")
          .headers(headers_260),
        http("request_425")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=((Seccion%20eq%20%27Autenticaci%C3%B3n%27)%20and%20(Nombre%20eq%20%27GoogleCaptchaKey%27))")
          .headers(headers_260),
        http("request_426")
          .get(uri12 + "?dcsdat=1572039943082&dcssip=prucorporativo.compensar.com&dcsuri=/Afiliaciones/Independiente&dcsref=https://prucorporativo.compensar.com/afiliaciones/quiero-afiliarme/caja-de-compensacion/afiliacion-independientes&wt.tz=-5&wt.bh=16&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Afiliarse%2520en%2520l%25C3%25ADnea%2520como%2520Independiente%2520a%2520Compensar%2520Caja%2520de%2520Compensaci%25C3%25B3n&wt.js=Yes&wt.bs=1366x584&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252FAfiliaciones%252FIndependiente&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&wt.co_f=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_1),
        http("request_427")
          .get(uri08 + "/recaptcha/api2/anchor?ar=1&k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI&co=aHR0cHM6Ly9wcnVjb3Jwb3JhdGl2by5jb21wZW5zYXIuY29tOjQ0Mw..&hl=es&v=5fbZx3NV5xhaMoMLrZV3TkN4&size=normal&cb=xc3mr1qllvk")
          .headers(headers_270),
        http("request_428")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/styles__ltr.css")
          .headers(headers_1),
        http("request_429")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_430")
          .get(uri11 + "/api2/logo_48.png")
          .headers(headers_1),
        http("request_431")
          .get(uri10)
          .headers(headers_280),
        http("request_432")
          .get(uri08 + "/js/bg/FImcmxIydQ5zO5X4JWmfILYA5Uks6S5qhuxO7imXJic.js")
          .headers(headers_1),
        http("request_433")
          .get(uri08 + "/recaptcha/api2/webworker.js?hl=es&v=5fbZx3NV5xhaMoMLrZV3TkN4")
          .headers(headers_282),
        http("request_434")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_435")
          .get(uri08 + "/recaptcha/api2/bframe?hl=es&v=5fbZx3NV5xhaMoMLrZV3TkN4&k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI&cb=z9k4cbklh8x")
          .headers(headers_270),
        http("request_436")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/styles__ltr.css")
          .headers(headers_1),
        http("request_437")
          .get(uri11 + "/releases/5fbZx3NV5xhaMoMLrZV3TkN4/recaptcha__es.js")
          .headers(headers_1),
        http("request_438")
          .get(uri10)
          .headers(headers_280)))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}