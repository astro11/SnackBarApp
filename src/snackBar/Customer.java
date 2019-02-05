package snackBar;

public class Customer
{
    private static int maxId = 0;
    public int id;
    public String name;
    public double coh; // cash on hand

    public Customer (String name, double coh)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.coh = coh;
    }

    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                        "name: " + name + "\n" +
                        "cash on hand: " + coh + "\n";
        return rtnStr;
    }
}