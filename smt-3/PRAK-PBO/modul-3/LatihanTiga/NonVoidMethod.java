package LatihanTiga;

public class NonVoidMethod {
    public String getNama(String nama){
        return nama;
    }

    public String getNIM(String nim){
        return nim;
    }

    public static void main(String[] args) {
        NonVoidMethod nvm = new NonVoidMethod();
        String nama = nvm.getNama("Wahyu");
        String nim = nvm.getNIM("L200210056");

        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}


