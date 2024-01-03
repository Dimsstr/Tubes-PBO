import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


class Pengunjung extends Orang implements Perpustakaan {
    private ArrayList<Buku> bukuDipinjam = new ArrayList<>();
    private String alamat;
    private String tanggalLahir;
    private String nim;
    private String tahunmasuk;
    private String fakultas;
    private String jurusan;

    Pengunjung(String nama) {
        super(nama);
    }

    public void buatKartu() {
        System.out.println("Input Data Pengunjung");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Alamat        : ");
        this.alamat = scanner.nextLine();

        System.out.print("Tanggal lahir : ");
        this.tanggalLahir = scanner.nextLine();

        System.out.print("NIM           : ");
        this.nim = scanner.nextLine();

        System.out.print("Tahun Masuk   : ");
        this.tahunmasuk = scanner.nextLine();

        System.out.print("Fakultas      : " );
        this.fakultas = scanner.nextLine();

        System.out.print("Jurusan       : ");
        this.jurusan = scanner.nextLine();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Kartu perpustakaan berhasil dibuat");
        System.out.println("Nama          : " + this.nama);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("Tanggal lahir : " + this.tanggalLahir);
        System.out.println("NIM           : " + this.nim);
        System.out.println("Tahun Masuk   : " + this.tahunmasuk);
        System.out.println("Fakultas      : " + this.fakultas);
        System.out.println("Jurusan       : " + this.jurusan);
        System.out.println("Silakan ambil kartu di bagian loket");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void pinjamBuku() {
        System.out.println("List Buku Tersedia:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < RakBuku.bukuDiRak.size(); i++) {
            Buku buku = RakBuku.bukuDiRak.get(i);
            System.out.println((i + 1) + ". " + buku.judul);
        }

        Scanner scannerChoice = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("Pilih nomor buku yang ingin dipinjam: ");
        int nomorPilihan = scannerChoice.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if (nomorPilihan >= 1 && nomorPilihan <= RakBuku.bukuDiRak.size()) {
            Buku bukuDipilih = RakBuku.bukuDiRak.get(nomorPilihan - 1);

            bukuDipinjam.add(bukuDipilih);
            System.out.println("Berhasil meminjam buku: " + bukuDipilih.judul);
        } else {
            System.out.println("Nomor pilihan tidak valid.");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void kembaliBuku() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
        String judulBukuKembali = scanner.nextLine();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        boolean bukuDitemukan = false;

        for (Buku buku : bukuDipinjam) {
            if (buku.judul.equalsIgnoreCase(judulBukuKembali)) {
                // Mengembalikan buku ke rak buku
                RakBuku.bukuDiRak.add(buku);
                bukuDipinjam.remove(buku);
                System.out.println("Berhasil mengembalikan buku: " + judulBukuKembali);
                bukuDitemukan = true;
                break;
            }
        }

        if (!bukuDitemukan) {
            System.out.println("Buku dengan judul " + judulBukuKembali + " tidak ditemukan di daftar buku yang dipinjam.");
        }
    }

    public void cariBuku() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang ingin dicari: ");
        String judulBukuCari = scanner.nextLine();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        boolean bukuDitemukan = false;

        for (Buku buku : RakBuku.bukuDiRak) {
            if (buku.judul.equalsIgnoreCase(judulBukuCari)) {
                System.out.println("Buku ditemukan di rak.");
                bukuDitemukan = true;
                break;
            }
        }

        if (!bukuDitemukan) {
            System.out.println("Buku tidak ditemukan.");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
