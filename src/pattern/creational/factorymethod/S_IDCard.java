package pattern.creational.factorymethod;

public class S_IDCard extends Product{

    private String owner;

    public S_IDCard(String owner) {
        System.out.println("S사의 " + owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("S사의 " + owner + "의 카드를 사용합니다.");
    }

    public String getOwner() {
        return owner;
    }
}