import java.util.Scanner;

public class NilaiKelompok14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        int j14, nilai14;
        float totalNilai14, rataNilai14 = 0f;
        int i14 = 1, kelompok14 = 0;
        double nilaiTertinggi14 = 0;
        while (i14 <= 6) {
            System.out.println("Kelompok " + i14);

            totalNilai14 = 0;
            for (j14 = 1; j14 <= 5; j14++) {
                System.out.print("Nilai dari Kelompok Penilai " + j14 + ": ");
                nilai14 = hikmal14.nextInt();
                totalNilai14 += nilai14;
            }

            rataNilai14 = totalNilai14 / 5;
            if (rataNilai14 > nilaiTertinggi14) {
                nilaiTertinggi14 = rataNilai14;
                kelompok14 = i14;
            }
            System.out.print("Kelompok " + i14 + ": nilai rata-rata = " + rataNilai14);
            System.out.println();
            i14++;
        }
        System.out.println("Kelompok " + kelompok14 + " dengan Rata rata tertinggi: " + nilaiTertinggi14);

    }

}