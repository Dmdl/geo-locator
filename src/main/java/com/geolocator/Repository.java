package com.geolocator;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Repository {

    private final JdbcTemplate jdbcTemplate;

    private final String SQL_INSERT = "INSERT INTO speedometer_reading(reading, coordinate) values(?,POINT(?,?))";

    public Repository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean addNewSpeedometerReading(SpeedometerReading reading) {
        return jdbcTemplate.update(SQL_INSERT, reading.getSpeed(), reading.getLatitude(), reading.getLongitude()) > 0;
    }
}
