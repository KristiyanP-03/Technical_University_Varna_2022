<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<form action="" method="post">
            Mагазин:<br>
            <input type="radio" name="chain" value="Верига магазин А"> Верига магазин A<br>
            <input type="radio" name="chain" value="Верига магазин Б"> Верига магазин B<br>
            <input type="radio" name="chain" value="Верига магазин С"> Верига магазин C<br>

            <br>

            Адреси:<br>
            <input type="checkbox" name="address[]" value="Варна">Варна<br>
            <input type="checkbox" name="address[]" value="София">София<br>
            <input type="checkbox" name="address[]" value="Пловдив">Пловдив<br>

            <br>

            Купувач:<br>
            Име:<input type="text" name="name"><br>
            Фамилия:<input type="text" name="surname"><br>
            Булстат:<input type="text" name="bulstat"><br>

            <br>

            Въведете брой за избраните артикули:<br>
            <input type="text" name="item1_quantity">Артикул от 1 лев<br>
            <input type="text" name="item2_quantity"> Артикул от 2 лева<br>
            <input type="text" name="item3_quantity">Артикул от 3 лева<br>
            <input type="text" name="item4_quantity">Артикул от 4 лева<br>


        <input type="submit" value="Запис">
        <input type="reset" value="Отказ">
    </form>
    <?php

        if (isset($_POST['chain'], $_POST['address'], $_POST['name'], $_POST['surname'], $_POST['bulstat'], $_POST['item1_quantity'],
         $_POST['item2_quantity'], $_POST['item3_quantity'], $_POST['item4_quantity'])) {

            $chain = $_POST['chain'];
            $address = $_POST['address'];
            $name = $_POST['name'];
            $surname = $_POST['surname'];
            $bulstat = $_POST['bulstat'];
            $item1_quantity = $_POST['item1_quantity'];
            $item2_quantity = $_POST['item2_quantity'];
            $item3_quantity = $_POST['item3_quantity'];
            $item4_quantity = $_POST['item4_quantity'];

            $total_count = $item1_quantity +
                    $item2_quantity +
                    $item3_quantity +
                    $item4_quantity;
            
            $total_price = $item1_quantity * 1 +
                    $item2_quantity * 2 +
                    $item3_quantity * 3 +
                    $item4_quantity * 4;



            $file = fopen("order.txt", "w") or die("No file.");

            fwrite($file, "Клиент " . $name . " " . $surname . "с булстат " . $bulstat . PHP_EOL);
            fwrite($file, "е поръчал от " . $chain);
            fwrite($file, ", находящи се градове: " . implode(", ", $address) . ", ");


            fwrite($file, $total_count . " броя артикули на обща цена ");
            fwrite($file, $total_price . " лева");

            fclose($file);

        }
    ?>


</body>
</html>