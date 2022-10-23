package LatihanSatu;

public class LocalVariable {
    public static void main(String[] args) {
        hitungUsia();
    }

    public static void hitungUsia(){
        int usia = 0;
        int tahunSekarang = 2022;
        int tahunLahir = 2000;
        
        usia = tahunSekarang - tahunLahir;
        System.out.println("Usia saya adalah " + usia + " tahun");
    }
    
    public static void beratBadan(){
        int beratLahir = 3;
        int beratBadan;

        beratBadan = beratLahir + (usia / 2);
        /*
         * Variabel usia tidak dapat diakses di dalam method beratBadan
         * karena variabel usia bersifat Lokal
         */
    }

}

