import java.util.Scanner;

class Displayplace{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num :");
        int num = sc.nextInt();
        var hundreds =0;
        int tens = 0;
        int ones = 0;
        //Displays hundreds place digit
        hundreds = num / 100;
        System.out.println("Hundreds place digit :" +hundreds);

        //Displays tens digit
        tens = (num - hundreds) / 10;
        System.out.println("Tens place digit: " +tens);


        //Display ones digit
        ones = (num - tens - hundreds);
        System.out.println("Ones place digit: " +ones);   

    }
}