package DefaultModLatihan;

import DefaultMod.DefaultModifier;   // Import class DefaultModifier dari package DefaultMod

public class Latihan2 {
    public static void main(String[] args) {
        DefaultModifier dm = new DefaultModifier();
        System.out.println(dm.a);    // Variabel a tdk dapat diakses karena aksesnya Default
        System.out.println(dm.b);    // Variabel b tdk dapat diakses karena aksesnya Default
        System.out.println(dm.c);    // Variabel c tdk dapat diakses karena aksesnya Default
        dm.jumlah();                 // Method jumlah tdk dapat diakses karena aksesnya Default
    }
}
