/*
 * Nama File    : Car.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Subclass Car dari Superclass Vehicle
 * Tanggal      : 03 Mei 2023
 */

public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare = jarak*harga;
        fare = fare-100.00f;
        System.out.println("Harga sewa mobil = "+fare);
    }
}
