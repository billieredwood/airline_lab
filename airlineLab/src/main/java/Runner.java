public class Runner {
    public static void main(String[] args) {

        Airline airline = new Airline("Ryanair");
        Flight flight = new Flight("London", "20/11/2023", "12345");
        Flight flight2 = new Flight("Manchester", "20/11/2023", "12495");

        airline.addFlight(flight);
        airline.addFlight(flight2);

        Passenger passenger = new Passenger("Tom", "tlog@gmail.com", "999");
        passenger.printPassengerID();
        Passenger passenger2 = new Passenger("Tom", "tlog@gmail.com", "999");
        passenger2.printPassengerID();

        airline.printFLightList();


    }
}
