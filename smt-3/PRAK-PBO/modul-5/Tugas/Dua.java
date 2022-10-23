package Tugas;

public class Dua {
    public static void main(String[] args) {
        Satu welcome = new Satu();
        Satu agnt0 = new Satu("Loid Forger", "A001", "Secret");
        Satu agnt1 = new Satu("Yor Briar", "A002", "Assassin");
        Satu agnt3 = new Satu("Anya Forger", "A003", "Esper");

        agnt0.ingfo();
        agnt1.ingfo();
        agnt3.ingfo();
    }
}
