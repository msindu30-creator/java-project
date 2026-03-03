import java.util.Scanner;

class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int bonus = salary / 10;

        System.out.println("Total Salary = " + (salary + bonus));
    }
}
