import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~ Selamat Datang di Perpustakaan Universitas Pancasila  ~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Penjaga penjaga = new Penjaga("Bambang Sugeni");
        Pengunjung pengunjung;
        System.out.println("Nama Penjaga: " + penjaga.nama);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Masukkan nama Pengunjung: ");
        String namaPengunjung = scanner.nextLine();
        pengunjung = new Pengunjung(namaPengunjung);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        String aktivitasLain = "ya"; // Inisialisasi nilai awal
        do {
            System.out.println("Pilihan Aktivitas: \n1. Membuat kartu perpustakaan\n2. Meminjam buku\n3. Mengembalikan buku\n4. Mencari buku");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Input (1/2/3/4) sesuai dengan pilihan di atas: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int pilihan = 0;
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid.");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                continue;
            }

            switch (pilihan) {
                case 1:
                    pengunjung.buatKartu();
                    break;
                case 2:
                    // Meminjam buku
                    pengunjung.pinjamBuku();
                    break;
                case 3:
                    pengunjung.kembaliBuku();
                    break;
                case 4:
                    pengunjung.cariBuku();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.print("Apakah ada aktivitas lainnya? (ya/tidak): ");
            aktivitasLain = scanner.nextLine();
        } while (aktivitasLain.equalsIgnoreCase("ya"));

        scanner.close();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Terimakasih sudah mengunjungi perpustakaan Universitas Pancasila");
    }
}
