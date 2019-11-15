package Compenssar


import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class home3 extends Simulation {

  val httpProtocol = http
    .baseUrl("https://prucorporativo.compensar.com")
    //.inferHtmlResources()
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:70.0) Gecko/20100101 Firefox/70.0")

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
    "Pragma" -> "no-cache",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_1 = Map("Pragma" -> "no-cache")

  val headers_2 = Map(
    "Accept" -> "text/css,*/*;q=0.1",
    "Pragma" -> "no-cache")

  val headers_7 = Map(
    "Pragma" -> "no-cache",
    "TE" -> "Trailers")

  val headers_10 = Map(
    "Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
    "Accept-Encoding" -> "identity",
    "Pragma" -> "no-cache")

  val headers_14 = Map(
    "Accept" -> "image/webp,*/*",
    "Pragma" -> "no-cache")

  val headers_22 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/json;odata=verbose",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=utf-8",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Pragma" -> "no-cache",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_43 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/json; odata=verbose",
    "Content-Type" -> "text/plain",
    "Pragma" -> "no-cache",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_54 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/xml, text/xml, */*; q=0.01",
    "Content-Type" -> """text/xml;charset="utf-8"""",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Pragma" -> "no-cache",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_56 = Map(
    "ADRUM" -> "isAjax:true",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Pragma" -> "no-cache",
    "X-RequestDigest" -> "0xB95347286F647E5ACB45095707007752BC0FB00BDC000326A411A0595CE40F0A75DC9A985A00AE8538DB2594B94E14BDE919F126C000F158A0AC250D740EDBD8,14 Nov 2019 16:20:48 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_59 = Map(
    "ADRUM" -> "isAjax:true",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Pragma" -> "no-cache",
    "X-RequestDigest" -> "0x82F5ACBD02F0BD43A6C03CF43FE53016327D6A09992010EDCCF65762A2807F50F900A858BC7A1E42E27342716DF48BEA3F885EC8AE77997043FF9B1E4333CB8D,14 Nov 2019 16:20:49 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_60 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/xml, text/xml, */*; q=0.01",
    "Content-Type" -> "text/xml;charset=UTF-8",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Pragma" -> "no-cache",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_80 = Map(
    "Accept" -> "image/webp,*/*",
    "Pragma" -> "no-cache",
    "TE" -> "Trailers")

  val uri1 = "https://www.google-analytics.com"
  val uri2 = "https://c.oracleinfinity.io/acs"
  val uri3 = "https://service.maxymiser.net"
  val uri4 = "https://stats.g.doubleclick.net/r/collect"
  val uri5 = "https://www.compensar.com/img/2016"
  val uri6 = "https://www.googletagmanager.com/gtm.js"
  val uri7 = "https://cdn.appdynamics.com/adrum-ext.396a4a3598e4fdd54b8073a93c951462.js"
  val uri9 = "https://dc.oracleinfinity.io/awlorq1lmp/dcs.gif"

  val scn = scenario("home3")
    .exec(http("request_0")
      .get("/")
      .headers(headers_0)
      .resources(http("request_1")
        .get("/Style%20Library/webparts/productosDestacados/ProductosDestacados.min.js?v=1")
        .headers(headers_1),
        http("request_2")
          .get("/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_2),
        http("request_3")
          .get("/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_2),
        http("request_4")
          .get("/Style%20Library/css/styles.min.css")
          .headers(headers_2),
        http("request_5")
          .get("/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_2),
        http("request_6")
          .get(uri6 + "?id=GTM-5GF54C6")
          .headers(headers_1),
        http("request_7")
          .get(uri3 + "/cg/v5us/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252F%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&pd=731562806%7CAQAAAApVAwDpQ2hfXBL3TAABEgABQgCimr4fAQC%2BSfagHWnXSL5J9qAdaddIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBXBIBAAAAAAAAAAAA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAQBDCwEAfhlbtxFcEgD%2F%2F%2F%2F%2FAVwSXBL%2F%2FwEAAAEAAAAAAQFwAgBNsQMAAAAAAAAAAUU%3D&bid=nycvwcgus03&srv=nycvwcgus03")
          .headers(headers_7),
        http("request_8")
          .get(uri3 + "/platform/us/api/mmpackage-1.17.js")
          .headers(headers_7),
        http("request_9")
          .get(uri2 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_10")
          .get("/Style%20Library/fonts/roboto/roboto_light/Roboto-Light-webfont.woff")
          .headers(headers_10),
        http("request_11")
          .get("/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_10),
        http("request_12")
          .get("/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_10),
        http("request_13")
          .get("/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_10),
        http("request_14")
          .get(uri5 + "/icon-twitter.png")
          .headers(headers_14),
        http("request_15")
          .get(uri5 + "/icon-linkedin.png")
          .headers(headers_14),
        http("request_16")
          .get(uri5 + "/icon-face.png")
          .headers(headers_14),
        http("request_17")
          .get(uri5 + "/icon-instagram.png")
          .headers(headers_14),
        http("request_18")
          .get(uri5 + "/icon-youtube.png")
          .headers(headers_14),
        http("request_19")
          .get("/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D")
          .headers(headers_1),
        http("request_20")
          .get("/Style%20Library/images/dashLine.png")
          .headers(headers_14),
        http("request_21")
          .get("/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D")
          .headers(headers_1),
        http("request_22")
          .post("/_api/contextinfo")
          .headers(headers_22),
        http("request_23")
          .post("/_api/contextinfo")
          .headers(headers_22),
        http("request_24")
          .post("/_api/contextinfo")
          .headers(headers_22),
        http("request_25")
          .post("/_api/contextinfo")
          .headers(headers_22),
        http("request_26")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_27")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_bannerhome.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_28")
          .post("/_api/contextinfo")
          .headers(headers_22),
        http("request_29")
          .post("/_api/contextinfo")
          .headers(headers_22),
        http("request_30")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_bannerhome.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_31")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_enlacesinteres_nuevo.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_32")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_enlacesinteres.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_33")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_34")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_35")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_enlacedirectos2.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_36")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_enlacesdirectos.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_37")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_novedades.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_38")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_novedades.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_39")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_noticias.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_40")
          .get("/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_noticias.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_41")
          .get(uri2 + "/common/js/0.0.19/common.js")
          .headers(headers_1),
        http("request_42")
          .get("/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D")
          .headers(headers_1),
        http("request_43")
          .get("/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_43),
        http("request_44")
          .get(uri2 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_1),
        http("request_45")
          .get("/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D")
          .headers(headers_1),
        http("request_46")
          .get("/style%20library/js/compensar.carruseldebanners.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_47")
          .get("/style%20library/css/compensar.tendencias.css?ctag=22835$$15.0.5131.1000")
          .headers(headers_2),
        http("request_48")
          .get("/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_49")
          .get("/style%20library/css/compensar.compstandard.css?ctag=22835$$15.0.5131.1000")
          .headers(headers_2),
        http("request_50")
          .get("/style%20library/css/compensar.enlacesdirectos.css?ctag=22835$$15.0.5131.1000")
          .headers(headers_2),
        http("request_51")
          .get("/style%20library/js/compensar.novedades.min.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_52")
          .get("/style%20library/js/compensar.modulonoticias.js?ctag=22835$$15.0.5131.1000")
          .headers(headers_1),
        http("request_53")
          .get("/Style%20Library/css/compensar.compStandard.min.css")
          .headers(headers_2),
        http("request_54")
          .post("/_vti_bin/Webs.asmx")
          .headers(headers_54)
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        //.body(RawFileBody("/home3/0054_request.dat")),
        http("request_55")
          .post("/_api/contextinfo")
          .headers(headers_22),
        http("request_56")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_56)
          .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
      // .body(RawFileBody("/home3/0056_request.dat")),
        http("request_57")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_56)
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        //.body(RawFileBody("/home3/0057_request.dat")),
        http("request_58")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_56)
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        //  .body(RawFileBody("/home3/0058_request.dat")),
        http("request_59")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_59)
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        // .body(RawFileBody("/home3/0059_request.dat")),
        http("request_60")
          .post("/_vti_bin/Lists.asmx")
          .headers(headers_60)
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        //  .body(RawFileBody("/home3/0060_request.dat")),
        http("request_61")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_56)
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        //  .body(RawFileBody("/home3/0061_request.dat")),
        http("request_62")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_56)
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        // .body(RawFileBody("/home3/0062_request.dat")),
        http("request_63")
          .post("/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_56)
          .body(StringBody("""<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"><soap:Body><WebUrlFromPageUrlResponse xmlns="http://schemas.microsoft.com/sharepoint/soap/"><WebUrlFromPageUrlResult>https://prucorporativo.compensar.com</WebUrlFromPageUrlResult></WebUrlFromPageUrlResponse></soap:Body></soap:Envelope>\r\n""")),
        //  .body(RawFileBody("/home3/0063_request.dat")),
        http("request_64")
          .get("/PublishingImages/Destacados/cirugia-estetica-compensar.png?RenditionID=107")
          .headers(headers_14),
        http("request_65")
          .get("/PublishingImages/Destacados/credito-libre-inversion-compensar.png?RenditionID=107")
          .headers(headers_14),
        http("request_66")
          .get("/PublishingImages/Destacados/09-abril-2015-salud-oral.jpg?RenditionID=107")
          .headers(headers_14),
        http("request_67")
          .get(uri2 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_1),
        http("request_68")
          .get("/Style%20Library/css/compensar.enlacesDeInteres.min.css")
          .headers(headers_2),
        http("request_69")
          .get("/PUBLISHINGIMAGES/TENDENCIAS/TENDENCIA-REVISTA-COMPENSAR-CESANTIAS-500X250.JPG?RenditionID=105")
          .headers(headers_14),
        http("request_70")
          .get("/Style%20Library/css/compensar.carruselDeBanners.min.css")
          .headers(headers_2),
        http("request_71")
          .get("/Style%20Library/vendor/slick.css")
          .headers(headers_2),
        http("request_72")
          .get("/Style%20Library/vendor/slick-theme.css")
          .headers(headers_2),
        http("request_73")
          .get("/Style%20Library/css/compensar.carouselTheme.min.css")
          .headers(headers_2),
        http("request_74")
          .get(uri1 + "/analytics.js")
          .headers(headers_1),
        http("request_75")
          .get("/PublishingImages/Banner/banner_credito_prospectados.jpg?RenditionID=101")
          .headers(headers_14),
        http("request_76")
          .get("/PublishingImages/Banner/mayo2018-banner-prueba.jpg?RenditionID=101")
          .headers(headers_14),
        http("request_77")
          .get("/PublishingImages/Prueba3%20banners/May2018Ban_Vivienda1.jpg?RenditionID=101")
          .headers(headers_14),
        http("request_78")
          .get("/Style%20Library/fonts/roboto/roboto_bold/Roboto-Bold-webfont.woff")
          .headers(headers_10),
        http("request_79")
          .get("/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D")
          .headers(headers_1),
        http("request_80")
          .get(uri1 + "/r/collect?v=1&_v=j79&a=708739722&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2F&ul=es-es&de=UTF-8&dt=Compensar%20Caja%20de%20Compensaci%C3%B3n%20Familiar%20home&sd=24-bit&sr=1366x768&vp=1349x137&je=0&_u=QACAAEAB~&jid=454872594&gjid=620444929&cid=1982219005.1573748045&tid=UA-90763271-1&_gid=5704781.1573748045&_r=1&gtm=2wgav35GF54C6&z=468335965")
          .headers(headers_80),
        http("request_81")
          .get("/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D")
          .headers(headers_1),
        http("request_82")
          .get(uri2 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_1),
        http("request_83")
          .get("/PublishingImages/nuestraOrganizacion.png")
          .headers(headers_14),
        http("request_84")
          .get("/PublishingImages/Lists/Footer/AllItems/book.jpg")
          .headers(headers_14),
        http("request_85")
          .get("/PublishingImages/proveedores.png")
          .headers(headers_14),
        http("request_86")
          .get("/PublishingImages/proyectosSociales.png")
          .headers(headers_14),
        http("request_87")
          .get("/PublishingImages/agenciaEmpleo.png")
          .headers(headers_14),
        http("request_88")
          .get("/PublishingImages/logos_certificaciones1.png")
          .headers(headers_14),
        http("request_89")
          .get("/Style%20Library/css/compensar.novedades.min.css")
          .headers(headers_2),
        http("request_90")
          .get("/PublishingImages/miplanilla.png")
          .headers(headers_14),
        http("request_91")
          .get("/PublishingImages/logos_certificaciones1.1.png")
          .headers(headers_14),
        http("request_92")
          .get("/PublishingImages/logos_certificaciones2.png")
          .headers(headers_14),
        http("request_93")
          .get("/PublishingImages/logos_certificaciones3.png")
          .headers(headers_14),
        http("request_94")
          .get(uri4 + "?v=1&aip=1&t=dc&_r=3&tid=UA-90763271-1&cid=1982219005.1573748045&jid=454872594&_gid=5704781.1573748045&gjid=620444929&_v=j79&z=468335965")
          .headers(headers_14),
        http("request_95")
          .get("/Style%20Library/css/compensar.moduloNoticias.min.css")
          .headers(headers_2),
        http("request_96")
          .get(uri7),
        http("request_97")
          .get(uri9 + "?dcsdat=1573748467870&dcssip=prucorporativo.compensar.com&dcsuri=/&wt.tz=-5&wt.bh=11&wt.ul=es-ES&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Compensar%2520Caja%2520de%2520Compensaci%25C3%25B3n%2520Familiar%2520home&wt.js=Yes&wt.bs=1366x137&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252F&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=23b3056a-fdf0-4f91-9825-753516697db8&wt.co_f=23b3056a-fdf0-4f91-9825-753516697db8&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_14),
        http("request_98")
          .get("/Style%20Library/vendor/ajax-loader.gif")
          .headers(headers_14)))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}