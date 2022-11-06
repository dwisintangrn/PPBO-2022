// Nama : Dwi Sinta Anggraini
// NIM  : M0521019

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PPBO_07_InputTeks {
	// method ini untuk input teks oleh user melalui keyboard
	public String ketikTeks() {
		System.out.println("Ketik kalimat yang akan disimpan :");
		Scanner sc = new Scanner(System.in);
		// ambil 1 kalimat, setelah tekan enter teks akan diambil
		String str1 = sc.nextLine();
        sc.close();
		return str1;
	}

	// untuk menyimpan teks yang diketik user ke file
	public void simpanTeks(String teks) {
		// set up file and stream
		// ganti path "/tmp/sample3.data" dengan alamat file di komputer anda
		File outFile = new File(System.getProperty("user.dir") + "/sample3.data");
		FileOutputStream outFileStream;
		try {
			outFileStream = new FileOutputStream(outFile);
			PrintWriter outStream = new PrintWriter(outFileStream);
			outStream.print(teks);
			outStream.close();
			System.out.println("file berhasil disimpan");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PPBO_07_InputTeks it = new PPBO_07_InputTeks();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
	}
}

//Pertanyaan : Jalankan source code tersebut, buka file teks menggunakan text editor, jelaskan seperti apa hasilnya?
//Jawab : Setelah source code dijalankan dan file sample3.data dibuka menggunakan text editor
//        hasil pada file sample3.data sama seperti teks yang diinputkan.
//        sebagai contoh, saya menginputkan "PPBO = PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK",
//        maka, hasil pada file sample3.data juga menampilkan tulisan "PPBO = PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK"
