package com.develogical.camera;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class CameraTest {
    @Test
    public void switchingTheCameraOnPowersUpTheSensor() {
        final Sensor sensor = Mockito.mock(Sensor.class);
        final Camera cam = new Camera(sensor);

        cam.powerOn();

        verify(sensor, times(1)).powerUp();
    }
}
