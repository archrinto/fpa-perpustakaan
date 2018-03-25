/**
 * Class Anggota
 * Memodelkan pelaku yang meminjam buku di perpustakaan
 */
 class Anggota {
     private String nama; // nama anggota
     private String alamat; // alamat anggota
     private Peminjaman transaksi; // transaksi peminjaman

     /**
      * Menghidupkan objek anggota
      * @param n String nama
      * @param a String alamat
      * @return void
      */
     Anggota(String n, String a) {
         this.nama = n;
         this.alamat = a;
     }

     /**
      * Mengisi/mengubah nama anggota
      * @param n String nama
      * @return void
      */
     public void setNama(String n) {
         this.nama = n;
     }

     /**
      * Mendapatkan nama anggota
      * @return String nama
      */
     public String getNama() {
         return this.nama;
     }

     /**
      * Mengisi/mengubah alamat anggota
      * @param a String alamat
      * @return void
      */
     public void gantiAlamat(String a) {
         this.alamat = a;
     }

     /**
      * Mendapatkan alamat anggota
      * @return String alamat
      */
     public String getAlamat() {
         return this.alamat;
     }

     /**
      * Melakukan peminjaman pustaka dengan menghidupkan objek peminjaman
      * dengan p sebagai Pustaka
      * @param p Pustaka pustaka
      * @return String
      */
     public String pinjamPustaka(Pustaka p) {
         Peminjaman transaksi = new Peminjaman(p);
         this.transaksi = transaksi;
     }

    /**
     * Mendapatkan objek transaksi Peminjaman
     * @return Peminjaman transaksi
     */
     public Peminjaman getTransaksi() {
         return this.transaksi;
     }

     /**
      * Menegmbalikan nilai true jika objek peminjaman tidak kosong
      * @return boolean
      */
     public boolean isPinjam() {
         if (this.transaksi != null) {
             return true;
         }
         return false;
     }

     /**
      * Mencetak informasi nama, alamat rumah, dan transaksi peminjaman
      * yang dilakukan
      * @return void
      */
     public void cetakInfo() {
         System.out.println("Nama : " + this.getNama());
         System.out.println("Alamat : " + this.getAlamat());
         System.out.println("Transaksi : " + this.getTransaksi());
     }
 }
