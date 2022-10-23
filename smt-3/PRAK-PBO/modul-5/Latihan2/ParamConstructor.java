package Latihan2;

public class ParamConstructor {
    String nama, nim;
    int semester;

    public ParamConstructor(String nama, String nim, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
    }

    public void ingfo(){
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nSemester: " + semester);
    }
}
