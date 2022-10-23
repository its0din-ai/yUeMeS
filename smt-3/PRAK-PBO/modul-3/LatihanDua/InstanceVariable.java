package LatihanDua;

public class InstanceVariable {
    int nilai;
    static int umur;

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }

    static void firstMethod(){
        int tahunSekarang = 2022;
        int tahunLahir = 2000;
        
        umur = tahunSekarang - tahunLahir;
        System.out.println("Usia saya adalah " + umur + " tahun");
    }

    static void secondMethod(){
        int beratLahir = 3;
        int beratBadan;

        beratBadan = beratLahir + (umur / 2);
        /*
         * Variabel umur dapat di akses di dalam method manapun
         * karena variabel umur bersifat Instance
         */

        System.out.println("Berat badan saya adalah " + beratBadan + " kg");
    }
}


