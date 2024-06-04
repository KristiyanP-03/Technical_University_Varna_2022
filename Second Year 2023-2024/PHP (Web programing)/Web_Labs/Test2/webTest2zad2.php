<?php
$host = 'localhost';
$dbUser = 'root';
$dbPass = '';

if (!$dbConn = mysqli_connect($host, $dbUser, $dbPass)) {
    die('NOT CONNECTED!!!');
}

$sql = 'CREATE DATABASE IF NOT EXISTS Library';
if ($queryResource = mysqli_query($dbConn, $sql)) {
    echo "DB CREATED!<br>";
} else {
    echo "ERROR with DB - " . mysqli_error($dbConn);
}

if (!mysqli_select_db($dbConn, 'Library')) {
    die('CANT SELECT DB -' . mysqli_error($dbConn));
}

$sql = "CREATE TABLE IF NOT EXISTS books (
    id INT(10) NOT NULL AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    stock INT(10) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=INNODB DEFAULT CHARSET=utf8";
$result = mysqli_query($dbConn, $sql);
if (!$result) {
    die('ERROR - ' . mysqli_error($dbConn));
}


$sql = "INSERT INTO books (title, author, price, stock) VALUES 
    ('Book 1', 'Author 1', '20.00', '5'),
    ('Book 2', 'Author 2', '15.00', '3'),
    ('Book 3', 'Author 3', '25.00', '2')";
$result = mysqli_query($dbConn, $sql);
if (!$result) {
    die('ERROR - ' . mysqli_error($dbConn));
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (isset($_POST["checkout"])) {
        $title = $_POST["title"];
        $sql = "UPDATE books SET stock = stock - 1 WHERE title = '$title' AND stock > 1";
        $result = mysqli_query($dbConn, $sql);
        if ($result) {
            echo "Book '$title' checked out successfully!";
        } else {
            echo "Error checking out the book: " . mysqli_error($dbConn);
        }
    }

    if (isset($_POST["return"])) {
        $title = $_POST["title"];
        $sql = "UPDATE books SET stock = stock + 1 WHERE title = '$title'";
        $result = mysqli_query($dbConn, $sql);
        if ($result) {
            echo "Book '$title' returned successfully!";
        } else {
            echo "Error returning the book: " . mysqli_error($dbConn);
        }
    }
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library Database</title>
</head>
<body>
    <h2>Add Book</h2>
    <form method="post" action="">
        Title: <input type="text" name="title"><br>
        <input type="submit" name="checkout" value="Checkout">
        <input type="submit" name="return" value="Return">
    </form>

    <h2>Library Catalog</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Price</th>
            <th>Stock</th>
        </tr>
        <?php
        $sql = "SELECT * FROM books";
        $result = mysqli_query($dbConn, $sql);
        if (mysqli_num_rows($result) > 0) {
            while ($row = mysqli_fetch_assoc($result)) {
                echo "<tr>";
                echo "<td>" . $row["id"] . "</td>";
                echo "<td>" . $row["title"] . "</td>";
                echo "<td>" . $row["author"] . "</td>";
                echo "<td>" . $row["price"] . "</td>";
                echo "<td>" . $row["stock"] . "</td>";
                echo "</tr>";
            }
        } else {
            echo "<tr><td colspan='5'>No books found</td></tr>";
        }
        ?>
    </table>
</body>
</html>
