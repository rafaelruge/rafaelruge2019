//alert("llamado archivo js exitoso");

function validacion(){

	var UserName = document.getElementById("userName").value;
	var Password = document.getElementById("password").value;
	

	if (UserName == ""){
		alert("ingrese el User Name.");
		return false;
	}
	if (Password == ""){
		alert("ingrese  su Password.");
		return false;
	}
	
}