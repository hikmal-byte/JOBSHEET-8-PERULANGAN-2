import java.util.Scanner;

public class Tugas1_14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n14 = hikmal14.nextInt();
        int j14 = 1;
        int k14 = 1;
        for (int i14 = 1; i14 <= n14; i14++) {
            int satu14 = 1;
            int angka14 = 1;
            while (j14 <= i14) {
                int jumlah14 = 0;
                System.out.print("n = " + i14 + "-> jumlah kuadrat = " + satu14);
                while (k14 <= j14) {
                    if (i14 > 0) {
                        jumlah14 = satu14;
                        if (i14 > 1) {
                            angka14 = 2;
                            angka14 *= 2;

                            System.out.print("+ " + angka14);
                            jumlah14 += angka14;
                            if (i14 > 2) {
                                angka14 = 3;
                                angka14 *= 3;
                                System.out.print("+ " + angka14);
                                jumlah14 += angka14;
                                if (i14 > 3) {
                                    angka14 = 4;
                                    angka14 *= 4;
                                    System.out.print("+ " + angka14);
                                    jumlah14 += angka14;
                                    if (i14 > 4) {
                                        angka14 = 5;
                                        angka14 *= 5;
                                        System.out.print("+ " + angka14);
                                        jumlah14 += angka14;
                                        if (i14 > 5) {
                                            angka14 = 6;
                                            angka14 *= 6;
                                            System.out.print("+ " + angka14);
                                            jumlah14 += angka14;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    k14++;
                }

                System.out.print("= " + jumlah14);
                System.out.println();
                j14++;
            }
        }

    }

}