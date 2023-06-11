import java.util.*;

public class Kendaraan<T> {
    private String nomorPlat;
    private String namaPengendara;
    private int kursi;
    protected Koleksi koleksi;

    public Kendaraan(){}

    public Kendaraan(String plat, String nama, int maks){
        this.nomorPlat = plat;
        this.namaPengendara = nama;
        this.kursi = maks;
        this.koleksi = new Koleksi();
    }

    public void setNomorPlat(String plat){
        this.nomorPlat = plat;
    }

    public void setNamaPengendara(String nama){
        this.namaPengendara = nama;
    }

    public void setKursi(int maks){
        this.kursi = maks;
    }

    public String getNomorPlat(){
        return nomorPlat;
    }

    public String getNamaPengendara(){
        return namaPengendara;
    }

    public int getMaksPenumpang(){
        return kursi;
    }
}
