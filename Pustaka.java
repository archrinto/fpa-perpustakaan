/**
 * Class Pustaka
 * Memodelkan buku yang dimiliki dan yang dipinjamkan di perpustakaan
 */
 class Pustaka {
     private String judul;
     private String penulis;
     private int stok;

     Pustaka(String j, String p) {
        this.setJudul(j);
        this.setPenulis(p);
     }

     public void setJudul(string j) {
         this.judul = j;
     }

     public String getJudul() {
         return this.judul;
     }

     public void setPenulis(String p) {
         this.penulis = p;
     }

     public Stirng getPenulis() {
         return this.penulis;
     }

     public void tambahStok(int n) {
         this.stok = this.stok + n;
     }

     public void ambilStok(int n) {
         this.stok = this.stok - n;
     }

     public int getStok() {
         return this.stok;
     }

     public boolean isKosong() {
         if (this.stok > 0) {
             return true;
         }
         return false;
     }

     public void cetakInfo() {
         System.out.println("Judul : " + this.getJudul());
         System.out.println("Penulis : " + this.getPenulis());
         System.out.println("Stok : " + this.getStok());
     }
 }
