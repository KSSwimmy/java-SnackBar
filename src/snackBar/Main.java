package snackBar;


public class Main
{
    private static void workMachine()
    {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        Vendingmachine v1 = new Vendingmachine("Food");
        Vendingmachine v2 = new Vendingmachine("Drink");
        Vendingmachine v3 = new Vendingmachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

        System.out.println("*** Snack Bar Data ***");

        System.out.println("*** Snack Bar Inventory ***");
        System.out.println(s1); 
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        // Customer 1 buys 3 of snack 4.
        // Print Customer 1 Cash on hand.
        // Print quantity of snack 4.
        c1.purchaseSnack(3,s4.getCost());
        s4.buySnack(3);
        System.out.println(c1.getName() + " has a balance of $" + c1.getCashOnHand());
        System.out.println(s4.getName() + " has " + s4.getQuantity() + " left");

        //Customer 1 buys 1 of snack 3.
        // Print Customer 1 Cash on hand.
        // Print quantity of snack 3.
        c1.purchaseSnack(1, s3.getCost());
        s3.buySnack(1);
        System.out.println("Jane has a balance of $" + c1.getCashOnHand());
        System.out.println(s3.getName() + " has " + s3.getQuantity() + " left");

        // Customer 2 buys 2 of snack 4.
        // Print Customer 2 Cash on Hand. 
        // Print quantity of snack 4
        c2.purchaseSnack(2, s4.getCost());
        s4.buySnack(2);
        System.out.println("Bob has a balance of $" + c2.getCashOnHand());
        System.out.println(s4.getName() + " has " + s4.getQuantity() + " left");

        // Customer 1 finds $10.
        // Print Customer 1 Cash on Hand.
        c1.addCash(10.0);
        System.out.println("Jane has a balance of $" + c1.getCashOnHand());

        // Customer 1 buys 1 of snack 2.
        // Print Customer 1 Cash on Hand.
        // Print quantity of snack 2.
        c1.purchaseSnack(1, s2.getCost());
        s2.buySnack(1);
        System.out.println("Jane has a balance of $" + c1.getCashOnHand());
        System.out.println(s2.getName() + "has " + s2.getQuantity() + "left");

        // Add 12 more items to snack 3.
        // Print quantity of snack 3.
        s3.addQuantity(12);
        System.out.println(s3.getName() + " has " + s3.getQuantity() + " left");

        // Customer 2 buys 3 of snack 3.
        // Print Customer 2 Cash on hand. 
        // Print quantity of snack 3.
        c2.purchaseSnack(3, s3.getCost());
        s3.buySnack(3);
        System.out.println("Bob has a balance of $" + c2.getCashOnHand());
        System.out.println(s3.getName() + " has " + s3.getQuantity() + " left");

    }
    public static void main(String[] args)
    {
        workMachine();
    }
}



 //PRINT OUT COMMANDS 


// Once in the src/ folder:
// Type javac employeeApp/*.java to compile all of the .java files
// Type jar cvfe EmpApp.jar employeeApp.Main employeeApp/*.class to compile all the .classfiles into a jar file
// Type java -jar EmpApp.jar to run the .jarfile you created


    // IT PRINTS OUT 

//     *** Snack Bar Data ***
// *** Snack Bar Inventory ***
// Name: Chips
// Vending Machine Number: 1
// Quantity On Hand: 36
// Total cost of all the quantities of this snack on hand: $63.0

// Name: Chocolate Bar
// Vending Machine Number: 1
// Quantity On Hand: 36
// Total cost of all the quantities of this snack on hand: $36.0

// Name: Pretzel
// Vending Machine Number: 1
// Quantity On Hand: 30
// Total cost of all the quantities of this snack on hand: $60.0

// Name: Soda
// Vending Machine Number: 2
// Quantity On Hand: 24
// Total cost of all the quantities of this snack on hand: $60.0

// Name: Water
// Vending Machine Number: 2
// Quantity On Hand: 20
// Total cost of all the quantities of this snack on hand: $55.0

// Jane has a balance of $37.75
// Soda has 21 left
// Jane has a balance of $35.75
// Pretzel has 29 left
// Bob has a balance of $28.14
// Soda has 19 left
// Jane has a balance of $45.75
// Jane has a balance of $44.75
// Chocolate Barhas 35left
// Pretzel has 41 left
// Bob has a balance of $22.14
// Pretzel has 38 left