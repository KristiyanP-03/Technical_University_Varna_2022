public class Animal {
    protected String name;
    protected int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    public class Dog extends Animal {
        String type;
        Dog(String type, String name, int age){
            super(name, age);
            this.type = type;
        }

        void barking(){
            
        }
    }

    public class Cat extends Animal {
        String fur;
        Cat(String fur, String name, int age){
            super(name, age);
            this.fur = fur;
        }
    }
}
