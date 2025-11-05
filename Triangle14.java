import java.util.Scanner;

public class Triangle14 {
    public static void main(String[] args) {
        Scanner hikmal = new Scanner (System.in);
        System.out.print("Masukkan nilai N = ");
        int n14 = hikmal.nextInt();
        int i14 = 1;
        while (i14 <= n14) {
            int j14 = 0;
            while (j14 < i14) {
                System.out.print("*");
                j14++;
            }
             System.out.println();
            i14++;
        }
    }
}