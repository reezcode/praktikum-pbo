/*
 * Nama File    : Sewa.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Program main inclusion
 * Tanggal      : 03 Mei 2023
 */


public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50,1000);
        mobil.calRent(50, 1000);
        bis.calRent(50,1000);
    }
}
