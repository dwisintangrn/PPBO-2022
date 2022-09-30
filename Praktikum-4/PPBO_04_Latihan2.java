// Nama : Dwi Sinta Anggraini
// NIM  : M0521019

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
/* Jawab: berbeda dengan Latihan1 yang eror ketika diinputkan karakter yang tidak sesuai dengan tipe data,
pada Latihan2 program tetap dapat berjalan dan tidak terjadi eror. hal ini dikarenakan telah dilakukan exception
handling menggunakan statement catch sehingga jika karakter yang diinputkan tidak sesuai dengan tipe data, 
maka output yang muncul adalah :

Input salah, masukkan angka

kemudian user akan diminta menginputkan karakter yang sesuai dengan tipe data
*/
