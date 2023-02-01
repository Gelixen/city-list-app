package lt.kslipaitis.citylistapp.controller;

import java.util.List;
import lt.kslipaitis.citylistapp.service.CityService;
import lt.kslipaitis.model.City;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }
}
