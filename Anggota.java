/**
 * Class Anggota
 * Memodelkan pelaku yang meminjam buku di perpustakaan
 */
 class Anggota {
     private String nama;
     private String alamat;
     private Peminjaman transaksi;

     Anggota(String n, String a) {

     }

     public void setNama(String n) {
         this.nama = n;
     }

     public String getNama() {
         return this.nama;
     }

     public void gantiAlamat(String a) {
         this.alamat = a;
     }

     public String getAlamat() {
         return this.alamat;
     }

     public String pinjamPustaka(Pustaka p) {

     }

     public Peminjaman getTransaksi() {
         return this.transaksi;
     }

     public boolean isPinjam() {
         if (this.getTransaksi() != null) {
             return true;
         }
         return false;
     }

     public void cetakInfo() {
         System.out.println("Nama : " + this.getNama());
         System.out.println("Alamat : " + this.getAlamat());
         System.out.println("Transaksi : " + this.getTransaksi());
     }
 }
