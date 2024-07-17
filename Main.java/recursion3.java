//program to print sum of n natural numbers using recursion
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum = fun(n);
		System.out.print(sum);
	}
	
	static int fun(int n){
	    if(n==0){
	        return 0;
	    }
	    return fun(n-1)+n;
	}
}