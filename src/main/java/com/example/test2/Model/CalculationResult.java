package com.example.test2.Model;

import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class CalculationResult {
    @Id
    @GeneratedValue
    public Long id;
    public Integer ResLevel;
    public Integer ResPosition;
    public Integer ResWeight;

}
