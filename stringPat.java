//Program to find the index and count of pattern in string
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String pat=sc.nextLine();
	int i=0,count=1;
	i=s.indexOf(pat);
	while(i>=0){
	    System.out.println(i+"\t"+count);
	    count+=1;
	    i=s.indexOf(pat,i+1);
	}
	}
}