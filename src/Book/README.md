# Penjelasan Kelas `Book`

----------------------------------------------------------------

```bash
    package Book;

    public class Book {
```

- `package Book;`: Mendefinisikan paket (package) di mana kelas Book berada. Berguna untuk mengelompokkan kelas-kelas yang terkait bersama dalam satu paket.
- `public class Book`: Mendefinisikan kelas Book yang dapat diakses dari luar paket (public). Kelas ini digunakan untuk merepresentasikan sebuah buku.

```bash
    // Atribut untuk informasi buku
    private String BookTitle;
    private String BookAuthor;
    private int YearPublished;
```

- `private String BookTitle;`, `private String BookAuthor;`, `private int YearPublished;`: Adalah variabel (atau atribut) yang menyimpan informasi tentang buku, seperti judul (`BookTitle`), penulis (`BookAuthor`), dan tahun terbit (`YearPublished`). Mereka bersifat `private`, sehingga hanya dapat diakses di dalam kelas `Book` itu sendiri.

```bash
    // Constructor untuk membuat objek buku baru
    public Book (String BookTitle, String BookAuthor, int YearPublished){
        this.BookTitle = BookTitle;
        this.BookAuthor = BookAuthor;
        this.YearPublished = YearPublished;
    }
```

- `public Book (String BookTitle, String BookAuthor, int YearPublished)`: Adalah constructor (konstruktor) dari kelas `Book`. Ketika membuat objek `Book`, constructor ini akan dipanggil untuk menginisialisasi objek dengan judul, penulis, dan tahun terbit yang diberikan.
- `this.BookTitle = BookTitle;`, `this.BookAuthor = BookAuthor;`, `this.YearPublished = YearPublished;`: Di dalam constructor, nilai-nilai dari parameter yang diterima (`BookTitle`, `BookAuthor`, `YearPublished`) diset ke variabel kelas (`this.BookTitle`, `this.BookAuthor`, `this.YearPublished`).

```bash
    // Getter untuk mengambil judul buku
    public String getBookTitle(){
        return BookTitle;
    }
```

- `public String getBookTitle()`: Ini adalah sebuah getter (metode pengambil nilai) yang digunakan untuk mengembalikan judul buku (`BookTitle`) saat ini.

```bash
    // Getter untuk mengambil penulis buku
    public String getBookAuthor(){
        return BookAuthor;
    }
```

- `public String getBookAuthor()`: Adalah getter untuk mengembalikan nama penulis buku (`BookAuthor`) saat ini.

```bash
    // Getter untuk mengambil tahun terbit buku
    public int getYearPublished(){
        return YearPublished;
    }
```

- `public int getYearPublished()`: Getter ini mengembalikan tahun terbit buku (YearPublished) saat ini.

```bash
    // Setter untuk mengubah judul buku
    public void setBookTitle(String BookTitle){
        this.BookTitle = BookTitle;
    }
```

- `public void setBookTitle(String BookTitle)`: Ini adalah setter (metode pengatur nilai) yang digunakan untuk mengubah judul buku (`BookTitle`) dengan nilai baru.

```bash
    // Setter untuk mengubah penulis buku
    public void setBookAuthor(String BookAuthor){
        this.BookAuthor = BookAuthor;
    }
```

- `public void setBookAuthor(String BookAuthor)`: Setter ini mengubah penulis buku (`BookAuthor`) dengan nilai baru.

```bash
    // Setter untuk mengubah tahun terbit buku
    public void setYearPublished(int YearPublished){
        this.YearPublished = YearPublished;
    }
```

- `public void setYearPublished(int YearPublished)`: Setter ini mengubah tahun terbit buku (`YearPublished`) dengan nilai baru.

```bash
    // Method untuk menampilkan informasi buku
    public void displayInfo(){
        System.out.println("Judul Buku : " + BookTitle);
        System.out.println("Penulis Buku : " + BookAuthor);
        System.out.println("Tahun Terbit : " + YearPublished);
    }
```

- `public void displayInfo()`: Adalah metode `displayInfo` yang digunakan untuk menampilkan informasi lengkap tentang buku, yaitu judul, penulis, dan tahun terbitnya.
- `System.out.println("Judul Buku : " + BookTitle);`, `System.out.println("Penulis Buku : " + BookAuthor);`, `System.out.println("Tahun Terbit : " + YearPublished);`: Dalam metode `displayInfo`, informasi tentang buku ditampilkan ke konsol dengan menggunakan `System.out.println`, termasuk judul, penulis, dan tahun terbitnya.
