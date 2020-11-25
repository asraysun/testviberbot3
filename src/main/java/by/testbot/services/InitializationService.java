package by.testbot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.SneakyThrows;

@Service
public class InitializationService {
    @Autowired
    private ViberService viberService;

    @SneakyThrows
    public void initalize() {
        viberService.setWeebhook();
    }
}
