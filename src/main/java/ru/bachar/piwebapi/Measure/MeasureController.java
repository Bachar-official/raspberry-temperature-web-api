package ru.bachar.piwebapi.Measure;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeasureController {
    private final MeasureRepository repository;

    MeasureController(MeasureRepository repository) {
        this.repository = repository;
    }

    // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/measures")
  List<Measure> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @GetMapping("/measures/{id}")
  Measure one(@PathVariable Long id) {
    return repository.findById(id)
    .orElseThrow(() -> new MeasureNotFoundException(id));
  }

  @GetMapping("/measures/last")
  List<Measure> last() {
    return repository.getLast();
  }

  @GetMapping("/measures/hour")
  List<Measure> lastHour() {
    return repository.getLastHour();
  }

  @GetMapping("/measures/day")
  List<Measure> lastDay() {
    return repository.getLastDay();
  }
    
}
