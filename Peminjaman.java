// Menggunakan class Date
import java.util.Date;

/**
 * Class Peminjaman
 * Memodelkan peminjaman Pustaka yang dilakukan oleh Anggota
 *
 * @author July Arifianto ( 17523216@students.uii.ac.id )
 */
 class Peminjaman {
     private Pustaka pustaka;
     private Date tanggalPinjam;
     private Date tanggalKembali;

     /**
      * Menghidupkan objek peminjaman hanya dengan objek pustaka
      * yang dipinjam, tanggalPinjam default hari ini dan
      * tanggalKembali diinisialisasi kosong/null
      * @param p Pustaka pustaka
      * @return void
      */
     Peminjaman(Pustaka p) {
         this.pustaka = p;
         this.tanggalPinjam = Date;
         this.tanggalKembali = null;
     }

     /**
      * Menghidupkan objek peminjaman
      * @param p Pustaka pustaka
      * @param tp Date tanggal pinjam
      * @return void
      */
     Peminjaman(Pustaka p, Date tp) {
         this.pustaka = p;
         this.tanggalPinjam = tp;
     }

     /**
      * Mengisi/menggati pustaka yang dipinjam
      * @param p Pustaka pustaka
      * @return void
      */
     public void setPustaka(Pustaka p) {
         this.pustaka = p;
     }

     /**
     * Mendapatkan pustaka yang dipinjam
     * @return Pustaka
     */
     public Pustaka getPustaka() {
         return this.pustaka;
     }

     /**
      * Mengisi/menggati tanggal pinjam pustaka
      * @param t Date
      * @return void
      */
     public void setTanggalPinjam(Date t) {
         this.tanggalPinjam = t;
     }

    /**
     * Mendapatkan tanggal peminjaman
     * @return Date tanggalPinjam
     */
     public Date getTanggalPinjam() {
         return this.tanggalPinjam;
     }

     /**
      * Mengisi tanggal kembali dengan hari ini
      * @return void
      */
     public void dikembalikan() {
         this.tanggalKembali = Date;
     }

     /**
      * Mengembalikan true jika tanggal kembali tidak kosong
      * @return boolean
      */
     public boolean isKembali() {
         if (this.tanggalKembali != null) {
             return true;
         }
         return false;
     }

     /**
      * Mencetak informasi pustaka yang dipinjam, tanggal peminjaman,
      * dan tanggal pengembalian
      * @return void
      */
     public void cetakInfo() {
         System.out.println("Pustaka : " + this.pustaka);
         System.out.println("Tanggal Pinjam : " + this.tanggalPinjam);
         System.out.println("Tanggal Kembali : " + this.tanggalKembali);
     }
 }
