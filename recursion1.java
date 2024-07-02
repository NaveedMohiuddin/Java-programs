//Program to print n to 1 using recursion
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    fun(n);
	}
	public static int fun(int n){
	    if(n<=0){
	        return 0;
	    }
	    System.out.print(n+" ");
	    return fun(n-1);
	}
}