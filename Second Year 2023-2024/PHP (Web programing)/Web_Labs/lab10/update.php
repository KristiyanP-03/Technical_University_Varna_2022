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

// Актуализация на записите за книги, издадени от издателство "Анубис"
$sql = "UPDATE books SET publisher='Просвета' WHERE publisher='Анубис'";

if ($conn->query($sql) === TRUE) {
    echo "Record updated successfully";
} else {
    echo "Error updating record: " . $conn->error;
}

$conn->close();
?>

</body>
</html>