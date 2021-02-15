import java.util.ArrayList;

public class Purchases {
    private ArrayList<GroceryItem> purchases;

    public Purchases() {
        this.purchases = new ArrayList<>();
    }

    public void addGroceryItem(GroceryItem item)
    {
        purchases.add(item);
    }

    public double getTotalPrice()
    {
        double total =0;
//        for (int i=0; i<purchases.size(); i++)
//        {
//            total += purchases.get(i).getPrice();
//        }
        for (GroceryItem groceryItem : purchases)
        {
            total += groceryItem.getPrice();
        }
        return total;
    }

    public String getGroceryNames()
    {
        String groceries = "";
        for (GroceryItem groceryItem:purchases)
        {
            groceries += groceryItem.getName() + ", ";
        }
        return groceries.substring(0, groceries.length()-2);
    }
}
