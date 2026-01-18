package com.springdatabase.demo.services;

import com.springdatabase.demo.model.Course;
import com.springdatabase.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServices {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        return courseRepository.findByTopics_Id(topicId);
    }

    // Get single course by id
    public Course getCourse(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    // Add new course
    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    // Update existing course
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    // Delete course
    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
