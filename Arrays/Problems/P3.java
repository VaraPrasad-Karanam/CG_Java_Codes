package Arrays.Problems;

public class P3 {
    public static void main(String[] args){
        int arr[] = {2,3,4,5,6,7};
        int arr1[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int mul = 1;
           for(int j=0;j<arr.length;j++){
            if(i==j){
                mul = mul*1;
            }else{
                mul = mul * arr[j];
            }
           }
           arr1[i]= mul;
        }
        for(int i:arr1){

            System.out.print(i+" ");
        }
    }
}
