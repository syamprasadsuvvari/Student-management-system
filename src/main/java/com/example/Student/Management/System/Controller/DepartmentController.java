package com.example.Student.Management.System.Controller;

import com.example.Student.Management.System.Model.Department;
import com.example.Student.Management.System.Service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@CrossOrigin("*")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Department> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Department create(@RequestBody Department d) {
        return service.create(d);
    }
}