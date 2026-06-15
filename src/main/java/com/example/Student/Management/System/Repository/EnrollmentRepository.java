package com.example.Student.Management.System.Repository;

import com.example.Student.Management.System.Model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
