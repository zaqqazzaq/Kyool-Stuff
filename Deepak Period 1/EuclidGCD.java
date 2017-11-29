import java.util.*;
public class EuclidGCD {
    public static void main (String [] args) {
        System.out.println("input two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        while (a != b) {
            if (a > b){
                a -= b;
            }
            if (b > a) {
                b -= a;
            }
        }
        System.out.println("The GCD is " + a);
    }
}