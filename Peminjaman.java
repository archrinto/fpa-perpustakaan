/**
 * Class Peminjaman
 * Memodelkan peminjaman Pustaka yang dilakukan oleh Anggota
 */
 class Peminjaman {
     private Pustaka pustaka;
     private Date tanggalPinjam;
     private Date tanggalKembali;

     Peminjaman(Putaka p) {

     }

     Peminjaman(Pustaka p, Date tp) {

     }

     public void setPustaka(Pustaka p) {

     }

     public Pustaka getPustaka() {
         return this.pustaka;
     }

     public void setTanggalPinjam(Date t) {
         this.tanggalPinjam = t;
     }

     public Date getTanggalPinjam() {
         return this.tanggalPinjam;
     }

     public void dikembalikan() {
         this.tanggalKembali = ;
     }

     public boolean isKembali() {
         if (this.tanggalKembali != null) {
             return true;
         }
         return false;
     }

     public void cetakInfo() {
         System.out.println("Pustaka : " + this.pustaka);
         System.out.println("Tanggal Pinjam : " + this.tanggalPinjam);
         System.out.println("Tanggal Kembali : " + this.tanggalKembali);
     }
 }