package pattern.structural.proxy;

public class OrderFulfillment implements IOrder {
    private List<Warehouse> warehouses;

    @Override
    public void fulfillOrder(Order order) {
        for (Item item: order.getItemList()) {
            for (Warehouse warehouse: warehouses) {
                if (warehouse.currentInventory(item) != 0) {
                    warehouse.fulfillOrder(order);
                }
            }
        }
    }
}