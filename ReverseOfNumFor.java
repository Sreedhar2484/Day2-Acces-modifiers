import java.util.Scanner;
public class ReverseOfNumFor{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int num = sc.nextInt();
        int i=0;
        int reverse = 0;
        for(;num!=0; num=num/10){
            int remainder = num%10;
            reverse = reverse*10 + remainder;

        }
        System.out.println("The reverse of a num :" +reverse);
    }
}
