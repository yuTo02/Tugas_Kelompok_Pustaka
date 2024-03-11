# Penjelasan Kelas `BookList`

----------------------------------------------------------------

## Deskripsi

Kelas `BookList` digunakan untuk menyimpan daftar buku dalam bentuk `ArrayList`. Kelas ini menyediakan berbagai method untuk menambahkan, menghapus, mencari, dan menampilkan informasi buku dalam list.

### Kode

```bash
package BookList;

import Book.Book;
import java.util.ArrayList;

public class BookList {
```

- `package BookList;`: Mendefinisikan paket (`package`) di mana kelas `BookList` berada.
 `import Book.Book;`: Mengimport kelas `Book` yang diperlukan untuk digunakan dalam `BookList`.
- `import java.util.ArrayList;`: Mengimport kelas `ArrayList` dari `Java standard library` untuk digunakan dalam `BookList`.

### Atribut

```bash
    private ArrayList<Book> bookList;  // List untuk menyimpan buku-buku
```

- `private ArrayList<Book> bookList;`: Variabel yang menyimpan daftar buku dalam bentuk `ArrayList`.

### Constructor

```bash
    // Constructor untuk membuat objek BookList baru
    public BookList() {
        bookList = new ArrayList<>();  // Inisialisasi ArrayList
    }
```

- `public BookList()`: Constructor untuk membuat objek `BookList` baru. Ketika objek dibuat, sebuah `ArrayList` baru untuk menyimpan buku pun diinisialisasi.

### Method addBook

```bash
    // Method untuk menambahkan buku ke dalam list
    public void addBook(Book book) {
        bookList.add(book);
    }
```

- `public void addBook(Book book)`: Method untuk menambahkan buku ke dalam list. Buku yang diterima sebagai parameter ditambahkan ke dalam `ArrayList bookList`.

### Method removeBook

```bash
    // Method untuk menghapus buku dari list
    public void removeBook(Book book) {
        bookList.remove(book);
    }
```

- `public void removeBook(Book book)`: Method untuk menghapus buku dari list. Buku yang diterima sebagai parameter dihapus dari `ArrayList bookList`.

### Method searchByTitle

```bash
    // Method untuk mencari buku berdasarkan judul
    public Book searchByTitle(String title) {
        for (Book book : bookList) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;  // Return null jika tidak ditemukan
    }
```

- `public Book searchByTitle(String title)`: Method untuk mencari buku berdasarkan judul. Jika buku dengan judul yang sesuai ditemukan, buku tersebut dikembalikan. Jika tidak ditemukan, method ini mengembalikan `null`.

### Method searchByAuthor

```bash
    // Method untuk mencari buku berdasarkan penulis
    public Book searchByAuthor(String author) {
        for (Book book : bookList) {
            if (book.getBookAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;  // Return null jika tidak ditemukan
    }
```

- `public Book searchByAuthor(String author)`: Method untuk mencari buku berdasarkan penulis. Jika buku dengan penulis yang sesuai ditemukan, buku tersebut dikembalikan. Jika tidak ditemukan, method ini mengembalikan `null`.

### Method searchByYear

```bash
    // Method untuk mencari buku berdasarkan tahun terbit
    public Book searchByYear(int year) {
        for (Book book : bookList) {
            if (book.getYearPublished() == year) {
                return book;
            }
        }
        return null;  // Return null jika tidak ditemukan
    }
```

- `public Book searchByYear(int year)`: Method untuk mencari buku berdasarkan tahun terbit. Jika buku dengan tahun terbit yang sesuai ditemukan, buku tersebut dikembalikan. Jika tidak ditemukan, method ini mengembalikan `null`.

### Method displayAllBooks

```bash
    // Method untuk menampilkan semua buku dalam list
    public void displayAllBooks() {
        for (Book book : bookList) {
            book.displayInfo();  // Memanggil method displayInfo dari buku
            System.out.println("--------------------");
        }
    }
```

- `public void displayAllBooks()`: Method untuk menampilkan semua buku dalam list. Method ini memanggil method `displayInfo` dari setiap buku dalam `ArrayList bookList` untuk menampilkan informasi lengkap tentang setiap buku.
