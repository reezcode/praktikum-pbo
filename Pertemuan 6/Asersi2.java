/*
 * Nama File    : Asersi2.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari yang bernilai nol
 * Tanggal      : 29 Maret 2023
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    } 
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}


 public class Asersi2 {
    public static void main(String[] args) {
       double jariJari = 7;
       assert(jariJari!=0):"jari jari tidak boleh nol!!!";
       Lingkaran l = new Lingkaran(jariJari);
       double kelilingLingkaran = l.hitungKeliling();
       System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

// Pertanyaan
// Seharusnya yang benar ialah jariJari != 0 bukan > 0 karena apabila yang diinginkan merupakan
// angka yang tidak nol maka angka negatif juga bisa masuk. Sehingga apabila digunakan > 0 maka untuk
// jari-jari yang bernilai negatif akan tidak dapat dijalankan. Oleh karena itu tanda yang paling tepat ialah
// jariJari != 0
