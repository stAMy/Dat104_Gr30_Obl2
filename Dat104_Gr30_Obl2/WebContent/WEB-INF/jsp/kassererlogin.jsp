<%@ page import="static no.hib.dat104.controller.UrlMappings.BETALINGSOVERSIKT_URL"%>
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kasserer login</title>
</head>
<body>
<h2>Kasserer login</h2>
<form action="<%=BETALINGSOVERSIKT_URL%>">
  <fieldset>
    <legend>Kasserer login</legend>
    <p>Passord: <input type="password" name="password" value="allstars" /></p>
    
    <p><input type="submit" value="Logg inn" /></p>
  </fieldset>
</form>

</body>
</html>