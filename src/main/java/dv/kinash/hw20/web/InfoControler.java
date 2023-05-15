package dv.kinash.hw20.web;

import dv.kinash.hw20.repository.NewsRepository;
import dv.kinash.hw20.repository.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.StreamSupport;

@RestController
public class InfoControler {
    @Autowired
    NewsRepository repository;
    @GetMapping("/info")
    List<News> getInfo(){
        return StreamSupport.stream(repository.findAll().spliterator(), false).toList();
    }
}
