package pattern.behavioral.templatemethod;

public class CloseDirection extends Direction {

    @Override
    void getDirection() {
        System.out.println("가까운 길을 찾습니다.");
    }

}