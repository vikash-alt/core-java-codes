import java.util.*;

public class check_palindrome {
    public static boolean checkPalindrome(String str){
        int n = str.length();
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                System.out.println("Not a Palindrome");
                return false;
            }
        }
        System.out.println("Plindrome");
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String quote = sc.nextLine(); 
        checkPalindrome(quote);  
    }
}