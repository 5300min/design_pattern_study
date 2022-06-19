package pattern.creational.singleton;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) { // 스레드 경합 문제를 방지
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}