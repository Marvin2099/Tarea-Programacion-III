<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String idBus= request.getParameter("idBus");
String Nombre= request.getParameter("Nom");
String Apellido= request.getParameter("Ape");
String Edad= request.getParameter("Eda");
String Direccion= request.getParameter("Dir");
String Dui= request.getParameter("Dui");
String Nit= request.getParameter("Nit");
String GrupoClas= request.getParameter("Gclas");
String UltimaNota= request.getParameter("Unota");

if(idBus==null){
	idBus="";
	Nombre="";
	Apellido="";
	Edad="";
	Direccion="";
	Dui="";
	Nit="";
	GrupoClas="";
	UltimaNota="";
		
}

%>
<body>
<form action="ServeletControler">
<table align="center">
	<thead>
	</thead>
	<tbody>
		<tr>
			<td>
		        	<p>Id</p><input type="text" name="Id" id="Idcarga" value="<%=idBus%>">
					<p>Nombre</p><input type="text" name="Nombre" id="Nom" value="<%=Nombre%>">
					<p>Apellido</p><input type="text" name="Apellido" id="Ape" value="<%=Apellido%>">
					<p>Edad</p><input type="text" name="Edad" id="Eda" value="<%=Edad%>">
					<p>Direccion</p><input type="text" name="Direccion" id="Dir" value="<%=Direccion%>">
					<p>Dui</p><input type="text" name="Dui" id="Du" value="<%=Dui%>">
					<p>Nit</p><input type="text" name="Nit" id="Ni" value="<%=Nit%>">
					<p>Grupo Clase</p><input type="text" name="grupoDeClaseProgramacion3Alquepertenece" id="Gclas" value="<%=GrupoClas%>">
					<p>Ultima Nota Programacion2</p><input type="text" name="ultimaNotaObtenidaEnProgramacion2" id="Unota" value="<%=UltimaNota%>">
					<br>
					<br>		
			</td>
		</tr>
	</tbody>
	
</table>

<input type="submit" class="btn btn-info" value="GUARDAR" name="btn">
<input type="submit" class="btn btn-info" value="ACTUALIZAR" name="btn">
</form>
</body>
</html>