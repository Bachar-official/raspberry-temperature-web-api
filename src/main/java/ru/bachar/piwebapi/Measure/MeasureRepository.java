package ru.bachar.piwebapi.Measure;

import org.springframework.data.jpa.repository.JpaRepository;

interface MeasureRepository extends JpaRepository<Measure, Long> {
    
}
