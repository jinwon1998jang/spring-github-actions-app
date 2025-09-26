package kr.co.jinwon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootTest
class SpringGithubActionsAppApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(SpringGithubActionsAppApplication.class, args);
    }

    @Value("${spring.application.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    public String index() {
        return appName + " - " +appVersion;
    }
}
