<%@ page import="static no.hib.dat104.controller.UrlMappings.FERDIG_URL"%>
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deltagerliste</title>
</head>
<body>
<h2>Deltagerliste</h2>
	<table border="1">
		<tr bgcolor="#cccccc">
			<th>Kjønn</th><th align="left">Navn</th></tr>
			<c:forEach var ="d" items ="${deltagere}">
				<c:if test="${innloggedDeltager ne d }">
				
				${d.kjonn ? "<tr bgcolor ="#aaffaa>" :  "<tr bgcolor='#ffaaaa'>"}
			</c:if>
			   </c:if>
        <c:if test="${innloggedDeltager ne d}">
            <tr>
        </c:if>
        <td align="center">${d.kjonnsymbol}</td>
        <td>${d.fulltNavn}</td>
    </c:forEach>
		
</table>
<p><a href="<%= FERDIG_URL %>">Ferdig</a></p>
</body>
</html>


<%--
Det som står over er ikke riktig kodet, men det er slik vi må gjøre det med andre attributter.
		<tr>
		<tr><td align="center">&#9794;</td><td>Arne And</td></tr>
		<tr bgcolor="#ffaaaa"><td align="center">&#9794;</td><td>Arne Arnesen</td></tr>
<!-- <tr bgcolor="#aaffaa"><td align="center">&#9794;</td><td>Arne Arnesen</td></tr> -->
<tr><td align="center">&#9792;</td><td>Berit Beritsen</td></tr>


--%>