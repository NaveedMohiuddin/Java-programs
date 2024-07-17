//program to check a string is palindrome using recursion
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean res = fun(s,0,s.length()-1);
		System.out.print(res);
		
	}
	
	static boolean fun(String s,int start, int end){
	    if(start>=end){
	        return true;
	    }
	    if(s.charAt(start)==s.charAt(end)){
	        return fun(s,start+1,end-1);
	    }
	    return false;
	}
}