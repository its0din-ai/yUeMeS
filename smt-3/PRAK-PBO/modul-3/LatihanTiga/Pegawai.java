package LatihanTiga;

public class Pegawai {
    String nama;
    int nip;
    double gaji;

    public void pegawai(String nama, int nip, double gaji){
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
    }

    public static void main(String[] args) {
        
        Pegawai pgw0 = new Pegawai();
        pgw0.pegawai("Moona", 8475625, 1000000);
        
        Pegawai pgw1 = new Pegawai();
        pgw1.pegawai("Iofi", 8475627, 2000000);

        Pegawai pgw2 = new Pegawai();
        pgw2.pegawai("Kobo", 8475623, 2300000);

        Pegawai pgw3 = new Pegawai();
        pgw3.pegawai("Kaela", 8475626, 5000000);

        Pegawai pgw4 = new Pegawai();
        pgw4.pegawai("Zeta", 8475629, 4300000);


        System.out.println("===========================================================");
        System.out.println("Nama: " + pgw0.nama + ", NIP: " + pgw0.nip + ", Gaji: " + pgw0.gaji);
        System.out.println("Nama: " + pgw1.nama + ", NIP: " + pgw1.nip + ", Gaji: " + pgw1.gaji);
        System.out.println("Nama: " + pgw2.nama + ", NIP: " + pgw2.nip + ", Gaji: " + pgw2.gaji);
        System.out.println("Nama: " + pgw3.nama + ", NIP: " + pgw3.nip + ", Gaji: " + pgw3.gaji);
        System.out.println("Nama: " + pgw4.nama + ", NIP: " + pgw4.nip + ", Gaji: " + pgw4.gaji);
        System.out.println("===========================================================");
    }
    
}


