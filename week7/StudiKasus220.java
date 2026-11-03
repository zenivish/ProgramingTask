package ProgramingTask.week7;
import java.util.Scanner;

public class StudiKasus220 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkat = 0;
        int statusPKM = 0;
        int dokumenKurang;
        boolean memenuhiSyarat = false;
        String alasan;

        System.out.print("Nama mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = input.nextLine().trim().toLowerCase();

        if (jenisKegiatan.equals("belmawa")
                || jenisKegiatan.equals("bakorma")
                || jenisKegiatan.equals("mandiri")) {
            System.out.print("Peringkat (1, 2, 3; 0 jika bukan juara): ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                memenuhiSyarat = true;
                alasan = "Memenuhi syarat peringkat kompetisi.";
            } else {
                alasan = "Tidak memenuhi syarat: hanya juara 1, 2, atau 3.";
            }

        } else if (jenisKegiatan.equals("pkm")) {
            System.out.print("Status pendanaan PKM (1 = disetujui, 0 = tidak): ");
            statusPKM = input.nextInt();

            if (statusPKM == 1) {
                memenuhiSyarat = true;
                alasan = "Proposal PKM disetujui untuk pendanaan.";
            } else {
                alasan = "Proposal PKM tidak disetujui untuk pendanaan.";
            }

        } else {
            alasan = "Jenis kegiatan tidak termasuk dalam ketentuan.";
        }

        if (memenuhiSyarat) {
            System.out.print("Jumlah dokumen yang diunggah (0-4): ");
            jumlahDokumen = input.nextInt();

            if (jumlahDokumen >= 4) {
                System.out.println("Status: Berhak menerima dana penghargaan.");
                System.out.println("Alasan: " + alasan);
            } else {
                dokumenKurang = 4 - jumlahDokumen;
                System.out.println("Status: Tidak berhak menerima dana penghargaan.");
                System.out.println("Alasan: Dokumen belum lengkap.");
                System.out.println("Dokumen yang masih kurang: " + dokumenKurang);
            }
        } else {
            System.out.println("Status: Tidak berhak menerima dana penghargaan.");
            System.out.println("Alasan: " + alasan);
        }

        System.out.println("Nama mahasiswa: " + nama);
        input.close();
    }
}
