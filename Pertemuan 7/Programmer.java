public class Programmer extends Manajer {
    private int bonus = 450000;
    public Programmer(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok + ", Bonus: " + this.bonus);
    }
}