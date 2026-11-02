import java.util.*;
public class Loan
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int age = sc.nextInt();
	    int salary = 25000;
	    if(age>=21 && salary>=25000){
	        System.out.println("eligible for the loan");
	    }else{
		System.out.println("Not eligible");
	}
	}
}