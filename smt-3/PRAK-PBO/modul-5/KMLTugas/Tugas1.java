package KMLTugas;

public class Tugas1 {
    String nama, id, prodi;

    public Tugas1(){
        System.out.println("Information Center");
    }

    public Tugas1(String nama, String id, String prodi){
        this.nama = nama;
        this.id = id;
        this.prodi = prodi;
    }

    public void ingfo(){
        System.out.println("===================================\n" + "Nama: " + nama + "\nID: " + id + "\nProdi: " + prodi + "\n");
    } 
}
