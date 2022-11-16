//Write a Program to Check Vowel or Consonant
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter : ");
        String letter = sc.next();
        switch (letter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u" :
                System.out.println(letter + " is vowel");
                break;
        
            default:
                System.out.println(letter + " is consonant");
        }


    }
}
