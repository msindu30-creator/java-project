import java.util.Scanner;

class EBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int bill = units * 5;

        System.out.println("Bill Amount = " + bill);
    }
}
