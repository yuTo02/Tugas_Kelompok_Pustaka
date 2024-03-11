# Penjelasan Kelas `FictionBook`

----------------------------------------------------------------

## Deskripsi

Kelas `FictionBook` merupakan turunan dari kelas `Book` yang digunakan untuk merepresentasikan buku fiksi. Kelas ini memiliki atribut tambahan seperti `genre` dan `rating` yang khusus untuk buku fiksi.

```bash
package BookType;
import Book.Book;

public class FictionBook extends Book {
```

- `package BookType;`: Mendefinisikan paket (`package`) di mana kelas `FictionBook`berada.
- `import Book.Book;`: Mengimport kelas `Book` yang diperlukan untuk turunan.

### Atribut

```bash
    private String Genre;  // Genre buku fiksi
    private double Rating;  // Rating buku fiksi
```

- `private String Genre;`: Variabel yang menyimpan `genre` dari buku fiksi.
- `private double Rating;`: Variabel yang menyimpan `rating` dari buku fiksi.

### Constructor

```bash
    // Constructor untuk membuat objek buku fiksi baru
    public FictionBook(String BookTitle, String BookAuthor, int YearPublished, String Genre, double Rating){
        super(BookTitle, BookAuthor, YearPublished);  // Memanggil constructor dari superclass (Book)
        this.Genre = Genre;
        this.Rating = Rating;
    }
```

- `public FictionBook(String BookTitle, String BookAuthor, int YearPublished, String Genre, double Rating)`: Constructor untuk membuat objek `FictionBook` baru dengan parameter judul, penulis, tahun terbit, genre, dan rating.
- `super(BookTitle, BookAuthor, YearPublished);`: Memanggil constructor dari superclass (`Book`) untuk menginisialisasi atribut judul, penulis, dan tahun terbit.

### Getter

```bash
    // Getter untuk mengambil genre buku fiksi
    public String getGenre(){
        return Genre;
    }

    // Getter untuk mengambil rating buku fiksi
    public double getRating(){
        return Rating;
    }
```

- `public String getGenre()`: Getter untuk mengembalikan `genre` buku fiksi.
- `public double getRating()`: Getter untuk mengembalikan `rating` buku fiksi.

### Setter

```bash
    // Setter untuk mengubah genre buku fiksi
    public void setGenre(String Genre){
        this.Genre = Genre;
    }

    // Setter untuk mengubah rating buku fiksi
    public void setRating(double Rating){
        this.Rating = Rating;
    }
```

- `public void setGenre(String Genre)`: Setter untuk mengubah `genre` buku fiksi.
- `public void setRating(double Rating)`: Setter untuk mengubah `rating` buku fiksi.

### Metode displayInfo

```bash
    // Method untuk menampilkan informasi buku fiksi
    @Override
    public void displayInfo(){
        super.displayInfo();  // Memanggil method displayInfo dari superclass (Book)
        System.out.println("Genre Buku : " + Genre);
        System.out.println("Rating Buku : " + Rating);
    }
```

- `@Override public void displayInfo()`: Metode yang dioverride dari superclass (`Book`) untuk menampilkan informasi lengkap tentang buku fiksi.
- `System.out.println("Genre Buku : " + Genre);`, `System.out.println("Rating Buku : " + Rating);`: Menampilkan genre dan rating buku fiksi ke konsol.
  
note: untuk penjelasan nonFictionBook juga hampir sama dengan penjelasan fictionBook di atas.
