/*
 * Nama File    : Manajer.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Subclass dari pegawai yakni manajer
 * Tanggal      : 03 Mei 2023
 */


public class Manajer extends Pegawai {
    private int tunjangan = 700000;
    public Manajer(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok + ", Tunjangan: " + this.tunjangan);
    }
}