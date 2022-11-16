//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132

import java.util.Scanner;
public class ReverseOfaNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        var reverse = 0;
        while (num!=0){
            int remainder = num%10;
            reverse = reverse*10 + remainder;
            num = num/10;
        }
        System.out.println("The reverse of a num : " +reverse);
    }
    
}
