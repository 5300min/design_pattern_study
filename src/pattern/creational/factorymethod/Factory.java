package pattern.creational.factorymethod;

public abstract class Factory {

    public final Product create(String company, String owner) throws ClassNotFoundException {
        Product p = createProduct(company, owner); // 변경. company 구분자 추가
//        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String company, String owner) throws ClassNotFoundException; // // 변경. company 구분자 추가


}