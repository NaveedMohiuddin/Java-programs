import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	boolean ans=isSorted(arr,n);
	if(ans){
	    System.out.println("yes");
	}
	else{
	    System.out.println("No");
	}
	

	}
	
	public static boolean isSorted(int[] arr,int n){
	    for(int i=0;i<n;i++){
	        for(int k=i-1;k>=0;k--){
	            if(arr[i]<arr[k]){
	                return false;
	            }
	        }
	    }
	    return true;
	}
}
