# JOBSHEET 5 — LOGICAL OPERATOR & NESTED IF

**Identitas Mahasiswa:**
- **Nama:** Mohammad Wisnu
- **NIM:** 264107020193
- **Kelas / No. Presensi:** TI 1I / [20]

---

## 1. TUJUAN PRAKTIKUM

Praktikum ini membahas penggunaan operator logika dan struktur `nested if` pada Java untuk memeriksa beberapa persyaratan secara bertahap.

Tujuan praktikum:
1. Memahami operator logika `&&` (AND), `||` (OR), dan `!` (NOT).
2. Mengimplementasikan operator logika dalam program Java.
3. Memahami alur pemeriksaan kondisi bertingkat (*nested if*).
4. Menganalisis hasil program berdasarkan kombinasi input yang diberikan.

---

## 2. HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1 — Pemeriksaan Persyaratan Ujian Tugas Akhir

Program memeriksa apakah mahasiswa telah menyelesaikan semua tanggungan penalti. Jika sudah, program mengevaluasi jumlah bimbingan dengan kedua supervisor.

#### 2.1.1 Kode Program Java

Kode lengkap tersedia di [`Week6/NestedThesisExamAttendance20.java`](/Week6/NestedThesisExamAttendance20.java).

```java
import java.util.Scanner;

public class NestedThesisExamAttendance20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;

        System.out.print("Has the student cleared all penalties? (Yes/No): ");
        String noPenalty = sc.nextLine().trim();

        System.out.print("Enter the number of guidance sessions with Supervisor 1: ");
        int guidanceCount1 = sc.nextInt();

        System.out.print("Enter the number of guidance sessions with Supervisor 2: ");
        int guidanceCount2 = sc.nextInt();

        if (noPenalty.equalsIgnoreCase("Yes")) {
            if (guidanceCount1 >= 8 && guidanceCount2 >= 4) {
                message = "All requirements met. The student may register for the thesis exam";
            } else if (guidanceCount1 < 8 && guidanceCount2 < 4) {
                message = "Failed! Guidance sessions with Supervisor 1 are below 8 and Supervisor 2 are below 4";
            } else if (guidanceCount1 < 8) {
                message = "Failed! Guidance sessions with Supervisor 1 have not reached 8";
            } else {
                message = "Failed! Guidance sessions with Supervisor 2 have not reached 4";
            }
        } else {
            message = "Failed! The student still has an outstanding penalty";
        }

        System.out.println(message);
        sc.close();
    }
}
```

#### 2.1.2 Analisis

- Kondisi luar memeriksa apakah penalti sudah diselesaikan.
- Jika jawabannya `Yes`, program memeriksa jumlah bimbingan Supervisor 1 minimal 8 kali dan Supervisor 2 minimal 4 kali.
- Operator `&&` memastikan kedua syarat jumlah bimbingan harus terpenuhi bersamaan.
- Jika penalti belum diselesaikan, program langsung menampilkan pesan kegagalan karena penalti dan tidak mengevaluasi hasil bimbingan untuk menentukan kelulusan.

#### 2.1.3 Hasil Running / Screenshot Output

![Output Percobaan 1](/Week6/images/experiment-1-output.png.png)

#### 2.1.4 Jawaban Pertanyaan

1. **Mengapa program dapat langsung menampilkan pesan penalti tanpa mengevaluasi jumlah bimbingan?**  
   Karena `noPenalty.equalsIgnoreCase("Yes")` bernilai `false`, sehingga program masuk ke blok `else` terluar. Struktur `if` di dalamnya dilewati.

2. **Apa fungsi operator `&&` pada pemeriksaan jumlah bimbingan?**  
   Operator `&&` bernilai `true` hanya jika kedua kondisi bernilai `true`. Jadi, jumlah bimbingan Supervisor 1 harus minimal 8 dan Supervisor 2 minimal 4.

3. **Bagaimana alur pemeriksaan persyaratan ujian tugas akhir?**  
   Program memeriksa status penalti terlebih dahulu, kemudian memeriksa jumlah bimbingan kedua supervisor, menetapkan pesan yang sesuai, dan menampilkan pesan tersebut.

---

### 2.2 Percobaan 2 — Operator Logika pada Akses Wi-Fi

Program memberikan akses Wi-Fi jika pengguna merupakan mahasiswa atau dosen dan tidak sedang diblokir.

#### 2.2.1 Kode Program Java

Kode lengkap tersedia di [`Week6/LogicalOperatorWifi20.java`](/Week6/LogicalOperatorWifi20.java).

