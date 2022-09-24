// Nama : Dwi Sinta Anggraini
// NIM  : M0521019
public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}
// Apa yang salah dengan source code tersebut?
// Jawaban : keyword final pada variabel bersifat konstanta dan tidak bisa diubah nilainya
//           sehingga ketika variabel KURS_DOLLAR diubah nilainya pada line 8, maka akan terjadi eror

// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban : keyword static digunakan untuk membuat variabel dan method yang dapat dipanggil secara 
//           langsung tanpa harus membentuk objek.