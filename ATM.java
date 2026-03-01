import java.util.Scanner;

public class ATM {

    static Scanner input = new Scanner (System.in);
    static BankAccount account = new BankAccount(500.0);

    public static void main(String[] args){

        for (int i = 1 ; i <= 3 ; i++){
            System.out.print ("Enter Your PIN: ");

            if (account.checkPIN(input.nextInt())){
                displayMenu();
                return;
            }
            System.out.println("Wrong PIN.");
        }
        System.out.println("Too many failed attempts. Access denied");
    }
    static void displayMenu(){

        while (true){
            System.out.println("Welcome To The ATM Menu ");
            System.out.println("\n 1.Balance \n 2.Deposit \n 3.Withdraw \n 4.History \n 5.Exit");
            System.out.println("Enter Your Choice: ");

            int choice = input.nextInt();

            if (choice == 5) {
                System.out.println ("Thank you for using our ATM");
                break;
            }

            switch (choice){
                case 1:
                    System.out.printf("Your Current Balance: $ %.2f%n" , account.getBalance());
                    break;

                case 2:
                    System.out.print("Deposit Amount: ");
                    double depositMoney = input.nextDouble();
                    account.deposit(depositMoney);
                    showReceipt (depositMoney, "Deposit");
                    break;

                case 3:
                    System.out.print("withdraw Amount: ");
                    double withdrawMoney = input.nextDouble();
                    if(account.withdraw(withdrawMoney)){
                        showReceipt (withdrawMoney , "Withdrawal");
                    }
                    else {
                        System.out.println ("Invalid Amount");
                    }
                    break;

                case 4:
                    System.out.println("Your Account History: ");
                    account.getHistory().forEach(System.out::println);
                    System.out.println("Current Balance is " + account.getBalance());
                    break;

                default:
                    System.out.println("Invalid choice, Please Enter a Number Between 1 and 5");
                    break;
            }
        }
    }
    static void showReceipt (double money , String type) {
        System.out.print ("Would You Like A Receipt?: ");
        if (input.next().equalsIgnoreCase("y")) {
            System.out.println("Receipt For: " + type + " Of $" + money + " Successful");
            System.out.println("Current Balance is " + account.getBalance());
        }
    }
}
