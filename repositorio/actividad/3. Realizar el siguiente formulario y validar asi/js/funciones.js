

//alert("llamado archivo js exitoso");

function validacion(){

	var nom = document.getElementById("nombres").value;
	var ape = document.getElementById("apellidos").value;
	var email = document.getElementById("email").value;

	if (nom == ""){
		alert("ingrese los nombres.");
		return false;
	}
	if (ape == ""){
		alert("ingrese los apellidos.");
		return false;
	}
	if (email == ""){
		alert("ingrese su correo.");
		return false;
	}
	
}