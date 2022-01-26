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
        String json = "{\"id\":\"df79bbe4-0f50-4afe-a76f-d63f12b45546\",\"beerName\":\"beer name\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"createdDate\":\"2022-01-26T14:36:49.7774426+02:00\",\"lastUpdateDate\":\"2022-01-26T14:36:49.7784398+02:00\"}";
        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beerDto);
    }

}
