# Jobsheet 4 — Pemilihan

**Nama:** Mohammad Wisnu  
**NIM:** 264107020193  
**Materi:** Struktur pemilihan pada Java

## Daftar Isi
- [Experiment 1 — IF](#experiment-1--if)
- [Experiment 2 — SWITCH](#experiment-2--switch)
- [IF-ELSE IF](#if-else-if)
- [Ternary Operator](#ternary-operator)
- [Assignment](#assignment)
- [Dokumentasi](#dokumentasi)

---

## Experiment 1 — IF

### Pertanyaan 1
Program membutuhkan input `true` agar kode di dalam blok `if` dijalankan. Struktur `if` hanya menjalankan blok internal apabila kondisinya bernilai `true`.

### Pertanyaan 2
Jika input `false`, tidak ada output yang dicetak. Program melewati blok `if` dan langsung selesai karena tidak ada instruksi lain setelahnya.

### Pertanyaan 3
Jika input `TRUE` dimasukkan, program tetap berjalan dan mencetak kedua baris pesan.

### Source Code

```java
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
```

### Dokumentasi
![Experiment 1 - Input true](images/image1.png)

![Experiment 1 - Input false](images/image2.png)

![Experiment 1 - IF ELSE](images/image3.png)

---

## Experiment 2 — SWITCH

Program menggunakan `switch-case` untuk menampilkan KRS berdasarkan semester.

### Pertanyaan 1
`break` digunakan untuk menghentikan dan keluar dari blok `switch` setelah kondisi `case` terpenuhi.

### Pertanyaan 2
Program dapat menghasilkan output yang valid untuk input `10` dan `0` sesuai kode yang dijalankan. `default` berfungsi sebagai penanganan ketika input tidak cocok dengan `case` yang tersedia. Jika `default` dihapus, program tetap berjalan, tetapi input yang tidak cocok tidak menghasilkan output dari `switch`.

### Pertanyaan 3
`switch` tidak dapat menggunakan `double` atau `float` sebagai selector. Tipe yang dapat digunakan antara lain `byte`, `short`, `char`, `int`, wrapper `Byte`, `Short`, `Character`, `Integer`, `enum`, dan `String`.

### Source Code

```java
import java.util.Scanner;

public class PemilihanSwitch20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Cetak KRS SIAKAD--");
        System.out.println("Masukkan semester saat ini");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("KRS Semester 1 Ditampilkan");
                break;
            case 2:
                System.out.println("KRS Semester 2 Ditampilkan");
                break;
            case 3:
                System.out.println("KRS Semester 3 Ditampilkan");
                break;
            case 4:
                System.out.println("KRS Semester 4 Ditampilkan");
                break;
            case 5:
                System.out.println("KRS Semester 5 Ditampilkan");
                break;
            case 6:
                System.out.println("KRS Semester 6 Ditampilkan");
                break;
            case 7:
                System.out.println("KRS Semester 7 Ditampilkan");
                break;
            case 8:
                System.out.println("KRS Semester 8 Ditampilkan");
                break;
            default:
                System.out.println("Invalid semester");
        }

        sc.close();
    }
}
```

### Dokumentasi
![Experiment 2 - Switch](images/image4.png)

---

## IF-ELSE IF

Struktur `if-else if` digunakan untuk mengecek beberapa kondisi semester secara berurutan.

```java
import java.util.Scanner;

public class PemilihanElif20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Cetak KRS SIAKAD--");
        System.out.println("Masukkan semester saat ini");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS semester 1 ditampilkan");
        } else if (semester == 2) {
            System.out.println("KRS semester 2 ditampilkan");
        } else if (semester == 3) {
            System.out.println("KRS semester 3 ditampilkan");
        } else if (semester == 4) {
            System.out.println("KRS semester 4 ditampilkan");
        } else if (semester == 5) {
            System.out.println("KRS semester 5 ditampilkan");
        } else if (semester == 6) {
            System.out.println("KRS semester 6 ditampilkan");
        } else if (semester == 7) {
            System.out.println("KRS semester 7 ditampilkan");
        } else if (semester == 8) {
            System.out.println("KRS semester 8 ditampilkan");
        } else {
            System.out.println("Invalid semester");
        }

        sc.close();
    }
}
```

### Readability
Berdasarkan jobsheet, `switch-case` lebih mudah dibaca untuk kondisi berupa nilai diskrit yang berasal dari satu variabel karena tidak perlu menulis pengecekan seperti `semester == ...` berulang kali.

![IF-ELSE IF](images/image5.png)

---

## Ternary Operator

Operator ternary cocok digunakan ketika memberikan nilai berdasarkan satu kondisi sederhana. Namun, ternary sebaiknya dihindari untuk kondisi bersarang atau logika kompleks karena dapat mengurangi keterbacaan kode.

```java
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
```

![Ternary Operator](images/image6.png)

---

# Assignment

## 1. Validasi Jumlah SKS

Program mengecek apakah jumlah SKS yang dimasukkan masih berada pada batas maksimal 24 SKS.

```java
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
```

![Tugas Validasi SKS](images/image7.png)

---

## 2. Sistem Parkir

Program menghitung biaya parkir berdasarkan lama parkir:

- Sampai 2 jam: Rp2.000
- Lebih dari 2 jam: tambahan Rp1.000 untuk setiap jam berikutnya.

```java
import java.util.Scanner;

public class TugasParkir20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int parkingDuration;
        int totalCost = 0;

        System.out.print("Enter parking duration: ");
        parkingDuration = sc.nextInt();

        if (parkingDuration <= 2) {
            totalCost = 2000;
        } else {
            totalCost = 2000 + (parkingDuration - 2) * 1000;
        }

        System.out.println("The total parking cost for " + parkingDuration
                + " hours is: Rp " + totalCost);

        sc.close();
    }
}
```

![Tugas Sistem Parkir](images/image8.png)

---

## 3. Academic Queue Machine

Program menggunakan `switch-case` untuk menentukan layanan akademik dan counter berdasarkan kode layanan.

```java
import java.util.Scanner;

public class TugasAntrean20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int serviceCode;

        System.out.println("Academic Queue Machine");
        System.out.print("Enter service code: ");
        serviceCode = sc.nextInt();

        switch (serviceCode) {
            case 1:
                System.out.println("Service: Degree Legalization");
                System.out.println("Counter: Counter A");
                break;

            case 2:
                System.out.println("Service: Active Student Certificate");
                System.out.println("Counter: Counter B");
                break;

            case 3:
                System.out.println("Service: Academic Transcript");
                System.out.println("Counter: Counter C");
                break;

            case 4:
                System.out.println("Service: Academic Leave Application");
                System.out.println("Counter: Counter D");
                break;

            default:
                System.out.println("Invalid service code");
        }

        sc.close();
    }
}
```

![Tugas Academic Queue Machine](images/image9.png)

---

## Struktur Folder GitHub

```text
Jobsheet4/
├── README.md
├── PemilihanIf20.java
├── PemilihanSwitch20.java
├── PemilihanElif20.java
├── PemilihanIfTernary20.java
├── Tugas2Pemilihan20.java
├── TugasParkir20.java
├── TugasAntrean20.java
└── images/
    ├── image1.png
    ├── image2.png
    ├── image3.png
    ├── image4.png
    ├── image5.png
    ├── image6.png
    ├── image7.png
    ├── image8.png
    └── image9.png
```

> **Catatan GitHub:** jangan mengubah folder `images`. Path seperti `![gambar](images/image1.png)` akan membuat gambar tampil otomatis di README GitHub selama file gambarnya ikut di-upload.

## Kesimpulan

Jobsheet 4 membahas struktur pemilihan pada Java, meliputi `if`, `if-else if`, `switch-case`, dan operator ternary. Setiap struktur memiliki penggunaan yang berbeda berdasarkan kompleksitas dan bentuk kondisi yang ingin diperiksa.
