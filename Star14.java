import java.util.Scanner;

public class Star14 {

    public static void main(String[] args) {
        Scanner hikmal = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = hikmal.nextInt();
        for(int i=1; i<=n; i++) {
            System.out.print("*");
        }
    }
}