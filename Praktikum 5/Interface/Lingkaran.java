import static java.lang.Math.PI;

/*
 * Nama File    : Lingkaran.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : File kelas implementasi IArea berupa cara menghitung luas lingkaran
 * Tanggal      : 24 Maret 2023
 */

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
