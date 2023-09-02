package com.geolocator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpeedometerReadingController {

    private final Repository repository;

    public SpeedometerReadingController(Repository repository) {
        this.repository = repository;
    }

    @PostMapping("location")
    public String addSpeedometerReading(@RequestBody SpeedometerReading reading) {
        repository.addNewSpeedometerReading(reading);
        return "added";
    }

    @GetMapping("location")
    public List<SpeedometerReading> getSpeedometerReading() {
        return repository.getSpeedometerReadings();
    }
}
