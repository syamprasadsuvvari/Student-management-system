package com.example.Student.Management.System.Repository;

import com.example.Student.Management.System.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
