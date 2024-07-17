// program to print the all substrings of a string
import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String curr="";
        int i=0;
        fun(s,curr,i);
	   
	}
	
	static void fun(String s,String curr, int i){
	    if(s.length()==i){
	        System.out.print(curr);
	        return;
	    }
	    fun(s,curr,i+1);
	    fun(s,curr+s.charAt(i),i+1);
	}
		
}