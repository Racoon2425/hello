import java.util.*;
public class factorial_of_n{
    public static int factorial(int n){
    if(n==1){
        return 1;
    }
    int fac = factorial(n-1);
    int result = n*fac;
    return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.print(factorial(n));
    }
}