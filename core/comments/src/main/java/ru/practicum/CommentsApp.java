package ru.practicum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import ru.practicum.event.client.EventClient;
import ru.practicum.user.UserClient;

@SpringBootApplication
@ComponentScan(basePackages = {"ru.practicum", "ru.practicum.feignconfiguration"})
@EnableFeignClients(clients = {UserClient.class, EventClient.class})
@EnableDiscoveryClient
public class CommentsApp {
    public static void main(String[] args) {
        SpringApplication.run(CommentsApp.class, args);
    }
}