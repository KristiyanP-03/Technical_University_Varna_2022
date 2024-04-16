package decorator;

class SimpleWall implements Wall {
    @Override
    public void build() {
        System.out.println("Строене на обикновена стена.");
    }
}
