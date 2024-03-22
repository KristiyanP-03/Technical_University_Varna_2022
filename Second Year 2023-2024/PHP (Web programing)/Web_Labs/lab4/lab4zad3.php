<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Prognoza za vremeto</title>
</head>
<body>
    <form method="post">
        <label for="city">Град:</label>
        <input type="text" id="city" name="city"><br>
        <label for="month">Месец:</label>
        <input type="text" id="month" name="month"><br>
        <label for="year">Година:</label>
        <input type="text" id="year" name="year"><br>
 
        <label>Време:</label><br>
        <input type="checkbox" name="weather[]" value="rain">Дъжд<br>
        <input type="checkbox" name="weather[]" value="sunshine">Слънце<br>
        <input type="checkbox" name="weather[]" value="clouds">Облачно<br>
        <input type="checkbox" name="weather[]" value="hail">Градушка<br>
        <input type="checkbox" name="weather[]" value="sleet">Леден дъжд<br>
        <input type="checkbox" name="weather[]" value="snow">Сняг<br>
        <input type="checkbox" name="weather[]" value="wind">Вятър<br>
        <input type="submit" value="Submit">
    </form>
    <?php
        if (isset($_POST['city'], $_POST['month'], $_POST['year'])) {
            $city = $_POST['city'];
            $month = $_POST['month'];
            $year = $_POST['year'];

            echo "В $city през месец $month $year, забелязахте следното време:<br>";
            
            echo "<ul>";
            if(isset($_POST['weather'])) {
                foreach ($_POST['weather'] as $option) {
                    echo "<li>$option</li>";
                }
            }
            echo "</ul>";
        }
    ?>
</body>
</html>
