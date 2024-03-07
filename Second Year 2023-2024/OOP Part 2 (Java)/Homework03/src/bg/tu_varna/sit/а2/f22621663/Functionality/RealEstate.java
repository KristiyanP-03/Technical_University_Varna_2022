package bg.tu_varna.sit.а2.f22621663.Functionality;

import bg.tu_varna.sit.а2.f22621663.Enumeration.Type;

public class RealEstate {
    private Type type;
    private double area;
    private double price;
    private int numberOfRooms;
    private boolean furnished;
    private boolean hasGarage;
    private boolean hasGarden;




    private RealEstate(Builder builder) {
        this.type = builder.type;
        this.area = builder.area;
        this.price = builder.price;
        this.numberOfRooms = builder.numberOfRooms;
        this.furnished = builder.furnished;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
    }
    public static class Builder {
        private Type type;
        private double area;
        private double price;
        private int numberOfRooms;
        private boolean furnished;
        private boolean hasGarage;
        private boolean hasGarden;



        public Builder(Type type, double area, double price) {
            this.type = type;
            this.area = area;
            this.price = price;
        }

        public Builder numberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
        }

        public Builder furnished(boolean furnished) {
            this.furnished = furnished;
            return this;
        }
        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }
        public Builder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }





        public RealEstate build() {
            return new RealEstate(this);
        }
    }
}
