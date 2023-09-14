CREATE DATABASE IF NOT EXISTS geo_locator;

create table speedometer_reading
(
    _id        INT             NOT NULL AUTO_INCREMENT,
    coordinate POINT           NOT NULL,
    reading    DECIMAL(6, 2),
    x_value    DECIMAL(15, 10) NOT NULL,
    y_value    DECIMAL(15, 10) NOT NULL,
    z_value    DECIMAL(15, 10) NOT NULL,
    PRIMARY KEY (_id)
);