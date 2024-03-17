<!DOCTYPE html>
<html>
    <head>
        <title>Zad1</title>
    </head>
    <body>
        <?php
            $names = array(
                "Kristiyan", "Krasimirov", "Pisev",
                "Kristiyan", "Krasimirov", "Pisev",
                "Kristiyan", "Krasimirov", "Pisev"
            );

            echo count(array_unique($names)) . " unique elements among "
            . count($names) . " elements in the array found!";
        ?>
    </body>
</html>