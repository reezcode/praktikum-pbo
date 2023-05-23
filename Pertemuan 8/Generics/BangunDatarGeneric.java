/*
 * Nama File    : BangunDatarGeneric.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Kelas bangun datar generic
 * Tanggal      : 17 Mei 2023
 */

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    public T get(){
        return bangunDatar;
    }
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
