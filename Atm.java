import java.util.*;

public class Atm {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int balance = random.nextInt(1000001);
        int choice;


        do {
        System.out.println("      ATM MENU");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance :" + balance);
                    break;

                case 2:
                    System.out.println("Enter amount to deposit");
                    int dep = sc.nextInt();
                    balance = balance + dep;
                    System.out.println("Current balance " + balance);
                    break;

                case 3:
                    System.out.println("Enter amount to withdraw");
                    int withdr = sc.nextInt();
                    balance = balance - withdr;
                    System.out.println("Current balance " + balance);
                    break;

                case 4:
                    System.out.println(" Thanks for using ATM");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}