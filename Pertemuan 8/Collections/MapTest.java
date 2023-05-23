/*
 * Nama File    : MapTest.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : Program MapTest untuk menguji collection pada java
 * Tanggal      : 17 Mei 2023
 */

import java.util.*;
public class MapTest {
 public static void main(String[] args) {
    Map<Integer,String> map = new HashMap<Integer,String>();
    // menyimpan nilai pada map
    map.put(1, "satu");
    map.put(2, "dua");
    map.put(3, "tiga");
    map.put(4, "empat");
    map.put(5, "lima");
    // menampilkan nilai map dengan kunci 1
    System.out.println(map.get(1));
    // generate set dari map keyset
    Set<Integer> keys = map.keySet();
    // looping untuk menampilkan key dan nilainya masing-masing
    for(Integer key : keys){
        System.out.println(key + " : " + map.get(key));
    }
 }   
}
