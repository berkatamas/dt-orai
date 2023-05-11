package com.dt.test.feladat3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getSzelesseg() {
        Rectangle t1 = new Rectangle(12,2);
        int szelesseg = t1.getSzelesseg();

        //ebben az esetben azt várom, hogy a getSzelesseg eredménye 12 legyen
        assertEquals(12, szelesseg);
    }

    @Test
    void setSzelesseg() {
        Rectangle t1 = new Rectangle(12,2);
        assertThrows(IllegalArgumentException.class,()->{t1.setSzelesseg(5);});
    }

    @Test
    void getMagassag() {
    }

    @Test
    void setMagassag() {
    }

    @Test
    void getK() {
    }

    @Test
    void getT() {
    }
}