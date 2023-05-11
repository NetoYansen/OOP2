package ru.netology.radio;

public class Radio {
    private int minStation = 0;
    private int quantityStations = 10;
    private int maxStation = quantityStations - 1;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int numberStation;
    private int volume;

    public Radio() {
    }

    public Radio(int quantityStations) {
        this.quantityStations = quantityStations;
    }

    public int getQuantityStations() {
        return quantityStations;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > maxStation) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void nextNumberStation() {
        if (numberStation == maxStation) {
            setNumberStation(0);
        } else {
            numberStation++;
        }

    }

    public void prevNumberStation() {
        if (numberStation == 0) {
            setNumberStation(maxStation);
        } else {
            numberStation--;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            setVolume(volume + 1);
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            setVolume(volume - 1);
        }
    }
}
