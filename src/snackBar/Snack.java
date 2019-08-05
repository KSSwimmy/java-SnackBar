package snackBar;

    // Snack has fields (so knows)

    //id
    //name
    //quantity
    //cost
    //vending machine id

public class Snack  
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineID;

    //constructor 
    public Snack (String name, int quantity, double cost, int vendingMachineID)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineID = vendingMachineID;
    }

    //Snack has methods (so can)

    //set and get id
    // set and get name
    // set and get cost
    // set and get vending machine id
    // get quantity
    // add quantity when given how many to add 
    // buy snack when given how many to buy
    // get total cost given a quantity


   //Getters and Setters 
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



    public double getCost()
    {
        return cost;
    }



    public void setCost(double cost)
    {
        this.cost = cost;
    }



    public int getvendingMachineID()
    {
        return vendingMachineID;
    }



    public int getQuantity()
    {
        return quantity;
    }



    public void addQuantity(int amount)
    {
        this.quantity = quantity + amount;
    }



    public void buySnack(int purchased)
    {
        this.quantity = quantity - purchased;
    }



    public double getTotal(int quantity)
    {
        return (this.cost) * quantity;
    }



// 
       @Override
   public String toString()
   {
      String rtnStr = "Name: " + name + "\n" + 
                      "Vending Machine Number: " + vendingMachineID + "\n" +
                      "Quantity On Hand: " + quantity + "\n" +
                      "Total cost of all the quantities of this snack on hand: $" + (quantity * cost) + "\n";
      return rtnStr;
   }
}