/* 
 * Nama File    : MTitik.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : File Main Program Titik
 * Tanggal      : 22 Februari 2023
 */

class MTitik {
    public static void main(String[] args) {
      // Pembuatan Objek Titik
      Titik T1 = new Titik();   // Set value melalui method
      T1.setAbsis(2.0);
      T1.setOrdinat(3.0);

      Titik T2 = new Titik(1.0, 0.0); // Overloading tipe data double
      Titik T3 = new Titik(4, 2); // Overloading tipe data integer

      // Inisialisasi Variabel counterTitik
      int counterTitik = T1.getCounterTitik();

      // Output Hasil Program
      System.out.println("Jumlah objek titik : " + counterTitik);
      System.out.println("T1 = (" + T1.getAbsis() + "," + T1.getOrdinat() + ")");
      System.out.println("T2 = (" + T2.getAbsis() + "," + T2.getOrdinat() + ")");
      System.out.println("T3 = (" + T3.getAbsis() + "," + T3.getOrdinat() + ")");
    }
  }
  