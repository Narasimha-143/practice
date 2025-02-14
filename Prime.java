import java.util.Scanner;
import java.lang.*;
public class Prime{
  public boolean isPrime(int number){
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
  }
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Prime p = new Prime();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Is a number Prime: " + p.isPrime(num));
  }
