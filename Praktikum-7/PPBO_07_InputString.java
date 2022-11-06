// Nama : Dwi Sinta Anggraini
// NIM  : M0521019

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PPBO_07_InputString {
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
		File outFile = new File(System.getProperty("user.dir") + "/sample4.data");
		FileOutputStream outFileStream;
		try {
			outFileStream = new FileOutputStream(outFile);
			DataOutputStream outStream = new DataOutputStream(outFileStream);
			outStream.writeBytes(teks);
			outStream.close();
			System.out.println("file berhasil disimpan");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
        }
	}

	public static void main(String[] args) {
		PPBO_07_InputString it = new PPBO_07_InputString();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
	}
}

//Pertanyaan : Jalankan source code tersebut, buka file teks menggunakan text editor, jelaskan seperti apa hasilnya?
//Jawab : Sama dengan Tugas 1, setelah source code dijalankan dan file sample4.data dibuka menggunakan text editor
//        hasil pada file sample4.data sama seperti teks yang diinputkan.
//        sebagai contoh, saya menginputkan "PPBO" maka, hasil pada file sample4.data juga menampilkan tulisan "PPBO"

//Pertanyaan : jelaskan perbedaan cara kerja dari PrintWriter.write() dan DataOutputStream.writeBytes()
//Jawab : PrintWriter.write() termasuk dalam Character Stream, dimana cara kerjanya adalah dengan mengubah tipe 
//        data primitif (int, float, char, dll) ke bentuk teks. Sedangkan DataOutputStream.write() merupakan contoh 
//        untuk Byte Stream (biner), dimana cara kerjanya adalah dengan menuliskan karakter dalam urutan byte yang 
//        mewakili tipe data primitif.