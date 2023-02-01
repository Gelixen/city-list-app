package lt.kslipaitis.citylistapp.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import lt.kslipaitis.citylistapp.service.CityService;
import lt.kslipaitis.model.City;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class CityControllerIT {

    @Autowired
    protected ObjectMapper objectMapper;
    @Autowired
    private MockMvc mvc;

    @Test
    void getAllCities() throws Exception {
        var response = mvc.perform(get("/cities"))
            .andExpect(status().isOk())
            .andReturn();

        var actualResult = objectMapper.readValue(
            response.getResponse().getContentAsString(),
            new TypeReference<List<City>>() {
            }
        );

        assertEquals(CityService.TEMP_CITY, actualResult.get(0));
    }
}