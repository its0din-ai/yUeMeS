package Latihan2;

public class BukuAccess {
    public static void main(String[] args) {
        Buku got = new Buku("Geroge R. R. Martin", "A Song of Ice and Fire", 1996, 1, 100000);
        Buku got2 = new Buku("Geroge R. R. Martin", "A Game of Thrones");
        Buku got3 = new Buku(1996, 1);

        Buku hp = new Buku("J. K. Rowling", "Harry Potter and the Philosopher's Stone", 1997, 1, 100000);
        Buku hp2 = new Buku("J. K. Rowling", "Harry Potter and the Philosopher's Stone");
        Buku hp3 = new Buku(1997, 1);

        Buku lotr = new Buku("J. R. R. Tolkien", "The Lord of the Rings", 1954, 1, 100000);
        Buku lotr2 = new Buku("J. R. R. Tolkien", "The Lord of the Rings");
        Buku lotr3 = new Buku(1954, 1);

        got.info();
        got2.ingfoString();
        got3.ingfoInt();

        hp.info();
        hp2.ingfoString();
        hp3.ingfoInt();

        lotr.info();
        lotr2.ingfoString();
        lotr3.ingfoInt();
    }
}
