package md.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }

    @Bean
    public CommandLineRunner writeData(FileWriterGateway gateway, Environment env) {
        return args -> gateway.writeToFile("simple.txt", "Hello, Spring Integration!");
    }

}
