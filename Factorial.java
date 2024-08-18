import java.util.Scanner;

public class Main {
    public static int factorial(int n){
        int fact= 1;
        if(n<=0){
            return 1;
        }
        for(int i=n;i>=1;i--){
            fact =  fact*i;
        }
        System.out.println(fact);
        return 1;
    }
    public static void main(String args[]) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        factorial(n);
    }
}
