package com.geolocator;

import javax.validation.constraints.NotNull;

public class SpeedometerReading {
    @NotNull
    private double latitude;
    @NotNull
    private double longitude;
    @NotNull
    private double speed;
    @NotNull
    private double xValue;
    @NotNull
    private double yValue;
    @NotNull
    private double zValue;

    public SpeedometerReading(double latitude, double longitude, double speed, double xValue, double yValue, double zValue) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
        this.xValue = xValue;
        this.yValue = yValue;
        this.zValue = zValue;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getxValue() {
        return xValue;
    }

    public void setxValue(double xValue) {
        this.xValue = xValue;
    }

    public double getyValue() {
        return yValue;
    }

    public void setyValue(double yValue) {
        this.yValue = yValue;
    }

    public double getzValue() {
        return zValue;
    }

    public void setzValue(double zValue) {
        this.zValue = zValue;
    }
}
