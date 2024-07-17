import java.util.*;
class Main{
    public static void main(String[] args){
        System.out.println("Enter the number of disks");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char A='A',B='B',C='C';
        TOH(n,A,B,C);
        
    }

    static void  TOH(int n,char A, char B,char C){
        if(n==1){
            System.out.println("Move 1 from "+A+" to "+C);

        }
        else{
            TOH(n-1,A,C,B);
            System.out.println("Move "+n+" from "+A+" to "+C);
            TOH(n-1,B,A,C);

        }
    }
}