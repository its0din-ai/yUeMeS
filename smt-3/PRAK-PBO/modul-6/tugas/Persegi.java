package tugas;

public class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas(){
        luas = sisi * sisi;
        return luas;
    }

    public double hitungKeliling(){
        keliling = 4 * sisi;
        return keliling;
    }
}

