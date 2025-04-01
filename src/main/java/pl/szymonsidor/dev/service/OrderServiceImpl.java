package pl.szymonsidor.dev.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pl.szymonsidor.dev.model.Order;
import pl.szymonsidor.dev.model.orderStatus;
import pl.szymonsidor.dev.repository.OrderRepository;

import java.util.List;
import java.time.LocalDateTime;

@Service
public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        order.setCreatedAt(LocalDateTime.now());
        order.setStatus(orderStatus.NOWE);
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(int id) {
        return null;
    }

    @Override
    public Order updateOrderStatus(int id, orderStatus status) {
        return null;
    }

    @Override
    public void deleteOrders(int id) {

    }

    @Override
    public List<Order> getOrderByStatus(orderStatus status) {
        return List.of();
    }

    @Override
    public List<Order> getOrders() {
        return List.of();
    }
}
