package com.geolocator;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class SpeedometerReadingController {

    private final Repository repository;

    public SpeedometerReadingController(Repository repository) {
        this.repository = repository;
    }

    @PostMapping("location")
    public String addSpeedometerReading(@Valid @RequestBody SpeedometerReading reading) {
        var rateLimiter = RateLimiter.create(20);
        if (rateLimiter.tryAcquire()) {
            repository.addNewSpeedometerReading(reading);
            return "added";
        } else {
            return "too many requests";
        }
    }

    @GetMapping("location")
    public List<SpeedometerReading> getSpeedometerReading() {
        var rateLimiter = RateLimiter.create(20);
        if (rateLimiter.tryAcquire()) {
            return repository.getSpeedometerReadings();
        } else {
            return List.of();
        }
    }
}
