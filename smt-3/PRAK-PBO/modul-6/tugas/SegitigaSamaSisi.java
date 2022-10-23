package tugas;

public class SegitigaSamaSisi extends Segitiga {
    double alas;

    public SegitigaSamaSisi(double alas) {
        this.alas = alas;
    }

    public double hitungLuas(){
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    public double hitungKeliling(){
        keliling = 3 * alas;
        return keliling;
    }
}
