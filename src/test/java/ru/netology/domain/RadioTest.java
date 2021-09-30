package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void createRadio() {
        Radio radio = new Radio();
        String expected = "Радио";
        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void offRadioStation() {
        Radio radio = new Radio();
        radio.isOn();
        assertTrue(radio.isOn());
    }

    @Test
    public void nextStationAfterMaximum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.pressNextRadioStation();

        assertEquals(radio.getMinRadioStation(), radio.getCurrentRadioStation());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);
        radio.pressNextRadioStation();

        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationToMinimum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        radio.pressPrevRadioStation();

        assertEquals(radio.getMaxRadioStation(), radio.getCurrentRadioStation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.pressPrevRadioStation();

        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void enterStationManually() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void enterStationManuallyGreaterMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(13);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void enterStationManuallyLessMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-3);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void enterStationManuallyMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void enterStationManuallyMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
    }


    @Test
    public void increaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());

    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();

        assertEquals(9, radio.getCurrentVolume());

    }

    @Test
    public void lowerVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void lowerVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.decreaseVolume();

        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void manuallyEnterVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void manuallyEnterVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void manuallyEnterVolumeGreaterMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(25);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void manuallyEnterVolumeGreaterLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void manuallyEnterVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        assertEquals(7, radio.getCurrentVolume());
    }
}
