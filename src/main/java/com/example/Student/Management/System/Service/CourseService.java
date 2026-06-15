package com.example.Student.Management.System.Service;

import com.example.Student.Management.System.Model.Course;
import com.example.Student.Management.System.Repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository repo;

    public CourseService(CourseRepository repo) {
        this.repo = repo;
    }

    public List<Course> getAll() {
        return repo.findAll();
    }

    public Course create(Course c) {
        return repo.save(c);
    }
}