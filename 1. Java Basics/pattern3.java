// public class pattern3{
//     public static void main(String args[]){
//         for(int i = 1; i <= 4; i++){
//             int count = 1;
//             for(int k = 1; k <= i; k++){
//                 System.out.print(count);
//                 count++;
//             }
//             System.out.println();
//         }
//     }
// }

public class pattern3 {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}