package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void enterCorrectValues() {
        Radio radio = new Radio(0, 9, 8, 0, 100, 50);
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void createMaxRadioStation9s() {
        Radio radio = new Radio(0, 9, 9, 0, 100, 50);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio(0, 9, 4, 0, 100, 50);
        radio.pressNextRadioStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStationAfterMaximum() {
        Radio radio = new Radio(0, 9, 9, 0, 100, 50);
        radio.pressNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(0, 9, 6, 0, 100, 50);
        radio.pressPrevRadioStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationToMinimum() {
        Radio radio = new Radio(0, 9, 0, 0, 100, 50);
        radio.pressPrevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
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
    public void increaseVolume() {
        Radio radio = new Radio(0, 9, 0, 0, 100, 50);
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio radio = new Radio(0, 9, 0, 0, 100, 100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void lowerVolume() {
        Radio radio = new Radio(0, 9, 0, 0, 100, 50);
        radio.decreaseVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void lowerVolumeBelowMin() {
        Radio radio = new Radio(0, 9, 0, 0, 100, 0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
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
        radio.setCurrentVolume(125);

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
