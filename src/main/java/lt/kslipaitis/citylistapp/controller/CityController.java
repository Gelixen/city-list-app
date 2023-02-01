package lt.kslipaitis.citylistapp.controller;

import lt.kslipaitis.citylistapp.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public String getAllCities() {
        return cityService.getAllCities().get(0).name();
    }
}
