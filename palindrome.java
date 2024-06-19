//Program to check if a string is palindromme or not
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
	   if(s.equals(rev)){
	    System.out.println("It is a palindrome");
	   }
	   else{
	       System.out.println("It is not a palindrome");
	   }
	}
}