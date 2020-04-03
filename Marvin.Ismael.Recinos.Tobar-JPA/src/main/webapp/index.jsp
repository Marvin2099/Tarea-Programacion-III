<html>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<body>
<h2 align="center" class="text-secondary">DATOS DE LOS ESTUDIANTES</h2>
<form action="ServeletControler" method="post">
<table align="center">
	<thead>
	</thead>
	<tbody>
		<tr>
			<td>
		        	<p>Id</p><input type="text" name="Id">
					<p>Nombre</p><input type="text" name="Nombre">
					<p>Apellido</p><input type="text" name="Apellido">
					<p>Edad</p><input type="text" name="Edad">
					<p>Direccion</p><input type="text" name="Direccion">
					<p>Dui</p><input type="text" name="Dui">
					<p>Nit</p><input type="text" name="Nit">
					<p>Grupo Clase</p><input type="text" name="grupoDeClaseProgramacion3Alquepertenece">
					<p>Ultima Nota Programacion2</p><input type="text" name="ultimaNotaObtenidaEnProgramacion2">
					<br>
					<br>		
			</td>
		</tr>
	</tbody>
	
</table>
<input type="submit" name="btn" value="AGREGAR" class="btn btn-warning">
<input type="submit" name="btn" value="ELIMINAR" class="btn btn-success">
<input type="submit" name="btn" value="MODIFICAR" class="btn btn-secondary">
</body>
</html>
