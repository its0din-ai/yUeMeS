public class RotiDemo {
    public static void main(String[] args) {
        Roti roti1 = new Roti();
        roti1.beriWarna("Coklat");
        roti1.beriRasa("Keju");
        roti1.timbangBerat(100);
        roti1.hargaJual(10000);
        roti1.infoRoti();

        Roti roti2 = new Roti();
        roti2.beriWarna("Putih");
        roti2.beriRasa("Mayo");
        roti2.timbangBerat(250);
        roti2.hargaJual(15750);
        roti2.infoRoti();

        Roti roti3 = new Roti();
        roti3.beriWarna("Hijau");
        roti3.beriRasa("Matcha");
        roti3.timbangBerat(180);
        roti3.hargaJual(22500);
        roti3.infoRoti();
        
        Roti roti4 = new Roti();
        roti4.beriWarna("Merah");
        roti4.beriRasa("Red Velvet");
        roti4.timbangBerat(180);
        roti4.hargaJual(24200);
        roti4.infoRoti();

        System.out.println("==================================");
    }

}


