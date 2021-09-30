package ru.netology.domain;

public class Radio {
    private String name;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private boolean on = true;


    public Radio(int minRadioStation, int maxRadioStation, int currentRadioStation, int minVolume, int maxVolume, int currentVolume) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = currentRadioStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

    public Radio() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }
    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation)
            return;
        if (currentRadioStation < minRadioStation)
            return;
        this.currentRadioStation = currentRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void pressNextRadioStation() {
        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void pressPrevRadioStation() {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

