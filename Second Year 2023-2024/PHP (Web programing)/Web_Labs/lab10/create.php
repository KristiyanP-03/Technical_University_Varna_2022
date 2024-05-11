<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
include 'config.php';

// Създаване на таблицата за книги
$sql = "CREATE TABLE books (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    publisher VARCHAR(100),
    year INT(4)
)";

if ($conn->query($sql) === TRUE) {
    echo "Table books created successfully";
} else {
    echo "Error creating table: " . $conn->error;
}

$conn->close();
?>

</body>
</html>