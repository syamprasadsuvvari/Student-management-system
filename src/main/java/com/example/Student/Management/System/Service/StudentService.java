package com.example.Student.Management.System.Service;

import com.example.Student.Management.System.Model.Student;
import com.example.Student.Management.System.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Student getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Student create(Student s) {
        return repo.save(s);
    }

    public Student update(Long id, Student s) {
        Student existing = getById(id);

        existing.setName(s.getName());
        existing.setEmail(s.getEmail());
        existing.setAge(s.getAge());
        existing.setDepartment(s.getDepartment());

        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}