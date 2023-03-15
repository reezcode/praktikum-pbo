/*
 * Nama File    : BujurSangkar.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : File Class Bujur Sangkar
 * Tanggal      : 15 Maret 2023
 */

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    // atribut
    private double panjangSisi;

    // konstruktor
    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4;
    }

    // method
    public double getPanjangSisi(){
        return this.panjangSisi;
    }

    public double hitungLuas(){
        return Math.pow(this.panjangSisi,2);
    }
}
