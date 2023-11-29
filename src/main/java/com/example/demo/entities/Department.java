package com.example.demo.entities;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class Department {
    private Long id;
    private String departmentName;
    private Lector headOfDepartment;
    private List<Lector> lectors;
}
