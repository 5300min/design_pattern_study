package pattern.behavioral.templatemethod;

public class FastDirection extends Direction {

    @Override
    void getDirection() {
        System.out.println("빠른 길을 찾습니다.");
    }

}