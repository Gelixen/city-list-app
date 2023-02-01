package lt.kslipaitis.citylistapp.service;

import static java.util.Collections.singletonList;

import java.util.List;
import lt.kslipaitis.model.City;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    public static final City TEMP_CITY = new City(0L, "name", "photo-url");
    private final List<City> cities;

    public CityService() {
        cities = singletonList(TEMP_CITY);
    }

    public CityService(List<City> cities) {
        this.cities = cities;
    }

    public List<City> getAllCities() {
        return cities;
    }
}
