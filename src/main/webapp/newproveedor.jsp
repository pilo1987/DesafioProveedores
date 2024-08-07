<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear Nuevo Proveedor</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
</head>
<div class="container mt-5">
	<div class="text-center mb-4">
		<h1 class="display-4">Formulario de Nuevo Proveedor</h1>
	</div>
	<hr>
	<form action="ProveedorController" method="POST">
		<div class="row g-3">
			<div class="col-md-6">
				<label for="nombre" class="form-label">Nombre</label> <input
					type="text" class="form-control" id="nombre" name="nombre"
					required placeholder="Pasteleria Filomeno">
			</div>
			<div class="col-md-6">
				<label for="rut" class="form-label">Rut</label> <input type="text"
					class="form-control" id="rut" name="rut" required placeholder="78.824.424-K">
			</div>
			<div class="col-md-12">
				<label for="direccion" class="form-label">Direccion</label> <input
					type="text" class="form-control" id="direccion" name="direccion"
					required placeholder="1234 Main Street">
			</div>
			<div class="col-md-6">
				<label for="correo" class="form-label">Correo Electronico</label> <input
					type="text" class="form-control" id="correo" name="correo"
					required placeholder="@gmail.com">
			</div>
			<div class="col-md-6">
				<label for="telefono" class="form-label">Telefono</label> <input
					type="text" class="form-control" id="telefono" name="telefono"
					required placeholder="(2) 1234 5678">
			</div>
			<div class="col-md-6">
				<label for="contacto" class="form-label">Contacto</label> <input
					type="text" class="form-control" id="contacto" name="contacto" required placeholder="Ej: Nadya Aranibar">
			</div>
			<div class="col-md-6">
				<label for="telefono_contacto" class="form-label">Teléfono
					Contacto:</label><input type="text" class="form-control" id="telefono_contacto"
					name="telefono_contacto" required placeholder="(56) 9 743 75 129">
			</div>
			<div class="row">
				<div class="col pt-4">
					<button type="submit" class="btn btn-primary">Crear
						Proveedor</button>
				</div>
			</div>
		</div>
	</form>
</div>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
	integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
	crossorigin="anonymous"></script>

</body>
</html>
