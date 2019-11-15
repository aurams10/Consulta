package Compenssar


import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class home1 extends Simulation {

  val httpProtocol = http
    .baseUrl("request_0")
    //.inferHtmlResources()

  val headers_0 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-CO",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/18.17763")

  val headers_1 = Map(
    "Accept" -> "text/html, application/xhtml+xml, application/xml; q=0.9, */*; q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-CO",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/18.17763")

  val headers_69 = Map(
    "Accept" -> "image/png, image/svg+xml, image/*; q=0.8, */*; q=0.5",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-CO",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/18.17763")

  val headers_98 = Map(
    "ACCEPT" -> "application/json; odata=verbose",
    "ADRUM" -> "isAjax:true",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-CO",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=utf-8",
    "Origin" -> "https://prucorporativo.compensar.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/18.17763",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_126 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/json; odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-CO",
    "Content-Type" -> "text/plain",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/18.17763",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_135 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-CO",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/18.17763",
    "X-RequestDigest" -> "0x414846AA346DEE32D208D807A3D63EF164593418DC64E7A7400437EFB11717073E69560DF1BEF537DEDCF4B394C8426AAD486F6B954869CA2956CC40FDF45EEE,14 Nov 2019 16:26:00 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_138 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-CO",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/18.17763",
    "X-RequestDigest" -> "0xF288A158A91E90B8E1EF9A319D9D3E1FAEDC215917B5D1B23C3B7A7DB682DA0DA9AF3C03A74A0AAFC82D7A6E7068E519149A5CC07C89E2A2C4E260DB4E949DB2,14 Nov 2019 16:25:59 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_146 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/xml, text/xml, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-CO",
    "Content-Type" -> "text/xml; charset=utf-8",
    "Origin" -> "https://prucorporativo.compensar.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/18.17763",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_149 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/xml, text/xml, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-CO",
    "Content-Type" -> "text/xml; charset='utf-8'",
    "Origin" -> "https://prucorporativo.compensar.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/18.17763",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_211 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-CO",
    "Content-type" -> "text/plain",
    "Origin" -> "https://prucorporativo.compensar.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/18.17763")

  val uri01 = "https://www.google-analytics.com"
  val uri02 = "https://c.oracleinfinity.io/acs"
  val uri03 = "https://service.maxymiser.net"
  val uri04 = "https://stats.g.doubleclick.net/r/collect"
  val uri05 = "https://www.compensar.com/img/2016"
  val uri07 = "https://www.googletagmanager.com/gtm.js"
  val uri08 = "https://cdn.appdynamics.com/adrum-ext.396a4a3598e4fdd54b8073a93c951462.js"
  val uri09 = "https://prucorporativo.compensar.com"
  val uri10 = "https://dc.oracleinfinity.io/awlorq1lmp/dcs.gif"

  val scn = scenario("home1")
    .exec(http("request_0")
      .get(uri09 + "/TSPD/0841a3cdb3ab28001693a26bad0816781d24e494119110611f229e1889f028e29575482a3d177cc2e8bf72bf4e92adf5?type=13")
      .headers(headers_0)
      .resources(http("request_1")
        .get(uri09 + "/")
        .headers(headers_1),
        http("request_2")
          .get(uri09 + "/_catalogs/masterpage/starter/minisp.min.js"),
        http("request_3")
          .get(uri09 + "/style%20library/vendor/jquery-3.1.1.min.js"),
        http("request_4")
          .get(uri09 + "/_layouts/15/init.js?rev=ZwTQYqYlNTyyuMWaLlhwSg%3D%3D"),
        http("request_5")
          .get(uri09 + "/style%20library/vendor/ko.sp-1.0.min.js"),
        http("request_6")
          .get(uri09 + "/style%20library/vendor/bluebird.min.js"),
        http("request_7")
          .get(uri09 + "/style%20library/js/datalayercorporativo.min.js"),
        http("request_8")
          .get(uri09 + "/style%20library/vendor/picturefill.min.js"),
        http("request_9")
          .get(uri09 + "/style%20library/vendor/slick.min.js"),
        http("request_10")
          .get(uri09 + "/style%20library/vendor/ion.rangeslider.min.js"),
        http("request_11")
          .get(uri09 + "/style%20library/vendor/rangeslider.min.js"),
        http("request_12")
          .get(uri09 + "/style%20library/vendor/bootstrap.min.js"),
        http("request_13")
          .get(uri09 + "/style%20library/vendor/validate.min.js"),
        http("request_14")
          .get(uri09 + "/Style%20Library/vendor/knockout-3.4.1.min.js?v=1"),
        http("request_15")
          .get(uri09 + "/style%20library/js/jquery.spservices-2014.02.min.js"),
        http("request_16")
          .get(uri09 + "/Style%20Library/js/afiliaciones.config.js?v=5"),
        http("request_17")
          .get(uri09 + "/style%20library/js/compensar.actualizarcorreo.min.js"),
        http("request_18")
          .get(uri09 + "/Style%20Library/js/compensar.enModoEdicion.min.js?v=1"),
        http("request_19")
          .get(uri09 + "/style%20library/js/compensar.script.min.js"),
        http("request_20")
          .get(uri09 + "/Style%20Library/js/compensar.componenteEmailController.min.js?v=1"),
        http("request_21")
          .get(uri09 + "/Style%20Library/js/compTools.min.js?v=1"),
        http("request_22")
          .get(uri09 + "/style%20library/js/sjcl/sjcl.min.js"),
        http("request_23")
          .get(uri09 + "/style%20library/js/compensar.notificaciones.min.js"),
        http("request_24")
          .get(uri09 + "/Style%20Library/js/compensar.loadComponents.min.js?v=1"),
        http("request_25")
          .get(uri09 + "/_layouts/15/compensar.portal.farm/customactioncall.js"),
        http("request_26")
          .get(uri09 + "/style%20library/js/customcanales.min.js"),
        http("request_27")
          .get(uri09 + "/Style%20Library/js/compensar.menuSecundario.min.js?v=1"),
        http("request_28")
          .get(uri09 + "/Style%20Library/js/compensar.miCompensarPerfil.min.js?v=1"),
        http("request_29")
          .get(uri09 + "/Style%20Library/js/compensar.deferImages.min.js?v=1"),
        http("request_30")
          .get(uri09 + "/style%20library/vendor/jquery.validate.min.js"),
        http("request_31")
          .get(uri09 + "/Style%20Library/js/ko/modeloMenuAux.min.js?v=1"),
        http("request_32")
          .get(uri09 + "/Style%20Library/js/compensar.tiempoInactividad.min.js?v=1"),
        http("request_33")
          .get(uri09 + "/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=SP%2ERes&rev=DoAHv8R6TO7rl33LcYBJTA%3D%3D"),
        http("request_34")
          .get(uri09 + "/Style%20Library/js/compensar.menuDesplegable.min.js?v=1"),
        http("request_35")
          .get(uri09 + "/Style%20Library/js/compensar.componentePopUpController.min.js?v=1"),
        http("request_36")
          .get(uri09 + "/ScriptResource.axd?d=DbBIHdj-QC5CO88xwauS5dkoqIs6nZmS0i8rusZB1q2JCx1O17otX38Pbo9-Co9QXf_ywgPOgCaWxydR-v-KO_BCuip-vRkoHzjnd81XPEqYhrrZRFvD28DBse-3zjaVmjdm2hC17AQqDXfxT3KoyoLs-sQ7qPLfqrjuPJokLcOn_d3Dmrsd446-Hg6mDbff0&t=72e85ccd"),
        http("request_37")
          .get(uri09 + "/style%20library/vendor/croppie.min.js"),
        http("request_38")
          .get(uri09 + "/Style%20Library/js/compensar.detectarAncho.min.js?v=1"),
        http("request_39")
          .get(uri09 + "/Style%20Library/js/compensar.controlPestanas.min.js?v=1"),
        http("request_40")
          .get(uri09 + "/Style%20Library/js/mainContent.min.js?v=1"),
        http("request_41")
          .get(uri09 + "/Style%20Library/js/headerNav.min.js?v=1"),
        http("request_42")
          .get(uri09 + "/Style%20Library/js/compensar.filtroControlerVivienda.min.js?v=1"),
        http("request_43")
          .get(uri09 + "/ScriptResource.axd?d=LzPGXWTyY4NfgAzL7AVGti8jNkeNvyxE7t2p3M-3BPJvKFvvkBUGxbbcxESn55TFNOUl8xW6SvygFDc-U8cavgouTpfnyDz3b86dyb2Q1b12B-B2zqJbKL3UrhnjJpkL79pBm9zX4FVDPUA4BsjrvCFATMYLp3cyBtLpIkBKZKUxDrfJga0vw4ZjurZ0mn1o0&t=72e85ccd"),
        http("request_44")
          .get(uri09 + "/_layouts/15/sp.runtime.js?rev=5f2WkYJoaxlIRdwUeg4WEg%3D%3D"),
        http("request_45")
          .get(uri09 + "/_layouts/15/images/spcommon.png?rev=23"),
        http("request_46")
          .get(uri09 + "/_layouts/15/blank.js?rev=ZaOXZEobVwykPO9g8hq%2F8A%3D%3D"),
        http("request_47")
          .get(uri09 + "/Style%20Library/js/compensar.footer.min.js?v=1"),
        http("request_48")
          .get(uri09 + "/_layouts/15/clientrenderer.js?rev=PWwV4FATEiOxN90BeB5Hzw%3D%3D"),
        http("request_49")
          .get(uri09 + "/PublishingImages/favicon.ico?rev=23"),
        http("request_50")
          .get(uri09 + "/Style%20Library/js/compensar.agregarTitulowebparts.min.js?v=1"),
        http("request_51")
          .get(uri09 + "/Style%20Library/js/compensar.quitarLoading.min.js?v=1"),
        http("request_52")
          .get(uri09 + "/_layouts/15/ScriptResx.ashx?culture=es%2Des&name=Srch%2EResources&rev=GVo354neq7eNTurLgIdpJQ%3D%3D"),
        http("request_53")
          .get(uri09 + "/_layouts/15/images/searchresultui.png?rev=23"),
        http("request_54")
          .get(uri09 + "/PublishingImages/logo_compensar.png"),
        http("request_55")
          .get(uri09 + "/_layouts/15/sp.search.js?rev=dMkPlEXpdY6iJ%2FsY5RsB0g%3D%3D"),
        http("request_56")
          .get(uri09 + "/Style%20Library/js/compensar.controlAcordeon.min.js?v=1"),
        http("request_57")
          .get(uri09 + "/Style%20Library/js/datalayerCorporativo.js"),
        http("request_58")
          .get(uri09 + "/_layouts/15/search.clientcontrols.js?rev=8Q15HW2EU2aXBktJq5YW%2FA%3D%3D"),
        http("request_59")
          .get(uri09 + "/_layouts/15/sp.init.js?rev=jvJC3Kl5gbORaLtf7kxULQ%3D%3D"),
        http("request_60")
          .get(uri09 + "/PublishingImages/logo_compensar.png?rev=23"),
        http("request_61")
          .get(uri09 + "/_layouts/15/search.cbs.js?rev=S5EegsQhNKgWxVFmcqr5dQ%3D%3D"),
        http("request_62")
          .get(uri09 + "/Style%20Library/webparts/productosDestacados/ProductosDestacados.min.js?v=1"),
        http("request_63")
          .get(uri09 + "/Style%20Library/webparts/productosDestacados/productosDestacados.min.css?v=1"),
        http("request_64")
          .get(uri09 + "/WebResource.axd?d=hcspxoKGngdkW0b6xYvFftMD9L7tgVctZKvxUqyhcPMOX4gSlmQgLLYGJ7F9lMuasHqe9Mv5x6g7VZmrwkJEQmLxw_pNwohGyqmgqyaeGpA1&t=635792838349294682"),
        http("request_65")
          .get(uri09 + "/PublishingImages/40-anos/banner-200.jpg"),
        http("request_66")
          .get(uri09 + "/Style%20Library/js/browsers/jquery.mb.browser.js"),
        http("request_67")
          .get(uri03 + "/api/us/prucorporativo.compensar.com/f47c70/mmapi.js")
          .headers(headers_0),
        http("request_68")
          .get(uri07 + "?id=GTM-5GF54C6"),
        http("request_69")
          .get(uri09 + "/PublishingImages/logo-compensar-gris.svg")
          .headers(headers_69),
        http("request_70")
          .get(uri09 + "/_catalogs/masterpage/starter/corev15.css"),
        http("request_71")
          .get(uri09 + "/Style%20Library/css/customCanales.min.css?v=2"),
        http("request_72")
          .get(uri09 + "/Style%20Library/css/styles.min.css"),
        http("request_73")
          .get(uri09 + "/_catalogs/masterpage/starter/searchv15.css"),
        http("request_74")
          .get(uri09 + "/_catalogs/masterpage/starter/corev15.css"),
        http("request_75")
          .get(uri09 + "/Style%20Library/css/styles.min.css"),
        http("request_76")
          .get(uri09 + "/_catalogs/masterpage/starter/searchv15.css"),
        http("request_77")
          .get(uri09 + "/_catalogs/masterpage/starter/searchv15.css"),
        http("request_78")
          .get(uri09 + "/_catalogs/masterpage/starter/corev15.css"),
        http("request_79")
          .get(uri09 + "/Style%20Library/css/styles.min.css"),
        http("request_80")
          .get(uri09 + "/Style%20Library/css/customCanales.min.css?v=2"),
        http("request_81")
          .get(uri09 + "/Style%20Library/css/customCanales.min.css?v=2"),
        http("request_82")
          .get(uri01 + "/analytics.js"),
        http("request_83")
          .get(uri01 + "/r/collect?v=1&_v=j79&a=314161067&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2F&ul=es-co&de=utf-8&dt=Compensar%20Caja%20de%20Compensaci%C3%B3n%20Familiar%20home&sd=24-bit&sr=1366x768&vp=1366x96&je=1&_u=QACAAEAB~&jid=374185556&gjid=1220243545&cid=2120564570.1573725400&tid=UA-90763271-1&_gid=986993130.1573725400&_r=1&gtm=2wgav35GF54C6&z=1208732890")
          .headers(headers_69),
        http("request_84")
          .get(uri03 + "/platform/us/api/mmpackage-1.17.js"),
        http("request_85")
          .get(uri04 + "?v=1&aip=1&t=dc&_r=3&tid=UA-90763271-1&cid=2120564570.1573725400&jid=374185556&_gid=986993130.1573725400&gjid=1220243545&_v=j79&z=1208732890")
          .headers(headers_69),
        http("request_86")
          .get(uri09 + "/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_0),
        http("request_87")
          .get(uri09 + "/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_0),
        http("request_88")
          .get(uri09 + "/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_0),
        http("request_89")
          .get(uri09 + "/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_0),
        http("request_90")
          .get(uri05 + "/icon-face.png"),
        http("request_91")
          .get(uri05 + "/icon-instagram.png"),
        http("request_92")
          .get(uri05 + "/icon-youtube.png"),
        http("request_93")
          .get(uri05 + "/icon-twitter.png"),
        http("request_94")
          .get(uri05 + "/icon-linkedin.png"),
        http("request_95")
          .get(uri02 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_0),
        http("request_96")
          .get(uri09 + "/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D"),
        http("request_97")
          .get(uri09 + "/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D"),
        http("request_98")
          .post(uri09 + "/_api/contextinfo")
          .headers(headers_98),
        http("request_99")
          .post(uri09 + "/_api/contextinfo")
          .headers(headers_98),
        http("request_100")
          .post(uri09 + "/_api/contextinfo")
          .headers(headers_98),
        http("request_101")
          .post(uri09 + "/_api/contextinfo")
          .headers(headers_98),
        http("request_102")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_bannerhome.js?ctag=22835$$15.0.5131.1000"),
        http("request_103")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22835$$15.0.5131.1000"),
        http("request_104")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_bannerhome.js?ctag=22835$$15.0.5131.1000"),
        http("request_105")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_enlacesinteres_nuevo.js?ctag=22835$$15.0.5131.1000"),
        http("request_106")
          .post(uri09 + "/_api/contextinfo")
          .headers(headers_98),
        http("request_107")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_enlacesinteres.js?ctag=22835$$15.0.5131.1000"),
        http("request_108")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=22835$$15.0.5131.1000"),
        http("request_109")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=22835$$15.0.5131.1000"),
        http("request_110")
          .post(uri09 + "/_api/contextinfo")
          .headers(headers_98),
        http("request_111")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_enlacedirectos2.js?ctag=22835$$15.0.5131.1000"),
        http("request_112")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_enlacesdirectos.js?ctag=22835$$15.0.5131.1000"),
        http("request_113")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_novedades.js?ctag=22835$$15.0.5131.1000"),
        http("request_114")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_novedades.js?ctag=22835$$15.0.5131.1000"),
        http("request_115")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_noticias.js?ctag=22835$$15.0.5131.1000"),
        http("request_116")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_noticias.js?ctag=22835$$15.0.5131.1000"),
        http("request_117")
          .get(uri09 + "/Style%20Library/images/dashLine.png"),
        http("request_118")
          .get(uri02 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_0),
        http("request_119")
          .get(uri02 + "/common/js/0.0.19/common.js")
          .headers(headers_0),
        http("request_120")
          .get(uri09 + "/_vti_bin/client.svc/ProcessQuery"),
        http("request_121")
          .get(uri09 + "/_vti_bin/client.svc/ProcessQuery"),
        http("request_122")
          .get(uri09 + "/_vti_bin/client.svc/ProcessQuery"),
        http("request_123")
          .get(uri09 + "/_vti_bin/client.svc/ProcessQuery"),
        http("request_124")
          .get(uri09 + "/_vti_bin/client.svc/ProcessQuery"),
        http("request_125")
          .get(uri09 + "/_vti_bin/client.svc/ProcessQuery"),
        http("request_126")
          .get(uri09 + "/_api/web/lists/getbytitle('Configuración')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20'Men%C3%BA%20Auxiliar'")
          .headers(headers_126),
        http("request_127")
          .get(uri09 + "/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D"),
        http("request_128")
          .get(uri09 + "/style%20library/js/compensar.carruseldebanners.js?ctag=22835$$15.0.5131.1000"),
        http("request_129")
          .get(uri09 + "/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D"),
        http("request_130")
          .get(uri09 + "/style%20library/css/compensar.tendencias.css?ctag=22835$$15.0.5131.1000"),
        http("request_131")
          .get(uri09 + "/style%20library/css/compensar.enlacesdirectos.css?ctag=22835$$15.0.5131.1000"),
        http("request_132")
          .get(uri09 + "/style%20library/css/compensar.compstandard.css?ctag=22835$$15.0.5131.1000"),
        http("request_133")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22835$$15.0.5131.1000"),
        http("request_134")
          .get(uri09 + "/style%20library/js/compensar.novedades.min.js?ctag=22835$$15.0.5131.1000"),
        http("request_135")
          .post(uri09 + "/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_135)
          .body(RawFileBody("/home1/0135_request.dat")),
        http("request_136")
          .get(uri09 + "/style%20library/js/compensar.modulonoticias.js?ctag=22835$$15.0.5131.1000"),
        http("request_137")
          .post(uri09 + "/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_135)
          .body(RawFileBody("/home1/0137_request.dat")),
        http("request_138")
          .post(uri09 + "/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_138)
          .body(RawFileBody("/home1/0138_request.dat")),
        http("request_139")
          .post(uri09 + "/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_135)
          .body(RawFileBody("/home1/0139_request.dat")),
        http("request_140")
          .post(uri09 + "/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_135)
          .body(RawFileBody("/home1/0140_request.dat")),
        http("request_141")
          .post(uri09 + "/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_135)
          .body(RawFileBody("/home1/0141_request.dat")),
        http("request_142")
          .get(uri10 + "?dcsdat=1573748777746&dcssip=prucorporativo.compensar.com&dcsuri=/&dcsref=https://prucorporativo.compensar.com/&wt.tz=-5&wt.bh=11&wt.ul=es-CO&wt.cd=24&wt.sr=1366x768&wt.jo=Yes&wt.ti=Compensar%2520Caja%2520de%2520Compensaci%25C3%25B3n%2520Familiar%2520home&wt.js=Yes&wt.bs=1366x96&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252F&wt.le=utf-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=96f2e03a-c0f2-4926-8569-dd022db638fb&wt.co_f=96f2e03a-c0f2-4926-8569-dd022db638fb&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_69),
        http("request_143")
          .get(uri09 + "/_vti_bin/client.svc/ProcessQuery"),
        http("request_144")
          .get(uri09 + "/Style%20Library/css/compensar.compStandard.min.css"),
        http("request_145")
          .get(uri09 + "/_vti_bin/Webs.asmx"),
        http("request_146")
          .post(uri09 + "/_vti_bin/Webs.asmx")
          .headers(headers_146)
          .body(RawFileBody("/home1/0146_request.dat")),
        http("request_147")
          .get(uri09 + "/_vti_bin/Lists.asmx"),
        http("request_148")
          .post(uri09 + "/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_135)
          .body(RawFileBody("/home1/0148_request.dat")),
        http("request_149")
          .post(uri09 + "/_vti_bin/Lists.asmx")
          .headers(headers_149)
          .body(RawFileBody("/home1/0149_request.dat")),
        http("request_150")
          .get(uri09 + "/PublishingImages/Destacados/cirugia-estetica-compensar.png?RenditionID=107"),
        http("request_151")
          .get(uri09 + "/PublishingImages/Destacados/credito-libre-inversion-compensar.png?RenditionID=107"),
        http("request_152")
          .get(uri09 + "/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D"),
        http("request_153")
          .get(uri09 + "/Style%20Library/css/compensar.enlacesDeInteres.min.css"),
        http("request_154")
          .get(uri09 + "/PUBLISHINGIMAGES/TENDENCIAS/TENDENCIA-REVISTA-COMPENSAR-CESANTIAS-500X250.JPG?RenditionID=105"),
        http("request_155")
          .get(uri09 + "/Style%20Library/css/compensar.novedades.min.css"),
        http("request_156")
          .get(uri09 + "/PublishingImages/Destacados/09-abril-2015-salud-oral.jpg?RenditionID=107")
          .headers(headers_69),
        http("request_157")
          .get(uri09 + "/Style%20Library/vendor/slick.css"),
        http("request_158")
          .get(uri09 + "/Style%20Library/css/compensar.carouselTheme.min.css"),
        http("request_159")
          .get(uri09 + "/Style%20Library/vendor/slick-theme.css"),
        http("request_160")
          .get(uri09 + "/Style%20Library/css/compensar.moduloNoticias.min.css"),
        http("request_161")
          .get(uri09 + "/Style%20Library/css/compensar.carruselDeBanners.min.css"),
        http("request_162")
          .get(uri09 + "/PublishingImages/Banner/banner_credito_prospectados.jpg?RenditionID=101"),
        http("request_163")
          .get(uri09 + "/PublishingImages/Banner/mayo2018-banner-prueba.jpg?RenditionID=101"),
        http("request_164")
          .get(uri09 + "/PublishingImages/Prueba3%20banners/May2018Ban_Vivienda1.jpg?RenditionID=101"),
        http("request_165")
          .get(uri09 + "/PublishingImages/Banner/banner_credito_prospectados.jpg?RenditionID=102"),
        http("request_166")
          .get(uri09 + "/PublishingImages/Prueba3%20banners/May2018Ban_Vivienda1.jpg?RenditionID=102"),
        http("request_167")
          .get(uri09 + "/Style%20Library/vendor/fonts/slick.woff")
          .headers(headers_0),
        http("request_168")
          .get(uri09 + "/Style%20Library/fonts/roboto/roboto_bold/Roboto-Bold-webfont.woff")
          .headers(headers_0),
        http("request_169")
          .get(uri09 + "/PublishingImages/Lists/Footer/AllItems/book.jpg"),
        http("request_170")
          .get(uri09 + "/PublishingImages/proveedores.png"),
        http("request_171")
          .get(uri09 + "/PublishingImages/nuestraOrganizacion.png"),
        http("request_172")
          .get(uri09 + "/PublishingImages/proyectosSociales.png"),
        http("request_173")
          .get(uri09 + "/PublishingImages/miplanilla.png"),
        http("request_174")
          .get(uri09 + "/PublishingImages/agenciaEmpleo.png"),
        http("request_175")
          .get(uri09 + "/PublishingImages/logos_certificaciones1.1.png"),
        http("request_176")
          .get(uri09 + "/PublishingImages/logos_certificaciones3.png"),
        http("request_177")
          .get(uri09 + "/PublishingImages/logos_certificaciones1.png"),
        http("request_178")
          .get(uri09 + "/PublishingImages/logos_certificaciones2.png"),
        http("request_179")
          .get(uri09 + "/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D"),
        http("request_180")
          .get(uri08),
        http("request_181")
          .get(uri09 + "/Style%20Library/vendor/ajax-loader.gif"),
        http("request_182")
          .get(uri09 + "/Style%20Library/webparts/productosDestacados/productosDestacados.min.css?v=1"),
        http("request_183")
          .get(uri09 + "/Style%20Library/webparts/productosDestacados/productosDestacados.min.css?v=1"),
        http("request_184")
          .get(uri09 + "/style%20library/css/compensar.tendencias.css?ctag=22835$$15.0.5131.1000"),
        http("request_185")
          .get(uri09 + "/style%20library/css/compensar.tendencias.css?ctag=22835$$15.0.5131.1000"),
        http("request_186")
          .get(uri09 + "/style%20library/css/compensar.enlacesdirectos.css?ctag=22835$$15.0.5131.1000"),
        http("request_187")
          .get(uri09 + "/style%20library/css/compensar.enlacesdirectos.css?ctag=22835$$15.0.5131.1000"),
        http("request_188")
          .get(uri09 + "/style%20library/css/compensar.compstandard.css?ctag=22835$$15.0.5131.1000"),
        http("request_189")
          .get(uri09 + "/style%20library/css/compensar.compstandard.css?ctag=22835$$15.0.5131.1000"),
        http("request_190")
          .get(uri09 + "/style%20library/css/compensar.tendencias.css?ctag=22835$$15.0.5131.1000"),
        http("request_191")
          .get(uri09 + "/style%20library/css/compensar.tendencias.css?ctag=22835$$15.0.5131.1000"),
        http("request_192")
          .get(uri09 + "/Style%20Library/css/compensar.enlacesDeInteres.min.css"),
        http("request_193")
          .get(uri09 + "/Style%20Library/css/compensar.compStandard.min.css"),
        http("request_194")
          .get(uri09 + "/Style%20Library/css/compensar.compStandard.min.css"),
        http("request_195")
          .get(uri09 + "/Style%20Library/css/compensar.novedades.min.css"),
        http("request_196")
          .get(uri09 + "/Style%20Library/css/compensar.novedades.min.css"),
        http("request_197")
          .get(uri09 + "/Style%20Library/vendor/slick.css"),
        http("request_198")
          .get(uri09 + "/Style%20Library/vendor/slick.css"),
        http("request_199")
          .get(uri09 + "/Style%20Library/css/compensar.carouselTheme.min.css"),
        http("request_200")
          .get(uri09 + "/Style%20Library/css/compensar.carouselTheme.min.css"),
        http("request_201")
          .get(uri09 + "/Style%20Library/vendor/slick-theme.css"),
        http("request_202")
          .get(uri09 + "/Style%20Library/vendor/slick-theme.css"),
        http("request_203")
          .get(uri09 + "/Style%20Library/css/compensar.moduloNoticias.min.css"),
        http("request_204")
          .get(uri09 + "/Style%20Library/css/compensar.moduloNoticias.min.css"),
        http("request_205")
          .get(uri09 + "/Style%20Library/css/compensar.carruselDeBanners.min.css"),
        http("request_206")
          .get(uri09 + "/Style%20Library/css/compensar.carruselDeBanners.min.css"),
        http("request_207")
          .get(uri09 + "/Style%20Library/css/compensar.enlacesDeInteres.min.css"),
        http("request_208")
          .get(uri09 + "/Style%20Library/vendor/slick-theme.css"),
        http("request_209")
          .get(uri09 + "/Style%20Library/vendor/slick-theme.css")))
    .pause(8)
    .exec(http("request_210")
      .get("/eumcollector/beacons/browser/v1/AD-AAB-AAT-HVX/adrum")
      .resources(http("request_211")
        .post("/eumcollector/beacons/browser/v1/AD-AAB-AAT-HVX/adrum")
        .headers(headers_211)
        .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>"""))))

        //.body(RawFileBody("/home1/0211_request.txt"))))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}