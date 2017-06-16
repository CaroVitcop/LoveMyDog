<?php
$host = "localhost"; 	//TU HOST//
$dbuser = "root";	 	//TU USUARIO DEL HOST//
$dbpwd = "root";	//TU CONTRASEÑA//
$db = "lovemypet";		//TU BASE DE DATOS//
error_reporting(E_ERROR | E_WARNING | E_PARSE | E_NOTICE);

$connect = mysql_connect ($host, $dbuser, $dbpwd) or die(mysql_error());
$select = mysql_select_db($db) or die(mysql_error());
$result = mysql_query("SELECT * FROM ", $connect);
?>