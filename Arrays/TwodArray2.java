package Arrays;

public class TwodArray2 {

    public static void main(String[] args){
        int[][] arr = {{80,75},{34,54},{32,67},{34,56}};
        for(int i =0;i<arr.length;i++){
            int total = 0;
            for(int j=0;j<arr[i].length;j++){
                total += arr[i][j];
            }
            System.out.println("student "+(i+1)+"total "+ total);
        }
    }
}
 