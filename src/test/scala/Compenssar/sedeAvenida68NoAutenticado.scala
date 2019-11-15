package Compenssar
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class sedeAvenida68NoAutenticado extends Simulation {

  val httpProtocol = http
    .baseUrl("https://col.eum-appdynamics.com")
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

  val headers_4 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "intervention" -> """<https://www.chromestatus.com/feature/5718547946799104>; level="warning"""",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_5 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_6 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_10 = Map("ADRUM" -> "isAjax:true")

  val headers_11 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_22 = Map(
    "ACCEPT" -> "application/json;odata=verbose",
    "ADRUM" -> "isAjax:true",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_29 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/json; odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "text/plain",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_32 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "text/xml",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-RequestDigest" -> "0x26D391BE3544E8544A4326D8A644EDCA111F0E618F5592B5F97E4CE54D7F26A63D5E2707121E61102827CB5673989C9D67A6E115ED27809CD67AF4FD1D37C4EF,13 Nov 2019 18:45:59 -0000",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_42 = Map(
    "ACCEPT" -> "application/json;odata=verbose",
    "ADRUM" -> "isAjax:true",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_48 = Map(
    "ADRUM" -> "isAjax:true",
    "Accept" -> "application/json; odata=verbose",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_61 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_66 = Map("Origin" -> "https://prucorporativo.compensar.com")

  val headers_69 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "x-client-data" -> "CLC1yQEIkrbJAQiltskBCMS2yQEIqZ3KAQjiqMoBCLywygEIzrDKAQj3tMoBGKukygE=")

  val headers_71 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-type" -> "text/plain",
    "Origin" -> "https://prucorporativo.compensar.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "cross-site")

  val uri01 = "https://maps.googleapis.com"
  val uri02 = "https://www.google-analytics.com"
  val uri03 = "https://c.oracleinfinity.io/acs"
  val uri04 = "https://service.maxymiser.net/cg/v5us"
  val uri05 = "https://stats.g.doubleclick.net/r/collect"
  val uri07 = "https://www.googletagmanager.com/gtm.js"
  val uri08 = "https://cdn.appdynamics.com/adrum-ext.396a4a3598e4fdd54b8073a93c951462.js"
  val uri09 = "https://prucorporativo.compensar.com"
  val uri10 = "https://maps.gstatic.com/mapfiles"
  val uri11 = "https://fonts.gstatic.com/s/roboto/v20"
  val uri12 = "https://dc.oracleinfinity.io/awlorq1lmp/dcs.gif"
  val uri13 = "https://fonts.googleapis.com/css"

  val scn = scenario("compensar68")
    .exec(http("home_sedes/avenida-68-sede-principal")
      .get(uri09 + "/sedes/avenida-68-sede-principal")
      .headers(headers_0)
      .resources(http("https://www.googletagmanager.com/gtm.js")
        .get(uri07 + "?id=GTM-5GF54C6"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/style%20library/js/ParqueaderosV2.js"),
        http("https://www.google-analytics.com")
          .get(uri02 + "/analytics.js"),
        http("https://service.maxymiser.net/cg/v5us")
          .get(uri04 + "/?fv=dmn%3Dprucorporativo.compensar.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fprucorporativo.compensar.com%252Fsedes%252Favenida-68-sede-principal%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=-300&jrt=s&ids=1%3D9999803422816436&pd=-881461051%7CpwAAAApVAwBxZ%2FapVBKTZxA5OTk5ODAzNDIyODE2NDM2ARIAAUIAcL59IQsAP3SWsmlo10iYcqPX12LXSAAAAAD%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwAGRGlyZWN0AVQSCwAAAAAAAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwIA6AkBAMIXF179WhIA%2F%2F%2F%2F%2FwFaElsS%2F%2F8OAAABAAAAAAFTbAIAsqwDAACgCQEATj5iruZaEgD%2F%2F%2F%2F%2FAVoSWxL%2F%2FxAAAAEAAAAAAZlrAgB3rQMAAAAAAAAAAUU%3D&bid=nycvwcgus04&srv=nycvwcgus04")
          .headers(headers_4),
        http("https://www.google-analytics.com")
          .get(uri02 + "/r/collect?v=1&_v=j79&a=458691886&t=pageview&_s=1&dl=https%3A%2F%2Fprucorporativo.compensar.com%2Fsedes%2Favenida-68-sede-principal&ul=es-419&de=UTF-8&dt=Sedes&sd=24-bit&sr=1366x768&vp=1354x150&je=0&_u=QACAAEAB~&jid=1080082365&gjid=1413860894&cid=2020315946.1573058361&tid=UA-90763271-1&_gid=2077898482.1573563542&_r=1&gtm=2wgav35GF54C6&z=689365766")
          .headers(headers_5),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/Style%20Library/fonts/roboto/roboto_regular/Roboto-Regular-webfont.woff")
          .headers(headers_6),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/Style%20Library/fonts/fontawesome-webfont.woff2?v=4.7.0")
          .headers(headers_6),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/Style%20Library/fonts/roboto/roboto_medium/Roboto-Medium-webfont.woff")
          .headers(headers_6),
        http("https://stats.g.doubleclick.net/r/collect")
          .get(uri05 + "?v=1&aip=1&t=dc&_r=3&tid=UA-90763271-1&cid=2020315946.1573058361&jid=1080082365&_gid=2077898482.1573563542&gjid=1413860894&_v=j79&z=689365766")
          .headers(headers_5),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_catalogs/masterpage/starter/corev15.css")
          .headers(headers_10),
        http("https://c.oracleinfinity.io/acs")
          .get(uri03 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_11),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_catalogs/masterpage/starter/searchv15.css")
          .headers(headers_10),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/Style%20Library/css/styles.min.css")
          .headers(headers_10),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/Style%20Library/css/customCanales.min.css?v=2")
          .headers(headers_10),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/style%20library/Parqueaderos/css/estilos.css")
          .headers(headers_10),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/Style%20Library/images/dashLine.png"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_layouts/15/3082/initstrings.js?rev=QqoBtCkUNE6qxwoI8f8TFA%3D%3D"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_layouts/15/sp.ui.dialog.js?rev=3Oh2QbaaiXSb7ldu2zd6QQ%3D%3D"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_tendencias.js?ctag=22765$$15.0.5131.1000"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/group_content.js?ctag=22765$$15.0.5131.1000"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_tendencias.js?ctag=22765$$15.0.5131.1000"),
        http("home_sedes/avenida-68-sede-principal")
          .post(uri09 + "/_api/contextinfo")
          .headers(headers_22),
        http("home_sedes/avenida-68-sede-principal")
          .post(uri09 + "/_api/contextinfo")
          .headers(headers_22),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_catalogs/masterpage/item_compensar_testdetallesede.js?ctag=22765$$15.0.5131.1000"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_testdetallesede.js?ctag=22765$$15.0.5131.1000"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/item_compensar_novedades.js?ctag=22765$$15.0.5131.1000"),
        http("home_sedes/avenida-68-sede-principal")
          .post(uri09 + "/_api/contextinfo")
          .headers(headers_22),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/content%20web%20parts/control_compensar_novedades.js?ctag=22765$$15.0.5131.1000"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_api/web/lists/getbytitle('Configuraci%C3%B3n')/items?$select=Nombre,Valor&$filter=Seccion%20eq%20%27Men%C3%BA%20Auxiliar%27")
          .headers(headers_29),
        http("https://c.oracleinfinity.io/acs")
          .get(uri03 + "/common/js/0.0.19/common.js")
          .headers(headers_11),
        http("https://c.oracleinfinity.io/acs")
          .get(uri03 + "/account/awlorq1lmp/js/main/analytics-default/analytics.js")
          .headers(headers_11),
        http("home_sedes/avenida-68-sede-principal")
          .post(uri09 + "/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_32)
          .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
        //.body(RawFileBody("/compensar68/0032_request.dat")),
        http("home_sedes/avenida-68-sede-principal")
          .post(uri09 + "/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_32)
          .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
        // .body(RawFileBody("/compensar68/0033_request.dat")),
        http("home_sedes/avenida-68-sede-principal4")
          .get(uri09 + "/_layouts/15/3082/strings.js?rev=7H3OSkoqL0w7CJav4zweJA%3D%3D"),
        http("home_sedes/avenida-68-sede-principal")
          .post(uri09 + "/_vti_bin/client.svc/ProcessQuery")
          .headers(headers_32)
          .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")),
        // .body(RawFileBody("/compensar68/0035_request.dat")),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_catalogs/masterpage/display%20templates/language%20files/es-ES/customstrings.js?ctag=22765$$15.0.5131.1000"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/style%20library/js/compensar.detallesedes.min.js?ctag=22765$$15.0.5131.1000"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/style%20library/js/compensar.novedades.min.js?ctag=22765$$15.0.5131.1000"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_layouts/15/sp.js?rev=BJ9b7Ak8FOS3NwGiaTXOjA%3D%3D"),
        http("https://c.oracleinfinity.io/acs")
          .get(uri03 + "/account/awlorq1lmp/js/main/odc.js")
          .headers(headers_11),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_layouts/15/core.js?rev=GpU7vxyOqzS0F9OfEX3CCw%3D%3D"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_api/web/lists/GetByTitle('Titulos%20Parametrizables')/items?$select=Title,ClaseDelElemento,Caracteres")
          .headers(headers_42),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/PUBLISHINGIMAGES/TENDENCIAS/TENDENCIA-REVISTA-COMPENSAR-CESANTIAS-500X250.JPG?RenditionID=105"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/Style%20Library/css/compensar.novedades.min.css"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/Style%20Library/vendor/slick.css"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/Style%20Library/vendor/slick-theme.css"),
        http("home_sedes/avenida-68-sede-principal7")
          .get(uri09 + "/Style%20Library/css/compensar.carouselTheme.min.css"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_api/web/lists/GetByTitle('Imagenes%20Sedes')/items?$select=Title,File,NombreSedeLookup_ListSedes/NombreSede&$expand=NombreSedeLookup_ListSedes,File&$top=5&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27")
          .headers(headers_48),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_api/web/lists/GetByTitle('Servicios%20Sedes')/items?$select=Tramite,Horario,Ubicacion,Servicio_ListServicios/NombreTexto,NombreSedeLookup_ListSedes/NombreSede&$expand=Servicio_ListServicios,NombreSedeLookup_ListSedes&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27")
          .headers(headers_48),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_api/web/lists/GetByTitle('Sedes%20Otros%20Servicios')/items?$select=Descripcion,Horario,NombreMultiTexto,NombreSedeLookup_ListSedes/NombreSede&$expand=NombreSedeLookup_ListSedes&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27%20and%20ContentType%20eq%20%27Tarifas%27")
          .headers(headers_48),
        http("https://maps.googleapis.com")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_419/common.js"),
        http("https://maps.googleapis.com")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_419/util.js"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_api/web/lists/GetByTitle('Sedes%20Otros%20Servicios')/items?$select=Descripcion,Horario,NombreMultiTexto,NombreSedeLookup_ListSedes/NombreSede&$expand=NombreSedeLookup_ListSedes&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27%20and%20ContentType%20eq%20%27Otros%20Servicios%27")
          .headers(headers_48),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_api/web/lists/GetByTitle('Sedes%20Otros%20Servicios')/items?$select=Descripcion,Horario,NombreMultiTexto,NombreSedeLookup_ListSedes/NombreSede&$expand=NombreSedeLookup_ListSedes&$filter=NombreSedeLookup_ListSedes/NombreSede%20eq%20%27undefined%27%20and%20ContentType%20eq%20%27Alimentos%27")
          .headers(headers_48),
        http("https://maps.googleapis.com")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_419/map.js"),
        http("https://maps.googleapis.com")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_419/marker.js"),
        http("https://maps.googleapis.com")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_419/geometry.js"),
        http("https://maps.googleapis.com")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_419/directions.js"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_layouts/15/sp.core.js?rev=tZDGLPOvY1bRw%2BsgzXpxTg%3D%3D"),
        http("home_sedes/avenida-68-sede-principal")
          .get(uri09 + "/_catalogs/masterpage/starter/corev15.css"),
        http("https://dc.oracleinfinity.io")
          .get(uri12 + "?dcsdat=1573670776949&dcssip=prucorporativo.compensar.com&dcsuri=/sedes/avenida-68-sede-principal&wt.tz=-5&wt.bh=13&wt.ul=es-419&wt.cd=24&wt.sr=1366x768&wt.jo=No&wt.ti=Sedes&wt.js=Yes&wt.bs=1354x150&wt.dl=0&wt.ssl=1&wt.es=prucorporativo.compensar.com%252Fsedes%252Favenida-68-sede-principal&wt.le=UTF-8&wt.tv=1.0.4&wt.ce=1&wt.vtid=859480ed-0693-4d22-948e-68a58339d2d3&wt.co_f=859480ed-0693-4d22-948e-68a58339d2d3&ora.tag_id=main&ora.tag_config=default")
          .headers(headers_61),
        http("https://maps.gstatic.com/mapfiles")
          .get(uri10 + "/openhand_8_8.cur"),
        http("https://maps.googleapis.com")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_419/onion.js"),
        http("https://maps.googleapis.com")
          .get(uri01 + "/maps-api-v3/api/js/38/11/intl/es_419/infowindow.js"),
        http("https://fonts.googleapis.com")
          .get(uri13 + "?family=Roboto:300,400,500,700|Google+Sans"),
        http("https://fonts.gstatic.com/s/roboto")
          .get(uri11 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
          .headers(headers_66),
        http("https://fonts.gstatic.com/s/roboto")
          .get(uri11 + "/KFOlCnqEu92Fr1MmWUlfBBc4.woff2")
          .headers(headers_66),
        http("https://cdn.appdynamics.com/adrum-ext")
          .get(uri08)))
    .pause(2)
    .exec(http("https://maps.googleapis.com")
      .get(uri01 + "/maps/api/js/AuthenticationService.Authenticate?1shttps%3A%2F%2Fprucorporativo.compensar.com%2Fsedes%2Favenida-68-sede-principal&4sAIzaSyBQs4JbPCHOPygyJzKnUYgsAm35jOpmshk&callback=_xdc_._7bkta6&key=AIzaSyBQs4JbPCHOPygyJzKnUYgsAm35jOpmshk&token=9260")
      .headers(headers_69)
      .resources(http("https://col.eum-appdynamics.com")
        .get(uri10 + "/api-3/images/icon_error.png")))
    .pause(9)
    .exec(http("https://col.eum-appdynamics.com")
      .post("/eumcollector/beacons/browser/v1/AD-AAB-AAT-HVX/adrum")
      .headers(headers_71)
      .body(StringBody("""<Request xmlns="http://schemas.microsoft.com/sharepoint/clientquery/2009" SchemaVersion="15.0.0.0" LibraryVersion="15.0.0.0" ApplicationName="Javascript Library"><Actions><ObjectPath Id="1" ObjectPathId="0" /><SetProperty Id="2" ObjectPathId="0" Name="TimeZoneId"><Parameter Type="Number">35</Parameter></SetProperty><SetProperty Id="3" ObjectPathId="0" Name="Culture"><Parameter Type="Number">-1</Parameter></SetProperty><SetProperty Id="4" ObjectPathId="0" Name="RowsPerPage"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="5" ObjectPathId="0" Name="RowLimit"><Parameter Type="Number">50</Parameter></SetProperty><SetProperty Id="6" ObjectPathId="0" Name="TotalRowsExactMinimum"><Parameter Type="Number">51</Parameter></SetProperty><SetProperty Id="7" ObjectPathId="0" Name="SourceId"><Parameter Type="Guid">{454a2926-d7a9-4369-b3d8-f1b6a824df07}</Parameter></SetProperty><ObjectPath Id="9" ObjectPathId="8" /><Method Name="SetQueryPropertyValue" Id="10" ObjectPathId="8"><Parameters><Parameter Type="String">SourceName</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">Compensar Tendencias</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="11" ObjectPathId="8"><Parameters><Parameter Type="String">SourceLevel</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">SPSite</Property></Parameter></Parameters></Method><ObjectPath Id="13" ObjectPathId="12" /><Method Name="Add" Id="14" ObjectPathId="12"><Parameters><Parameter Type="String">CantidadPersonalizada</Parameter></Parameters></Method><Method Name="Add" Id="15" ObjectPathId="12"><Parameters><Parameter Type="String">DescripcionTendenciaOWSTEXT</Parameter></Parameters></Method><Method Name="Add" Id="16" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioNombre</Parameter></Parameters></Method><Method Name="Add" Id="17" ObjectPathId="12"><Parameters><Parameter Type="String">NegocioTituloTendencia</Parameter></Parameters></Method><Method Name="Add" Id="18" ObjectPathId="12"><Parameters><Parameter Type="String">ImagenOWSIMGE</Parameter></Parameters></Method><Method Name="Add" Id="19" ObjectPathId="12"><Parameters><Parameter Type="String">FechaInicioNovedad</Parameter></Parameters></Method><Method Name="Add" Id="20" ObjectPathId="12"><Parameters><Parameter Type="String">FechaFinNovedad</Parameter></Parameters></Method><Method Name="Add" Id="21" ObjectPathId="12"><Parameters><Parameter Type="String">URLOWSURLH</Parameter></Parameters></Method><Method Name="Add" Id="22" ObjectPathId="12"><Parameters><Parameter Type="String">AbrirNuevaPestaOWSBOOL</Parameter></Parameters></Method><Method Name="Add" Id="23" ObjectPathId="12"><Parameters><Parameter Type="String">Orden</Parameter></Parameters></Method><Method Name="Add" Id="24" ObjectPathId="12"><Parameters><Parameter Type="String">SeccionNoticiasOWSCHCM</Parameter></Parameters></Method><Method Name="Add" Id="25" ObjectPathId="12"><Parameters><Parameter Type="String">Home</Parameter></Parameters></Method><ObjectPath Id="27" ObjectPathId="26" /><Method Name="Add" Id="28" ObjectPathId="26"><Parameters><Parameter Type="String">Title</Parameter></Parameters></Method><Method Name="Add" Id="29" ObjectPathId="26"><Parameters><Parameter Type="String">Path</Parameter></Parameters></Method><Method Name="Add" Id="30" ObjectPathId="26"><Parameters><Parameter Type="String">Author</Parameter></Parameters></Method><Method Name="Add" Id="31" ObjectPathId="26"><Parameters><Parameter Type="String">SectionNames</Parameter></Parameters></Method><Method Name="Add" Id="32" ObjectPathId="26"><Parameters><Parameter Type="String">SiteDescription</Parameter></Parameters></Method><SetProperty Id="33" ObjectPathId="0" Name="TrimDuplicates"><Parameter Type="Boolean">false</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="34" ObjectPathId="8"><Parameters><Parameter Type="String">TryCache</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="35" ObjectPathId="8"><Parameters><Parameter Type="String">Scope</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">{Site.URL}</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="36" ObjectPathId="8"><Parameters><Parameter Type="String">UpdateLinksForCatalogItems</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="37" ObjectPathId="8"><Parameters><Parameter Type="String">EnableStacking</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">true</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">3</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="38" ObjectPathId="8"><Parameters><Parameter Type="String">ListId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">697642d2-eb10-42c9-9ff2-e0f2d2469483</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="39" ObjectPathId="8"><Parameters><Parameter Type="String">ListItemId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">12</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">2</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="Null" /></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="40" ObjectPathId="8"><Parameters><Parameter Type="String">TermId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">c5a4b166-492d-404b-9fcb-ae27336f578f</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="41" ObjectPathId="8"><Parameters><Parameter Type="String">TermSetId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">24429c1e-5d03-4696-b47e-abfb6fe51cfe</Property></Parameter></Parameters></Method><Method Name="SetQueryPropertyValue" Id="42" ObjectPathId="8"><Parameters><Parameter Type="String">TermStoreId</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">48be665c-c5b7-44c4-9bc7-af3dde310a85</Property></Parameter></Parameters></Method><SetProperty Id="43" ObjectPathId="0" Name="ResultsUrl"><Parameter Type="String">https://prucorporativo.compensar.com/sedes/avenida-68-sede-principal</Parameter></SetProperty><SetProperty Id="44" ObjectPathId="0" Name="BypassResultTypes"><Parameter Type="Boolean">true</Parameter></SetProperty><SetProperty Id="45" ObjectPathId="0" Name="ClientType"><Parameter Type="String">ContentSearchRegular</Parameter></SetProperty><SetProperty Id="46" ObjectPathId="0" Name="EnableInterleaving"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="47" ObjectPathId="0" Name="ProcessBestBets"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="48" ObjectPathId="0" Name="UILanguage"><Parameter Type="Number">3082</Parameter></SetProperty><Method Name="SetQueryPropertyValue" Id="49" ObjectPathId="8"><Parameters><Parameter Type="String">QuerySession</Parameter><Parameter TypeId="{b25ba502-71d7-4ae4-a701-4ca2fb1223be}"><Property Name="BoolVal" Type="Boolean">false</Property><Property Name="IntVal" Type="Number">0</Property><Property Name="QueryPropertyValueTypeIndex" Type="Number">1</Property><Property Name="StrArray" Type="Null" /><Property Name="StrVal" Type="String">93ffd479-471b-42ec-aa06-effa355fde61</Property></Parameter></Parameters></Method><SetProperty Id="50" ObjectPathId="0" Name="ProcessPersonalFavorites"><Parameter Type="Boolean">false</Parameter></SetProperty><SetProperty Id="51" ObjectPathId="0" Name="SafeQueryPropertiesTemplateUrl"><Parameter Type="String">querygroup://webroot/Paginas/CatalogItem-SedesHome.aspx?groupname=83d74ed8%2D3a6f%2D4a1f%2D851d%2D3602a91dbd3c</Parameter></SetProperty><SetProperty Id="52" ObjectPathId="0" Name="IgnoreSafeQueryPropertiesTemplateUrl"><Parameter Type="Boolean">false</Parameter></SetProperty><ObjectPath Id="54" ObjectPathId="53" /><ExceptionHandlingScope Id="55"><TryScope Id="57"><Method Name="ExecuteQueries" Id="59" ObjectPathId="53"><Parameters><Parameter Type="Array"><Object Type="String">7b9f3d2b-fd99-41e1-8f05-3500fc645c5983d74ed8-3a6f-4a1f-851d-3602a91dbd3c</Object></Parameter><Parameter Type="Array"><Object ObjectPathId="0" /></Parameter><Parameter Type="Boolean">true</Parameter></Parameters></Method></TryScope><CatchScope Id="61" /></ExceptionHandlingScope></Actions><ObjectPaths><Constructor Id="0" TypeId="{80173281-fffd-47b6-9a49-312e06ff8428}" /><Property Id="8" ParentId="0" Name="Properties" /><Property Id="12" ParentId="0" Name="SelectProperties" /><Property Id="26" ParentId="0" Name="HitHighlightedProperties" /><Constructor Id="53" TypeId="{8d2ac302-db2f-46fe-9015-872b35f15098}" /></ObjectPaths></Request>""")))


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