import java.util.*;

public class ATM_mini_project {

    public static void main(String[] args) {
        int pin = 1234;
        int balance = 1000;

        int AddAmount = 0;
        int WithdrawAmount = 0;

        System.out.println("Welcome to the SG ATM");
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin number:");
        int password = scanner.nextInt();

        // code arrangement shortcut shft+alt+f
        if (password == pin) 
        {
            System.out.println("Enter your name:");
            name = scanner.next();
            System.out.println("Welcome " + name);

            while (true)
             { 
                System.out.println("Press 1 to check balance");
                System.out.println("Press 2 to add money");
                System.out.println("Press 3 to withdraw money");
                System.out.println("Press 4 to print receipt");
                System.out.println("Press 5 to exit");
                
                int opt = scanner.nextInt();
                switch(opt)
                {
                    case 1:
                        System.out.println("Your balance is " + balance);
                        break;
                    case 2:
                        System.out.println("Enter the amount to be added:");
                        AddAmount = scanner.nextInt();
                        System.out.println("Amount successfully added");
                        balance = AddAmount + balance;
                        System.out.println("Your current balance is " + balance);
                        break;
                    case 3:
                        System.out.println("Enter the amount to be withdraw:");
                        WithdrawAmount = scanner.nextInt();
                        if(WithdrawAmount<balance)
                        {
                            balance = balance - WithdrawAmount;
                            System.out.println("Withdrawl successful");
                            System.out.println("Your current balance is " + balance);
                            break;
                        }
                        else
                        {
                            System.out.println("Insufficient balance\nPlease enter valid amount that is less than your balance");
                            break;
                        }
                    case 4:
                        System.out.println("Your current balance is " + balance);
                        System.out.println("Amount added " + AddAmount);
                        System.out.println("Amount withdrawn " + WithdrawAmount);
                        System.out.println("Thank you for visiting SG ATM!");
                        break;
                     
                    default:
                        System.out.println("Please enter the number between 1 and 5");
                        break;
                    

                     }
            if(opt == 5)
            {
                System.out.println("Thank you");
                break;
            }
            
                        
            }       
         }
         else
         {
            System.out.println("Invalid password\nPlease enter valid password");
         }
            
    }
}
