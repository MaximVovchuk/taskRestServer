package com.example.demo;

import com.example.demo.entities.Degree;
import com.example.demo.entities.Department;
import com.example.demo.entities.Lector;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class Controller {
    private final String name = "Javax";

    @GetMapping(path = "/")
    public Department getInfo() {
        Lector head = Lector.builder()
                .id(2L)
                .fullName("John Doe")
                .degree(Degree.PROFESSOR)
                .salary(BigDecimal.valueOf(1000.0))
                .build();
        return Department.builder()
                .id(2L)
                .departmentName(name)
                .headOfDepartment(head)
                .lectors(List.of(
                        head,
                        Lector.builder()
                                .id(2L)
                                .fullName("Jane Doe")
                                .degree(Degree.ASSISTANT)
                                .salary(BigDecimal.valueOf(500.0))
                                .build(),
                        Lector.builder()
                                .id(3L)
                                .fullName("John Smith")
                                .degree(Degree.ASSOCIATE_PROFESSOR)
                                .salary(BigDecimal.valueOf(750.0))
                                .build()))
                .build();
    }

    @GetMapping(path = "/name")
    public String getName() {
        return name;
    }
}
