import java.util.*;
class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234, balance = 5000;

        System.out.print("Enter PIN: ");
        if (sc.nextInt() != pin) {
            System.out.println("Invalid PIN!");
            return;
        }

        System.out.println("1.Check Balance  2.Deposit  3.Withdraw");
        System.out.print("Choose: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Balance: " + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                balance += sc.nextInt();
                System.out.println("Updated Balance: " + balance);
                break;

            case 3:
                System.out.print("Enter amount to withdraw: ");
                int w = sc.nextInt();
                if (w <= balance) {
                    balance -= w;
                    System.out.println("Withdrawn! New Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }
                break;

            default:
                System.out.println("Invalid Option!");
        }
    }
}
