package inheritance;

public class Programmer extends Pegawai {
    public static void main(String[] args) {
        double lemburPerjam = 50000;
        double gajiPerBulan;

        Pegawai pegawai = new Pegawai();
        gajiPerBulan = pegawai.gajiPokok + lemburPerjam;
        System.out.println("Gaji per bulan: " + gajiPerBulan);
    }
}
