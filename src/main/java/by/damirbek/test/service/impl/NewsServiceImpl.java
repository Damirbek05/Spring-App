package by.damirbek.test.service.impl;

import by.damirbek.test.models.dto.NewsDTO;
import by.damirbek.test.models.entity.News;
import by.damirbek.test.repository.NewsRepository;
import by.damirbek.test.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    private final NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository){
        this.newsRepository = newsRepository;
    }

    @Override
    public News createNews(NewsDTO newsDTO) {
        News news = new News();

        news.setTitle(newsDTO.getTitle());
        news.setContent(newsDTO.getContent());

        return newsRepository.save(news);
    }

    @Override
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }
}
