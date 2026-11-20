package Loops;

public class RightPattern1 {
    public static void main(String[] args) {
        //1
        // for(int i=4;i>=1;i--){
        //     for(int s=4;s>i;s--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        //2
        for(int i=4;i>=1;i--){
            for(int s=1;s<4-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
