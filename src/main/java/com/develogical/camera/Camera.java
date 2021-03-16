package com.develogical.camera;

public class Camera {
    private final Sensor sensor;
    private final MemoryCard memCard;

    public Camera(final Sensor sensor, final MemoryCard memCard) {
        this.sensor = sensor;
        this.memCard = memCard;
    }

    public void pressShutter() {
        // not implemented
    }

    public void powerOn() {
        this.sensor.powerUp();
    }

    public void powerOff() {
       this.sensor.powerDown();
    }
}

