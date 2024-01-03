import java.util.List;
import java.util.ArrayList;

public class RakBuku {
    static ArrayList<Buku> bukuDiRak = new ArrayList<>();

    static {
        bukuDiRak.add(new Buku("Laskar Pelangi"));
        bukuDiRak.add(new Buku("Negeri 5 Menara"));
        bukuDiRak.add(new Buku("Sang Pemimpi"));
        bukuDiRak.add(new Buku("Bumi Manusia"));
        bukuDiRak.add(new Buku("Anak Semua Bangsa"));
        bukuDiRak.add(new Buku("Jejak Langkah"));
        bukuDiRak.add(new Buku("Rumah Kaca"));
        bukuDiRak.add(new Buku("Burung-Burung Manyar"));
        bukuDiRak.add(new Buku("Saman"));
        bukuDiRak.add(new Buku("Larung"));
        bukuDiRak.add(new Buku("Cantik Itu Luka"));
        bukuDiRak.add(new Buku("Sepatu Dahlan"));
        bukuDiRak.add(new Buku("Edensor"));
        bukuDiRak.add(new Buku("Maryamah Karpov"));
        bukuDiRak.add(new Buku("Padang Bulan"));
        bukuDiRak.add(new Buku("Cinta dalam Gelas"));
        bukuDiRak.add(new Buku("Pulang"));
        bukuDiRak.add(new Buku("Rantau 1 Muara"));
        bukuDiRak.add(new Buku("Ayah"));
        bukuDiRak.add(new Buku("Andrea Hirata"));
        bukuDiRak.add(new Buku("Perahu Kertas"));
        bukuDiRak.add(new Buku("Para Priyayi"));
        bukuDiRak.add(new Buku("Manusia Setengah Salmon"));
        bukuDiRak.add(new Buku("Madre"));
        bukuDiRak.add(new Buku("Filosofi Kopi"));
        bukuDiRak.add(new Buku("Supernova: Ksatria, Puteri, dan Bintang Jatuh"));
        bukuDiRak.add(new Buku("Supernova: Akar"));
        bukuDiRak.add(new Buku("Bilangan Fu"));
        bukuDiRak.add(new Buku("Entrok"));
        bukuDiRak.add(new Buku("Lelaki Harimau"));
        bukuDiRak.add(new Buku("Tenggelamnya Kapal Van Der Wijck"));
        bukuDiRak.add(new Buku("Siti Nurbaya"));
        bukuDiRak.add(new Buku("Habibie & Ainun"));
        bukuDiRak.add(new Buku("Ronggeng Dukuh Paruk"));
        bukuDiRak.add(new Buku("Balada Si Roy"));
        bukuDiRak.add(new Buku("Ketika Cinta Bertasbih"));
        bukuDiRak.add(new Buku("Hafalan Shalat Delisa"));
        bukuDiRak.add(new Buku("Cerita Calon Arang"));
        bukuDiRak.add(new Buku("Bumi Cinta"));
        bukuDiRak.add(new Buku("Pesan Dari Bintang"));
        bukuDiRak.add(new Buku("Gadis Pantai"));
        bukuDiRak.add(new Buku("Atap Puisi"));
        bukuDiRak.add(new Buku("Pukat"));
        bukuDiRak.add(new Buku("Musashi"));
        bukuDiRak.add(new Buku("Negara Kelima"));
        bukuDiRak.add(new Buku("Jakarta Undercover"));
        bukuDiRak.add(new Buku("Kedai 1001 Mimpi"));
        bukuDiRak.add(new Buku("Selamat Tinggal"));
        bukuDiRak.add(new Buku("Jalan Raya Pos, Jalan Daendels"));
        bukuDiRak.add(new Buku("Garis Batas"));
        bukuDiRak.add(new Buku("Kuambil Lagi Hatiku"));
        bukuDiRak.add(new Buku("5 cm"));
        bukuDiRak.add(new Buku("9 Summers 10 Autumns"));
        bukuDiRak.add(new Buku("Hujan Bulan Juni"));
        bukuDiRak.add(new Buku("Dunia Sophie"));
    }
    static List<Buku> cariBukuDalamRak(char awal, char akhir) {
        List<Buku> hasil = new ArrayList<>();
        for (Buku buku : bukuDiRak) {
            if (buku.judul.charAt(0) >= awal && buku.judul.charAt(0) <= akhir) {
                hasil.add(buku);
            }
        }
        return hasil;
    }
}

