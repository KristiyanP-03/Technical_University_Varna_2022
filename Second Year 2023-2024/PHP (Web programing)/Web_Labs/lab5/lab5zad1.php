<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <style>
        p {
            margin-bottom: 10px;
        }
    </style>
    <form method="post">
        <p><h3>Лице на правоъгълник</h3></p>
        Въведете дължина i и шири
        <input type="text" name="num1" placeholder="--- first number ---">
        <input type="text" name="num2" placeholder="--- second number ---">
        <button type="submit" name="calculate">Calculate</button>
    </form>

    <?php
    if(isset($_POST['num1'], $_POST['num2'])) {
        $l = $_POST['num1'];
        $w = $_POST['num2'];

        function recArea($l, $w){
            $area = $l * $w;
            return $area;
        }

        echo "Area: " . recArea($l, $w);
    
    }
    ?>
</body>
</html>
