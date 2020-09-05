package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest {

    private final String BEER_DTO_JSON = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":\"12.99\",\"createdDate\":\"2019-06-03T21:01:53-0400\",\"lastUpdatedDate\":\"2019-06-03T21:01:53.628287-04:00\",\"myLocalDate\":\"20190603\",\"beerId\":\"8ed4c7eb-ef3a-437e-823e-a26497ed7e71\"}\n";


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