import java.util.*;

public class basic{
    public static void evenOdd (int n){
        if(n%2==0){
            System.out.print("Number is even");
        }
        else{
            System.out.print("Number is odd");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        evenOdd(n);
    }
}