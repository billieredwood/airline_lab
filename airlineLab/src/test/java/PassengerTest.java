import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {

    Passenger passenger;

    @BeforeEach
    public void setUp(){
        passenger = new Passenger("Tom", "tlog@gmail.com", "999");
    }

    @Test
    void canGetName(){
        assertThat(passenger.getName()).isEqualTo("Tom");
    }

    @Test
    void canSetPassengerID(){
        passenger.setPassengerID(1050);
        assertThat(passenger.getPassengerID()).isEqualTo(1050);
    }



}
