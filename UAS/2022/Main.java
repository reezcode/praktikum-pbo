import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kendaraan motor2 = new Motor();
        Kendaraan motor = new Motor("ABC", "Boby"); // polimorfisme
        System.out.println(motor.getNamaPengendara());
        motor.setNamaPengendara("Jenab");
        System.out.println(motor.getNamaPengendara());
        motor.koleksi.addData("12312","Jaenab");
        System.out.println(motor.koleksi.getNamaPenumpang("12312"));
        motor.koleksi.addData("2121","Jacob");
        System.out.println(motor.koleksi.getNIK("Jacob"));
    }
}
