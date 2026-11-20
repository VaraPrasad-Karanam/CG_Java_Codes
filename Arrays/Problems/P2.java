package Arrays.Problems;

public class P2 {
    public static void main(String[] args) {
        int arr[] = {3,5,0,2,3,0};
        int a = 0;
        for(int b =0;b<arr.length;b++){
            if(arr[b]==0){
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b]=temp;
                a++;
            }
        }
        for(int i:arr){
            System.out.print(i);
        }
    }
}
