package LatihanTiga;

public class MethodParameter {
    String nama;

    public String setNama(String nama){
        return this.nama = nama;
    }

    public static void main(String[] args) {
        MethodParameter mp = new MethodParameter();
        mp.setNama("Vestia Zeta");
        System.out.println("Nama: " + mp.nama);
    }
}
