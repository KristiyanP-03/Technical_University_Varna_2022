package bg.tu_varna.sit.a2.f22621663.homework7.task4;

class FishList {
    Fish[] fishArray;
    int count;

    public FishList(int capacity) {
        fishArray = new Fish[capacity];
        count = 0;
    }





    public void addFish(Fish fish) {
        if (count < fishArray.length) {
            fishArray[count++] = fish;
        } else {
            System.out.println("FishList is full. Cannot add more fish.");
        }
    }
}