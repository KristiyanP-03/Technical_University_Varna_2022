package bg.tu_varna.sit.b3.f22621663.homework2.task1;

public class ItemArray {
    Item[] itemsArray;
    ItemArray(Item[] itemsArray){
        this.itemsArray = itemsArray;
    }

    double calculateAveragePrice(){
        double avaragePrice = 0.0;

        if(itemsArray.length != 0){
            for (Item item: itemsArray) {
                avaragePrice += item.getPrice();
            }
        }

        return avaragePrice / itemsArray.length;
    }
}
