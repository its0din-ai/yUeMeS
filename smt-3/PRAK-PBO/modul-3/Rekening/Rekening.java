package Rekening;

import java.util.Scanner;

public class Rekening {
    long saldo;
    int no_rekening;    
    Scanner masukan = new Scanner(System.in);

    public Rekening(long saldo) {
        this.saldo = saldo;
    }

    public Rekening() {

    }

    void cek_saldo (){
        System.out.println("Saldo Anda sekarang Rp " + saldo +",00");
    }

    void menabung (long simpan) {
        simpan = (long) masukan.nextInt();
        saldo = simpan+saldo;
        System.out.println("Saldo Anda sekarang Rp " + saldo +",00");
    }

    void menarik (long ambil) {
        ambil = masukan.nextInt();
        if (saldo <= ambil) {
            System.out.println("Mohon maaf saldo Anda tidak cukup!");
            
        } else saldo = saldo-ambil; {
            System.out.println("Saldo Anda sekarang Rp " + saldo +",00");
        }
    }

    void transfer (long kirim) {
        System.out.println("Masukkan no rekening tujuan Anda");
        no_rekening = masukan.nextInt();
        System.out.println("Masukkan jumlah uang yang ditransfer ");
        kirim = masukan.nextInt();
        saldo = saldo-kirim;
        System.out.println("Transfer telah sukses!");
        System.out.println("Saldo Anda sekarang Rp " + saldo +",00");
    }
}