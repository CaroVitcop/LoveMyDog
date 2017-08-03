<?php
require_once('config.php');
$statment=$db->prepare("SELECT * FROM usuarios");
$statment->execute();
$results=$statment->fetchAll(PDO::FETCH_ASSOC);
$json=json_encode($results);
echo $json;
	
?>