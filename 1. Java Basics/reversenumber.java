import java.util.*;

public class reversenumber{
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int rem = 0, rev = 0;
        while(number > 0){
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        System.out.println("Reversed number is: " + rev);
    }
}