package com.geolocator;

public class SpeedometerReading {
    private double latitude;
    private double longitude;
    private double speed;

    public SpeedometerReading(double latitude, double longitude, double speed) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
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
}
