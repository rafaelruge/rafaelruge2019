function validar() {
	var nombre,apellido;

	user = document.getElementById("usuario").value;
	password = document.getElementById("password").value;


	if (user === "") {
		alert("No ha ingresado usuario");
		return false;
	}
	else if (password ==="") {
		alert("No ha ingresado contraseña");
		return false;
	}
	else if (user.length>15) {
		alert("El usuario es muy largo");
		return false;
	}
	else if (user.length<2) {
		alert("El usuario es muy corto");
		return false;
	}
	else if (password.length>15) {
		alert("El password es muy largo");
		return false;
	}
	else if (password.length<2) {
		alert("El Password es muy corto");
		return false;
	}
}