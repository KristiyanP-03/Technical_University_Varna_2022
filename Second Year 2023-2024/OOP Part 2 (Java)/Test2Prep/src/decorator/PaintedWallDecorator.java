package decorator;

class PaintedWallDecorator implements Wall {
    private Wall wall;

    public PaintedWallDecorator(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void build() {
        wall.build();
        paintWall();
    }

    private void paintWall() {
        System.out.println("Стената е боядисана.");
    }
}
