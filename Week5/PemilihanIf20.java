import java.util.Scanner;

public class PemilihanIf20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Cetak KRS Siakad--");
        System.out.print("Apakah UKT sudah lunas (true/false): ");
        boolean UKTLunas = sc.nextBoolean();

        if (UKTLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.print("Silahkan cetak KRS dan minta tanda tangan DPA");
        }

        sc.close();
    }
}
