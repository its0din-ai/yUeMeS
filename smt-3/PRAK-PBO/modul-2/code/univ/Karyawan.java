package univ;

public class Karyawan {
    String nama;
    String alamat;
    String jabatan;
    double gaji;

    void tampilkanNama(String namaKaryawan){
        nama = namaKaryawan;
    }

    void tampilkanJabatan(String jabatanKaryawan){
        jabatan = jabatanKaryawan;
    }

    void tampilkanAlamat(String alamatKaryawan){
        alamat = alamatKaryawan;
    }

    void tampilkanGaji(double gajiKaryawan){
        gaji = gajiKaryawan;
    }

    void panggilKaryawan(){
        System.out.println("Nama Karyawan: " + nama + "\n" +
                            "Alamat Karyawan: " + alamat + "\n" +
                            "Jabatan Karyawan: " + jabatan + "\n" +
                            "Gaji Karyawan: " + gaji + "\n");
    }
}



