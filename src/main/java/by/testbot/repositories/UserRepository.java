package by.testbot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import by.testbot.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
