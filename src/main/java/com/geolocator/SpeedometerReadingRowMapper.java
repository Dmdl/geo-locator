package com.geolocator;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SpeedometerReadingRowMapper implements RowMapper<SpeedometerReading> {
    @Override
    public SpeedometerReading mapRow(ResultSet rs, int rowNum) throws SQLException {
        var latitude = rs.getObject(1, Double.class);
        var longitude = rs.getObject(2, Double.class);
        var speed = rs.getObject(3, Double.class);
        return new SpeedometerReading(latitude, longitude, speed);
    }
}
