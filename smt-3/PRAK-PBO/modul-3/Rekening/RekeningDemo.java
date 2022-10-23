package Rekening;
import java.util.Scanner;

public class RekeningDemo {
    public static void main(String[] args) {
        long ambil = 0, simpan = 0, kirim = 200000;
        Scanner pilih = new Scanner(System.in);
        Rekening rek = new Rekening();

        System.out.println("Selamat Datang di Bank Toyib");
        for (int i = 1; i >= 1 ; i++) {
        
        System.out.println("\nMenu ATM");
        System.out.println("1. Cek Saldo \n2. Simpan Uang \n3. Ambil Uang \n4. Transfer \n5. Batalkan transaksi");
        System.out.print("Pilih Menu ATM : " );
        int menu = pilih.nextInt();
        System.out.print("\n");

        if (menu == 1) {
            rek.cek_saldo();
            
        } else if (menu == 2) {
            System.out.println("Masukkan uang Anda Rp ");
            rek.menabung(simpan);     

        } else if (menu == 3) {
            System.out.println("Masukkan uang yang ingin Anda ambil Rp ");
            rek.menarik(ambil);

        } else if (menu == 4) {     
            rek.transfer(kirim);

        } else if (menu == 5) {
            System.out.print("Transaksi dibatalkan ");
            break;

        } else if (menu > 5) {
            System.out.print("Menu Tidak Ada ");
            System.out.print("Ulangi Pilih Menu ATM : ");
        } else break;}

     
    }
}