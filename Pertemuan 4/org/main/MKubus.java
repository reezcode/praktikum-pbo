/*
 * Nama File    : MKubus.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : File Main Kubus
 * Tanggal      : 15 Maret 2023
 */

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(4.0);
        Kubus kubus = new Kubus(bujurSangkar);

        System.out.println("Kubus dengan panjang sisi : " + bujurSangkar.getPanjangSisi());
        System.out.println("Luas alas Kubus : " + kubus.hitungLuasAlas());
        System.out.println("Volume Kubus : "+ kubus.hitungVolume());

    }
}