<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
$servername = "localhost";
$username = "username";
$password = "password";
$dbname = "info_books";

// Създаване на връзка с базата данни
$conn = new mysqli($servername, $username, $password, $dbname);

// Проверка за връзка
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
?>

</body>
</html>