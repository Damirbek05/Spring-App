package by.damirbek.test.controllers;
import by.damirbek.test.models.dto.NewsDTO;
import by.damirbek.test.models.entity.News;
import by.damirbek.test.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    private final NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public ResponseEntity<List<News>> getAllNews() {
        List<News> allNews = newsService.getAllNews();
        return ResponseEntity.ok(allNews);
    }

    @PostMapping
    public ResponseEntity<News> createNews(@RequestBody NewsDTO newsDTO) {
        News createdNews = newsService.createNews(newsDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdNews);
    }
}