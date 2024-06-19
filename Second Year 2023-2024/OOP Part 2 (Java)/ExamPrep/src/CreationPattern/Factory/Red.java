package CreationPattern.Factory;

// Клас за червен цвят
class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with red color.");
    }
}
