# JOBSHEET 4 - PEMILIHAN 1

**Identitas Mahasiswa:**

* **Nama:** Mohammad Wisnu
* **NIM:** 264107020193
* **Kelas:** TI - 1I

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu memahami konsep dasar struktur pemilihan (*conditional statement*) pada Java.
2. Mahasiswa mampu mengimplementasikan struktur `if`, `if-else if`, `switch-case`, dan operator ternary pada Java.
3. Mahasiswa mampu memahami alur eksekusi program berdasarkan kondisi yang diberikan.
4. Mahasiswa mampu membandingkan penggunaan beberapa struktur pemilihan berdasarkan kebutuhan program.
5. Mahasiswa mampu menerapkan struktur pemilihan pada beberapa studi kasus sederhana.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Penerapan Struktur IF

Percobaan pertama menggunakan struktur `if` untuk memeriksa apakah pembayaran UKT mahasiswa sudah lunas. Program akan menjalankan blok kode di dalam `if` apabila input bernilai `true`.

#### 2.1.1 Kode Program Java

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

#### 2.1.2 Hasil Running / Screenshot Output
(/Week5/images/image1.png)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Apa yang terjadi ketika program diberikan input `true`?

  **Jawab:** Program menjalankan kode yang berada di dalam blok `if`, sehingga program menampilkan pesan bahwa pembayaran UKT telah terverifikasi dan mahasiswa dapat mencetak KRS serta meminta tanda tangan DPA.

* **Pertanyaan 2:** Apa yang terjadi ketika program diberikan input `false`?

  **Jawab:** Tidak ada output tambahan yang dicetak. Program melewati blok `if` karena kondisinya bernilai `false`, kemudian program selesai.

* **Pertanyaan 3:** Apa yang terjadi jika input `TRUE` dimasukkan?

  **Jawab:** Input `TRUE` tetap dianggap sebagai nilai boolean `true`, sehingga blok `if` dijalankan dan kedua baris pesan ditampilkan.

---

### 2.2 Percobaan 2: Penerapan Struktur SWITCH-CASE

Percobaan kedua menggunakan struktur `switch-case` untuk menampilkan KRS berdasarkan semester mahasiswa. Program menyediakan pilihan semester 1 sampai 8. Apabila input tidak sesuai dengan pilihan yang tersedia, program akan menjalankan bagian `default`.

#### 2.2.1 Kode Program Java

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

#### 2.2.2 Tabel Pengujian Parameter Output

Berikut adalah hasil pengujian program menggunakan beberapa variasi input:

|  No | Input Parameter | Output yang Dihasilkan       | Status Eksekusi |
| :-: | :-------------- | :--------------------------- | :-------------: |
|  1  | `1`             | `KRS Semester 1 Ditampilkan` |      Valid      |
|  2  | `5`             | `KRS Semester 5 Ditampilkan` |      Valid      |
|  3  | `8`             | `KRS Semester 8 Ditampilkan` |      Valid      |
|  4  | `10`            | `Invalid semester`           |     Invalid     |
|  5  | `0`             | `Invalid semester`           |     Invalid     |

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Apa fungsi `break` pada `switch-case`?

  **Jawab:** `break` digunakan untuk menghentikan eksekusi dan keluar dari blok `switch` setelah `case` yang sesuai dijalankan.

* **Pertanyaan 2:** Apa fungsi `default` pada `switch-case`?

  **Jawab:** `default` digunakan untuk menangani kondisi ketika nilai input tidak sesuai dengan `case` yang tersedia. Jika `default` dihapus, program tetap dapat berjalan, tetapi input yang tidak cocok dengan `case` tidak menghasilkan output dari struktur `switch`.

* **Pertanyaan 3:** Apakah `switch` dapat menggunakan tipe data `double` atau `float`?

  **Jawab:** Tidak. `switch` tidak dapat menggunakan `double` atau `float` sebagai selector. Beberapa tipe data yang dapat digunakan antara lain `byte`, `short`, `char`, `int`, `String`, `enum`, serta wrapper dari tipe-tipe tersebut.

#### 2.2.4 Hasil Running / Screenshot Output
(/Week5/images/image2.png)

---

### 2.3 Percobaan 3: Penerapan IF-ELSE IF

Struktur `if-else if` digunakan untuk memeriksa beberapa kondisi semester secara berurutan. Setiap kondisi dibandingkan dengan nilai semester yang dimasukkan oleh pengguna.

#### 2.3.1 Kode Program Java

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

#### 2.3.2 Analisis

Struktur `if-else if` memungkinkan program memeriksa beberapa kondisi secara berurutan. Jika suatu kondisi bernilai `true`, blok kode pada kondisi tersebut akan dijalankan dan kondisi berikutnya tidak perlu diperiksa.

Untuk kasus pemilihan semester seperti pada program ini, `switch-case` lebih mudah dibaca karena kondisi yang diperiksa merupakan nilai diskrit dari satu variabel. Pada `if-else if`, pengecekan seperti `semester == 1`, `semester == 2`, dan seterusnya harus ditulis secara berulang.

