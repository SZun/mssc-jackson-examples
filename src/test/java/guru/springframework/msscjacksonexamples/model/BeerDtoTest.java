package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest {

    private final String BEER_DTO_JSON = "{\"id\":\"cf70dc88-4b86-43ce-b4e7-e0774cf1ecae\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":12.99,\"createdDate\":\"2020-09-05T13:11:35.767008-05:00\",\"lastUpdatedDate\":\"2020-09-05T13:11:35.767805-05:00\"}\n";

    @Test
    void testSerializeDto() throws JsonProcessingException {

        System.out.println(
                mapper.writeValueAsString(getBeer())
        );

    }

    @Test
    void testDeserialize() throws IOException {

        System.out.println(
                mapper.readValue(
                        BEER_DTO_JSON,
                        BeerDto.class
                )
        );

    }
}