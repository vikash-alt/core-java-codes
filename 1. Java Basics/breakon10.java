import java.util.*;

public class breakon10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if((number % 10) == 0){
                break;
            }
            System.out.println(number);
        }
    }
}