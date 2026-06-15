package com.example.Student.Management.System.Service;

import com.example.Student.Management.System.Model.Enrollment;
import com.example.Student.Management.System.Repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    private final EnrollmentRepository repo;

    public EnrollmentService(EnrollmentRepository repo) {
        this.repo = repo;
    }

    public List<Enrollment> getAll() {
        return repo.findAll();
    }

    public Enrollment create(Enrollment e) {
        return repo.save(e);
    }
}