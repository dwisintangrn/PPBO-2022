// Nama : Dwi Sinta Anggraini
// NIM  : M0521019

public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        for (int i = 1; i < 6; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab: kode perulangan for pada code diatas masih belum tepat.
//        hal ini dikarenakan pada java array dimulai dari indeks 0, sedangkan pada code inisiasi i adalah 1
//        sehingga menyebabkan array pada indeks 0 yaitu 5 tidak ditampilkan dan hanya menampilkan array dengan
//        indeks 1-4 yaitu 1, 4, 2, 3

//        untuk perbaikan dapat mengubah inisiasi i menjadi sama dengan 0 sebagai berikut,
//        for (int i = 0; i < 5; i++)
//        System.out.println("elemen ke-" + i + " = " + arr[i]);
//        }