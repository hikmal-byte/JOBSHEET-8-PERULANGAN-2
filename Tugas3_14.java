import java.util.Scanner;
public class Tugas3_14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        System.out.print("Jumlah cabang kafe : ");
        int n14 = hikmal14.nextInt();
        int totalPelanggan14 = 0;
        int totalItem14 = 0;
        for (int i14 = 1; i14 <= n14; i14++) {
            System.out.println("--- Cabang " + i14 + " ---");
            System.out.print("Jumlah pelanggan : ");
            int jumlahPelanggan14 = hikmal14.nextInt();
            int j14 = 1;
            int jumlahItem14 = 0;
            do {
                System.out.print("Pelanggan " + j14 + " memesan berapa item? ");
                int item14 = hikmal14.nextInt();
                jumlahItem14 += item14;
                j14++;
            } while (j14 <= jumlahPelanggan14);
            System.out.println("Cabang " + i14 + " : ");
            System.out.println("- Pelanggan: " + jumlahPelanggan14+ " orang");
            System.out.println("- Item Terjual: " + jumlahItem14);
            totalItem14 += jumlahItem14;
            totalPelanggan14 += jumlahPelanggan14;
            
        }
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan14 + " orang");
        System.out.println("Item terjual: " + totalItem14 + " item");
        
    }
}