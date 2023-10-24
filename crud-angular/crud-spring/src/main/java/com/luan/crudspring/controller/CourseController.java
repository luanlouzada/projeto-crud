package com.luan.crudspring.controller;


import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luan.crudspring.model.Course;
import com.luan.crudspring.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")

@Component
public class CourseController {


  private final CourseRepository courseRepository;

  public CourseController(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;  }


  @GetMapping
  public List<Course> list() {
    return courseRepository.findAll();
  }


}
