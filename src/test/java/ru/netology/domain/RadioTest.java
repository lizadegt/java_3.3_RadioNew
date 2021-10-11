package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void NumberStation() {
        Radio radio = new Radio();

        assertEquals(10, radio.getNumberOfStations());
    }

    @Test
    public void enterNumberStationManually() {
        Radio radio = new Radio(5);

        assertEquals(5, radio.getNumberOfStations());
    }

    @Test
    public void enterCorrectValues() {
        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);
        radio.pressNextRadioStation();

        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStationAfterMaximum() {
        Radio radio = new Radio(8);
        radio.setCurrentRadioStation(7);
        radio.pressNextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(7);
        radio.setCurrentRadioStation(3);
        radio.pressPrevRadioStation();

        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationToMinimum() {
        Radio radio = new Radio(5);
        radio.pressPrevRadioStation();

        assertEquals(4, radio.getCurrentRadioStation());
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
        Radio radio = new Radio();
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void lowerVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.decreaseVolume();

        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void lowerVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume());
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
