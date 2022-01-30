package com.example.test2.Repository;
import com.example.test2.Model.CalculationResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepo extends JpaRepository<CalculationResult, Long> {
    CalculationResult findByResLevelAndResPosition (int ResLevel, int ResPosition);

}
