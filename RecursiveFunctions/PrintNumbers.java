package RecursiveFunctions;

public class PrintNumbers {
    public static void print(int n){
        if(n>5){
            return;
        }
        System.out.print(n+" ");
        print(n+1);
    }
    static int sum = 0;
    public static int addNumbers(int n,int sum){
        if(n>5){
            return sum;
        }
        sum = sum+n;
        return addNumbers(n+1,sum);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static int sum1(int n, int res){
        if(n==0){
            return res;
        }
        res = res*10 + n%10;
        return sum1(n/10, res);
    }
    public static void main(String[] args) {
        print(1);
        int res = addNumbers(1, 0);
        System.out.println(res);
        System.out.println(fact(5));
        System.out.println(sum1(123,0));
    }
}
