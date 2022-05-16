import java.util.Scanner;

public class Bai27 {
    public static void main(String[]args){
        Scanner cs = new Scanner(System.in);
        String name = cs.next();
        int age = cs.nextInt();
        System.out.println("In 15 years, age of "+ name +" will be "+(age+15));
    }
}
