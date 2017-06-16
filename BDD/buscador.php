<?php
include ('config.php');
error_reporting(E_ERROR | E_WARNING | E_PARSE | E_NOTICE);
$sql = "SELECT * FROM usuarios";
$result = mysql_query($sql,$connect) or die(mysql_error());


if ($row = mysql_fetch_array($result)) {

	echo "Resultados";


	do {
			?>
			<br>
			<br>
			(Nombre: <?php echo $row['Usuario']; ?> - <?php echo $row['DireccionAlternativa']; ?> - <?php echo $row['Direccion']; ?>

			<?php
	}
	while ($row = mysql_fetch_array($result));
}
else {
	echo "No se encontraron resultados";
}
?>