package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    Radio radio = new Radio();

    @Test

    public void testRadio() {
        Radio radio = new Radio();
        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void testRadio2() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getMinStation());
    }
}