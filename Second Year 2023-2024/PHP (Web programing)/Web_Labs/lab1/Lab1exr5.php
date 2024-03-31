<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    Моля, въведете следната информация!
    <form action="" method="post">
        <label for="name">Вашето име: </label>
        <input type="text" name="name">
        <label for="age">Възраст: </label>
        <input type="text" name="age"> <br>
        <input type="submit" value="Изпрати">
    </form>
    <?php
        if(isset($_POST["name"], $_POST["age"])){
            $name = $_POST["name"];
            $age = $_POST["age"];

            echo "Здравейте, " . $name . "!" . "<br>";
            echo "Вие сте на " . $age . " години.";
        }
    ?>
</body>
</html>