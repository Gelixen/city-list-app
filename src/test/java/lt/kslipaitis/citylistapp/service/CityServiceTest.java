package lt.kslipaitis.citylistapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CityServiceTest {

    private CityService cityService;

    @BeforeEach
    void setUp() {
        cityService = new CityService();
    }

    @Test
    void getAllCities() {
        String actualResult = cityService.getAllCities();

        assertEquals("cities", actualResult);
    }
}