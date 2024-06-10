<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        interface IName{
            function GetName();
            function SetName($name);
        }

        interface IID{
            function GetID();
            function SetID($id);
        }

        class Employer implements IName, IID{
            private $name;
            private $EGN;
            private $salary;
            function __construct($salary){
                $this->salary = $salary;
            }

            function GetName(){
                return $this->name;
            }

            function SetName($name){
                $this->name = $name;
            }

            function SetID($EGN){
                $this->EGN = $EGN;
            }

            function GetID(){
                return $this->EGN;
            }

            function GetSalary(){
                return $this->salary;
            }
        }

        class Student implements IID, IName{
            private $name;
            private $fnom;
            private $grade;
            function __construct($grade){
                $this->grade = $grade;
            }

            function GetName(){
                return $this->name;
            }

            function SetName($name){
                $this->name = $name;
            }

            function SetID($fnom){
                $this->fnom = $fnom;
            }

            function GetID(){
                return $this->fnom;
            }

            function GetGrade(){
                return $this->grade;
            }
        }

        $employer = new Employer(10000);
        $employer->SetName("Kristiyan Employee");
        $employer->SetID("4444");

        $student = new Student(5.00);
        $student->SetName("Kristiyan Student");
        $student->SetID("22621663");

        echo "Name[Employer]: " . $employer->GetName() . "<br>";
        echo "ID[Employer]: " . $employer->GetID() . "<br>";
        echo "Salary[Employer]: " . $employer->GetSalary() . "<br>";

        echo "Name[Student]: " . $student->GetName() . "<br>";
        echo "ID[Student]: " . $student->GetID() . "<br>";
        echo "Grade[Student]: " . $student->GetGrade() . "<br>";
    ?>
</body>
</html>
