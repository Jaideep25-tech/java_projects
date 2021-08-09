import java.util.*;
class LoginPage
{
    public static String name;
    public static String password;
    public static String lName;
    public static String lPassword;
    public static int age;
    public static int usrIn;
    public static int passhow;

    public static void main()
    {
        System.out.println("HEY THERE! WELCOME TO OUR LOGIN PAGE");
        Initiate();
    }

    static void Initiate()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("\n\nLogin Or Signup ? \n\nIf login Press1");
        System.out.println("\nIf Signup Press 2");
        usrIn=input.nextInt();
        if(usrIn==1)
            login();
        else if(usrIn==2)
            signUp();
        else
        {
            System.out.println("Sorry! to say..... Please enter correct option");
            Initiate();
        }
    }

    static void signUp()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Hello there New User! \nPlease tell us your name");
        name=input.nextLine();
        System.out.println("\nFor your further security \nPlease tell your password");
        password=input.nextLine();
        System.out.println("\nWonderful what's your age?");
        age=input.nextInt();
        System.out.println("\n\nYou are now signUp! \nPlease login now!");
        Initiate();
    }

    static void login()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Hello, what's your name?");
        lName=input.nextLine();
        if(lName.equals(name))
            System.out.println("Yeh...! you are already in our user");
        else
        {
            System.out.println("I dont remember you! PLease sign up first1");
            Initiate();
        }
        System.out.println("Please enter your password!");
        lPassword=input.nextLine();
        if(lPassword.equals(password))
        {
            System.out.println("Wonderful! you are logined!\n");
            System.out.println("Your age is: "+age);
            System.out.println("Your password is :************");
            System.out.println("\nIf you want to see your password!\n press 1 =Yes or press 2 =No");
        }
        else
        {
            System.out.println("your password is wrong! please enter correct password");
            login();
        }
        passhow=input.nextInt();
        if(passhow==1)
        System.out.println("Your password is "+password);
        else if(passhow==2)
        System.out.println("Great!");
        else
        System.out.println("please enter correct choice!");
    }
}
