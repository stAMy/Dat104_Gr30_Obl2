<%@ page import="static no.hib.dat104.controller.UrlMappings.DELTAGERLISTE_URL"%>
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logg inn</title>
</head>
<body>
<h2>Logg inn</h2>
<p>Det er kun registrerte deltagere som f�r se deltagerlisten.
Logg inn ved � gi mobil-nummeret ditt.</p>
<form action="<%=DELTAGERLISTE_URL%>">
  <fieldset>
    <legend>Logg inn</legend>
    <p>Mobil: <input type="password" name="mobil" value="90123456" /></p>
    <p><input type="submit" value="Logg inn" /></p>
  </fieldset>
</form>

</body>
</html>