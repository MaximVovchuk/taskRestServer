package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class Lector {
    private Long id;
    private String fullName;
    private Degree degree;
    private BigDecimal salary;
}
