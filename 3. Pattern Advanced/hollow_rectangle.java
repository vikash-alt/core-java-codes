import java.util.*;

public class hollow_rectangle {
    public static void hollowRectangle(int totRows, int totCols){
        for (int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i==1 || j==1 || i==totRows || j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollowRectangle(8, 15);
    }
}