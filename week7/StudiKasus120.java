package ProgramingTask.week7;
import java.util.Scanner;

public class StudiKasus120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int HARGA_KOPI = 18000;
        int jumlah;
        int total;
        double diskon = 0;
        double totalBayar;
        double uangBayar;
        double kembalian;

        System.out.print("Jumlah kopi yang dibeli: ");
        jumlah = input.nextInt();

        total = jumlah * HARGA_KOPI;

        if (total >= 100000) {
            diskon = total * 0.10;
        }

        totalBayar = total - diskon;

        System.out.println("Total harga: Rp" + total);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total pembayaran: Rp" + totalBayar);

        System.out.print("Uang yang dibayarkan: Rp");
        uangBayar = input.nextDouble();

        kembalian = uangBayar - totalBayar;
        System.out.println("Kembalian: Rp" + kembalian);

        input.close();
    }
}