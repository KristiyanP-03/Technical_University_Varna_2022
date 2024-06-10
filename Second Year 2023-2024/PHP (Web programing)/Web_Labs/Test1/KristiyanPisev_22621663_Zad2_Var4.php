<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $students = array(
            "Student1" => 2.00,
            "Student2" => 5.50,
            "Student3" => 5.00,
            "Student4" => 4.50,
            "Student5" => 4.00,
        );

        foreach ($students as $name => $grade) {
            echo "$name има успех $grade<br>";
        }


        

        arsort($students);
        echo "<table border='1'><tr><th>Име</th><th>Успех</th></tr>";
        foreach ($students as $name => $grade) {
            echo "<tr><td>$name</td><td>$grade</td></tr>";
        }
        echo "</table>";

        


        $file = fopen("array.txt", "w") or die("No file.");

        foreach ($students as $name => $grade) {
            fwrite($file, "$name има успех $grade\n");
        }
        

        fclose($file);
    ?>
</body>
</html>