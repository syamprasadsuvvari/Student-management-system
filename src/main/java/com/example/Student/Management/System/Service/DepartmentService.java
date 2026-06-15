package com.example.Student.Management.System.Service;

import com.example.Student.Management.System.Model.Department;
import com.example.Student.Management.System.Repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository repo;

    public DepartmentService(DepartmentRepository repo) {
        this.repo = repo;
    }

    public List<Department> getAll() {
        return repo.findAll();
    }

    public Department create(Department d) {
        return repo.save(d);
    }
}