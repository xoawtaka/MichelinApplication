public class CourseModifier implements Priceable {

    private final String name;
    private final double price;
    private final ModifierCategory category;

    public CourseModifier(String name, double price,  ModifierCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name;}
    public ModifierCategory getCategory() { return category; }

    @Override
    public double getPrice() {
        return 0;
    }
}
