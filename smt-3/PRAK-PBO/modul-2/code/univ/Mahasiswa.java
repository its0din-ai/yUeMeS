package univ;

public class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    int semester;

    void tampilkanNama(String namaMhs){
        nama = namaMhs;
    }

    void tampilkanNim(String nimMhs){
        nim = nimMhs;
    }

    void tampilkanAlamat(String alamatMhs){
        alamat = alamatMhs;
    }

    void tampilkanSemester(int semesterMhs){
        semester = semesterMhs;
    }

    void panggilMahasiswa(){
        System.out.println("Nama Mahasiswa: " + nama + "\n" +
                            "NIM Mahasiswa: " + nim + "\n" +
                            "Alamat Mahasiswa: " + alamat + "\n" +
                            "Semester Mahasiswa: " + semester + "\n");
    }
}



