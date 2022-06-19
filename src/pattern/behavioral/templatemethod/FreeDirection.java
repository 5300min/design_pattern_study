package pattern.behavioral.templatemethod;

public class FreeDirection extends Direction {

    @Override
    void getDirection() {
        System.out.println("무료 길을 찾습니다.");
    }

}