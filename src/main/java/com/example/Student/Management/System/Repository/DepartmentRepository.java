package com.example.Student.Management.System.Repository;

import com.example.Student.Management.System.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
