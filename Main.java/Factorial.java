import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int fac=sc.nextInt();
        int res=1;
        for(int i=fac;i>0;i--){
            res=res*i;
        }
        System.out.println(res);

	}
}
