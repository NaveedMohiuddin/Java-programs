
//Program to print the digits after decimal point
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String num=sc.nextLine();
	    for(int i=0;i<num.length()-1;i++){
	        if(num.substring(i,i+1).equals(".")){
	            System.out.println(num.substring(i+1));
	        }
	    }

	}
}