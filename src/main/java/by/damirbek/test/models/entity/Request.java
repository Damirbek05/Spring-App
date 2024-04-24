package by.damirbek.test.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "requests")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,name = "product")
    private String product;

    @Column(nullable = false,name = "quantity")
    private int quantity;

    @Column(nullable = false,name = "address")
    private String deliveryAddress;

    @Column(nullable = false,name = "phoneNumber")
    private String phoneNumber;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false, name = "created_at")
    private Date created_at;

    @PrePersist
    protected void onCreate() {
        created_at = new Date();
    }
}
