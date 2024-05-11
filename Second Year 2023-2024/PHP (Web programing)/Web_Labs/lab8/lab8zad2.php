<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        class Person{
            private $first_name;
            private $last_name;

            function __construct($first_name, $last_name){
                $this -> first_name = $first_name;
                $this -> last_name = $last_name;
            }

            function show_person() {
                echo "Hello!";
                echo "<br>";
                echo "My name is, " . $this->first_name . " " . $this->last_name . "!<br>";
            }
        }

        class Programmer extends Person{
            private $langs = array();

            function __construct($first_name, $last_name, $langs){
                parent::__construct($first_name, $last_name);
                $this->langs = $langs;
            }

            function set_langs($langs){
                $this->langs[] = $langs;
            }

            function show_programmer(){
                echo "I also know " . end($this->langs) . ".<br>";
                echo "Array (";
                for ($i = 0; $i < count($this->langs); $i++){
                    echo " [" . $i . "] => " . $this->langs[$i] . ",";
                }
                echo ")";
            }
        }

        $person = new Programmer("Ivan", "Ivanov", []);
        $person->set_langs("Lisp");
        $person->set_langs("Java");
        $person->set_langs("PHP");

        $person->show_person();
        $person->show_programmer();
    ?>
</body>
</html>