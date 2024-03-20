import java.nio.file.FileStore;

public class Dish {
    private String name;
    private String description;



    public static class Builder{
        private String name;
        private String description;


        public Builder(String name) {
            this.name = name;
        }

        public Builder withDescription(String description){
            this.description = description;
            return this;
        }

        public Dish build(){
            return new Dish();
        }
    }


    private Dish(){}

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}