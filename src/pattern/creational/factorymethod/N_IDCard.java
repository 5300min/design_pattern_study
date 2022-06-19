package pattern.creational.factorymethod;

public class N_IDCard extends Product{

    private String owner;

    public N_IDCard(String owner) {
        System.out.println("N사의 " + owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("N사의 " + owner + "의 카드를 사용합니다.");
    }

    public String getOwner() {
        return owner;
    }
}