import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("generics");
        // menghapus elemen
        strings.remove("praktikum");
        for(String s : strings){
            System.out.println(s+" ");
        }
        
    }
}
