package pattern.behavioral.templatemethod;

public abstract class Direction {

    // 출발, 도착 세팅
    final void setStartAndDest(String start, String end) {
        System.out.println("출발지 : " + start);
        System.out.println("도착지 : " + end);
    }

    // 경유지 세팅
    final void setPassThroughs(String... points) {
        for (String point : points) {
            System.out.println("* 경유지 : " + point);
        }
    }

    // 길 찾기
    abstract void getDirection();

}