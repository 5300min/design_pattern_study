package pattern.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String company, String owner) throws ClassNotFoundException {
        if ("S".equals(company)) { // 변경 - 구분자에 맞는 Class 반환
            return new S_IDCard(owner);
        } else if ("N".equals(company)) {
            return new N_IDCard(owner);
        } else if ("K".equals(company)) {
            return new K_IDCard(owner);
        } else {
            throw new ClassNotFoundException("No Search IDCard. Please Check Company");
        }
    }

    public List<String> getOwners() {
        return owners;
    }
}