<html>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js">	
</script>
<script type="text/javascript">
	$(document).ready(function (){
		
			var btn = $('#envio').val();
			$.post('ServeletControler',{

			}, function(respose){

			let datos = JSON.parse(respose);
			//console.log(datos);

			var tabladatos = document.getElementById('tablaDatos'); 
			for(let item of datos){

				tabladatos.innerHTML +=`
				<tr>
				<td>${item.id}</td>
				<td>${item.nombre}</td>
				<td>${item.apellido}</td>
				<td>${item.edad}</td>
				<td>${item.direccion}</td>
				<td>${item.dui}</td>
				<td>${item.nit}</td>
				<td>${item.grupoDeClaseProgramacion3Alquepertenece}</td>
				<td>${item.utimaNotaObtenidaEnProgramacion2}</td>
				<td>
				<a href="ServeletControler?btn=ELIMINAR&Id=${item.id}" class="btn btn-warning">ELIMINAR</a>
				<a href="funciones.jsp?idBus=${item.id}&Nom=${item.nombre}&Ape=${item.apellido}&Eda=${item.edad}&Dir=${item.direccion}&Dui=${item.dui}&Nit=${item.nit}&Gclas=${item.grupoDeClaseProgramacion3Alquepertenece}&Unota=${item.utimaNotaObtenidaEnProgramacion2}" class="btn btn-danger">ACTUALIZAR</a>
				</td>
				
				
				</tr>
				`
			}
        
		});
	});

</script>
<body>
<h2 align="center" class="text-secondary">DATOS DE LOS ESTUDIANTES</h2>


<a href="funciones.jsp" class="btn btn-warning">AGREGAR</a>

<table class="table table-dark" id="tablaDatos">
	
	<thead>
	    <th>ID</th>
	    <th>Nombre</th>
	    <th>Apellido</th>
	    <th>Edad</th>
	    <th>Direccion</th>
	    <th>Dui</th>
	    <th>Nit</th>
	    <th>grupoDeClaseProgramacion3Alquepertenece</th>
	    <th>ultimaNotaObtenidaEnProgramacion2</th>	
	    <th>Opciones</th>
	</thead>

	<tbody>
		
	</tbody>

</table>

</body>
</html>

