package dv.kinash.hw20.repository;

import dv.kinash.hw20.repository.model.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Long> {
}
