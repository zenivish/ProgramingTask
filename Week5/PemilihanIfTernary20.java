import java.util.Scanner;

public class PemilihanIfTernary20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Cetak KRS Siakad--");
        System.out.print("Apakah UKT sudah lunas (true/false): ");
        boolean UKTLunas = sc.nextBoolean();

        String pesan = UKTLunas
                ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
                : "Pembayaran UKT belum terverifikasi\nMohon membayar UKT anda terlebih dahulu";

        System.out.println(pesan);

        sc.close();
    }
}
