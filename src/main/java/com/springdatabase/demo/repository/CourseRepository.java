package com.springdatabase.demo.repository;

import com.springdatabase.demo.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    List<Course> findByTopics_Id(String id);
}
