package univ;

public class Dosen {
    String nama;
    int nik;
    String pendidikan;
    String tglLahir;

    void tampilkanNama(String namaDosen){
        nama = namaDosen;
    }
    
    void tampilkanTglLahir(String tglLahirDosen){
        tglLahir = tglLahirDosen;
    }

    void tampilkanNik(int nikDosen){
        nik = nikDosen;
    }

    void tampilkanPendidikan(String pendidikanDosen){
        pendidikan = pendidikanDosen;
    }

    void panggilDosen(){
        System.out.println("Nama Dosen: " + nama + "\n" +
                            "NIK Dosen: " + nik + "\n" +
                            "Pendidikan Dosen: " + pendidikan + "\n" +
                            "Tanggal Lahir Dosen: " + tglLahir + "\n");
    }
}


