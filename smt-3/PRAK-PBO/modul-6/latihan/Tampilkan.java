package latihan;

public class Tampilkan {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan();
        Mobil mobil = new Mobil();
        Pesawat pesawat = new Pesawat();

        mobil.info();
        mobil.infoKendaraan();
        pesawat.info();
    }
}
