package PrivateMod;

public class Private {
    public static void main(String[] args) {
        PrivateModifier pm = new PrivateModifier();
        System.out.println(pm.nama);    // Variabel nama tdk dapat diakses karena aksesnya Private
        System.out.println(pm.umur);    // Variabel umur tdk dapat diakses karena aksesnya Private
    }
}


