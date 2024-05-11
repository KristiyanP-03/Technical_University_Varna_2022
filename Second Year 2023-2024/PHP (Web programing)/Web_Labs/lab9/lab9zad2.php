<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
    session_start();
    $_SESSION['username'] = "Maria";
    echo 'Hello, '.$_SESSION['username']."<br>";
?>
<a href="page2.php">Go to next page </a>


<?php
    echo $_SESSION['username'].' , This is page 2 of the site!';
    echo("<br>");
?>
<a href="page3.php">Next page - 3 </a>


<?php
    echo 'Hello, '.$_SESSION['username'];
    unset($_SESSION['username']); // разрегистраме променливата
    echo 'Your session is unset, '.$_SESSION['username'];
    /* Сега вече името на потебителя не се извежда */
    session_destroy(); // разрушаване на сесия
?>



</body>
</html>