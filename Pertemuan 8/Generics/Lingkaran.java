/*
 * Nama File    : Lingkaran.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Kelas Lingkaran
 * Tanggal      : 17 Mei 2023
 */


public class Lingkaran extends BangunDatar {
    private double jejari;
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2 * Math.PI * jejari;
    }
    
}
