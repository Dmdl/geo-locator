CREATE DATABASE IF NOT EXISTS geo_locator;

create table speedometer_reading
(
    _id        INT   NOT NULL AUTO_INCREMENT,
    reading    DECIMAL(6, 2) NOT NULL,
    coordinate POINT NOT NULL,
    PRIMARY KEY (_id)
);