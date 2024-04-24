package by.damirbek.test.service;

import by.damirbek.test.models.dto.NewsDTO;
import by.damirbek.test.models.entity.News;

import java.util.List;

public interface NewsService {
    News createNews(NewsDTO newsDTO);
    List<News> getAllNews();
}
