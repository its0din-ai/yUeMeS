package DefaultMod;

public class Latihan {
    public static void main(String[] args) {
        DefaultModifier dm = new DefaultModifier();
        System.out.println(dm.a);    // Variabel a dapat diakses karena aksesnya Default
        System.out.println(dm.b);    // Variabel b dapat diakses karena aksesnya Default
        System.out.println(dm.c);    // Variabel c dapat diakses karena aksesnya Default
        dm.jumlah();                 // Method jumlah dapat diakses karena aksesnya Default
    }
}
