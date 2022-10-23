package tugas;

public class Hitung {
    public static void main(String[] args) {
        double luas;
        double keliling;

        System.out.println("<=====================================>");
        Persegi persegi = new Persegi(5);
        luas = persegi.hitungLuas();
        keliling = persegi.hitungKeliling();
        System.out.println("Luas Persegi: " + luas);
        System.out.println("Keliling Persegi: " + keliling);
        System.out.println("<=====================================>");
        
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 10);
        luas = persegiPanjang.hitungLuas();
        keliling = persegiPanjang.hitungKeliling();
        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
        System.out.println("<=====================================>");
        
        Segitiga segitiga = new Segitiga();
        luas = segitiga.hitungLuas();
        keliling = segitiga.hitungKeliling();
        System.out.println("Luas Segitiga: " + luas);
        System.out.println("Keliling Segitiga: " + keliling);
        System.out.println("<=====================================>");
        
        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(5);
        luas = segitigaSamaSisi.hitungLuas();
        keliling = segitigaSamaSisi.hitungKeliling();
        System.out.println("Luas Segitiga Sama Sisi: " + luas);
        System.out.println("Keliling Segitiga Sama Sisi: " + keliling);
        System.out.println("<=====================================>");
        
        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(5);
        luas = segitigaSamaKaki.hitungLuas();
        keliling = segitigaSamaKaki.hitungKeliling();
        System.out.println("Luas Segitiga Sama Kaki: " + luas);
        System.out.println("Keliling Segitiga Sama Kaki: " + keliling);
        System.out.println("<=====================================>");
    }
}
