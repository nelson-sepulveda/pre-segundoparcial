<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Empleado</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
   <body>

	<div class="container">
		<div class="row">
		<form action="servletRegisterEmplead" method="post">
			<div class="form-group">
				<div class="col">
					<label>Nombre</label>
					<input required type="text" class="form-control" name="nombreempleado" placeholder="Nombre Empleado" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
				</div>
				<div class="col">
					<label>Codigo</label>
					<input required type="number" class="form-control" name="codigoempleado" placeholder="Codigo Empleado" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
				</div>
				<div class="col">
					<label>Cedula</label>
					<input required type="date" class="form-control" name="cedulaempleado" placeholder="Cedula Empleado" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
				</div>
				<div class="col">
					<label>Fecha Nacimiento</label>
					<input required type="date" class="form-control" name="fechanacimiento" placeholder="Fecha Nacimiento" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
				</div>
				<div class="col">
					<label>Fecha Ingreso</label>
					<input required type="date" class="form-control" name="fechaingreso" placeholder="Fecha Ingreso" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
				</div>
				<div class="col">
					<label>Fecha Retiro</label>
					<input required type="date" class="form-control" name="fecharetiro" placeholder="Fecha Retiro" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
				</div>
				<div class="col">
					<label></label><br>
					<button type="submit" class="btn btn-primary">Registrar Empleado!</button>
				</div>
			</div>
		</form>
	 </div>		
	</div>
	
   </body>
   <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script> 
</html>    