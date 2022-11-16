
import java.util.Scanner;
//1. Read a single Digit Number and write in word

class word {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a single Digit Number :");
    int n = sc.nextInt();
    int b=n%10, a =n/10;
    String[] single_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
    if(b==0){
        System.out.println("Zero");
    }
    else{          
         System.out.println(single_digits[b]);
    }

    }
    
}
