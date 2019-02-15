//document.get+element+byid("xxxxxx") ----> var [v_bnt_play=]
//listeners= escuchar ---> eventos ---> load - click- mouse over
//v_btn_play.addEventListener("click",reproducir-->algoritmos)



var v_btn_play, v_videoPpal, v_barra_video, v_progreso_video,v_btn_vol_max, v_btn_vol_mute, v_barra_vol, v_progreso_vol;
var max_barra_video = 235, v_tiempo, v_img_vol, v_full_screen;
var max_barra_vol = 63;
var mouseXVol;

function iniciar(){
	v_btn_play = document.getElementById("btn_play"); // camel case--> 
	v_videoPpal = document.getElementById("videoPpal");
	v_barra_video = document.getElementById("barra_video");
	v_progreso_video = document.getElementById("progreso_video");
	v_progreso_vol = document.getElementById("progreso_vol");
	v_barra_vol = document.getElementById("barra_vol");
	
	v_tiempo = document.getElementById("tiempo");
	v_btn_vol_max = document.getElementById("btn_vol_max");
	v_btn_vol_mute = document.getElementById("btn_vol_min");
	v_barra_vol = document.getElementById("barra_vol");
	v_img_vol = document.getElementById("img_vol");
	v_full_screen= document.getElementById("full_screen");

	//Adicional listeners a los objetos 
	v_barra_video.addEventListener("click",eventoBarra,false);
	v_btn_play.addEventListener("click", eventoPlay, false);
	v_img_vol.addEventListener("click", cambiaVolumen, false);
	v_barra_vol.addEventListener("click", eventoBarraVol, false);
	v_tiempo.innerHTML = formatoTiempo(v_videoPpal.currentTime); //cambiamos el formato y trae los ceros
	v_full_screen.addEventListener("click", cambiarPantalla, false);
	estadoBarraVol();


}
function cambiarPantalla(){
	v_videoPpal.webkitEnterFullScreen();
}

function estadoBarraVol(){
	var totalVol = parseInt(videoPpal.volume * max_barra_vol);
	v_progreso_vol.style.width = totalVol + "px";
	if(this.mouseXVol == null)
		this.mouseXVol = totalVol;

}

function eventoBarraVol(posicion){
	mouseXVol = posicion.pageX - getPosx(v_barra_vol);
	var nuevoVol = mouseXVol / max_barra_vol;
	v_videoPpal.volume = nuevoVol;
	v_progreso_vol.style.width = mouseXVol + "px";
	if(v_videoPpal.muted){
		v_img_vol.setAttribute("src", "videos/controles/vol_max.jpg");
		v_videoPpal.muted = false;
	}
}
 
function cambiaVolumen(){
	if(videoPpal.muted){
		videoPpal.muted = false;
		v_img_vol.setAttribute("src", "videos/controles/vol_max.jpg");
		estadoBarraVol();
		v_progreso_vol.style.width = this.mouseXVol + "px";
	}else{
		v_videoPpal.muted = true;
		v_img_vol.setAttribute("src", "videos/controles/vol_min.jpg");
        v_progreso_vol.style.width = "0px";
	}


}

function eventoPlay(){
	//validar estado del video
	if(v_videoPpal.paused === false && v_videoPpal.ended === false){
		v_videoPpal.pause();
		v_btn_play.setAttribute("src", "videos/controles/play.jpg");
	} else{
		v_videoPpal.play();
		v_btn_play.setAttribute("src", "videos/controles/pause.jpg");
		ciclo = setInterval(estadoBarra, 50);
	}
}

function estadoBarra(){
	if (v_videoPpal.ended === false) {
		var estadoActual = v_videoPpal.currentTime * max_barra_video / v_videoPpal.duration;
		v_progreso_video.style.width = estadoActual + "px"; 
		v_tiempo.innerHTML = formatoTiempo(v_videoPpal.currentTime);
		
	}

}
//para calcular los segundos
function formatoTiempo(segundos){
	min = Math.floor(segundos / 60); // traemos los minutos
	min = (min >= 10) ? min : "0" + min;
	seg = Math.floor(segundos % 60); //Con % traemos el residuo de la division que son los segundos
	seg = (seg >= 10) ? seg : "0" + seg;
	return min + ":" + seg;
}

//funcion para cambiar imagen de menu
function cambiarImagen(nuevaImagen, etiqueta){
    etiqueta.setAttribute("src", nuevaImagen);
}

	//function getposx obtener la distancia del borde de la pagina hasta el barra video

function getPosx (e){
	for (var lx= 0; e!=null;
		lx += e.offsetLeft, e = e.offsetParent);
		return lx;
}

function eventoBarra(posicion){
	var distX=posicion.pageX-getPosx(v_barra_video);
	var nuevoTiempo = distX * v_videoPpal.duration / max_barra_video;
	v_videoPpal.currentTime=nuevoTiempo;
	v_progreso_video.style.width = distX+"px"; 

}
/////////////////////////
function eventoBarraVolumen(posicion){
	var distX=posicion.pageX-getPosx(v_barra_vol_max);
	var nuevoVolumen = distX * 1 / max_volumen;
	v_videoPpal.volume=nuevoVolumen;
	v_progreso_video.style.width = distX+"px"; 

}





window.addEventListener("load", iniciar, false);