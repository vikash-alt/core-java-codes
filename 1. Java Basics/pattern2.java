// import java.util.*;

// public class pattern2{
//     public static void main(String args[]){
//         for(int i = 4; i >= 1; i--){
//             for(int k = i; k >= 1; k--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


public class pattern2{
    public static void main(String args[]){
        for(int i = 1; i <= 4; i++){
            for(int k = 1; k <= (4 - i + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}