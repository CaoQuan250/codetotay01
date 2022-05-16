import java.util.Scanner;

public class Bai35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.equals(b)) {
            System.out.println("Two people have the same name");
        } else {
            System.out.println("Two people don't have the same name");
        }
    }
}
