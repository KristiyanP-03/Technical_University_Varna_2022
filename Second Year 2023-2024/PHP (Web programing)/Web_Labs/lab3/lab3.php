<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Zad 1 ================================================================== -->
    <!-- <ul style="list-style-type: square;">
    <?php
        for ($x = 1; $x <= 10; $x++) {

            echo "<li>";
            echo "Х=$x <br>";
            echo "</li>";


            $cube = pow($x, 3);

            echo "<li style='list-style-type: circle; margin-left: 20px;'>";
            echo "Х^3=$cube <br>";
            echo "</li>";
        }
    ?>
    </ul> -->

    <!-- Zad 2 ================================================================== -->
    <!--
    <?php
        echo "abc ";
        $abc = 0;
        while ($abc < 8) {
            echo "abc ";
            $abc++;
        }
        echo "<br>";



        echo "xyz ";
        $xyz = 0;
        do {
            echo "xyz ";
            $xyz++;
        } while ($xyz < 8);
        echo "<br>";



        for ($number = 1; $number <= 9; $number++) {
            echo "&nbsp"."$number "."&nbsp";
        }



        echo "<ol>";
        $letters = ['A', 'B', 'C', 'D', 'E', 'F'];
        for ($m = 0; $m < count($letters); $m++) {
            echo "<li>Item $letters[$m]</li>";
        }
        echo "</ol>";
        ?>
        -->


        <!-- Zad 3 ================================================================== -->
        <!--
        <style>
        table {
            border-collapse: collapse;
        }
        td {
            border: 1px solid black;
            padding: 5px;
            text-align: center;
        }
        </style>
        <table>
        <?php
            for ($x = 1; $x <= 7; $x++){
                echo "<tr>";
                for ($y = 1; $y <= 7; $y++){
                    echo "<td>" . ($x * $y) . "</td>";
                }
                echo "</tr>";
            }
        ?>
        </table>
        -->
        <!-- Zad 4 ================================================================== -->
           
</body>
</html>
