import java.util.Arrays;
import java.util.List;

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
        if(price > 0.00 && price < 150.00)
            this.price = price;
        else
            throw new IllegalArgumentException(price +" is outside of the range between 0.00 and 150.00. Please try again.");
    }

    public String getCategory() {
        return category;
    }

    public static List<String> getValidCategory()
    {
        return Arrays.asList("vegetable","fruit","meat","fish","dairy","bread", "condiments");
    }

    public void setCategory(String category) {
        category = category.toLowerCase();
        if(getValidCategory().contains(category))
            this.category = category;
        else
            throw new IllegalArgumentException(category +" was entered, valid categories are: " + getValidCategory());
    }

    public String toString(){return name + ", category: " + category + ", price: " + price;}

}
