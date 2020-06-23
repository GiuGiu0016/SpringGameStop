<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<title>GameStop</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<!-- Header -->
<header class="w3-display-container w3-content w3-center" style="max-width:1500px">
  <img class="w3-image" src="https://sm.ign.com/t/ign_it/screenshot/default/gamestop-logo-14070_atrr.1280.jpg" alt="Me" width="1500" height="600">

  <!-- Navbar (placed at the bottom of the header image) -->
  <div class="w3-bar w3-light-gray w3-round w3-display-bottommiddle w3-hide-small" style="bottom:-16px">
    <a href="new" class="w3-bar-item w3-button" style="font-style: italic; font-weight: bold;">Aggiugi VideoGame</a>
  </div>
 <style type="text/css">
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: red;
  color: white;
}
</style>
</header>

<!-- Page content -->
<div class="w3-content w3-padding-large w3-margin-top">
<form method="get" action="search">
<label style="font-weight: bold;font-style: italic; font-size: 30px; margin-left: 40%;">Videogiochi</label><input style="margin-left: 50px;" type="text" name="keyword" placeholder="Parola chiave"/><input type="submit" value="Search" />
</form>
		<table border="1" style="margin-top: 20px;">
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>PREZZO</th>
				<th>PEGI</th>
				<th>CATEGORIA</th>
				<th>Modifica</th>
				<th>Rimuovi</th>
			</tr>
			<c:forEach items="${listaVideogiochi}" var="videogioco">
				<tr>
					<td>${videogioco.id}</td>
					<td>${videogioco.titolo}</td>
					<td>${videogioco.prezzo}</td>
					<td>${videogioco.pegi}</td>
					<td>${videogioco.categoria}</td>
					<td><a href="edit?id=${videogioco.id}">Modifica</a></td> 
					<td><a href="delete?id=${videogioco.id}">Rimuovi</a></td>
				</tr>
			</c:forEach>
		</table>
</div>

</body>
</html>

