package snackBar;

public class Vendingmachine 
{
    private static int maxId = 0;
    private int id;
    private String name;

    public Vendingmachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName()
    {
        this.name = name;
    }
}