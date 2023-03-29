/*
 * Nama File    : ExceptionononArray.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Program penggunaan eksepsi menggunakan class library Java
 * Tanggal      : 29 Maret 2023
 */

public class ExceptiononArray {
    public static void main(String[] args) {
        Integer[] arrayIntegers = new Integer[4];
        try {
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
