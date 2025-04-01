package pl.szymonsidor.dev.model;
import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "Orders")
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private int customer_id;

    @ElementCollection
    @NotEmpty
    private List<String> productList;

    @DateTimeFormat
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private orderStatus status;

}
