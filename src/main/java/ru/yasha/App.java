package ru.yasha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.yasha.controller.MyController;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@EntityScan("ru.yasha.entity")
@EnableJpaRepositories("ru.yasha.repository")
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
        MyController controller = new MyController();

    }
}
