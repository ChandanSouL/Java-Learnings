import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String original = scan.next();
        String result = "";
        for(int i=0;i<= original.length();i++){
            if(original.charAt(i)=='e'){
                result += i;
            }else{
                result += original.charAt(i);
            }
        }
        System.out.println(result);

    }
}
