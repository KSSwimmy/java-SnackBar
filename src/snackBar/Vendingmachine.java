package snackBar;

public class Vendingmachine 
{
    //Vending machine has fields (so knows)
    // id
    // name
    private static int maxId = 0;
    private int id;
    private String name;


    //constructor 
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