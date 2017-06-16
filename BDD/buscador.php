<?php
include ('config.php');
error_reporting(E_ERROR | E_WARNING | E_PARSE | E_NOTICE);
$sql = "SELECT * FROM usuarios";
$result = mysql_query($sql,$connect) or die(mysql_error());



	echo "Resultados 1";

	$json = "";
	 while($r = mysql_fetch_assoc($result)) {
	 	
	 	$usuario = $r["Usuario"];
	 	$direccion = $r["Direccion"];
	     //$rows['Usuario'][] = $r;
	     $json = $json . "{'usuario:'" . $usuario .  "'}";

	   }

	   echo $json;

	
?>