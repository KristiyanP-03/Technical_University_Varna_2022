<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
    class Donation {
        private $name;
        private $amount;
        private static $totalDonated = 0;
        private static $numberOfDonors = 0;


        public function __construct($name, $amount) {
            $this->name = $name;
            $this->amount = $amount;
            self::$totalDonated += $amount;
            self::$numberOfDonors++;
        }


        public function info() {
            $percent = ($this->amount / self::$totalDonated) * 100;
            echo "{$this->name} donated {$this->amount} ({$percent}%)<br>";
        }


        public static function getTotalDonations() {
            return self::$totalDonated;
        }

        
        public static function getNumberOfDonors() {
            return self::$numberOfDonors;
        }
    }



    $donors = [
        new Donation("Nichola", 85.00),
        new Donation("Mitko", 50.00),
        new Donation("Emily", 90.00),
        new Donation("Iliana", 65.00)
    ];

    foreach ($donors as $donor) {
        $donor->info();
    }

    echo "Total Donations = " . Donation::getTotalDonations() . "<br>";
    echo "Number of Donors = " . Donation::getNumberOfDonors();
?>

</body>
</html>