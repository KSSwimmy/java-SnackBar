package snackBar;

public class Snack 
{
	// Fields, state of class, attributes
	 // Fields, state of the class, attributes
    private static int maxId = 0;
    private int id;
    private String sname;
    private int quantity;
    private double cost;
    private int vmachineId;
  
}

// constructor 

	public Snackbar(int id, Sting sname, int quantiy, double cost, int vmachineId) 
	{
		maxId++;
		id = maxId;

		this.sname;
		this.quantiy;
		this.cost;
		this.vmachineId;
	}

	// methods, behaviors
	//getters and setters

	public int getId()
	{
		return id;
	}

	public String getSname()
	{
		return sname;
	}

	public void setSname(String sname)
	{
		this.sname = sname;
	}

	public int getQuantiy()
	{
		return quantiy;
	}

	public void setQuantiy( int quantiy)
	{
		this.quantiy = quantiy;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost;
	}

	public int getVmachineId()
	{
		return vmachineId;
	}

	public void setVmachineId(int vmachineId)
	{
		this.vmachineId;
	}





