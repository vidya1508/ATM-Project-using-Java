import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
public class Main {
    static ArrayList<String> user = new ArrayList<>(Arrays.asList("vidya", "vamsi", "sai", "devi"));
    static ArrayList<String> password = new ArrayList<>(Arrays.asList("vidya1", "vamsi2", "sai3", "devi4"));
    static ArrayList<Integer> pin = new ArrayList<>(Arrays.asList(0000, 1111, 2222, 3333));
    static ArrayList<Integer> balance = new ArrayList<>(Arrays.asList(1000, 4000, 6000, 7000));
    static Scanner in = new Scanner(System.in);
public static void Withdraw(int i)
{
  System.out.println("Enter Amount:");
  int amount=in.nextInt();
  System.out.println("Enter Your PIN:");
  int pincode=in.nextInt();
  if(pincode!=pin.get(i)){
     System.out.println("INCORRECT PIN!!!");
  }
  else{
    if(amount>balance.get(i))
    {
        System.out.println("INSUFFICIENT BALANCE");
    }
    else
    {
       System.out.println("WITHDRAWL SUCCESSFUL.");
       balance.set(i,balance.get(i)-amount);
       System.out.println("Do you want to Know your Balance?(Yes/No):");
       String q=in.nextLine();
       if(q.equals("No"))
       {
        System.out.println("THANK YOU FOR BANKING WITH US, VISIT AGAIN.");
       }
       else{
        System.out.println("Your remaining balance is: "+balance.get(i));
        System.out.println("THANK YOU FOR BANKING WITH US, VISIT AGAIN.");
       }

    }
  }
}
public static void deposit(int i)
{
  System.out.println("Enter Amount:");
  int amount=in.nextInt();
  System.out.println("Enter your PIN:");
  int pincode=in.nextInt();
  if(pincode!=pin.get(i))
  {
    System.out.println("INCORRECT PIN!!");
  }
  else{
    balance.set(i,balance.get(i)+amount);
    System.out.println("Deposition Successful.");
    System.out.println("Do you want to Know your Balance?(Yes/No):");
       String q=in.nextLine();
       if(q.equals("No"))
       {
        System.out.println("THANK YOU FOR BANKING WITH US, VISIT AGAIN.");
       }
       else{
        System.out.println("Your remaining balance is: "+balance.get(i));
        System.out.println("THANK YOU FOR BANKING WITH US, VISIT AGAIN.");
       }

  }

}
public static void viewBalance(int i)
{
    System.out.println("Enter your PIN:");
    int pincode=in.nextInt();
    if(pincode!=pin.get(i))
    {
      System.out.println("INCORRECT PIN!!");
    }
    else{
        System.out.println("Your Current Balance is: "+balance.get(i));
        System.out.println("THANK YOU FOR BANKING WITH US, VISIT AGAIN.");
    }
}
public static void changePassword(int i)
{
  System.out.println("Enter Your current Password:");
  in.nextLine();
  String cp=in.nextLine();
  while(true)
  {
  if(!cp.equals(password.get(i)))
  {
    System.out.println("INCORRECT PASSWORD!");
    System.out.println("Enter Your Correct Password:");
    cp=in.nextLine();
  }
  else{
    System.out.print("Enter Your New Password:");
    String np=in.nextLine();
    System.out.print("Re-Enter Your New Password:");
    String np1=in.nextLine();
    if(!np.equals(np1))
    {
        System.out.println("Password does not match!");
    }
    else{
        password.set(i,np);
        System.out.println("PASSWORD HAS CHANGED SUCCESSFULLY!");
        System.out.println("THANK YOU FOR BANKING WITH US, VISIT AGAIN.");
        break;
    }
  }
}
}
public static void ATM()
{
    System.out.println("Enter Your Username:");
    String user_name=in.nextLine();
    if(!user.contains(user_name))
    {
        System.out.println("END");
    }
    else{
        int i=user.indexOf(user_name);
        System.out.println("Enter Your Password:");
        String pass_word=in.nextLine();
        int flag=0;
        if(!pass_word.equals(password.get(i)))
        {
            System.out.println("Incorrect Password,Enter Your Correct Password! You have only 3 chances left otherwise your Account will be BLOCKED!");
            pass_word=in.nextLine();
            if(!pass_word.equals(password.get(i))){
              System.out.println("Incorrect Password,Enter Your Correct Password! You have only 2 chances left otherwise your Account will be BLOCKED!");
              pass_word=in.nextLine();
              if(!pass_word.equals(password.get(i)))
              {
               System.out.println("Incorrect Password,Enter Your Correct Password! You have only 1 chances left otherwise your Account will be BLOCKED!");
               pass_word=in.nextLine();
               if(!pass_word.equals(password.get(i))) {
                System.out.println("ACCOUNT BLOCKED!");
                }
               else{
               flag=1;
                }
               }
              else{
              flag=1;
              }
             }
           else{
            flag=1;
           }
           }
           else
           {
              flag=1;
             }
             if(flag==0)
             {
                System.out.println("END");
             }
             else{
                System.out.println("Enter Your Choice:");
                System.out.println("1.Withdrawal");
                System.out.println("2.Deposit");
                System.out.println("3.Check Balance");
                System.out.println("4.Change Password");
                int choice = in.nextInt();
                while(true)
                {
                    if(choice <1 || choice<4)
                    {
                        System.out.println("Enter a Valid Choice:");
                        choice=in.nextInt();
                    }
                    else{
                        switch(choice)
                        {
                            case 1:
                            System.out.println("****WITHDRAWL****");
                            Withdraw(i);
                            break;
                            case 2:
                            System.out.println("****DEPOSIT****");
                            deposit(i);
                            break;
                            case 3:
                            System.out.println("****CHECK BALANCE****");
                            viewBalance(i);
                            case 4:
                            System.out.println("****CHANGE PASSWORD****");
                            changePassword(i);
                            break;

                        }
                        break;
                    }
                }
             }
           }
        }
    public static void main(String[]args)
    {
        ATM();
    }
}
