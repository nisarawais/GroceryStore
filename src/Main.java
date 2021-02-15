/**
 * This class should be used to test your code.  To uncomment code,
 * select the lines you want to uncomment, hold [cntrl /] on PC,
 * [cmd /] on Mac
 */
public class Main {
    public static void main(String[] args) {

        //the following lines of code will create valid grocery items
        System.out.println("-- Creating new grocery items --");
        GroceryItem milk = new GroceryItem("milk", 5.49, "dairy");
        System.out.println(milk);
        GroceryItem pork = new GroceryItem("pork chop", 8.92, "meat");
        System.out.println(pork);
        GroceryItem bread = new GroceryItem("bread", 3.99, "bread");
        System.out.println(bread);
        GroceryItem apples = new GroceryItem("apples", 8.76, "fruit");
        System.out.println(apples);
        GroceryItem bananas = new GroceryItem("bananas", 2.96, "fruit");
        System.out.println(bananas);

//        the following lines of code should trigger an exception
        System.out.println("\n-- Ensuring invalid objects are not created --");
        try{
            GroceryItem invalid = new GroceryItem("m", 5.49, "dairy");
            System.err.println("invalid should have triggered an exception for a short name");
        }catch (IllegalArgumentException e)
        {
            System.out.println("message for invalid name: " + e.getMessage());
        }

        try{
            GroceryItem invalid = new GroceryItem("milk", -0.01, "dairy");
            System.err.println("invalid should have triggered an exception for a negative price");
        }catch (IllegalArgumentException e)
        {
            System.out.println("message for catching a price too low: " + e.getMessage());
        }

        try{
            GroceryItem invalid = new GroceryItem("milk", 151, "dairy");
            System.err.println("invalid should have triggered an exception for a high price");
        }catch (IllegalArgumentException e)
        {
            System.out.println("message for catching a price too high: " + e.getMessage());
        }

        try{
            GroceryItem invalid = new GroceryItem("milk", 151, "nonsense");
            System.err.println("invalid-should have triggered an exception for an invalid category");
        }catch (IllegalArgumentException e)
        {
            System.out.println("message for catching an invalid category: " + e.getMessage());
        }

        //These lines of code will test the Purchases class

        //create a new Purchases object
        System.out.println("\n-- Creating a Purchases object  and calling 'toString()' --");
        Purchases purchases = new Purchases();
        System.out.println(purchases);

        //add GroceryItem's to the purchases object
        purchases.addGroceryItem(milk);
        purchases.addGroceryItem(bread);
        purchases.addGroceryItem(bananas);
        purchases.addGroceryItem(pork);
        purchases.addGroceryItem(apples);

        //test the totalPrice method
        System.out.println("\n-- Showing the total price (should be $30.12) --");
        System.out.printf("The total price is $%.2f%n", purchases.getTotalPrice());

        //test the getGroceryNames as a String
        System.out.println("\n-- showing all the groceries separated by commas --");
        System.out.printf("The groceries purchased are: %s%n",purchases.getGroceryNames());

        //test the categories
        System.out.println("\n-- showing all the categories separated by commas without duplicates --");
        System.out.printf("The categories are: %s%n", purchases.getCategories());

        //test the toString method
        System.out.println("\n-- showing the toString() method after Purchases --");
        System.out.println(purchases);
    }
}
