/*
 * Nama File    : ExceptionononArray.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Program penggunaan exception buatan sendiri
 * Tanggal      : 29 Maret 2023
 */

 // Perbaikan

class AngkaSialException extends Exception{
    public AngkaSialException(String x){
        super(x);
    }
}

 // --
public class AngkaSial {

   public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException("AWASS!! ANGKA SIAL");
        }
        System.out.println(angka+" bukan angka sial");
   }

   public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException e) {
            System.out.println(e.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
   } 
}

// PERTANYAAN
// tidak bisa dieksekusi karena class angkasial exception belum dibuat
// oleh karena itu perlu adanya pembuatan class angka sial exception yang merupakan
// turunan dari class exception