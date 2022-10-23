package order;

import food.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTests {
    Order order = new Order();

    @Test
    void testOrderInit() {
        assertEquals(10, order.getId().length());
        assertEquals(0, order.getItems().size());
    }

    @Test
    void testAddItem() {
        Pizza pizza = new Pizza();
        order.addItem(pizza);
        assertEquals(1, order.getItems().size());
        assertEquals(pizza, order.getItems().get(0));
    }

    @Test
    void testRemoveItem() {
        Pizza pizza = new Pizza();
        order.addItem(pizza);
        assertEquals(1, order.getItems().size());
        order.removeItem(pizza);
        assertEquals(0, order.getItems().size());
    }
}
