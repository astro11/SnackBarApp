package snackBar;

public class Main
{
    private static void snackData()
    {
        Vending food = new Vending("Food");
        Vending drink = new Vending("Drink");
        Vending office = new Vending("Office");

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());


        System.out.println("*** Vending Machine Data ***");


        System.out.println("*** Customer Data ***");
        System.out.println(c1);
        System.out.println(c2);


    }

    public static void main(String[] args)
    {
        snackData();
    }
}