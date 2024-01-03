package com.example.cicdtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class WhateverTest {

    Whatever whatever = new Whatever();
    @Test
    void whatever() {
        int i = 3;
        int j = 5;

        int result = whatever.whatever(i, j);

        assertEquals(result, 8);


    }
}