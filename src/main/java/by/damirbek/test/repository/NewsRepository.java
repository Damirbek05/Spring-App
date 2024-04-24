package by.damirbek.test.repository;

import by.damirbek.test.models.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News,Long> {
}
