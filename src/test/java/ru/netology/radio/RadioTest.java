package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextStationTest() {
        Radio radio = new Radio();
        radio.setNumberStation(9);

        radio.nextNumberStation();

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest1() {
        Radio radio = new Radio();
        radio.setNumberStation(0);

        radio.nextNumberStation();

        int expected = 1;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio();
        radio.setNumberStation(9);

        radio.prevNumberStation();

        int expected = 8;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationTest1() {
        Radio radio = new Radio();
        radio.setNumberStation(0);

        radio.prevNumberStation();

        int expected = 9;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberStationTest() {
        Radio radio = new Radio();
        radio.setNumberStation(9);

        radio.setNumberStation(5);

        int expected = 5;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberStationTest1() {
        Radio radio = new Radio();
        radio.setNumberStation(9);

        radio.setNumberStation(10);

        int expected = 9;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberStationTest2() {
        Radio radio = new Radio();
        radio.setNumberStation(0);

        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTest1() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.setVolume(101);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTest2() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.setVolume(50);

        int expected = 50;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest1() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTest1() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


}
