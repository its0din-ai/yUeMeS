package tugas;

public class Segitiga extends BangunDatar {
    double alas = 5;
    double tinggi = 12;

    public double hitungLuas(){
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    public double hitungKeliling(){
        keliling = 3 * alas;
        return keliling;
    }
}
