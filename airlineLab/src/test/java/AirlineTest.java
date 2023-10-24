import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirlineTest {

    Airline airline;

    @BeforeEach
    public void setUp(){
        airline = new Airline("Ryanair");
    }

    @Test
    public void canReturnPassengerList(){
        Flight flight = new Flight("London", "20/11/2023", "12345");
        Passenger passenger = new Passenger("Tom", "tlog@gmail.com", "999");

        flight.addPassenger(passenger);
        assertThat(airline)
    }



}
