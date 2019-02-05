package snackBar;

public class Vending
{
    private static int maxId = 0;
    private int id;
    private String name;

    public Vending (String name) // Vending Machine constructor
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName() {
        return name;
    }
}