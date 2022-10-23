package latihan;

public class Mobil extends Kendaraan {
    int jumlahPintu = 4;
    String tipeKendaraan = "SUV";
    String asal = "Jepang";

    // Overriding method
    public void info(){
        System.out.println("<=====================================================>");
        System.out.println("Tipe Kendaraan: " + tipeKendaraan);
        System.out.println("Asal Kendaraan: " + asal);
        System.out.println("Kapasitas Kendaraan: " + kapasitas);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
    
    public void infoKendaraan(){
        System.out.println("<=====================================================>");
        System.out.println("Tipe Kendaraan: " + tipe);
        System.out.println("Asal Kendaraan: " + asal);
        System.out.println("Kapasitas Kendaraan: " + kapasitas);
    }

}
