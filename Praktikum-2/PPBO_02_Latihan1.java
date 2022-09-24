// Nama : Dwi Sinta Anggraini
// NIM  : M0521019
public class PPBO_02_Latihan1 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;
        float c = 4.3f;

        // ubah variabel a dan c ke tipe data double
        double Ubah_a = Double.valueOf(a);
        double Ubah_c = Double.valueOf(c);

        // jumlahkan variabel a, b, dan c
        double jumlah = Ubah_a + b + Ubah_c;

        // tampilkan hasil penjumlahan ketiga variabel
        System.out.println("Hasil penjumlahan ketiga variabel adalah : "+jumlah);
    }
}

/*
 * Output yang diharapkan:
    17.3
 */
