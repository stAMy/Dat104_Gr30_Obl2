<%@ page import="static no.hib.dat104.controller.UrlMappings.PAAMELDINGSSKJEMA_URL"%>
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Påmelding</title>
</head>
<body>
<h2>Påmelding</h2>
<form action="<%=PAAMELDINGSSKJEMA_URL %>" method="post">
  <fieldset>
    <legend>Personlige data</legend>
    <p>Fornavn: <input type="text" name="fornavn" value="${deltager.fornavn}"/><font color="red">${deltager.fornavnFeilmelding}</font></p>
    <p>Etternavn: <input type="text" name="etternavn"  value="${deltager.etternavn}" /><font color="red">${deltager.etternavnFeilmelding}</font></p>
    <p>Mobil (8 siffer): <input type="text" name="mobil" value="${deltager.mobil}" /><font color="red">${deltager.mobilFeilmelding}</font></p>
    <p>Kjønn: <input type="radio" name="kjonn" value="mann"/>mann
        <input type="radio" name="kjonn" value="kvinne" />kvinne</p>
    <p><input type="submit" value="Meld meg på" /></p>
  </fieldset>
</form>
</body>
</html>