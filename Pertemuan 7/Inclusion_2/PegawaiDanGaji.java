
/*
 * Nama File    : PegawaiDanGaji.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Program atau main class pegawai dan gaji
 * Tanggal      : 03 Mei 2023
 */

public class PegawaiDanGaji {
    public static void main(String [] args){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");
        
        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}