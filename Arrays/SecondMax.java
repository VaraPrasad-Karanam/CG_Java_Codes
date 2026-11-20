package Arrays;

public class SecondMax {
    public static void main(String[]args){
        int arr[] = {10,20,30,25};
        int max= arr[0];
        int sec = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                sec = max;
                max = arr[i];
            }else if(arr[i]>sec && arr[i]<max){
                sec = arr[i];
            }
        }
        System.out.println(sec);
    }
}
