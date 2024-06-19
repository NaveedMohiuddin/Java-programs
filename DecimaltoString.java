//Program to convert Decimal to binary
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int decimal = sc.nextInt();
		String binary = "";
		int rem;
		while(decimal>0){
		    rem = decimal%2;
		    binary=rem+binary;
		    decimal=decimal/2;
		}
		System.out.println(binary);
	}
}