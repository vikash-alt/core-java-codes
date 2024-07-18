import java.util.*;

public class ternary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        String type = (n % 2 == 0) ? "Number is Even" : "Number is Odd";
        System.out.println(type);
    }
}