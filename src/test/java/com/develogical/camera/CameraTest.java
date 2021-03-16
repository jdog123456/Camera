package com.develogical.camera;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class CameraTest {
    @Test
    public void switchingTheCameraOnPowersUpTheSensor() {
        final Sensor sensor = Mockito.mock(Sensor.class);
        final MemoryCard memCard = Mockito.mock(MemoryCard.class);
        final Camera cam = new Camera(sensor, memCard);

        cam.powerOn();

        verify(sensor, times(1)).powerUp();
    }

    @Test
    public void switchingTheCameraOffPowersDownTheSensor() {
        final Sensor sensor = Mockito.mock(Sensor.class);
        final MemoryCard memCard = Mockito.mock(MemoryCard.class);
        final Camera cam = new Camera(sensor, memCard);

        cam.powerOff();

        verify(sensor, times(1)).powerDown();
    }

    @Test
    public void shouldCopyDataToMemoryCardWhenPressingShutterWithPowerOn() {
        final Sensor sensor = Mockito.mock(Sensor.class);
        final MemoryCard memCard = Mockito.mock(MemoryCard.class);
        final Camera cam = new Camera(sensor, memCard);

        cam.powerOn();
        cam.pressShutter();

        verify(memCard, times(1)).write(any(), any());
    }
}
