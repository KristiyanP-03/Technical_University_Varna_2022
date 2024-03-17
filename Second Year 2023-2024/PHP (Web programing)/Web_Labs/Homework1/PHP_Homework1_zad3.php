<!DOCTYPE html>
<html>
    <head>
        <title>Zad3</title>
        <style>
            form {
                text-align: center;
                font-size: 24px;
                margin: 100px;
            }
            input[type="text"],
            input[type="submit"] {
                text-align: center;
                font-size: 24px;
                padding: 10px;
                margin: 5px;
            }
            .output {
                text-align: center;
                font-size: 50px;
                margin: 100px;
                margin-top: -70px;
            }
        </style>
    </head>
    <body>
        <form method="post">
            <input type="text" name="text" placeholder="--- Your string/int here ---">
            <br>
            <input type="submit" value="Check if your input is palindrome?">
        </form>

        <?php
            if(isset($_POST['text'])) {

                $text = $_POST['text'];
                $lowered_text = strtolower($text);
                $reversed_text = strrev($lowered_text);


                if ($text == "") {
                    echo "<i>ERROR: Няма въведен input !!!</i>";
                }
                else if($lowered_text == $reversed_text) {
                    echo "<div class='output'>$text е палиндром!</div>";
                }
                else {
                    echo "<div class='output'>НЕ! $text НЕ е палиндром!</div>";
                }
            }
        ?>
    </body>
</html>
