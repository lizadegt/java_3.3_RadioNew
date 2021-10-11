package ru.netology.domain;

public class Radio {
    private String name;
    int numberOfStations = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private boolean on = true;


    public Radio(int numberOfStations) {
       this.numberOfStations = numberOfStations;
       this.maxRadioStation = numberOfStations - 1;
    }

    public Radio() {
        this.name = name;
        this.numberOfStations = numberOfStations;
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = currentRadioStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
        this.on = on;
    }

    public int getNumberOfStations(int i) {
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        this.numberOfStations = numberOfStations;
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

    public int getCurrentRadioStation(int i) {
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

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }
}
