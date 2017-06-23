<?php
try{
	$db=new PDO ('mysql:host=localhost;dbname=lovemypet;charset=utf8mb4','root','root');
	$db->setAttribute(PDO::ATTR_ERRMODE, PDO:: ERRMODE_EXCEPTION);
}catch(PDOexception $e){
	echo 'ERROR';
}
/*$host = "localhost"; 	//TU HOST//
$dbuser = "root";	 	//TU USUARIO DEL HOST//
$dbpwd = "root";	//TU CONTRASEÑA//
$db = "mysql";		//TU BASE DE DATOS//
error_reporting(E_ERROR | E_WARNING | E_PARSE | E_NOTICE);

$connect = mysql_connect ($host, $dbuser, $dbpwd) or die(mysql_error());
$select = mysql_select_db($db) or die(mysql_error());
$result = mysql_query("SELECT * FROM ", $connect);
*/?>