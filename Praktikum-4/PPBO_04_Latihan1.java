// Nama : Dwi Sinta Anggraini
// NIM  : M0521019

import java.util.Scanner;

public class PPBO_04_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }
}

/* a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
 - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB : program tidak dapat dijalankan dan terjadi eror karena karakter yang diinputkan tidak sesuai 
dengan tipe data yang diminta. 

output yang muncul adalah :

Exception in thread "main" java.util.InputMismatchException      
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)   
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at PPBO_04_Latihan1.main(PPBO_04_Latihan1.java:10)     

*/

/* b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
    Jelaskan output yang muncul!
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB : program dapat dijalankan dan tidak terjadi eror karena karakter yang diinputkan sesuai dengan tipe data 
yang diminta.

output yang muncul adalah :

5 / 0 = Infinity
seharusnya jika sesuai dengan teori matematika suatu bilangan tidak bisa dibagi dengan 0, namun pada java
bilangan dengan tipe data double jika dibagi 0 akan menghasilkan infinity atau tak hingga

*/
