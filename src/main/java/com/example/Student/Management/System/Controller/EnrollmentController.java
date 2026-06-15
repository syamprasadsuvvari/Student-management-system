package com.example.Student.Management.System.Controller;

import com.example.Student.Management.System.Model.Enrollment;
import com.example.Student.Management.System.Service.EnrollmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
@CrossOrigin("*")
public class EnrollmentController {

    private final EnrollmentService service;

    public EnrollmentController(EnrollmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Enrollment> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Enrollment create(@RequestBody Enrollment e) {
        return service.create(e);
    }
}