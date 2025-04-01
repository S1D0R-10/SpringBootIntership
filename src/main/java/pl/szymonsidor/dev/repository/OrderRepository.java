package pl.szymonsidor.dev.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.szymonsidor.dev.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {}