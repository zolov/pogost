package ru.zolov.pogost.repos;

import org.springframework.data.repository.CrudRepository;
import ru.zolov.pogost.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
