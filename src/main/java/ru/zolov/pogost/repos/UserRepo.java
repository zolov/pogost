package ru.zolov.pogost.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zolov.pogost.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
