package hewan;

public class Hewan {
    String namaHwn;
    int jmlKaki;
    String makanan;
    String tipeHwn;

    void kasihNama(String namaHewan){
        namaHwn = namaHewan;
    }

    void kasihJmlKaki(int jmlKakiHewan){
        jmlKaki = jmlKakiHewan;
    }

    void kasihMakanan(String makananHewan){
        makanan = makananHewan;
    }

    void kasihTipe(String tipeHewan){
        tipeHwn = tipeHewan;
    }

    void hewanApa(){
        System.out.println("Nama Hewan: " + namaHwn + "\n" +
                            "Jumlah Kaki Hewan: " + jmlKaki + "\n" +
                            "Makanan Hewan: " + makanan + "\n" +
                            "Tipe Hewan: " + tipeHwn + "\n");
    }

}







