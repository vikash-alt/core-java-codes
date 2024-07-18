import java.util.*;

public class find_string {
    //charAt() function
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String quote = "This is Sparta!!!";
        printLetters(quote); 
    }
}