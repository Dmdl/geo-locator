package com.geolocator;

import javax.validation.constraints.NotNull;

public class SpeedometerReading {
    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;
    private Double speed;
    @NotNull
    private Double xValue;
    @NotNull
    private Double yValue;
    @NotNull
    private Double zValue;

    public SpeedometerReading(Double latitude, Double longitude, Double speed, Double xValue, Double yValue, Double zValue) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
        this.xValue = xValue;
        this.yValue = yValue;
        this.zValue = zValue;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getxValue() {
        return xValue;
    }

    public void setxValue(Double xValue) {
        this.xValue = xValue;
    }

    public Double getyValue() {
        return yValue;
    }

    public void setyValue(Double yValue) {
        this.yValue = yValue;
    }

    public Double getzValue() {
        return zValue;
    }

    public void setzValue(Double zValue) {
        this.zValue = zValue;
    }
}
