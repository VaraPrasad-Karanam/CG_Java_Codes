package Arrays.Problems;

public class P4 {
    public static void main(String[] args) {
        int arr[] = {22, 17, 4, 66, 8, 2, 87};
        int a = 1;
        while(a<=100){
            boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(a==arr[i]){
                found = true;
                break;
            }
        }
        if(!found){

            System.out.print(a+" ");
        }
        a++;
        }
    }
}
