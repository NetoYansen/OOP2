package ru.netology.radio;

public class Radio {
    private int numberStation;
    private int volume;

    public int getNumberStation() {
        return numberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > 9) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void nextNumberStation() {
        if (numberStation == 9) {
            setNumberStation(0);
        } else {
            numberStation++;
        }

    }

    public void prevNumberStation() {
        if (numberStation == 0) {
            setNumberStation(9);
        } else {
            numberStation--;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            setVolume(volume + 1);
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            setVolume(volume - 1);
        }
    }
}
