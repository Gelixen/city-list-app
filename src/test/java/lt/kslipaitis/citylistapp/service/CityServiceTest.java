package lt.kslipaitis.citylistapp.service;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import lt.kslipaitis.model.City;
import org.junit.jupiter.api.Test;

class CityServiceTest {

    private CityService cityService;

    @Test
    void getAllCities_returnTempCity() {
        cityService = new CityService();

        List<City> actualResult = cityService.getAllCities();

        assertEquals(singletonList(CityService.TEMP_CITY), actualResult);
    }

    @Test
    void getAllCities_returnPassedCitiesListWithSingleElement() {
        City city = new City(111L, "test-name", "test-url");
        List<City> cities = singletonList(city);
        cityService = new CityService(cities);

        List<City> actualResult = cityService.getAllCities();

        assertEquals(cities, actualResult);
    }

    @Test
    void getAllCities_returnPassedCitiesListWithMultipleElements() {
        City city1 = new City(111L, "test-name-1", "test-url-1");
        City city2 = new City(222L, "test-name-2", "test-url-2");
        List<City> cities = asList(city1, city2);
        cityService = new CityService(cities);

        List<City> actualResult = cityService.getAllCities();

        assertEquals(cities, actualResult);
    }
}