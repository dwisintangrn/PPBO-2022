// Nama : Dwi Sinta Anggraini
// NIM  : M0521019
public class PPBO_02_Latihan3 {
    String nim, nama, alamat;
    char jenisKelamin;

    // Buatlah constructor untuk menginisiasi nilai dari variabel
    // nim, nama, jenisKelamin, alamat
    PPBO_02_Latihan3(String Nim, String Nama, char JenisKelamin, String Alamat){
        this.nim = Nim;
        this.nama = Nama;
        this.jenisKelamin = JenisKelamin;
        this.alamat = Alamat;
    }

    void print(){
        System.out.println("Data Mahasiswa :");
        System.out.println("NIM : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Jenis Kelamin : "+jenisKelamin);
        System.out.println("Alamat : "+alamat);
    }

    public static void main(String[] args) {
        PPBO_02_Latihan3 mhs = new PPBO_02_Latihan3("M0501001", "Patrick Star", 'L', "Bikini Bottom");
        mhs.print();
    }
}