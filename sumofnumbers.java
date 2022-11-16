//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
import java.util.Scanner;
public class sumofnumbers {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int i=1;
        int sum = 0;
        while(i<=num){
            sum+=i;
            i++;
        }
        
        System.out.println("Sum of n natural numbers :" + sum);
    }
}



