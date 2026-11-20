package Arrays;

public class SecondMin {
    public static void main(String[] args) {
        int arr[] = {23,43,12,56,8};
        int min = arr[0];
        int sec = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                sec = min;
                min = arr[i];
            }
        }
        System.out.println(sec);
    }
}
