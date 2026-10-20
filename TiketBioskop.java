import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaTiket = 50000, jumlahTiket, totalTerjual = 0;
        double totalPenjualan = 0, diskon = 0;

        while (true){
            System.out.print("Masukkan Jumlah Tiket Yang Dibeli (ketik '0' untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0){
                break;
            }

            if (jumlahTiket < 0){
                System.out.println("Jumlah tidak valid. Mohon masukkan jumlah yang valid!");
                continue;
            }

            if (jumlahTiket > 4) {
                diskon = 0.10;
            } else if (jumlahTiket > 10) {
                diskon = 0.15;
            }

            double hargaAsli = jumlahTiket * hargaTiket;
            double totalBayar = hargaAsli - (hargaAsli * diskon);
            
            totalTerjual += jumlahTiket;
            totalPenjualan += totalBayar;

            System.out.println("Total Yang Harus Dibayar: " + totalBayar);
        }

        System.out.println("Total Tiket Terjual: " + totalTerjual);
        System.out.println("Total Harga Penjualan: Rp. " + totalPenjualan);
    }
}
