package com.luan.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luan.crudspring.model.Course;
import com.luan.crudspring.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

  @Bean
  CommandLineRunner initDataBase(CourseRepository courseRepository) {
    return args -> {
      courseRepository.deleteAll();

      Course c = new Course();
      c.setName("Angular");
      c.setCategory("Front-end");



      courseRepository.save(c);
    };

  }

}
