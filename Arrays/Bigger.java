package Arrays;

public class Bigger {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int max = arr[0];
        for(int i: arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println("Max: " + max);
    }
}
