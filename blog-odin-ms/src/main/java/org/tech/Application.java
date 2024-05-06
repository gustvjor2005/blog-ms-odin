package org.tech;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.tech.model.Comment;
import org.tech.repository.CommentRepository;

import java.util.stream.Stream;

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  ApplicationRunner init(CommentRepository commentRepository) {
    return args -> {
      Stream.of("bueno", "malo", "maso").forEach(name -> {
        commentRepository.save(new Comment(name));
      });
    };
  }


}