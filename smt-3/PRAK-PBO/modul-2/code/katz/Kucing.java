package katz;

public class Kucing {
    int umur;
    String warnaBulu;
    

    void meong(){
        System.out.println("Meong!!!!!!!!!!!!");
    }

    void umur(int umurKucing){
        umur = umurKucing;
    }

    void warnaBulu(String warnaBuluKucing){
        warnaBulu = warnaBuluKucing;
    }

    void kucingApa(){
        System.out.println("Umur Kucing: " + umur + "\n" +
                            "Warna Bulu Kucing: " + warnaBulu);
    }
}