```java
import java.util.Scanner;

public class LogicalOperatorWifi20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is the user student (true/false):");
        boolean isStudent = sc.nextBoolean();

        System.out.print("Is the user Lecturer (true/false):");
        boolean isLecturer = sc.nextBoolean();

        System.out.print("Is the user recently bloked (true/false):");
        boolean isBlocked = sc.nextBoolean();

        if ((isStudent || isLecturer) && !isBlocked) {
            System.out.println("WiFi access granted");
        } else {
            System.out.println("WiFi access denied");
        }

        sc.close();
    }
}
```

#### 2.2.2 Analisis Operator

| Operator | Nama | Fungsi |
|---|---|---|
| `&&` | AND | Bernilai `true` jika kedua kondisi bernilai `true`. |
| `||` | OR | Bernilai `true` jika minimal satu kondisi bernilai `true`. |
| `!` | NOT | Membalik nilai boolean, misalnya `!isBlocked` bernilai `true` saat `isBlocked` bernilai `false`. |

Ekspresi `(isStudent || isLecturer) && !isBlocked` berarti pengguna harus berstatus mahasiswa atau dosen, serta tidak sedang diblokir.

#### 2.2.3 Tabel Pengujian

| Mahasiswa | Dosen | Diblokir | Hasil yang diharapkan |
|---|---|---|---|
| `true` | `false` | `false` | Wi-Fi diberikan |
| `false` | `true` | `false` | Wi-Fi diberikan |
| `true` | `true` | `true` | Akses ditolak |
| `false` | `false` | `false` | Akses ditolak |

#### 2.2.4 Hasil Running / Screenshot Output

![Output Percobaan 2](/Week6/images/experiment-2-output.png.png)

#### 2.2.5 Jawaban Pertanyaan

1. **Apa perbedaan `||`, `&&`, dan `!`?**  
   `||` membutuhkan minimal satu kondisi benar, `&&` membutuhkan semua kondisi benar, sedangkan `!` membalik nilai boolean.

2. **Mengapa kondisi `(isStudent || isLecturer)` dapat bernilai `true` ketika pengguna adalah dosen?**  
   Karena operator OR cukup membutuhkan salah satu kondisi bernilai `true`.

3. **Mengapa mengganti OR menjadi AND dapat mengubah hasil akses?**  
   Dengan AND, pengguna harus sekaligus berstatus mahasiswa dan dosen. Jika hanya salah satu status yang `true`, bagian tersebut bernilai `false`.

4. **Kapan Java melewati evaluasi bagian kanan operator `&&`?**  
   Jika operand di sebelah kiri bernilai `false`, Java menggunakan *short-circuit evaluation* dan tidak mengevaluasi operand di sebelah kanan.

---

### 2.3 Percobaan 3 — Nested If untuk Akses Laboratorium

Program memberikan akses laboratorium apabila pengguna adalah mahasiswa aktif, tidak sedang terkena sanksi, dan memiliki izin dosen atau berstatus asisten laboratorium.

#### 2.3.1 Kode Program Java

Kode lengkap tersedia di [`Week6/NestedLabAccess20.java`](Week6/NestedLabAccess20.java).

```java
import java.util.Scanner;

public class NestedLabAccess20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is the user an active student? (true/false): ");
        boolean isActiveStudent = sc.nextBoolean();

        System.out.print("Is the user sanctioned? (true/false): ");
        boolean isSanctioned = sc.nextBoolean();

        System.out.print("Does the user have a lecturer permit? (true/false): ");
        boolean hasLecturerPermit = sc.nextBoolean();

        System.out.print("Is the user a lab assistant? (true/false): ");
        boolean isLabAssistant = sc.nextBoolean();

        if (isActiveStudent && !isSanctioned) {
            if (hasLecturerPermit || isLabAssistant) {
                System.out.println("Laboratory access granted");
            } else {
                System.out.println(
                    "Access denied: lecturer permission or lab assistant status required"
                );
            }
        } else {
            System.out.println(
                "Access denied: student status does not meet the requirement"
            );
        }

        sc.close();
    }
}
```

#### 2.3.2 Analisis

- Persyaratan utama: `isActiveStudent && !isSanctioned`.
- Persyaratan lanjutan: `hasLecturerPermit || isLabAssistant`.
- Operator `&&` mengharuskan mahasiswa aktif dan tidak terkena sanksi.
- Operator `||` mengizinkan salah satu dari dua kondisi tambahan terpenuhi.
- Struktur bertingkat membantu program menampilkan alasan penolakan yang berbeda sesuai kondisi yang gagal.

#### 2.3.3 Tabel Pengujian

