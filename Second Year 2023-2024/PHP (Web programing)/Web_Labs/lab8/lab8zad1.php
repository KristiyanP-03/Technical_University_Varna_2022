<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        class Book
        {
            private $title;
            private $author;
            private $price;

            public function __construct($title, $author, $price) {
                $this->title = $title;
                $this->author = $author;
                $this->price = $price;
            }

            function show_books(){
                echo $this->title . ", " . $this->author . ", " . $this->price . "лв";
            }
        }

        $book1 = new Book("PHP and SQL", "Иван Иванов", 12);
        $book1->show_books();
    ?>
</body>
</html>