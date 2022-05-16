import java.util.Scanner;

public class Bai33 {
    public static void main(System[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ( n == 0 ) {
            System.out.println("n is equal to zero");
        } else if ( n > 0) {
            System.out.println("n is positive");
        } else {
            System.out.println("n is negative");
        }
    }
}
