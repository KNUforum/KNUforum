package com.knuforum.api;


import com.knuforum.database.UserRepository;
import com.knuforum.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
  @Bean
  CommandLineRunner initDb(UserRepository repository){
    return args -> {
      log.info("Preloading " + repository.save(new User("test1", "asdf", "test1@test.com")));
      log.info("Preloading " + repository.save(new User("test2", "asdf", "test2@test.com")))
    };
  }
}
