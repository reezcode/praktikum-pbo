/*
 * Nama File    : Vehicle.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Superclass Vehicle
 * Tanggal      : 03 Mei 2023
 */


public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("Vehicle price = "+fare);
    }
}
