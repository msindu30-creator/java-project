import java.util.*;

class Student {
    String name;
    int age;
    int marks;
    Student(String n, int a, int m) {
        name = n; age = a; marks = m;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("\n1.Add  2.Display  3.Search  4.Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Name: "); String n = sc.next();
                System.out.print("Age: "); int a = sc.nextInt();
                System.out.print("Marks: "); int m = sc.nextInt();
                list.add(new Student(n, a, m));
            } 
            else if (ch == 2) {
                for (Student s : list)
                    System.out.println(s.name+" "+s.age+" "+s.marks);
            } 
            else if (ch == 3) {
                System.out.print("Enter name: "); String n = sc.next();
                boolean found = false;
                for (Student s : list)
                    if (s.name.equalsIgnoreCase(n)) {
                        System.out.println(s.name+" "+s.age+" "+s.marks);
                        found = true;
                    }
                if (!found) System.out.println("Not found");
            } 
            else break;
        }
    }
}
