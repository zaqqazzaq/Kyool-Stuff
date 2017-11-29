import java.util.*;
public class isPerfect {
  public static boolean isPerfect(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++){
      if (n%i ==0) {
        sum += i;
      }
    } 
    if (sum == n) return true;
    else return false;
  }
  
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to test its perfection...");
    int x = sc.nextInt();
    if(isPerfect(x)){
        System.out.println("Perfection has been attained!");
    }
    else {System.out.println("Sorry, better luck next time!");}
  }

}
