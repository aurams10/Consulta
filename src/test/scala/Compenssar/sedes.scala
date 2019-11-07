package Compenssar

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class sedes extends Simulation {

  val httpProtocol = http
    .baseUrl("https://prucorporativo.compensar.com")
    .inferHtmlResources()
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.120 Safari/537.36")

  val headers_0 = Map("Sec-Fetch-Mode" -> "no-cors")

  val headers_5 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "none",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_76 = Map(
    "Intervention" -> """<https://www.chromestatus.com/feature/5718547946799104>; level="warning"""",
    "Sec-Fetch-Mode" -> "no-cors")

  val headers_77 = Map(
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors")

  val headers_95 = Map(
    "ACCEPT" -> "application/json;odata=verbose",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_118 = Map(
    "Accept" -> "application/json; odata=verbose",
    "Content-Type" -> "text/plain",
    "Sec-Fetch-Mode" -> "cors",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_119 = Map(
    "Accept" -> "application/xml, text/xml, */*; q=0.01",
    "Content-Type" -> """text/xml;charset="UTF-8"""",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_120 = Map(
    "Accept" -> "application/xml, text/xml, */*; q=0.01",
    "Content-Type" -> "text/xml;charset='UTF-8'",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_126 = Map(
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "X-RequestDigest" -> "0xDDF28DE9A194B2C89354092F616E78E61E7DF579ED195DAD4CC74FB304D7DD75BAE04F64C0727481627D18DD7BDA0201859BC819E10D35D418AD90EC183DA65C,25 Oct 2019 22:01:37 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_148 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_253 = Map(
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "X-RequestDigest" -> "0x4AB1C28FC30FA3870518CBF80E89C5B910A989C1F983A3D1C1251D038B1247050A30B7F0E965C09B1D104951ECE39CD04CABCB4F9909E70C25E55861005A3ADD,25 Oct 2019 22:01:44 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_273 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_312 = Map(
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "X-RequestDigest" -> "0xABEBB36F0D569C233909861C2933B31528A6F9B3443EE85745789EB773DE9C979A60663F09CA44855BA5E7767B25046B74CC3C85B38DF6AB8016E14B6F6A9930,25 Oct 2019 22:01:54 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_318 = Map(
    "Accept" -> "application/json; odata=verbose",
    "Sec-Fetch-Mode" -> "cors",
    "X-Requested-With" -> "XMLHttpRequest")

  val uri01 = "https://maps.googleapis.com"
  val uri02 = "https://www.google-analytics.com"
  val uri03 = "https://c.oracleinfinity.io/acs"
  val uri04 = "https://service.maxymiser.net"
  val uri05 = "https://www.compensar.com/img/2016"
  val uri06 = "https://www.cesarcancino.com/codigos/js/base_64.js"
  val uri07 = "https://www.googletagmanager.com/gtm.js"
  val uri09 = "https://maps.gstatic.com/mapfiles/openhand_8_8.cur"
  val uri10 = "https://fonts.gstatic.com/s/roboto/v20"
  val uri11 = "https://dc.oracleinfinity.io/awlorq1lmp/dcs.gif"
  val uri12 = "https://fonts.googleapis.com/css"

  val scn = scenario("sedes")
    .exec(http("minisp.min.js")
      .get("/_catalogs/masterpage/starter/minisp.min.js")
      .headers(headers_0)
      .resources(http("init.js")
        .get("/_layouts/15/init.js?rev=ZwTQYqYlNTyyuMWaLlhwSg%3D%3D")
        .headers(headers_0),
        http("jquery-3.1.1.min.js")
          .get("/style%20library/vendor/jquery-3.1.1.min.js")
          .headers(headers_0),
        http("request_3")
          .get("/style%20library/js/datalayercorporativo.min.js")
          .headers(headers_0),
        http("request_4")
          .get("/style%20library/vendor/bluebird.min.js")
          .headers(headers_0),
        http("request_5")
          .get("/")
          .headers(headers_5),
        http("request_6")
          .get("/style%20library/vendor/bootstrap.min.js")
          .headers(headers_0),
        http("request_7")
          .get("/style%20library/js/jquery.spservices-2014.02.min.js")
          .headers(headers_0),
        http("request_8")
          .get("/Style%20Library/vendor/knockout-3.4.1.min.js?v=1")
          .headers(headers_0),
        http("request_9")
          .get("/style%20library/vendor/ko.sp-1.0.min.js")
          .headers(headers_0),
        http("request_10")
          .get("/style%20library/vendor/slick.min.js")
          .headers(headers_0),
        http("request_11")
          .get("/style%20library/vendor/rangeslider.min.js")
          .headers(headers_0),
        http("request_12")
          .get("/style%20library/vendor/ion.rangeslider.min.js")
          .headers(headers_0),
        http("request_13")
          .get("/style%20library/vendor/picturefill.min.js")
          .headers(headers_0),
        http("request_14")
          .get("/style%20library/vendor/validate.min.js")
          .headers(headers_0),
        http("request_15")
          .get("/style%20library/vendor/jquery.validate.min.js")
          .headers(headers_0),
        http("request_16")
          .get("/style%20library/vendor/croppie.min.js")
          .headers(headers_0),
        http("request_17")
          .get("/style%20library/js/afiliaciones.config.js")
          .headers(headers_0),
        http("request_18")
          .get("/Style%20Library/js/compTools.min.js?v=1")
          .headers(headers_0),
        http("request_19")
          .get("/style%20library/js/compensar.script.min.js")
          .headers(headers_0),
        http("request_20")
          .get("/style%20library/js/compensar.actualizarcorreo.min.js")
          .headers(headers_0),
        http("request_21")
          .get("/style%20library/js/sjcl/sjcl.min.js")
          .headers(headers_0),
        http("request_22")
          .get("/Style%20Library/js/compensar.loadComponents.min.js?v=1")
          .headers(headers_0),
        http("request_23")
          .get("/Style%20Library/js/compensar.tiempoInactividad.min.js?v=1")
          .headers(headers_0),
        http("request_24")
          .get("/Style%20Library/js/compensar.enModoEdicion.min.js?v=1")
          .headers(headers_0),
        http("request_25")
          .get("/Style%20Library/js/compensar.detectarAncho.min.js?v=1")
          .headers(headers_0),
        http("request_26")
          .get("/Style%20Library/js/compensar.deferImages.min.js?v=1")
          .headers(headers_0),
        http("request_27")
          .get("/Style%20Library/js/compensar.agregarTitulowebparts.min.js?v=1")
          .headers(headers_0),
        http("request_28")
          .get("/Style%20Library/js/compensar.menuDesplegable.min.js?v=1")
          .headers(headers_0),
        http("request_29")
          .get("/Style%20Library/js/compensar.miCompensarPerfil.min.js?v=1")
          .headers(headers_0),
        http("request_30")
          .get("/Style%20Library/js/compensar.controlPestanas.min.js?v=1")
          .headers(headers_0),
        http("request_31")
          .get("/Style%20Library/js/compensar.controlAcordeon.min.js?v=1")
          .headers(headers_0),
        http("request_32")
          .get("/Style%20Library/js/compensar.filtroControlerVivienda.min.js?v=1")
          .headers(headers_0),
        http("request_33")
          .get("/Style%20Library/js/mainContent.min.js?v=1")
          .headers(headers_0),
        http("request_34")
          .get("/Style%20Library/js/headerNav.min.js?v=1")
          .headers(headers_0),
        http("request_35")
          .get("/Style%20Library/js/ko/modeloMenuAux.min.js?v=1")
          .headers(headers_0),
        http("request_36")
          .get("/Style%20Library/js/compensar.menuSecundario.min.js?v=1")
          .headers(headers_0),
        http("request_37")
          .get("/Style%20Library/js/compensar.quitarLoading.min.js?v=1")
          .headers(headers_0),
        http("request_38")
          .get("/Style%20Library/js/compensar.componenteEmailController.min.js?v=1")
          .headers(headers_0),
        http("request_39")
          .get("/Style%20Library/js/compensar.componentePopUpController.min.js?v=1")
          .headers(headers_0),
        http("request_40")
          .get("/style%20library/js/compensar.notificaciones.min.js")
          .headers(headers_0),
        http("request_41")
          .get("/style%20library/js/customcanales.min.js")
          .headers(headers_0),
        http("request_42")
          .get("/_layouts/15/compensar.portal.farm/customactioncall.js")
          .headers(headers_0),
        http("request_43")
          .get("/ScriptResource.axd?d=DbBIHdj-QC5CO88xwauS5dkoqIs6nZmS0i8rusZB1q2JCx1O17otX38Pbo9-Co9QXf_ywgPOgCaWxydR-v-KO_BCuip-vRkoHzjnd81XPEqYhrrZRFvD28DBse-3zjaVmjdm2hC17AQqDXfxT3KoyoLs-sQ7qPLfqrjuPJokLcOn_d3Dmrsd446-Hg6mDbff0&t=72e85ccd")
          .headers(headers_0),
        http("request_44")
          .get("/_layouts/15/blank.js?rev=ZaOXZEobVwykPO9g8hq%2F8A%3D%3D")
          .headers(headers_0),
        http("request_45")
          .get("/ScriptResource.axd?d=LzPGXWTyY4NfgAzL7AVGti8jNkeNvyxE7t2p3M-3BPJvKFvvkBUGxbbcxESn55TFNOUl8xW6SvygFDc-U8cavgouTpfnyDz3b86dyb2Q1b12B-B2zqJbKL3UrhnjJpkL79pBm9zX4FVDPUA4BsjrvCFATMYLp3cyBtLpIkBKZKUxDrfJga0vw4ZjurZ0mn1o0&t=72e85ccd")
          .headers(headers_0),
        http("request_46")
          .get("/_layouts/15/sp.init.js?rev=jvJC3Kl5gbORaLtf7kxULQ%3D%3D")
          .headers(headers_0),
        http("request_47")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=SP%2ERes&rev=DoAHv8R6TO7rl33LcYBJTA%3D%3D")
          .headers(headers_0),
        http("request_48")
          .get("/_layouts/15/sp.runtime.js?rev=5f2WkYJoaxlIRdwUeg4WEg%3D%3D")
          .headers(headers_0),
        http("request_49")
          .get("/_layouts/15/sp.search.js?rev=dMkPlEXpdY6iJ%2FsY5RsB0g%3D%3D")
          .headers(headers_0),
        http("request_50")
          .get("/_layouts/15/clientrenderer.js?rev=PWwV4FATEiOxN90BeB5Hzw%3D%3D")
          .headers(headers_0),
        http("request_51")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=Srch%2EResources&rev=GVo354neq7eNTurLgIdpJQ%3D%3D")
          .headers(headers_0),
        http("request_52")
          .get("/_layouts/15/search.clientcontrols.js?rev=8Q15HW2EU2aXBktJq5YW%2FA%3D%3D")
          .headers(headers_0),
        http("request_53")
          .get("/_layouts/15/search.cbs.js?rev=S5EegsQhNKgWxVFmcqr5dQ%3D%3D")
          .headers(headers_0),
        http("request_54")
          .get("/PublishingImages/favicon.ico?rev=23")
          .headers(headers_0),
        http("request_55")
          .get("/_layouts/15/images/spcommon.png?rev=23")
          .headers(headers_0),
        http("request_56")
          .get("/PublishingImages/logo_compensar.png?rev=23")
          .headers(headers_0),
        http("request_57")
          .get("/WebResource.axd?d=hcspxoKGngdkW0b6xYvFftMD9L7tgVctZKvxUqyhcPMOX4gSlmQgLLYGJ7F9lMuasHqe9Mv5x6g7VZmrwkJEQmLxw_pNwohGyqmgqyaeGpA1&t=635792838349294682")
          .headers(headers_0),
        http("request_58")
          .get(uri07 + "?id=GTM-5GF54C6")
          .headers(headers_0),
        http("request_59")
          .get("/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_0),
        http("request_60")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_0),
        http("request_61")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_0),
        http("request_62")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_0),
        http("request_63")
          .get("/PublishingImages/logo_compensar.png")
          .headers(headers_0),
        http("request_64")
          .get("/_layouts/15/images/searchresultui.png?rev=23")
          .headers(headers_0),
        http("request_65")
          .get("/Style%20Library/js/datalayerCorporativo.js")
          .headers(headers_0),
        http("request_66")
          .get("/PublishingImages/40-anos/banner-200.jpg")
          .headers(headers_0),
        http("request_67")
          .get(uri06)
          .headers(headers_0),
        http("request_68")
          .get("/PublishingImages/banner-firma-digital-prospectados.png")
          .headers(headers_0),
        http("request_69")
          .get("/Style%20Library/js/browsers/jquery.mb.browser.js")
          .headers(headers_0),
        http("request_70")
          .get("/Style%20Library/webparts/productosDestacados/ProductosDestacados.min.js?v=1")
          .headers(headers_0),
        http("request_71")
          .get(uri04 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_0),
        http("request_72")
          .get("/Style%20Library/webparts/productosDestacados/productosDestacados.min.css?v=1")
          .headers(headers_0),
        http("request_73")
          .get(uri02 + "/analytics.js")
          .headers(headers_0),
        http("request_74")
          .get("/PublishingImages/logo-compensar-gris.svg")
          .headers(headers_0),
        http("request_75")
          .get(uri02 + "/collect?v=1&_v=j79&a=292928196&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2F&ul=es-es&de=UTF-8&dt=Compensar%20Caja%20de%20Compensaci%C3%B3n%20Familiar%20home&sd=24-bit&sr=1366x768&vp=1366x179&je=0&_u=QACAAEAB~&jid=&gjid=&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&gtm=2wgaa05GF54C6&z=581802107")
          .headers(headers_0),
        http("request_76")
          .get(uri04 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252F%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&pd=-1232563425%7CLQAAAApVAwDcYaCCPxIDZAABEgABQgCFdZ%2BHAwBdauXillnXSMUHQGJSUtdIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBSBICAAEAAAAAAAAA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAAAAAAAAAFF&bid=nycvwcgus10&srv=nycvwcgus10")
          .headers(headers_76),
        http("request_77")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_77),
        http("request_78")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_77),
        http("request_79")
          .get(uri03 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_0),
        http("request_80")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_77),
        http("request_81")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D")
          .headers(headers_0),
        http("request_82")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D")
          .headers(headers_0),
        http("request_83")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_77),
        http("request_84")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_bannerhome.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_85")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_86")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_bannerhome.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_87")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_enlacesinteres_nuevo.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_88")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_enlacesinteres.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_89")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_90")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_91")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_enlacedirectos2.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_92")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_enlacesdirectos.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_93")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_novedades.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_94")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_novedades.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_95")
          .post("/_api/contextinfo")
          .headers(headers_95),
        http("request_96")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_noticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_97")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_noticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_98")
          .get(uri05 + "/icon-face.png")
          .headers(headers_0),
        http("request_99")
          .get(uri05 + "/icon-twitter.png")
          .headers(headers_0),
        http("request_100")
          .get(uri05 + "/icon-youtube.png")
          .headers(headers_0),
        http("request_101")
          .get(uri05 + "/icon-linkedin.png")
          .headers(headers_0),
        http("request_102")
          .get(uri05 + "/icon-instagram.png")
          .headers(headers_0),
        http("request_103")
          .get("/Style%20Library/images/dashLine.png")
          .headers(headers_0),
        http("request_104")
          .post("/_api/contextinfo")
          .headers(headers_95),
        http("request_105")
          .post("/_api/contextinfo")
          .headers(headers_95),
        http("request_106")
          .post("/_api/contextinfo")
          .headers(headers_95),
        http("request_107")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D")
          .headers(headers_0),
        http("request_108")
          .post("/_api/contextinfo")
          .headers(headers_95),
        http("request_109")
          .get("/style%20library/js/compensar.carruseldebanners.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_110")
          .get("/style%20library/css/compensar.tendencias.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_111")
          .get("/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_112")
          .get("/style%20library/css/compensar.compstandard.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_113")
          .post("/_api/contextinfo")
          .headers(headers_95),
        http("request_114")
          .get("/style%20library/css/compensar.enlacesdirectos.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_115")
          .get("/style%20library/js/compensar.novedades.min.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_116")
          .get("/style%20library/js/compensar.modulonoticias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_117")
          .get("/Style%20Library/css/compensar.compStandard.min.css")
          .headers(headers_0),
        http("request_118")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_118),
                       http("request_121")
          .get("/PublishingImages/Destacados/cirugia-estetica-compensar.png?RenditionID=107")
          .headers(headers_0),
        http("request_122")
          .get("/PublishingImages/Destacados/credito-libre-inversion-compensar.png?RenditionID=107")
          .headers(headers_0),
        http("request_123")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D")
          .headers(headers_0),
        http("request_124")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D")
          .headers(headers_0),
        http("request_125")
          .get("/PublishingImages/Destacados/09-abril-2015-salud-oral.jpg?RenditionID=107")
          .headers(headers_0),
        http("request_129")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D")
          .headers(headers_0),
                      http("request_133")
          .get("/Style%20Library/css/compensar.moduloNoticias.min.css")
          .headers(headers_0),
        http("request_134")
          .get("/Style%20Library/css/compensar.enlacesDeInteres.min.css")
          .headers(headers_0),
        http("request_135")
          .get("/Style%20Library/css/compensar.carruselDeBanners.min.css")
          .headers(headers_0),
        http("request_136")
          .get("/Style%20Library/vendor/slick.css")
          .headers(headers_0),
        http("request_137")
          .get("/Style%20Library/vendor/slick-theme.css")
          .headers(headers_0),
        http("request_138")
          .get("/Style%20Library/css/compensar.carouselTheme.min.css")
          .headers(headers_0),
        http("request_139")
          .get(uri03 + "/common/js/0.0.19/common.js")
          .headers(headers_0),
        http("request_140")
          .get("/PUBLISHINGIMAGES/TENDENCIAS/TENDENCIA-REVISTA-COMPENSAR-CESANTIAS-500X250.JPG?RenditionID=105")
          .headers(headers_0),
        http("request_141")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_0),
        http("request_142")
          .get(uri03 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_0),
        http("request_143")
          .get("/Style%20Library/css/compensar.novedades.min.css")
          .headers(headers_0),
        http("request_144")
          .get(uri11 + "?dcsdat=1572040909437&dcssip=prucorporativo.compensar.com&dcsuri=/&wt.tz=-5&wt.bh=17&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Compensar%2520Caja%2520de%2520Compensaci%25C3%25B3n%2520Familiar%2520home&wt.js=Yes&wt.bs=1366x179&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252F&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&wt.co_f=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_0),
        http("request_145")
          .get("/Style%20Library/vendor/ajax-loader.gif")
          .headers(headers_0)))
    .pause(3)
    .exec(http("request_146")
      .get(uri02 + "/collect?v=1&_v=j79&a=292928196&t=event&ni=1&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2F&ul=es-es&de=UTF-8&dt=Compensar%20Caja%20de%20Compensaci%C3%B3n%20Familiar%20home&sd=24-bit&sr=1366x768&vp=1349x179&je=0&ec=Home&ea=Header&el=Sedes&ev=0&_u=SACAAEAB~&jid=&gjid=&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&gtm=2wgaa05GF54C6&z=1114682226")
      .headers(headers_0)
      .resources(http("request_147")
        .get(uri02 + "/collect?v=1&_v=j79&a=292928196&t=event&ni=1&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2F&ul=es-es&de=UTF-8&dt=Compensar%20Caja%20de%20Compensaci%C3%B3n%20Familiar%20home&sd=24-bit&sr=1366x768&vp=1349x179&je=0&ec=Home&ea=Header&el=Sedes&ev=0&_u=SACAAEAB~&jid=&gjid=&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&gtm=2wgaa05GF54C6&z=641062506")
        .headers(headers_0),
        http("request_148")
          .get("/sedes")
          .headers(headers_148),
        http("request_149")
          .get("/_catalogs/masterpage/starter/minisp.min.js")
          .headers(headers_0),
        http("request_150")
          .get("/_layouts/15/init.js?rev=ZwTQYqYlNTyyuMWaLlhwSg%3D%3D")
          .headers(headers_0),
        http("request_151")
          .get("/style%20library/vendor/jquery-3.1.1.min.js")
          .headers(headers_0),
        http("request_152")
          .get("/style%20library/js/datalayercorporativo.min.js")
          .headers(headers_0),
        http("request_153")
          .get("/style%20library/vendor/bluebird.min.js")
          .headers(headers_0),
        http("request_154")
          .get("/style%20library/vendor/bootstrap.min.js")
          .headers(headers_0),
        http("request_155")
          .get("/style%20library/js/jquery.spservices-2014.02.min.js")
          .headers(headers_0),
        http("request_156")
          .get("/Style%20Library/vendor/knockout-3.4.1.min.js?v=1")
          .headers(headers_0),
        http("request_157")
          .get("/style%20library/vendor/ko.sp-1.0.min.js")
          .headers(headers_0),
        http("request_158")
          .get("/style%20library/vendor/slick.min.js")
          .headers(headers_0),
        http("request_159")
          .get("/style%20library/vendor/rangeslider.min.js")
          .headers(headers_0),
        http("request_160")
          .get("/style%20library/vendor/ion.rangeslider.min.js")
          .headers(headers_0),
        http("request_161")
          .get("/style%20library/vendor/picturefill.min.js")
          .headers(headers_0),
        http("request_162")
          .get("/style%20library/vendor/validate.min.js")
          .headers(headers_0),
        http("request_163")
          .get("/style%20library/vendor/jquery.validate.min.js")
          .headers(headers_0),
        http("request_164")
          .get("/style%20library/vendor/croppie.min.js")
          .headers(headers_0),
        http("request_165")
          .get("/style%20library/js/afiliaciones.config.js")
          .headers(headers_0),
        http("request_166")
          .get("/Style%20Library/js/compTools.min.js?v=1")
          .headers(headers_0),
        http("request_167")
          .get("/style%20library/js/compensar.script.min.js")
          .headers(headers_0),
        http("request_168")
          .get("/style%20library/js/compensar.actualizarcorreo.min.js")
          .headers(headers_0),
        http("request_169")
          .get("/style%20library/js/sjcl/sjcl.min.js")
          .headers(headers_0),
        http("request_170")
          .get("/Style%20Library/js/compensar.loadComponents.min.js?v=1")
          .headers(headers_0),
        http("request_171")
          .get("/Style%20Library/js/compensar.tiempoInactividad.min.js?v=1")
          .headers(headers_0),
        http("request_172")
          .get("/Style%20Library/js/compensar.enModoEdicion.min.js?v=1")
          .headers(headers_0),
        http("request_173")
          .get("/Style%20Library/js/compensar.detectarAncho.min.js?v=1")
          .headers(headers_0),
        http("request_174")
          .get("/Style%20Library/js/compensar.deferImages.min.js?v=1")
          .headers(headers_0),
        http("request_175")
          .get("/Style%20Library/js/compensar.agregarTitulowebparts.min.js?v=1")
          .headers(headers_0),
        http("request_176")
          .get("/Style%20Library/js/compensar.menuDesplegable.min.js?v=1")
          .headers(headers_0),
        http("request_177")
          .get("/Style%20Library/js/compensar.miCompensarPerfil.min.js?v=1")
          .headers(headers_0),
        http("request_178")
          .get("/Style%20Library/js/compensar.controlPestanas.min.js?v=1")
          .headers(headers_0),
        http("request_179")
          .get("/Style%20Library/js/compensar.controlAcordeon.min.js?v=1")
          .headers(headers_0),
        http("request_180")
          .get("/Style%20Library/js/compensar.filtroControlerVivienda.min.js?v=1")
          .headers(headers_0),
        http("request_181")
          .get("/Style%20Library/js/mainContent.min.js?v=1")
          .headers(headers_0),
        http("request_182")
          .get("/Style%20Library/js/headerNav.min.js?v=1")
          .headers(headers_0),
        http("request_183")
          .get("/Style%20Library/js/ko/modeloMenuAux.min.js?v=1")
          .headers(headers_0),
        http("request_184")
          .get("/Style%20Library/js/compensar.menuSecundario.min.js?v=1")
          .headers(headers_0),
        http("request_185")
          .get("/Style%20Library/js/compensar.quitarLoading.min.js?v=1")
          .headers(headers_0),
        http("request_186")
          .get("/Style%20Library/js/compensar.componenteEmailController.min.js?v=1")
          .headers(headers_0),
        http("request_187")
          .get("/Style%20Library/js/compensar.componentePopUpController.min.js?v=1")
          .headers(headers_0),
        http("request_188")
          .get("/style%20library/js/compensar.notificaciones.min.js")
          .headers(headers_0),
        http("request_189")
          .get("/style%20library/js/customcanales.min.js")
          .headers(headers_0),
        http("request_190")
          .get("/_layouts/15/compensar.portal.farm/customactioncall.js")
          .headers(headers_0),
        http("request_191")
          .get("/ScriptResource.axd?d=DbBIHdj-QC5CO88xwauS5dkoqIs6nZmS0i8rusZB1q2JCx1O17otX38Pbo9-Co9QXf_ywgPOgCaWxydR-v-KO_BCuip-vRkoHzjnd81XPEqYhrrZRFvD28DBse-3zjaVmjdm2hC17AQqDXfxT3KoyoLs-sQ7qPLfqrjuPJokLcOn_d3Dmrsd446-Hg6mDbff0&t=72e85ccd")
          .headers(headers_0),
        http("request_192")
          .get("/_layouts/15/blank.js?rev=ZaOXZEobVwykPO9g8hq%2F8A%3D%3D")
          .headers(headers_0),
        http("request_193")
          .get("/ScriptResource.axd?d=LzPGXWTyY4NfgAzL7AVGti8jNkeNvyxE7t2p3M-3BPJvKFvvkBUGxbbcxESn55TFNOUl8xW6SvygFDc-U8cavgouTpfnyDz3b86dyb2Q1b12B-B2zqJbKL3UrhnjJpkL79pBm9zX4FVDPUA4BsjrvCFATMYLp3cyBtLpIkBKZKUxDrfJga0vw4ZjurZ0mn1o0&t=72e85ccd")
          .headers(headers_0),
        http("request_194")
          .get("/_layouts/15/sp.init.js?rev=jvJC3Kl5gbORaLtf7kxULQ%3D%3D")
          .headers(headers_0),
        http("request_195")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=SP%2ERes&rev=DoAHv8R6TO7rl33LcYBJTA%3D%3D")
          .headers(headers_0),
        http("request_196")
          .get("/_layouts/15/sp.runtime.js?rev=5f2WkYJoaxlIRdwUeg4WEg%3D%3D")
          .headers(headers_0),
        http("request_197")
          .get("/_layouts/15/sp.search.js?rev=dMkPlEXpdY6iJ%2FsY5RsB0g%3D%3D")
          .headers(headers_0),
        http("request_198")
          .get("/_layouts/15/clientrenderer.js?rev=PWwV4FATEiOxN90BeB5Hzw%3D%3D")
          .headers(headers_0),
        http("request_199")
          .get("/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=Srch%2EResources&rev=GVo354neq7eNTurLgIdpJQ%3D%3D")
          .headers(headers_0),
        http("request_200")
          .get("/_layouts/15/search.clientcontrols.js?rev=8Q15HW2EU2aXBktJq5YW%2FA%3D%3D")
          .headers(headers_0),
        http("request_201")
          .get("/_layouts/15/search.cbs.js?rev=S5EegsQhNKgWxVFmcqr5dQ%3D%3D")
          .headers(headers_0),
        http("request_202")
          .get("/PublishingImages/favicon.ico?rev=23")
          .headers(headers_0),
        http("request_203")
          .get("/_layouts/15/images/spcommon.png?rev=23")
          .headers(headers_0),
        http("request_204")
          .get("/PublishingImages/logo_compensar.png?rev=23")
          .headers(headers_0),
        http("request_205")
          .get("/WebResource.axd?d=hcspxoKGngdkW0b6xYvFftMD9L7tgVctZKvxUqyhcPMOX4gSlmQgLLYGJ7F9lMuasHqe9Mv5x6g7VZmrwkJEQmLxw_pNwohGyqmgqyaeGpA1&t=635792838349294682")
          .headers(headers_0),
        http("request_206")
          .get("/PublishingImages/logo_compensar.png")
          .headers(headers_0),
        http("request_207")
          .get("/_layouts/15/images/searchresultui.png?rev=23")
          .headers(headers_0),
        http("request_208")
          .get("/WebResource.axd?d=VE1LltKE1dXL7-UbkAp-bt6ljn4Brx0V3X9hDRsD8jSFT9qB8YndTHVisocnrFQ8rNfw3OXiDn_Fb7iUlcK8bUIBKyIA1h_3y1b4G2-c7f01&t=635792838349294682")
          .headers(headers_0),
        http("request_209")
          .get("/Style%20Library/css/modules/main/navInterno/navInterno.css")
          .headers(headers_0),
        http("request_210")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_0),
        http("request_211")
          .get("/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_0),
        http("request_212")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_0),
        http("request_213")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_0),
        http("request_214")
          .get("/Style%20Library/webparts/productosDestacados/ProductosDestacados.min.js?v=1")
          .headers(headers_0),
        http("request_215")
          .get(uri04 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_0),
        http("request_216")
          .get("/PublishingImages/logo-compensar-gris.svg")
          .headers(headers_0),
        http("request_217")
          .get("/Style%20Library/css/compensar.sedes.min.css")
          .headers(headers_0),
        http("request_218")
          .get(uri01 + "/maps/api/js?key=AIzaSyBQs4JbPCHOPygyJzKnUYgsAm35jOpmshk")
          .headers(headers_0),
        http("request_219")
          .get("/Style%20Library/js/compensar.sedes-pruebas.js")
          .headers(headers_0),
        http("request_220")
          .get("/Style%20Library/webparts/productosDestacados/productosDestacados.min.css?v=1")
          .headers(headers_0),
        http("request_221")
          .get("/Style%20Library/js/mainContentInterno.js")
          .headers(headers_0),
        http("request_222")
          .get("/_layouts/15/images/nodearrow.png")
          .headers(headers_0),
        http("request_223")
          .get(uri07 + "?id=GTM-5GF54C6")
          .headers(headers_0),
        http("request_224")
          .get("/PublishingImages/mapa-sedes-prev1.jpg")
          .headers(headers_0),
        http("request_225")
          .get(uri02 + "/analytics.js")
          .headers(headers_0),
        http("request_226")
          .get(uri02 + "/collect?v=1&_v=j79&a=618476815&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2Fsedes&ul=es-es&de=UTF-8&dt=Sedes&sd=24-bit&sr=1366x768&vp=1366x179&je=0&_u=QACAAEAB~&jid=&gjid=&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&gtm=2wgaa05GF54C6&z=1655771812")
          .headers(headers_0),
        http("request_227")
          .get(uri04 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252F%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fsedes%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&pd=1033932088%7CLgAAAApVAwDcYaCCPxIDZAABEgABQgCFdZ%2BHAwDRc0follnXSMUHQGJSUtdIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBSBICAAEAAAAAAAAA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAAAAAAAAAFF&bid=nycvwcgus10&srv=nycvwcgus10")
          .headers(headers_76),
        http("request_228")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_77),
        http("request_229")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_77),
        http("request_230")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_77),
        http("request_231")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_77),
        http("request_232")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D")
          .headers(headers_0),
        http("request_233")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D")
          .headers(headers_0),
        http("request_234")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_235")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_236")
          .get(uri03 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_0),
        http("request_237")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_238")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_novedades.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_239")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_novedades.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_240")
          .get("/Style%20Library/images/dashLine.png")
          .headers(headers_0),
        http("request_241")
          .post("/_api/contextinfo")
          .headers(headers_95),
        http("request_242")
          .post("/_api/contextinfo")
          .headers(headers_95),
        http("request_243")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D")
          .headers(headers_0),
        http("request_244")
          .get(uri03 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_0),
        http("request_245")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_118),
        http("request_246")
          .get("/style%20library/css/compensar.tendencias.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_247")
          .get("/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_248")
          .get("/style%20library/js/compensar.novedades.min.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_249")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D")
          .headers(headers_0),
        http("request_250")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D")
          .headers(headers_0),
        http("request_251")
          .get(uri03 + "/common/js/0.0.19/common.js")
          .headers(headers_0),
        http("request_252")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D")
          .headers(headers_0),
                http("request_254")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_0),
                http("request_256")
          .get("/Style%20Library/css/compensar.compStandard.min.css")
          .headers(headers_0),
            http("request_259")
          .get("/PublishingImages/Destacados/cirugia-estetica-compensar.png?RenditionID=107")
          .headers(headers_0),
        http("request_260")
          .get("/PublishingImages/Destacados/credito-libre-inversion-compensar.png?RenditionID=107")
          .headers(headers_0),
        http("request_261")
          .get("/PUBLISHINGIMAGES/TENDENCIAS/TENDENCIA-REVISTA-COMPENSAR-CESANTIAS-500X250.JPG?RenditionID=105")
          .headers(headers_0),
        http("request_262")
          .get("/Style%20Library/css/compensar.novedades.min.css")
          .headers(headers_0),
        http("request_263")
          .get("/Style%20Library/vendor/slick.css")
          .headers(headers_0),
        http("request_264")
          .get("/PublishingImages/Destacados/09-abril-2015-salud-oral.jpg?RenditionID=107")
          .headers(headers_0),
        http("request_265")
          .get("/Style%20Library/vendor/slick-theme.css")
          .headers(headers_0),
        http("request_266")
          .get("/Style%20Library/css/compensar.carouselTheme.min.css")
          .headers(headers_0),
        http("request_267")
          .get(uri03 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_0),
        http("request_268")
          .get(uri11 + "?dcsdat=1572040915515&dcssip=prucorporativo.compensar.com&dcsuri=/sedes&dcsref=https://prucorporativo.compensar.com/&wt.tz=-5&wt.bh=17&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Sedes&wt.js=Yes&wt.bs=1366x179&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252Fsedes&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&wt.co_f=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_0),
        http("request_269")
          .get("/Style%20Library/vendor/ajax-loader.gif")
          .headers(headers_0)))
    .pause(2)
    .exec(http("request_270")
      .get(uri01 + "/maps-api-v3/api/js/38/9/intl/es_ALL/common.js")
      .headers(headers_0)
      .resources(http("request_271")
        .get(uri01 + "/maps-api-v3/api/js/38/9/intl/es_ALL/util.js")
        .headers(headers_0),
        http("request_272")
          .get(uri01 + "/maps/api/js/AuthenticationService.Authenticate?1shttps%3A%2F%2Fprucorporativo.compensar.com%2Fsedes&4sAIzaSyBQs4JbPCHOPygyJzKnUYgsAm35jOpmshk&callback=_xdc_._r6x4hd&key=AIzaSyBQs4JbPCHOPygyJzKnUYgsAm35jOpmshk&token=127798")
          .headers(headers_0)))
    .pause(3)
    .exec(http("request_273")
      .get("/sedes/avenida-68-sede-principal")
      .headers(headers_273)
      .resources(http("request_274")
        .get(uri07 + "?id=GTM-5GF54C6")
        .headers(headers_0),
        http("request_275")
          .get("/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_0),
        http("request_276")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_0),
        http("request_277")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_0),
        http("request_278")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_0),
        http("request_279")
          .get("/style%20library/Parqueaderos/css/estilos.css")
          .headers(headers_0),
        http("request_280")
          .get("/style%20library/js/ParqueaderosV2.js")
          .headers(headers_0),
        http("request_281")
          .get("/style%20library/css/compensar.detallevivienda.min.css?ctag=5143$$15.0.4927.1000")
          .headers(headers_0),
        http("request_282")
          .get(uri02 + "/analytics.js")
          .headers(headers_0),
        http("request_283")
          .get(uri02 + "/collect?v=1&_v=j79&a=1819677906&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2Fsedes%2Favenida-68-sede-principal&ul=es-es&de=UTF-8&dt=Sedes&sd=24-bit&sr=1366x768&vp=1366x179&je=0&_u=QACAAEAB~&jid=&gjid=&cid=974125059.1571241288&tid=UA-90763271-1&_gid=622444644.1572016093&gtm=2wgaa05GF54C6&z=530049303")
          .headers(headers_0),
        http("request_284")
          .get(uri04 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fsedes%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fsedes%252Favenida-68-sede-principal%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&pd=1524450406%7CLwAAAApVAwDcYaCCPxIDZAABEgABQgCFdZ%2BHAwBXokjsllnXSMUHQGJSUtdIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBSBICAAEAAAAAAAAA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAAAAAAAAAFF&bid=nycvwcgus10&srv=nycvwcgus10")
          .headers(headers_76),
        http("request_285")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_77),
        http("request_286")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_77),
        http("request_287")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D")
          .headers(headers_0),
        http("request_288")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_77),
        http("request_289")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D")
          .headers(headers_0),
        http("request_290")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_77),
        http("request_291")
          .get(uri03 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_0),
        http("request_292")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_293")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_294")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_295")
          .get("/_catalogs/masterpage/item_compensar_testdetallesede.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_296")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_testdetallesede.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_297")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_novedades.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_298")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_novedades.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_299")
          .get("/Style%20Library/images/dashLine.png")
          .headers(headers_0),
        http("request_300")
          .post("/_api/contextinfo")
          .headers(headers_95),
        http("request_301")
          .post("/_api/contextinfo")
          .headers(headers_95),
        http("request_302")
          .post("/_api/contextinfo")
          .headers(headers_95),
        http("request_303")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_118),
        http("request_304")
          .get(uri03 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_0),
        http("request_305")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D")
          .headers(headers_0),
        http("request_306")
          .get("/style%20library/css/compensar.tendencias.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_307")
          .get("/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_308")
          .get("/style%20library/css/compensar.detallesedes.min.css?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_309")
          .get("/style%20library/js/compensar.detallesedes.min.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
        http("request_310")
          .get(uri03 + "/common/js/0.0.19/common.js")
          .headers(headers_0),
        http("request_311")
          .get("/style%20library/js/compensar.novedades.min.js?ctag=22734$$15.0.5131.1000")
          .headers(headers_0),
               http("request_314")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D")
          .headers(headers_0),
                http("request_316")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D")
          .headers(headers_0),
        http("request_317")
          .get(uri03 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_0),
        http("request_318")
          .get("/_api/web/lists/GetByTitle('Sedes%20Otros%20Servicios')/items?$select=Descripcion,Horario,NombreMultiTexto,NombreSedeLookup_ListSedes/NombreSede&$expand=NombreSedeLookup_ListSedes&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27%20and%20ContentType%20eq%20%27Tarifas%27")
          .headers(headers_318),
        http("request_319")
          .get("/PUBLISHINGIMAGES/TENDENCIAS/TENDENCIA-REVISTA-COMPENSAR-CESANTIAS-500X250.JPG?RenditionID=105")
          .headers(headers_0),
        http("request_320")
          .get("/Style%20Library/css/compensar.novedades.min.css")
          .headers(headers_0),
        http("request_321")
          .get("/Style%20Library/vendor/slick.css")
          .headers(headers_0),
        http("request_322")
          .get("/Style%20Library/vendor/slick-theme.css")
          .headers(headers_0),
        http("request_323")
          .get("/Style%20Library/css/compensar.carouselTheme.min.css")
          .headers(headers_0),
        http("request_324")
          .get("/_api/web/lists/GetByTitle('Imagenes%20Sedes')/items?$select=Title,File,NombreSedeLookup_ListSedes/NombreSede&$expand=NombreSedeLookup_ListSedes,File&$top=5&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27")
          .headers(headers_318),
        http("request_325")
          .get(uri01 + "/maps-api-v3/api/js/38/9/intl/es_ALL/common.js")
          .headers(headers_0),
        http("request_326")
          .get(uri01 + "/maps-api-v3/api/js/38/9/intl/es_ALL/util.js")
          .headers(headers_0),
        http("request_327")
          .get(uri01 + "/maps-api-v3/api/js/38/9/intl/es_ALL/map.js")
          .headers(headers_0),
        http("request_328")
          .get("/_api/web/lists/GetByTitle('Servicios%20Sedes')/items?$select=Tramite,Horario,Ubicacion,Servicio_ListServicios/NombreTexto,NombreSedeLookup_ListSedes/NombreSede&$expand=Servicio_ListServicios,NombreSedeLookup_ListSedes&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27")
          .headers(headers_318),
        http("request_329")
          .get(uri01 + "/maps-api-v3/api/js/38/9/intl/es_ALL/marker.js")
          .headers(headers_0),
        http("request_330")
          .get(uri01 + "/maps-api-v3/api/js/38/9/intl/es_ALL/geometry.js")
          .headers(headers_0),
        http("request_331")
          .get("/_api/web/lists/GetByTitle('Sedes%20Otros%20Servicios')/items?$select=Descripcion,Horario,NombreMultiTexto,NombreSedeLookup_ListSedes/NombreSede&$expand=NombreSedeLookup_ListSedes&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27%20and%20ContentType%20eq%20%27Otros%20Servicios%27")
          .headers(headers_318),
        http("request_332")
          .get(uri01 + "/maps-api-v3/api/js/38/9/intl/es_ALL/directions.js")
          .headers(headers_0),
        http("request_333")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D")
          .headers(headers_0),
        http("request_334")
          .get("/_api/web/lists/GetByTitle('Sedes%20Otros%20Servicios')/items?$select=Descripcion,Horario,NombreMultiTexto,NombreSedeLookup_ListSedes/NombreSede&$expand=NombreSedeLookup_ListSedes&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27%20and%20ContentType%20eq%20%27Alimentos%27")
          .headers(headers_318),
        http("request_335")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_0),
        http("request_336")
          .get(uri01 + "/maps-api-v3/api/js/38/9/intl/es_ALL/infowindow.js")
          .headers(headers_0),
        http("request_337")
          .get(uri12 + "?family=Roboto:300,400,500,700|Google+Sans")
          .headers(headers_0),
        http("request_338")
          .get(uri09)
          .headers(headers_0),
        http("request_339")
          .get(uri01 + "/maps-api-v3/api/js/38/9/intl/es_ALL/onion.js")
          .headers(headers_0),
        http("request_340")
          .get(uri10 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
          .headers(headers_77),
        http("request_341")
          .get(uri10 + "/KFOlCnqEu92Fr1MmWUlfBBc4.woff2")
          .headers(headers_77),
        http("request_342")
          .get(uri11 + "?dcsdat=1572040925443&dcssip=prucorporativo.compensar.com&dcsuri=/sedes/avenida-68-sede-principal&dcsref=https://prucorporativo.compensar.com/sedes&wt.tz=-5&wt.bh=17&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Sedes&wt.js=Yes&wt.bs=1366x179&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252Fsedes%252Favenida-68-sede-principal&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&wt.co_f=ddba0b9f-eb98-4cfc-99f1-422c7c486c51&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_0)))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)

//setUp(scn.inject(constantUsersPerSec(5) during(5 minutes)))

}