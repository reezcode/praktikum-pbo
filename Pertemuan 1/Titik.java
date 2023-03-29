/* 
 * Nama File    : TItik.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : File Kelas Titik
 * Tanggal      : 22 Februari 2023
 */

class Titik { // Identity
    // Atribut/State
    double absis;
    double ordinat;
    static int counterTitik;

    // Konstruktor
    Titik() {
      absis = 0;
      ordinat = 0;
      counterTitik++;
    }

    // Overloading
    Titik(double x, double y) {
      absis = x;
      ordinat = y;
      counterTitik++;
    }
    
    Titik(int x, int y) {
      absis = x;
      ordinat = y;
      counterTitik++;
    }

    // Method/Behaviour
    void setAbsis(double x) {
      absis = x;
    }
  
    void setOrdinat(double y) {
      ordinat = y;
    }
  
    double getAbsis() {
      return absis;
    }
  
    double getOrdinat() {
      return ordinat;
    }
  
    int getCounterTitik() {
      return counterTitik;
    }
  
  }
  