/*
* Nama File    : DiskonLambda.java
* Nama Pembuat : Resma Adi Nugroho
* NIM          : 24060121120021
* Deskripsi    : Impementasi lambda untuk menghitung diskon
* Tanggal      : 06 Juni 2023
*/

interface IDikson {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // tanpa lambda
        IDikson diskonMerdeka = new IDikson() {
            @Override
            public double hitungDiskon(int harga) {
                return harga * (1 - 0.3);
            }
        };
        // dengan lambda
        IDikson diskonLebaran = (harga) -> harga * (1 - 0.4);
        // lambda dengan block statement
        // digunakan apabila terdapat lebih dari satu statement
        IDikson diskonBiasa = (harga) -> {
            return harga * (1 - 0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}
