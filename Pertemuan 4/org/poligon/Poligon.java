/*
 * Nama File    : Poligon.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : File Super Class Poligon
 * Tanggal      : 15 Maret 2023
 */

package org.poligon;

public class Poligon {
    // atribut
    protected int jumlahSisi;

    // konstruktor
    public Poligon(){
        this.jumlahSisi = 0;
    }

    // method
    public void setJumlahSisi(int sisi){
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}
