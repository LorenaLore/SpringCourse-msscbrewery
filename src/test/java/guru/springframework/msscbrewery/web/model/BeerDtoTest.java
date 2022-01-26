package guru.springframework.msscbrewery.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
public class BeerDtoTest extends BaseTest {
    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String json = objectMapper.writeValueAsString(beerDto);
        System.out.println(json);
    }

    @Test
    void testDeserialize() throws IOException {
        String json = "{\"beerName\":\"beer name\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":\"12.99\",\"createdDate\":\"26-01-2022T15:02:27+0200\",\"lastUpdateDate\":\"2022-01-26T15:02:27.7193617+02:00\",\"id\":\"7a4dac84-a43c-4217-87fe-70a3b1fb9426\"}";
        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beerDto);
    }

}
