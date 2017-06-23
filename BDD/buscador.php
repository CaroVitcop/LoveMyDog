<?php
require_once('config.php');
$statment=$db->prepare("SELECT * FROM usuarios");
$statment->execute();
$results=$statment->fetchAll(PDO::FETCH_ASSOC);
$json=json_encode($results);
echo $json;
/*include ('config.php');
error_reporting(E_ERROR | E_WARNING | E_PARSE | E_NOTICE);
$sql = "SELECT * FROM usuarios";
$result = mysql_query($sql,$connect) or die(mysql_error());


$arr = array('a' => "Usuario", 'b' => 2, 'c' => 3, 'd' => 4, 'e' => 5);


	echo "Resultados :";

	$json = "";
	 while($r = mysql_fetch_assoc($result)) {

	 	echo 
	 	
	 	$usuario = $r["Usuario"];
	 	$password = $r["Password"];
		$direccion = $r["Direccion"];
		$direccionalternativa = $r["DireccionAlternativa"];
		$nombreperro = $r["NombrePerro"];
		$pesoperro = $r["PesoPerro"];
		$razaperro = $r["RazaPerro"];
		$nombrefamiliar = $r["NombreFamiliar"];
		$celular = $r["Celular"];
		$nombrefamiliar2 = $r["NombreFamiliar2"];
		$celular2 = $r["Celular2"];
		$nombrefamiliar3 = $r["NombreFamiliar3"];
		$celular3 = $r["Celular3"];
	     //$rows['Usuario'][] = $r;
		 
	     $json = $json . "{'usuario:'" . $usuario .  "'}";
		 $json = $json . "{'password:'" . $password .  "'}";
		 $json = $json . "{'direccion:'" . $direccion .  "'}";
		 $json = $json . "{'direccionalternativa:'" . $direccionalternativa.  "'}";
		 $json = $json . "{'nombreperro:'" . $nombreperro .  "'}";
		 $json = $json . "{'pesoperro:'" . $pesoperro .  "'}";
		 $json = $json . "{'razaperro:'" . $razaperro .  "'}";
		 $json = $json . "{'nombrefamiliar:'" . $nombrefamiliar .  "'}";
		 $json = $json . "{'celular:'" . $celular .  "'}";
		 $json = $json . "{'nombrefamiliar2:'" . $nombrefamiliar2 .  "'}";
		 $json = $json . "{'celular2:'" . $celular2 .  "'}";
		 $json = $json . "{'nombrefamiliar3:'" . $nombrefamiliar3.  "'}";
		 $json = $json . "{'celular3:'" . $celular3 .  "'}";

	   }

	   echo $json;
*/
	
?>