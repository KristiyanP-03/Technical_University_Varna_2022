<!DOCTYPE html>
<html>
    <head>
        <title>Zad4</title>
        <style>
            form {
                margin-top: 100px;
                text-align: center;
            }
            input[type="text"] {
                text-align: center;
                padding: 10px;
                margin: 5px;
            }
            select, button {
                padding: 10px 20px;
                margin: 5px;
            }
            .result {
                text-align: center;
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <form method="post">
            <input type="text" name="num1" placeholder="--- first number ---">
            <br>
            <input type="text" name="num2" placeholder="--- second number ---">
            <br>
            <select name="operator">
                <option value="add">+</option>
                <option value="subtract">-</option>
                <option value="multiply">*</option>
                <option value="divide">/</option>
            </select>
            <button type="submit">Calculate</button>
        </form>

        <?php
            if(isset($_POST['num1'], $_POST['num2'], $_POST['operator'])) {
                $num1 = $_POST['num1'];
                $num2 = $_POST['num2'];
                $operator = $_POST['operator'];
                $result = '';

                switch($operator) {
                    case 'add':
                        $result = $num1 + $num2;
                        break;
                    case 'subtract':
                        $result = $num1 - $num2;
                        break;
                    case 'multiply':
                        $result = $num1 * $num2;
                        break;
                    case 'divide':
                        if($num2 != 0) {
                            $result = $num1 / $num2;
                        } else {
                            $result = "ERROR: You can not divide by zero !";
                        }
                        break;
                    default:
                        $result = "ERROR";
                }

                echo "<div class='result'>" . "$num1 " . " $operator " . " $num2" . " = $result" . "</div>";
            }
        ?>
    </body>
</html>