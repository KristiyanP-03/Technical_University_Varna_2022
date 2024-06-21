package CreationPattern.Factory;

// Фабрика за създаване на цветове
class ColorFactory {
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        switch (colorType.toLowerCase()) {
            case "red":
                return new Red();

            default:
                return null;
        }
    }
}
