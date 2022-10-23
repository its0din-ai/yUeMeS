package Latihan2;

public class Buku {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanKe;
    double hargaJual;

    public Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }

    public Buku(String namaPengarang, String judulBuku) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
    }

    public Buku(int tahunTerbit, int cetakanKe) {
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
    }

    public void info(){
        System.out.println("===================================\n" + "Nama Pengarang: " + namaPengarang + "\nJudul Buku: " + judulBuku + "\nTahun Terbit: " + tahunTerbit + "\nCetakan Ke: " + cetakanKe + "\nHarga Jual: Rp. " + hargaJual);
    }

    public void ingfoString(){
        System.out.println("===================================\n" + "Nama Pengarang: " + namaPengarang + "\nJudul Buku: " + judulBuku);
    }

    public void ingfoInt(){
        System.out.println("===================================\n" + "Tahun Terbit: " + tahunTerbit + "\nCetakan Ke: " + cetakanKe + "\n");
    }



}
