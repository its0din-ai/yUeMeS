package multi;

public class InheritanceTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.MessageA();
        b.MessageB();
        c.MessageA();
        c.MessageC();
        c.MessageB();
        c.MessageA();
    }
}
