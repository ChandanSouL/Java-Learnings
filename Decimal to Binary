import java.util.Scanner;
import java.io.*;
public class Main {
    public static void decToBin(int n) {
        int[] binaryNum = new int[32];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.println(binaryNum[j]);
        }
    }
        public static void main() {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            decToBin(n);
        }
}
