<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        class Article{
            private $title;
            private $author;
            private $description;

            
            function __construct($title, $author, $description){
                $this -> title = $title;
                $this -> author = $author;
                $this -> description = $description;
            }


            function show_article(){
                echo "<h1>" . $this -> title . "</h1><br>";
                echo $this->description . "<br>";
                echo "Author: " . $this->author;
            }
        }

        class Person{
            private $first_name;
            private $last_name;
            private $email;


            function __construct($first_name, $last_name, $email){
                $this -> first_name = $first_name;
                $this -> last_name = $last_name;
                $this -> email = $email;
            }

            
            function show_person(){
                
            }
        }

    ?>
</body>
</html>