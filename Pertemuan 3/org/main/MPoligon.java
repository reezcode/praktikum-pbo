/*
 * Nama File    : MPoligon.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : File Main Poligon untuk menampilkan Persegi dan Segitiga
 * Tanggal      : 8 Maret 2023
 */

package org.main;

import org.bangundatar.PersegiPanjang;
import org.bangundatar.Segitiga;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
        System.out.println(" ");
        Segitiga segitigaSikuSiku = new Segitiga(3,4,3);
        segitigaSikuSiku.printInfo();
        System.out.println("Luas Segitiga : "+segitigaSikuSiku.hitungLuas());

    }
}