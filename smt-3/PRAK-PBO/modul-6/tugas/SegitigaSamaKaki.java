package tugas;

public class SegitigaSamaKaki extends Segitiga {
    double sisiMiring;

    public SegitigaSamaKaki(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    public double hitungLuas(){
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    public double hitungKeliling(){
        keliling = (2 * sisiMiring) + alas;
        return keliling;
    }
}
