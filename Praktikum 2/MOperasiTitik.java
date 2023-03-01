/*
 * Nama File    : MOperasiTitik.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : File Main Operasi Titik
 * Tanggal      : 1 Maret 2023
 */
public class MOperasiTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik(5.0, 3.0);
        OperasiTitik op = new OperasiTitik();

        System.out.println("Titik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("\nTitik setelah direfleksi sumbu X");
        Titik t2 = op.refleksiX(t1);
        System.out.println("Titik(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        System.out.println("Titik setelah direleksi sumbu Y");
        Titik t3 = op.refleksiY(t2);
        System.out.println("Titik(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
    }
}