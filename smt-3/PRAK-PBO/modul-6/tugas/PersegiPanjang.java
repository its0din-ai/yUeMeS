package tugas;

public class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas(){
        luas = panjang * lebar;
        return luas;
    }

    public double hitungKeliling(){
        keliling = 2 * (panjang + lebar);
        return keliling;
    }
    
}
