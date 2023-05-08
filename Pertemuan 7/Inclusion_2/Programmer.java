/*
 * Nama File    : Progammer.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Sunclass dari pegawai yakni manajer
 * Tanggal      : 03 Mei 2023
 */


public class Programmer extends Manajer {
    private int bonus = 450000;
    public Programmer(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok + ", Bonus: " + this.bonus);
    }
}