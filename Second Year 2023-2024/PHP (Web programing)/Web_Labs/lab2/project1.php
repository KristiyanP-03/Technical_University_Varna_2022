<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form method="GET" name="myForm">
        <label>Please enter your age</label><br>
        <input type="text" name="age"><br><br>
        <label>Please enter the price</label><br>
        <input type="number" name="price">
        <input type="submit" value="Go">
    </form>

    <?php
        $price = $_GET['price'];
        $age = $_GET['age'];

        if ($age <= 6 || $age >= 65)
            $price = $price / 2;
            
        echo "You are $age old", "<br>". "The price is $price";
    ?>

</body>
</html>