/*
 * Nama File    : PolimorfismeCoercion.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Program penggunaan polimorfisme coercion
 * Tanggal      : 03 Mei 2023
 */


public class PolimorfismeCoercion {
    public static int kuadrat(int bilangan){
        return bilangan*bilangan;
    }
    public static void main(String[] args) {
        // deklarasi objek integer
        Integer bilangan = 10;
        
        // objek integer dipaksa untuk diubah menjadi objek primitif
        int hasilKuadrat = kuadrat(bilangan);

        System.out.printf("Hasil kuadrat %d adalah %d",bilangan,hasilKuadrat);
    }
}