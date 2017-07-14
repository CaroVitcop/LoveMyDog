<?php
require_once('config.php');

$usuario = $_POST['Usuario'];
$pass = $_POST['Password'];

if($_POST){
$statment=$db->prepare("SELECT Usuario,Password FROM Usuarios WHERE Usuario=? AND Password=?");
$statment->execute([$usuario, $pass]);

$results=$statment->fetchAll(PDO::FETCH_ASSOC);
$json=json_encode($results);

echo $json;
}
