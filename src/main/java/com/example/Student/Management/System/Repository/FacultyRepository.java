package com.example.Student.Management.System.Repository;

import com.example.Student.Management.System.Model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
