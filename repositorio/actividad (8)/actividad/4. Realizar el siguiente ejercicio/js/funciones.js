body
{
	function alerta(){
	alert("Desea salir de esta pagina web");
	var go = document.getElementById("google").value;
	var ac = document.getElementById("acade").value;


		if (go == ""){
		alert("saldra a google");
		
	}

	if (ac == ""){
		alert("saldra a google academico");
		return false;
	}
}