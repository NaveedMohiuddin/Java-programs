/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        boolean isdistinct=true;
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            for(int k=j-1;k>=0;k--){
                if(arr[k]==arr[j]){
                    isdistinct=false;
                    break;
                }
            }
            if(isdistinct==true){
                count+=1;
            }
            isdistinct=true;
        }
        System.out.println(count);
        
	}
}
