function validarForma(Forma){
    //validamos el usuario
    var usuario = forma.usuario;
    if (usuario.value == "" || usuario.value == "Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    //Validamos el password
    var password =forma.password;
    if (password.value == "" || password.value.length < 3){
        alert("Debe proporcionar el password almenos 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    //Validamos tecnologias de interes
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    //Revisamos si selecciono algun checkbox
    for(i = 0; i < tecnologias.length; i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    if(!checkSeleccionado){
        alert("Debe proporcionar una tecnologia");
        return false;
    }
    
    //Validamos el genero
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    //Revisamos si seleccionamos algun radiobutton
    for (i = 0; i < generos.length; i++){
        if(generos[i].cheked){
            radioSeleccionado = true;
        }
    }
    if(!radioSeleccionado){
        alert("Debe seleccionar el Genero");
        return false;
    }
    
    //Validamos la ocupacion
    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    
    //Formulario valido
    alert("Formulario valido, Enviando Datos....");
}


