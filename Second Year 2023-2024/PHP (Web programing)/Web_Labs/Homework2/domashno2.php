<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php

class Machine {
    protected $price;

    public function __construct($price) {
        $this->price = $price;
        echo "Object of class Machine created. <br>";
    }

    public function getPrice() {
        return $this->price;
    }

    public function setPrice($price) {
        $this->price = $price;
    }
}


class Printer extends Machine {
    protected $pagesPerMinute;

    public function __construct($price, $pagesPerMinute) {
        parent::__construct($price);
        $this->pagesPerMinute = $pagesPerMinute;
        echo "Object of class Printer created. <br>";
    }

    public function getPagesPerMinute() {
        return $this->pagesPerMinute;
    }

    public function setPagesPerMinute($pagesPerMinute) {
        $this->pagesPerMinute = $pagesPerMinute;
    }
}




class Bus {
    protected $seats;
    protected $driver;

    public function __construct($seats, $driver) {
        $this->seats = $seats;
        $this->driver = $driver;
        echo "Object of class Bus created. <br>";
    }

    public function getSeats() {
        return $this->seats;
    }

    public function setSeats($seats) {
        $this->seats = $seats;
    }

    public function getDriver() {
        return $this->driver;
    }

    public function setDriver($driver) {
        $this->driver = $driver;
    }
}

class DriverLicense {
    protected $validityMonths;

    public function __construct($validityMonths) {
        $this->validityMonths = $validityMonths;
        echo "Object of class DriverLicense created. <br>";
    }
    public function getValidityMonths() {
        return $this->validityMonths;
    }
    public function setValidityMonths($validityMonths) {
        $this->validityMonths = $validityMonths;
    }
}



class Employee {
    protected $name;
    protected $hoursPerDay;
    protected $hourlyRate;

    public function __construct($name, $hoursPerDay, $hourlyRate) {
        $this->name = $name;
        $this->hoursPerDay = $hoursPerDay;
        $this->hourlyRate = $hourlyRate;
        echo "Object of class Employee created. <br>";
    }
    public function salary() {
        return $this->hoursPerDay * $this->hourlyRate;
    }
    public function getName() {
        return $this->name;
    }
    public function setName($name) {
        $this->name = $name;
    }
    public function getHoursPerDay() {
        return $this->hoursPerDay;
    }
    public function setHoursPerDay($hoursPerDay) {
        $this->hoursPerDay = $hoursPerDay;
    }

    public function getHourlyRate() {
        return $this->hourlyRate;
    }

    public function setHourlyRate($hourlyRate) {
        $this->hourlyRate = $hourlyRate;
    }
}




class Engineer extends Employee {
    protected $machinesCreated;
    protected $machinesList;

    public function __construct($name, $hoursPerDay, $hourlyRate, $machinesCreated, $machinesList) {
        parent::__construct($name, $hoursPerDay, $hourlyRate);
        $this->machinesCreated = $machinesCreated;
        $this->machinesList = $machinesList;
        echo "Object of class Engineer created. <br>";
    }

    public function __destruct() {
        echo "Object of class Engineer destroyed. <br>";
    }

    public function salary() {
        $baseSalary = parent::salary();
        $bonus = 0.001 * $this->hourlyRate * $this->machinesCreated;
        return $baseSalary + $bonus;
    }

    public function getMachinesCreated() {
        return $this->machinesCreated;
    }

    public function setMachinesCreated($machinesCreated) {
        $this->machinesCreated = $machinesCreated;
    }

    public function getMachinesList() {
        return $this->machinesList;
    }

    public function setMachinesList($machinesList) {
        $this->machinesList = $machinesList;
    }
}



class Driver extends Employee {
    protected $driverLicense;
    protected $coursesPerDay;

    public function __construct($name, $hoursPerDay, $hourlyRate, $driverLicense, $coursesPerDay) {
        parent::__construct($name, $hoursPerDay, $hourlyRate);
        $this->driverLicense = $driverLicense;
        $this->coursesPerDay = $coursesPerDay;
        echo "Object of class Driver created. <br>";
    }
    public function salary() {
        $baseSalary = parent::salary();
        $bonus = $this->coursesPerDay > 10 ? 0.05 * $baseSalary : 0;
        return $baseSalary + $bonus;
    }
    public function getDriverLicense() {
        return $this->driverLicense;
    }
    public function setDriverLicense($driverLicense) {
        $this->driverLicense = $driverLicense;
    }
    public function getCoursesPerDay() {
        return $this->coursesPerDay;
    }
    public function setCoursesPerDay($coursesPerDay) {
        $this->coursesPerDay = $coursesPerDay;
    }
}




$printer = new Printer(1000, 20);
echo "Printer price: $" . $printer->getPrice() . "<br>";
echo "Pages per minute: " . $printer->getPagesPerMinute() . "<br>";

$bus = new Bus(7, "busDriver");
echo "Bus seats: " . $bus->getSeats() . "<br>";
echo "Bus driver: " . $bus->getDriver() . "<br>";


$driverLicense = new DriverLicense(39);
echo "Driver license validity: " . $driverLicense->getValidityMonths() . " months <br>";



$employee = new Employee("engi1", 8, 20);
echo "Employee name: " . $employee->getName() . "<br>";
echo "Employee salary: $" . $employee->salary() . "<br>";



$engineer = new Engineer("engi2", 8, 15, 5, ["Machine1", "Machine2"]);
echo "Engineer name: " . $engineer->getName() . "<br>";
echo "Engineer salary: $" . $engineer->salary() . "<br>";



$driver = new Driver("John", 8, 12, $driverLicense, 15);
echo "Driver's courses per day: " . $driver->getCoursesPerDay() . "<br>";
echo "Driver's salary: $" . $driver->salary() . "<br>";

?>



</body>
</html>