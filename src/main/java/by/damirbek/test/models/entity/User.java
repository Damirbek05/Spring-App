package by.damirbek.test.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true , name = "login")
    private String username;

    @Column(nullable = false,name = "password")
    private String password;

    @Column(nullable = false,name = "fullName")
    private String fullName;

    private String avatarUrl;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false, name = "created_at")
    private Date created_at;

    @PrePersist
    protected void onCreate() {
        created_at = new Date();
    }

}
