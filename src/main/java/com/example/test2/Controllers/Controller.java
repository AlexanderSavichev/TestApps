package com.example.test2.Controllers;

import com.example.test2.Model.CalculationResult;
import com.example.test2.Repository.AppRepo;
import com.example.test2.Service.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Component
public class Controller {
    @Autowired
    Method newMethod;
    Integer newWeight = 80;
    @Autowired
    public AppRepo repository;
    @GetMapping("/param")
    public int getWeight(@RequestParam(value = "level", defaultValue = "0") int level, @RequestParam (value = "index", defaultValue = "0") int index) {
        CalculationResult result = repository.findByResLevelAndResPosition(level, index);
        if (result != null) {return result.ResWeight;}
        result = new CalculationResult();
        result.ResLevel = level;
        result.ResPosition = index;
        result.ResWeight = newMethod.getWeight(level, index, newWeight);
        repository.save(result);
        return result.ResWeight;

    }
}
