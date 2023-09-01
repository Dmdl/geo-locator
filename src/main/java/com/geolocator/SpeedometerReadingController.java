package com.geolocator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeedometerReadingController {

    @PostMapping("location")
    public String addSpeedometerReading(@RequestBody SpeedometerReading reading){
        return "added";
    }
}
