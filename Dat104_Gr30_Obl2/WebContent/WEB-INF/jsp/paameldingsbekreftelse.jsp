<%@ page import="static no.hib.dat104.controller.UrlMappings.PAAMELDING_BEKREFTELSE_URL"%>
<%@ page import="static no.hib.dat104.controller.UrlMappings.DELTAGERLISTE_URL"%>
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P�meldingsbekreftelse</title>
</head>
<body>
<h2>P�meldingsbekreftelse</h2>
<form action="<%=PAAMELDING_BEKREFTELSE_URL %>" method="get">
  <fieldset>
<p>P�meldingen er mottatt for</p>
<p> ${deltager.fornavn}</p>
<p> ${deltager.etternavn}</p>
<p> ${deltager.mobil}</p>
<p> ${deltager.kjonn}</p>
<p><b>NB! Husk � betale til kassereren f�r festen!</b></p>
<a href="<%=DELTAGERLISTE_URL%>">G� til deltagerlisten</a>
</fieldset>
</form>
</body>
</html>