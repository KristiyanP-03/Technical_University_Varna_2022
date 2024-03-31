<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $baseVariable = 8;
        echo "x=8" . "<br>";

        $baseVariable += 2;
        echo "Add 2. " . $baseVariable . "<br>";

        $baseVariable -= 4;
        echo "Substract 4. " . $baseVariable . "<br>";

        $baseVariable *= 5;
        echo "Multiply by 5. " . $baseVariable . "<br>";

        $baseVariable /= 3;
        echo "Devide by 3. " . $baseVariable . "<br>";

        $baseVariable++;
        echo "Increment by 1. " . $baseVariable . "<br>";

        $baseVariable--;
        echo "Decrement by 1. " . $baseVariable . "<br>";
    ?>
</body>
</html>