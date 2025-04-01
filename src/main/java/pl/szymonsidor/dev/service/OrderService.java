package pl.szymonsidor.dev.service;
import pl.szymonsidor.dev.model.Order;
import pl.szymonsidor.dev.model.orderStatus


public interface OrderService {
    Order createOrder(Order order);
    Order getOrderById(int id);
    Order updateOrderStatus(int id, orderStatus status);
    void deleteOrders(int id);
    Order getOrderByStatus(orderStatus status);
    Order getOrders();
}