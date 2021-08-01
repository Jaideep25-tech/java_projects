import java.util.*;
class AtmMachine
{
    private double totalBal=1000;
    Scanner input= new Scanner(System.in);
    public int userAccount()
    {
        System.out.println("enter your account no.");
        int account=input.nextInt();
        if(account==12345678)
        return account;
        else
        {
            System.out.println("invalid acc. no.");
            return userAccount();
        }
    }

    public int userPin()
    {
        System.out.println("enter your account pin");
        int pin=input.nextInt();
        if(pin==87654321)
        return pin;
        else
        {
            System.out.println("invalid pin");
            return userPin();
        }
    }

    public void startAtm()
    {
        userAccount();
        userPin();
        drawMainMenu();
    }

    public void drawMainMenu()
    {
        int selection;
        System.out.println("\nATM main menu");
        System.out.println("1- View Account Balance");
        System.out.println("2- Withdraw funds");
        System.out.println("3- Add funds");
        System.out.println("4- Terminate Transaction");
        System.out.println("choice ");
        selection=input.nextInt();
        switch(selection)
        {
            case 1: viewAccountInfo();
                break;
            case 2: withdraw();
                break;
            case 3: addFunds();
                break;
            case 4: System.out.println("Thank you for using this ATM!! goodbye");
        }
    }

    public void viewAccountInfo()
    {
        System.out.println("Account Information:"); 
        System.out.println("\t--Total balance: Rs."+totalBal); 
        drawMainMenu();
    } 

    public void deposit(int depAmount)
    {
        System.out.println("\n***Please insert your money now...*");
        totalBal =totalBal +depAmount;
    }

    public void checkNsf(int withdrawAmount)
    { 
        if(totalBal -withdrawAmount < 0) 
            System.out.println("\n**ERROR!!! Insufficient funds in you accout**");
        else
        {
            totalBal =totalBal-withdrawAmount;
            System.out.println("\n***Please take your money now...***");
        }
    }

    public void addFunds ()
    { 
        int addSelection;
        System.out.println("Deposit funds:");
        System.out.println("1- Rs. 500");
        System.out.println("2 - Rs. 1000");
        System.out.println("3 - Rs. 2000");
        System.out.println("4 - Rs. 3000");
        System.out.println("5- Back to main menu");
        System.out.print("Choice: "); 
        addSelection=input.nextInt();
        switch(addSelection)
        {
            case 1: deposit(500); 
                drawMainMenu();
                break;
            case 2: deposit(1000);
                drawMainMenu();
                break;
            case 3: deposit(2000);
                drawMainMenu();
                break;
            case 4: deposit (3000);
                drawMainMenu();
                break;
            case 5: drawMainMenu();
                break;
        }
    }

    public void withdraw()
    { 
        int withdrawSelection;
        System.out.println("Withdraw money:");
        System.out.println("1 - Rs. 500");
        System.out.println("2 - Rs. 1000");
        System.out.println("3 - Rs. 1500");
        System.out.println("4 - Rs. 2000");
        System.out.println("5 - Back to main menu");
        System.out.print("Choice: ");
        withdrawSelection=input.nextInt();
        switch (withdrawSelection)
        {
            case 1: checkNsf(500);
                drawMainMenu();
                break; 
            case 2: checkNsf(1000);
                drawMainMenu();
                break;
            case 3: checkNsf(1500);
                drawMainMenu();
                break;
            case 4:checkNsf(2000);
                drawMainMenu();
                break;
            case 5: drawMainMenu();
                break;
        }
    }

    public static void main()

    { 
        AtmMachine myAtm = new AtmMachine();
        myAtm.startAtm();
    }
}