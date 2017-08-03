<?php
try{
	$db=new PDO ('mysql:host=localhost;dbname=lmp;charset=utf8mb4','root','albi');
	$db->setAttribute(PDO::ATTR_ERRMODE, PDO:: ERRMODE_EXCEPTION);
}catch(PDOexception $e){
	echo 'ERROR';
}
