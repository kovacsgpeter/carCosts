package com.codecool.autokoltseg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car testGCar;
    private Car testDCar;
    private Car testECar;

    @BeforeEach
    void setup(){
        testDCar = new DieselCar("diesel", "dieselmodel", 1, 1);
        testGCar = new GasCar("gas", "gasmodel", 1, 1, 1);
        testECar = new ElectricCar("electric", "electricmodel", 1, 1);

    }

    @AfterEach
    void tearDown(){
        testDCar = null;
        testGCar = null;
        testECar = null;

    }

    @Test
    void carsNotNull(){
        assertNotNull(testDCar);
        assertNotNull(testECar);
        assertNotNull(testGCar);

    }

    @DisplayName("cars NOT NULL")
    @ParameterizedTest
    @ValueSource(strings = {"fiat", "ford"})
    void testCarName(String message){
        assertNotNull( new ElectricCar(message, "typo", 1, 1).getManufacturer() );
        assertEquals(message, new ElectricCar(message, "typo", 1, 1).getManufacturer() );

    }


}