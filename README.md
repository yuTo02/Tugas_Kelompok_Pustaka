# Sistem Pustaka Online

## Deskripsi

Program ini merupakan simulasi sistem pustaka online (`berbasis CLI`) yang memungkinkan pengguna untuk melakukan berbagai operasi terhadap daftar buku. Pengguna dapat menambahkan buku baru (baik fiksi maupun non-fiksi), menghapus buku, mencari buku berdasarkan judul, penulis, atau tahun terbit, serta menampilkan semua buku yang ada di pustaka.

Di dalamnya, terdapat sebuah `Scanner` untuk input dari pengguna, serta objek `BookList` yang digunakan untuk menyimpan daftar buku.
Program akan terus berjalan dalam `loop while`sehingga pengguna dapat melakukan berbagai operasi pada daftar buku.
Setiap pilihan menu akan mengeksekusi fungsi yang sesuai dalam `BookList` dan menghasilkan output yang relevan kepada pengguna.
Jika pengguna memilih opsi "`Keluar`", program akan keluar dari `loop` dan menutup `Scanner`.

### Daftar Menu

1. Tambah Buku

- Pengguna diminta untuk memasukkan informasi buku baru (judul, penulis, tahun terbit, genre, rating).
- Bergantung pada jawaban pengguna (fiksi atau non-fiksi), program akan membuat objek `FictionBook` atau `NonFictionBook`, kemudian menambahkannya ke `BookList`.

2. Hapus Buku

- Pengguna diminta untuk memasukkan judul buku yang akan dihapus.
- Program akan mencari buku dengan judul tersebut dalam `BookList` dan menghapusnya jika ditemukan.

3. Cari Buku berdasarkan Judul

- Pengguna diminta untuk memasukkan judul buku yang dicari.
- Program akan mencari buku dengan judul tersebut dalam `BookList` dan menampilkan informasi jika ditemukan.

4. Cari Buku berdasarkan Penulis

- Pengguna diminta untuk memasukkan penulis buku yang dicari.
- Program akan mencari buku dengan penulis tersebut dalam `BookList` dan menampilkan informasi jika ditemukan.

5. Cari Buku berdasarkan Tahun Terbit

- Pengguna diminta untuk memasukkan tahun terbit buku yang dicari.
- Program akan mencari buku dengan tahun terbit tersebut dalam `BookList` dan menampilkan informasi jika ditemukan.

6. Tampilkan Semua Buku

- Program akan menampilkan informasi semua buku yang ada dalam `BookList`.

7. Keluar

- Program akan menutup `Scanner` dan keluar dari sistem pustaka online.

### Cara Instalasi

#### Prasyarat

Sebelum menginstal dan menjalankan program, pastikan komputer pengguna telah terinstall:

1. `Java Development Kit (JDK)`
2. `Git` (jika akan melakukan clone dari repository)

#### Langkah-langkah Instalasi

- Clone Repository

Pengguna harus melakukan clone dari `repository upstream` (repo program) ke `repo lokal` (pribadi). Ini dapat dilakukan dengan perintah:

```bash
git clone <URL_Repository>
```

Gantilah `<URL_Repository>` dengan URL yang sesuai dengan repository tujuan. Dalam hal ini repo `upstreamnya` adalah (`https://github.com/yuTo02/Tugas_Kelompok_Pustaka.git`).

- Masuk ke Direktori Program

Setelah melakukan `clone`, pengguna harus masuk ke direktori program yang sudah terclone repo upstream dengan perintah:

```bash
cd nama_folder
```

Gantilah `nama_folder` dengan nama folder hasil clone dari repository tujuan.

- Compile Program

Compile program menggunakan `Java Compiler`. Pastikan berada di dalam direktori yang berisi file `Main.java`.

```bash
javac Main.java
```

- Jalankan Program

Setelah berhasil dikompilasi, jalankan program dengan perintah:

```bash
java Main
```

Program akan memulai eksekusi dan menampilkan menu interaktif untuk pengguna.
