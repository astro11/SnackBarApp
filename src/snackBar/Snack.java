package snackBar;

public class Snack
{
    private static int maxId = 0;
    private  int id;
    private String name;
    private double quantity;
    private double cost;
    private int vendingID;

    public Snack (String name, double quantity, double cost, int vendingID)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingID = vendingID;

    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getQuantity()
    {
        return quantity;
    }

    public void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

}