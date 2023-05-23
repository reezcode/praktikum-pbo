/*
 * Nama File    : BangunDatarGenericTest.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Program penggunaan polimorfisme coercion
 * Tanggal      : 17 Mei 2023
 */


public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2); // membuat objek lingkaran baru
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>(); // membuat objek generic 
        bdg.set(l); // set lingkaran pada objek generic bdg
        System.out.println("keliling lingkaran : "+bdg.hitungKeliling());
        System.out.println("tipe generic : "+bdg.get().getClass().getName());
    }
}
