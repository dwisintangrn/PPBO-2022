// Nama : Dwi Sinta Anggraini
// NIM  : M0521019

import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        
        // tambahkan code untuk menyimpan nominal total pembelian
        double total = sc.nextDouble();
        double diskon = 0.0;

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        if(total < 50000){
            diskon = 0.0;
        }else if(total >= 50000 && total < 75000){
            diskon = 0.05;
        }else if(total >= 75000 && total < 125000){
            diskon = 0.15;
        }else{
            diskon = 0.2;
        }

        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        double bayar = total - (total * diskon);

        // sesuai dengan ketentuan diskon yang diberikan
        System.out.println("Total harga yang harus dibayar : Rp. "+bayar);

        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000
