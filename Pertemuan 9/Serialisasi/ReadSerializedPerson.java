/*
* Nama File    : ReadSerializedPerson.java
* Nama Pembuat : Resma Adi Nugroho
* NIM          : 24060121120021
* Deskripsi    : Main file untuk membaca data dari serialisasi
* Tanggal      : 03 Juni 2023
*/

import java.io.*;
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person p = null;
        try {
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            p = (Person) ois.readObject();
            ois.close();
            System.out.println("Serialized person name = "+p.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
