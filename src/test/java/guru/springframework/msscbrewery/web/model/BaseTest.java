package guru.springframework.msscbrewery.web.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {


    @Autowired
    ObjectMapper objectMapper;

    BeerDto getDto() {
        return BeerDto.builder()
                .beerId(UUID.randomUUID())
                .beerName("beer name")
                .beerStyle("Ale")
                .createdDate(OffsetDateTime.now())
                .lastUpdateDate(OffsetDateTime.now())
                .upc(123123123123L)
                .build();
    }
}
