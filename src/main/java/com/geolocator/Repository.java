package com.geolocator;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Repository {

    private final JdbcTemplate jdbcTemplate;

    private final String SQL_INSERT = "INSERT INTO speedometer_reading(reading, coordinate) values(?,POINT(?,?))";
    private final String SQL_SELECT = "SELECT ST_X(coordinate) as latitude, ST_Y(coordinate) as longitude, reading FROM speedometer_reading";

    public Repository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addNewSpeedometerReading(SpeedometerReading reading) {
        jdbcTemplate.update(SQL_INSERT, reading.getSpeed(), reading.getLatitude(), reading.getLongitude());
    }

    public List<SpeedometerReading> getSpeedometerReadings() {
        return jdbcTemplate.query(SQL_SELECT, new SpeedometerReadingRowMapper());
    }
}
