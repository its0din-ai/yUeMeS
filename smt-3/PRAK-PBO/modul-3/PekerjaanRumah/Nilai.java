package PekerjaanRumah;

public class Nilai {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;
    double nilaiTotal;
    double a = (double)nilaiUTS;
    double b = (double)nilaiUAS;
    double c = (double)nilaiTugas;

    public void nilai(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void info(){
        System.out.println("Nilai UTS double: " + a);
        System.out.println("Nilai UTS: " + a);
        System.out.println("Nilai UAS: " + b);
        System.out.println("Nilai Tugas: " + c);
    }

    public void total(){
        nilaiTotal = (a + b + c) / 3;
        System.out.println("Nilai Total: " + nilaiTotal);
    }

    public static void main(String[] args) {
        Nilai n = new Nilai();
        n.nilai(90, 70, 80);
        n.info();
        n.total();
    }
}




