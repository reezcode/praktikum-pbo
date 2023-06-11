import java.util.*;
import java.util.Map.Entry;

public class Koleksi {
    private Map<String, String> data = new HashMap<>();

    public Koleksi(){}

    public void addData(String NIK, String namaPenumpang){
        data.put(NIK,namaPenumpang);
    }

    public void updateData(String NIK, String namaPenumpang){
        data.replace(NIK, namaPenumpang);
    }

    public void deleteData(String NIK){
        data.remove(NIK);
    }

    public Map<String,String> getData(){
        return data;
    }

    public String getNamaPenumpang(String NIK){
        return data.get(NIK);
    }

    public String getNIK(String namaPenumpang){
        String nik = "";
        for(Entry<String, String> x : data.entrySet()){
            if(x.getValue() == namaPenumpang){
                nik = x.getKey();
            }
        }
        return nik;
    }
}
