//Program to print 1 to n using recursion
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    fun(n);
	}
	public static void fun(int n){
	    if(n<=0){
	        return ;
	    }
	    fun(n-1);
	    System.out.print(n+" ");
	}
}