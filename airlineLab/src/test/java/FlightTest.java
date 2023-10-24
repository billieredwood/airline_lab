import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.BeanProperty;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight;

    @BeforeEach
    public void setUp()  { flight = new Flight("London", "20/11/2023", "12345");

    }

    @Test
    public void canGetDestination() {
        assertThat(flight.getDestination()).isEqualTo("London");
    }

    @Test
    public void canGetDate() {
        assertThat(flight.getDate()).isEqualTo("20/11/2023");
    }

    @Test
    public void canGetFlightId() {
        assertThat(flight.getFlightId()).isEqualTo("12345");
    }

    @Test
    public void canAddPassenger() {
        Passenger passenger2 = new Passenger("Tom", "tlog@gmail.com", "999");
        flight.addPassenger(passenger2);
        assertThat(flight.getPassengerList().size()).isEqualTo(1);
    }

    @Test
    public void canRemovePassenger() {
        Passenger passenger2 = new Passenger("Tom", "tlog@gmail.com", "999");
        flight.addPassenger(passenger2);
        flight.removePassenger(passenger2);
        assertThat(flight.getPassengerList().size()).isEqualTo(0);
    }

}
