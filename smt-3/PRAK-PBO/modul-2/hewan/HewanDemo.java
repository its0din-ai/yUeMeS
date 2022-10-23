package hewan;

public class HewanDemo {
    public static void main(String[] args) {
        Hewan harimau = new Hewan();
        Hewan kerbau = new Hewan();

        harimau.kasihNama("Harimau");
        harimau.kasihJmlKaki(4);
        harimau.kasihMakanan("Daging");
        harimau.kasihTipe("Karnivora");
        harimau.hewanApa();

        kerbau.kasihNama("Kerbau");
        kerbau.kasihJmlKaki(4);
        kerbau.kasihMakanan("Rumput");
        kerbau.kasihTipe("Karnivora");
        kerbau.hewanApa();
    }
}







