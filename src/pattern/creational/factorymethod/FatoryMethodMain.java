package pattern.creational.factorymethod;

public class FatoryMethodMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("N", "홍길동");
        Product card2 = factory.create("S", "김정태");
        Product card3 = factory.create("K", "손수영");
        card1.use();
        card2.use();
        card3.use();
    }
}