| Mahasiswa aktif | Terkena sanksi | Izin dosen | Asisten lab | Hasil |
|---|---|---|---|---|
| `true` | `false` | `true` | `false` | Akses diberikan |
| `true` | `false` | `false` | `true` | Akses diberikan |
| `true` | `false` | `false` | `false` | Akses ditolak: izin/asisten tidak terpenuhi |
| `false` | `false` | `true` | `true` | Akses ditolak: status mahasiswa tidak memenuhi |
| `true` | `true` | `true` | `true` | Akses ditolak: status mahasiswa tidak memenuhi |

#### 2.3.4 Hasil Running / Screenshot Output

![Output Percobaan 3](/Week6/images/experiment-3-output.png.png)

#### 2.3.5 Jawaban Pertanyaan

1. **Mengapa izin dosen atau status asisten lab menjadi persyaratan sekunder?**  
   Karena program baru memeriksa persyaratan tersebut setelah memastikan mahasiswa aktif dan tidak terkena sanksi.

2. **Apa fungsi operator logika pada program?**  
   `&&` mengharuskan status mahasiswa aktif dan tidak terkena sanksi; `||` mengharuskan minimal satu dari izin dosen atau status asisten lab terpenuhi; `!` membalik nilai boolean `isSanctioned`.

3. **Apakah tanda kurung membantu memperjelas evaluasi kondisi?**  
   Ya. Pengelompokan kondisi dengan tanda kurung memperjelas bagian ekspresi yang dievaluasi bersama.

4. **Apa manfaat nested if dalam program ini?**  
   Program dapat memisahkan pemeriksaan persyaratan utama dan persyaratan lanjutan, serta memberikan alasan penolakan yang lebih spesifik.

5. **Berikan contoh kombinasi input yang menyebabkan akses ditolak.**  
   Contoh pertama: `isActiveStudent = false`, `isSanctioned = false`, `hasLecturerPermit = true`, `isLabAssistant = true`. Contoh kedua: `isActiveStudent = true`, `isSanctioned = false`, `hasLecturerPermit = false`, `isLabAssistant = false`.

---

## 3. TUGAS MANDIRI

Dua file tugas berikut disertakan berdasarkan source code yang tersedia.

### 3.1 Tugas 1 — Diskon Toko Buku dengan Nested If

Program menghitung diskon berdasarkan jenis buku dan jumlah buku yang dibeli. Kode lengkap: [`Week6/Task1Jobsheet6.java`](/Week6/Task1Jobsheet6.java).

Aturan yang diterapkan oleh kode:
- **Dictionary:** diskon 10%; tambahan 2% jika jumlah lebih dari 2.
- **Novel:** diskon 7%; tambahan 2% jika jumlah lebih dari 3, atau tambahan 1% jika jumlah 3 atau kurang.
- **Jenis lainnya:** diskon 5% jika jumlah lebih dari 3; selain itu tidak ada diskon.
- Program menghitung nilai diskon dan jumlah yang harus dibayar.

#### Hasil Running / Screenshot Output

![Output Tugas 1](/Week6/images/task-1-output.png.png)

### 3.2 Tugas 2 — Seleksi Kandidat Asisten Laboratorium

Program memeriksa status mahasiswa, sanksi akademik, nilai Dasar Pemrograman atau sertifikat kompetensi, lalu nilai wawancara. Kode lengkap: [`/Week6/Task2AssistantSelection20.java`](/Week6/Task2AssistantSelection20.java).

Ringkasan aturan dari kode:
1. Mahasiswa harus aktif dan tidak sedang terkena sanksi akademik.
2. Nilai Dasar Pemrograman minimal 80 **atau** memiliki sertifikat kompetensi pemrograman.
3. Jika memenuhi persyaratan tersebut, mahasiswa dipanggil wawancara.
4. Kandidat diterima sebagai asisten jika nilai wawancara minimal 75.

#### Hasil Running / Screenshot Output

![Output Tugas 2](/Week6/images/task-2-output.png.png)

---

## 4. KESIMPULAN

Operator logika `&&`, `||`, dan `!` membantu menggabungkan serta membalik kondisi boolean dalam program Java. Struktur `nested if` memungkinkan pemeriksaan dilakukan secara bertahap, sehingga program dapat menentukan keputusan berdasarkan beberapa persyaratan dan menampilkan pesan yang sesuai dengan kondisi yang terpenuhi atau gagal.

---

## 5. STRUKTUR FOLDER REPOSITORY

```text
Week6/
├── README.md
├── images/
│   ├── experiment-1-output.png
│   ├── experiment-2-output.png
│   ├── experiment-3-output.png
│   ├── task-1-output.png
│   └── task-2-output.png
├── LogicalOperatorWifi20.java
├── NestedLabAccess20.java
├── NestedThesisExamAttendance20.java
├── Task1Jobsheet6.java
└── Task2AssistantSelection20.java