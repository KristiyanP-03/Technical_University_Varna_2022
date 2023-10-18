package bg.tu_varna.sit.b3.f22621663.homework2.task5;

public class SoftDrinkShelf {
    SoftDrink[] softDrinks;

    SoftDrinkShelf(SoftDrink[] softDrinks) {
        this.softDrinks = softDrinks;
    }

    SoftDrink getMostFrequentSoftDrink() {
        SoftDrink mostFrequentDrink = null;
        int maxFrequency = 0;

        for (SoftDrink drink : softDrinks) {
            int frequency = 0;

            for (SoftDrink otherDrink : softDrinks) {
                if (drink.equals(otherDrink)) {
                    frequency++;
                }
            }

            if (frequency >= maxFrequency) {
                mostFrequentDrink = drink;
                maxFrequency = frequency;
            }
        }

        return mostFrequentDrink;
    }
}
