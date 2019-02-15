<!DOCTYPE html>
<html>
<head>
	<title>Tienda Ropa</title>
</head>
<body>
	Un negocio de ropa vendio los siguientes articulos:<br>

<?php
$valorjean=150000;
$valorCamisetasRoja=80000;
$valorCamisetasAzules=90000;
$valorMed=5000;
$ventaJeans=6*$valorjean;
$ventaCaRojas=8*$valorCamisetasRoja;
$VentaCaAzul=4*$valorCamisetasAzules;
$ventaMedias=9*$valorMed;
$Iva=0.19;
$total=$ventaJeans+$ventaCaRojas+$VentaCaAzul+$ventaMedias;
$totalGeneral=$Iva*$total;
$valorconIva=$total+$totalGeneral;

echo "6 Jeans a $150000 cada uno <br> El valor fue: ".$ventaJeans;
echo "<br>";
echo "8 Camisetas rojas a $80000 cada una <br> El Valor fue: ".$ventaCaRojas;
echo "<br>";
echo "4 Camisetas azules a $90000 cada una <br> El valor fue: ".$VentaCaAzul;
echo "<br>";
echo "9 Pares de medias a $5000 cada par <br> El valor fue: ".$ventaMedias;
echo "<br>";
echo "el iva de la compra es : ".$totalGeneral;
echo "<br>";
echo "El valor de total de la venta sin iva es: ".$total;
echo "<br>";
echo "La venta total es: ".$valorconIva;



?>
</body>
</html>