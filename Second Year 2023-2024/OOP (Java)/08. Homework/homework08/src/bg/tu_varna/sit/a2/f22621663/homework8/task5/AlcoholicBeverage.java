package bg.tu_varna.sit.a2.f22621663.homework8.task5;

class AlcoholicBeverage extends Drink {
    private double vol;

    public AlcoholicBeverage(String name, double quantity, double serveQuantity, double vol) throws AlcoholicBeverageException {
        super(name, quantity, serveQuantity);
        if (quantity < 5) {
            throw new AlcoholicBeverageException("Minimum quantity for alcoholic beverage delivery is 5 liters");
        }
        if (vol < 0) {
            throw new AlcoholicBeverageException("Invalid alcohol volume");
        }
        this.vol = vol;
    }

    public boolean isProper(int age) throws AlcoholicBeverageException {
        if (age <= 0) {
            throw new AlcoholicBeverageException("Invalid age");
        } else if (age <= 18) {
            throw new AlcoholicBeverageException("Persons under 18 years old cannot consume alcoholic beverages");
        } else if ((age >= 18 && age < 21) || age >= 70) {
            return vol < 10;
        } else {
            return true;
        }
    }
}


