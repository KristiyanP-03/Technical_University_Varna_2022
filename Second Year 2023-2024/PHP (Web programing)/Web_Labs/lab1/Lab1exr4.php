<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<form method="get">
        <label for="name">Please enter your name:</label> <br>
        <input type="text" id="name" name="name">
        <input type="submit" value="GO">
</form>
<?php
    if(isset($_GET["name"])){
        $name = $_GET["name"];

        echo "Your name is " . $name;
    }
?>
    
</body>
</html>