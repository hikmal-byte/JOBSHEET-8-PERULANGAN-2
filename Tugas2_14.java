import java.util.Scanner;

public class Tugas2_14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        System.out.print("Masukkan nilai N untuk membuat persegi: ");
        int n14 = hikmal14.nextInt();

        for (int i14 = 1; i14 <= n14; i14++) {
            for (int j14 = 0; j14 < n14; j14++) {
                if (i14 == 1) {

                    System.out.print(n14 + "  ");
                }

                if (i14 > 1 && j14 == 0 && i14 < n14) {
                    System.out.println();
                    System.out.print(n14 + "  ");
                    if (i14 > 1 && j14 == 0 && i14 < n14) {
                        int l14 = i14;
                        while (l14 < n14) {

                            if (i14 > 1 && i14 < n14) {
                                int o14 = 2;
                                do {
                                    System.out.print("   ");
                                    o14++;
                                } while (o14 < n14);
                            }
                            System.out.print(n14);
                            break;
                        }


                    }
                }
                if (i14 == n14) {
                    System.out.println();
                }
                if (i14 == n14) {
                    for (int k14 = 0; k14 < n14; k14++) {
                        System.out.print(n14 + "  ");
                    }
                    break;
                }
            }
        }
    }
}