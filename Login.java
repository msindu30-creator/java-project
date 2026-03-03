import java.util.Scanner;

class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();

        if (username.equals("admin") && password.equals("1234"))
            System.out.println("Login Successful");
        else
            System.out.println("Invalid Login");
    }
}
