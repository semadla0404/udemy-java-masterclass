public class CoffeeTable {
    private String material;
    private String color;
    private Size size;

    public CoffeeTable(String material, String color, Size size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }
}
