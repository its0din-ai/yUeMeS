package PublicMod;

public class PublicModifier {
    public int a = 2;
    public int b = 5;
    public int c = 9;

    public void kali(){
        int d = a * b * c;
        System.out.println("Hasil perkalian = " + d);
    }

    public void kurang(){
        int e = a - b - c;
        System.out.println("Hasil pengurangan = " + e);
    }

    public void bagi(){
        int f = a / b / c;
        System.out.println("Hasil pembagian = " + f);
    }

    public void rata(){
        int g = (a + b + c) / 3;
        System.out.println("Hasil rata-rata = " + g);
    }
}
