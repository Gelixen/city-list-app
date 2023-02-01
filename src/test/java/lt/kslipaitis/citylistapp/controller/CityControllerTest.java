package lt.kslipaitis.citylistapp.controller;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import lt.kslipaitis.citylistapp.service.CityService;
import lt.kslipaitis.model.City;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CityControllerTest {

    @Mock
    private CityService cityService;
    private CityController cityController;

    @BeforeEach
    void setUp() {
        cityController = new CityController(cityService);
    }

    @Test
    void getAllCities() {
        City city = CityService.TEMP_CITY;
        when(cityService.getAllCities()).thenReturn(singletonList(city));

        String actualResult = cityController.getAllCities();

        verify(cityService).getAllCities();
        assertEquals(city.name(), actualResult);
    }
}