public class GroceryItem {
    private String name;
    private double price;
    private String category;

    public GroceryItem(String name, double price, String category) {
        setName(name);
        setPrice(price);
        setCategory(category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 2)
            this.name = name;
        else
            throw new IllegalArgumentException("You need to type more than two characters long.");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
