/**
 * Class Pustaka
 * Memodelkan buku yang dimiliki dan yang dipinjamkan di perpustakaan
 */
 class Pustaka {
     private String judul;
     private String penulis;
     private int stok;

     /**
      * Menghidupkan objeck pustaka dengan inisialisasi
      * @param j String judul
      * @param p String penulis
      * @return void
      */
     Pustaka(String j, String p) {
        this.judul = j;
        this.penulis = p;
     }

     /**
      * Mengisi dan mengubah judul pustaka
      * @param j String judul
      * @return void
      */
     public void setJudul(string j) {
         this.judul = j;
     }

     /**
      * mendapatkan judul pustaka
      * @return String judul
      */
     public String getJudul() {
         return this.judul;
     }

     /**
      * Mengisi/mengubah nama penulis pustaka
      * @param p String penulis
      * @return void
      */
     public void setPenulis(String p) {
         this.penulis = p;
     }

     /**
      * Mendapatkan nama penulis pustaka
      * @return String penulis
      */
     public Stirng getPenulis() {
         return this.penulis;
     }

     /**
      * Menabahkan stok lama
      * @param n int jumlah
      * @return void
      */
     public void tambahStok(int n) {
         this.stok = this.stok + n;
     }

     /**
      * Mengambil stok pustaka
      * @param n int jumlah
      * @return void
      */
     public void ambilStok(int n) {
         this.stok = this.stok - n;
     }

     /**
      * Mendapatkan jumlah stok pustaka saat ini
      * @return int
      */
     public int getStok() {
         return this.stok;
     }

     /**
      * Mengembalikan True jika jumlah stok pustaka sama dengan nol
      * @return boolean
      */
     public boolean isKosong() {
         if (this.stok > 0) {
             return true;
         }
         return false;
     }

     /**
      * Mencetak informasi judul, penulis dan jumlah stok pustaka
      * @return void
      */
     public void cetakInfo() {
         System.out.println("Judul : " + this.getJudul());
         System.out.println("Penulis : " + this.getPenulis());
         System.out.println("Stok : " + this.getStok());
     }
 }
