/*
 * Nama File    : Kubus.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : File Class Kubus
 * Tanggal      : 15 Maret 2023
 */

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    // atribut
    private BujurSangkar permukaan;

    // konstruktor
    public Kubus(BujurSangkar bujurSangkar){
        this.permukaan = bujurSangkar;
    }

    // method
    public double hitungVolume(){
        return Math.pow(permukaan.getPanjangSisi(), 3);
    }

    public double hitungLuasAlas(){
        return permukaan.hitungLuas();
    }
}
