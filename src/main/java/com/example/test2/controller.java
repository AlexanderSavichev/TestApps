package com.example.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Component
public class controller {
    @Autowired
    Method newMethod;
    double newWeight = 50.0;
    @GetMapping("/param")
    public double getWeight(@RequestParam(value = "level", defaultValue = "0") int level, @RequestParam (value = "index", defaultValue = "0") int index) {
        return newMethod.getWeight(level, index, newWeight);
    }
}
