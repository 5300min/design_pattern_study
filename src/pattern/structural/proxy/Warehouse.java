package pattern.structural.proxy;

import java.util.Hashtable;

public class Warehouse implements IOrder {
    private Hashtable<Integer, Integer> stock;
    private String address;

    @Override
    public void fulfillOrder(Order order) {
        for (Item item: order.getItemList()) {
            Integer sku = item.getSku();
            this.stock.replace(sku, stock.get(sku) - 1);

            /* 포장, 배송 등 기타 작업들이 추가적으로 이루어질 수 있음 */

        }
    }

    public int currentInventory(Item item) {
        return stock.getOrDefault(stock.get(item.getSku()), 0);
    }
}