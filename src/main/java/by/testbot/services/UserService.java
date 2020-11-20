package by.testbot.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.testbot.models.User;
import by.testbot.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void update(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Transactional
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Transactional
    public User getById(Long id) {
        return userRepository.findAll().stream().filter(u -> u.getId() == id).findAny().orElse(null);
    }

    @Transactional
    public User getByViberId(String viberId) {
        return userRepository.findAll().stream().filter(u -> u.getViberId().equals(viberId)).findAny().orElse(null);
    }
}
