//Program to print Reverse of a string
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   String rev="";
	   for(int i=0;i<s.length();i++){
	       rev=s.substring(i,i+1)+rev;
	   }
	   System.out.println(rev);
	}
}
