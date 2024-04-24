package by.damirbek.test.repository;

import by.damirbek.test.models.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request,Long> {
}