#### 2.3.3 Hasil Running / Screenshot Output
(Week5/images/image3.png)

---

### 2.4 Percobaan 4: Penerapan Ternary Operator

Operator ternary digunakan untuk menentukan nilai berdasarkan sebuah kondisi sederhana. Pada percobaan ini, operator ternary digunakan untuk menentukan pesan berdasarkan status pembayaran UKT.

#### 2.4.1 Kode Program Java

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

#### 2.4.2 Analisis

Operator ternary memiliki bentuk umum:

```java
kondisi ? nilaiJikaTrue : nilaiJikaFalse;
```

Pada program ini, apabila `UKTLunas` bernilai `true`, variabel `pesan` akan berisi informasi bahwa pembayaran UKT telah terverifikasi. Jika bernilai `false`, program akan memberikan pesan agar mahasiswa membayar UKT terlebih dahulu.

Operator ternary cocok digunakan untuk kondisi sederhana. Untuk kondisi yang lebih kompleks atau memiliki banyak percabangan, penggunaan `if-else` biasanya lebih mudah dibaca.

#### 2.4.3 Hasil Running / Screenshot Output

---

## 3: TUGAS MANDIRI

Berikut adalah tugas mandiri yang dikerjakan pada Jobsheet 4:

* [x] **Tugas 1:** Validasi jumlah SKS.
* [x] **Tugas 2:** Membuat program sistem parkir.
* [x] **Tugas 3:** Membuat program *Academic Queue Machine*.

---

### 3.1 Tugas 1: Validasi Jumlah SKS

Program digunakan untuk mengecek apakah jumlah SKS yang dimasukkan mahasiswa masih berada dalam batas maksimal 24 SKS.

#### 3.1.1 Kode Program Java

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

#### 3.1.2 Hasil Running / Screenshot Output

#### 3.1.3 Analisis

Program menggunakan struktur `if-else` untuk membandingkan jumlah SKS dengan batas maksimal 24 SKS. Jika jumlah SKS kurang dari atau sama dengan 24, program menampilkan bahwa KRS valid. Jika jumlah SKS lebih dari 24, program menampilkan bahwa KRS tidak valid.

---

### 3.2 Tugas 2: Sistem Parkir

Program menghitung biaya parkir berdasarkan lama kendaraan berada di tempat parkir.

Aturan biaya parkir:

* Sampai 2 jam: Rp2.000.
* Lebih dari 2 jam: dikenakan tambahan Rp1.000 untuk setiap jam berikutnya.

#### 3.2.1 Kode Program Java

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

#### 3.2.2 Hasil Running / Screenshot Output

#### 3.2.3 Analisis

Program menggunakan struktur `if-else`. Jika lama parkir kurang dari atau sama dengan 2 jam, biaya yang dikenakan adalah Rp2.000. Jika lama parkir lebih dari 2 jam, biaya dasar Rp2.000 ditambah Rp1.000 untuk setiap jam setelah 2 jam pertama.

---

### 3.3 Tugas 3: Academic Queue Machine

Program *Academic Queue Machine* digunakan untuk menentukan layanan akademik dan counter berdasarkan kode layanan yang dimasukkan oleh pengguna.

#### 3.3.1 Kode Program Java

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

#### 3.3.2 Hasil Running / Screenshot Output

#### 3.3.3 Analisis

Program menggunakan `switch-case` untuk menentukan layanan berdasarkan kode yang dimasukkan. Setiap `case` memiliki layanan dan counter yang berbeda.

`break` digunakan setelah setiap `case` agar program keluar dari `switch` setelah menemukan kode layanan yang sesuai. Jika pengguna memasukkan kode selain 1 sampai 4, bagian `default` akan dijalankan dan program menampilkan pesan `Invalid service code`.

---

## 4: KESIMPULAN

Berdasarkan praktikum yang telah dilakukan, struktur pemilihan pada Java digunakan untuk mengatur alur program berdasarkan kondisi atau nilai tertentu. Struktur `if` digunakan ketika program hanya perlu memeriksa satu kondisi, sedangkan `if-else if` dapat digunakan untuk memeriksa beberapa kondisi secara berurutan.

Struktur `switch-case` lebih sesuai digunakan ketika program melakukan pemilihan berdasarkan beberapa nilai tertentu dari satu variabel. Sementara itu, operator ternary dapat digunakan sebagai bentuk singkat dari percabangan sederhana yang menghasilkan suatu nilai.

Melalui percobaan dan tugas mandiri pada Jobsheet 4, dapat dipahami bahwa pemilihan struktur percabangan perlu disesuaikan dengan kebutuhan program agar kode dapat berjalan dengan benar serta tetap mudah dibaca dan dipahami.

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

> **Catatan GitHub:** Folder `images` harus tetap berada di dalam folder `Jobsheet4`. Path seperti `![Experiment 1 - Input true](images/image1.png)` akan menampilkan gambar secara otomatis di README GitHub selama file gambar tersebut ikut di-upload.
