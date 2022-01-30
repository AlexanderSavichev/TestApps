package com.example.test2.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CalculationResult {
    @Id
    @GeneratedValue
    public Long id;
    public Integer resLevel;
    public Integer resPosition;
    public Integer resWeight;

}
