package ru.bachar.piwebapi.Measure;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MeasureRepository extends JpaRepository<Measure, Long> {
    @Query(value = "SELECT * FROM measure WHERE id = (SELECT MAX(id) FROM measure)", nativeQuery = true)
    List<Measure> getLast();

    @Query(value = "SELECT * FROM (SELECT * FROM measure ORDER BY id DESC LIMIT 12);", nativeQuery = true)
    List<Measure> getLastHour();

    @Query(value = "SELECT * FROM (SELECT * FROM measure ORDER BY id DESC LIMIT 288);", nativeQuery = true)
    List<Measure> getLastDay();
}
