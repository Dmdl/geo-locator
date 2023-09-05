CREATE DATABASE IF NOT EXISTS geo_locator;

create table speedometer_reading
(
    _id        INT           NOT NULL AUTO_INCREMENT,
    reading    DECIMAL(6, 2) NOT NULL,
    coordinate POINT         NOT NULL,
    PRIMARY KEY (_id)
);

ALTER TABLE speedometer_reading
    ADD COLUMN x_value DECIMAL(15, 10) AFTER coordinate;
ALTER TABLE speedometer_reading
    ADD COLUMN y_value DECIMAL(15, 10) AFTER x_value;
ALTER TABLE speedometer_reading
    ADD COLUMN z_value DECIMAL(15, 10) AFTER y_value;