package by.damirbek.test.repository;

import by.damirbek.test.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findUserByUsername(String username);
    boolean existsByUsername(String username);

}
