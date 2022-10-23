package latihan;

public class Pesawat extends Kendaraan {
    String bahanBakar = "Avtur";
    String tipeKendaraan = "Jet Pribadi";
    String asal = "Amerika";

    // Overriding Method
    public void info(){
        System.out.println("<=====================================================>");
        System.out.println("Tipe Kendaraan: " + tipeKendaraan);
        System.out.println("Asal Kendaraan: " + asal);
        System.out.println("Kapasitas Kendaraan: " + kapasitas);
        System.out.println("Bahan Bakar: " + bahanBakar + "\n");
    }
}
