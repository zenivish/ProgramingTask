import java.util.Scanner;

public class Tugas2Pemilihan20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahSks;

        System.out.println("Masukkan Jumlah SKS Anda");
        jumlahSks = sc.nextInt();

        if (jumlahSks <= 24) {
            System.out.println("KRS anda valid");
        } else {
            System.out.println("KRS anda tidak valid");
        }

        sc.close();
    }
}
