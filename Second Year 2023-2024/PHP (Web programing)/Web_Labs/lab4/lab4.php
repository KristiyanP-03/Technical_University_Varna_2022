<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Zad 1 ================================================================== -->
    <!--
    <?php
    $students_status = array(
        "Иван Иванов" => "4",
        "Драган Драганов" => "5.45",
        "Димо Петров" => "5.67",
    );

    echo "<ol>";
    foreach ($students_status as $student => $grade) { 
        echo "<li>";
        echo "Студент " . $student . " има успех: " . $grade;
        echo "</li>";
    }
    echo "</ol>";

    echo "<ul>";
    foreach ($students_status as $student => $grade) { 
        echo "<li>";
        echo "Студент " . $student . " има успех: " . $grade;
        echo "</li>";
    }
    echo "</ul>";
    ?>

    <table border="1">
    <thead>
        <tr>
            <th>Име, Фамилия</th>
            <th>Успех</th>
        </tr>
    </thead>
    <tbody>
        <?php 
            foreach ($students_status as $student => $grade) {
                echo "<tr>";
                echo "<td>" . $student . "</td>";
                echo "<td>" . $grade . "</td>";
                echo "</tr>";
            }
        ?>
        </tbody>
    </table>
        -->
    


    <!-- Zad 2 ================================================================== -->
    <?php
        $cities = array("Tokyo", "Mexico City", "New York City", "Mumbai", "Seoul", "Shanghai", "Lagos", "Buenos Aires", "Cairo", "London");

        echo implode(', ', $cities);

        sort($cities);

        echo "<ul>";
        foreach ($cities as $city) {
            echo "<li>$city</li>";
        }
        echo "</ul>";

        $new_cities = array("Los Angeles", "Calcutta", "Osaka", "Beijing");
        $cities = array_merge($cities, $new_cities);

        sort($cities);

        echo "<ol>";
        foreach ($cities as $city) {
            echo "<li>$city</li>";
        }
        echo "</ol>";


        echo "<table border='1'>";
        echo "<tr><th>Град</th></tr>";
        foreach ($cities as $city) {
            echo "<tr><td>$city</td></tr>";
        }
        echo "</table>";
?>
     






</body>
</html>