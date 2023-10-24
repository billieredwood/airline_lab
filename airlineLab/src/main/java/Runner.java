import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
//
        Airline airline = new Airline("Ryanair");
       Flight flight = new Flight("London", "20/11/2023", "12345");
//        Flight flight2 = new Flight("Manchester", "20/11/2023", "12495");
//
       airline.addFlight(flight);
//        airline.addFlight(flight2);
//
//        Passenger passenger = new Passenger("Tom", "tlog@gmail.com", "999");
//        passenger.printPassengerID();
//        Passenger passenger2 = new Passenger("Tom", "tlog@gmail.com", "999");
//        passenger2.printPassengerID();
//
//        airline.printFLightList();

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning == true){
            System.out.println("Display flights, create flight, create passenger, book passenger onto flight, remove passenger flight, cancel flight");
            String response = scanner.nextLine();
            if (response.equals("quit")) {
                isRunning = false;
            }
            if (response.equals("Create Flights")) {
                airline.userAddFlight();

            }

            if (response.equals("Display Flights")) {
                airline.printFLightList();
            }

            if (response.equals("Cancel Flights")) {
                System.out.println("What flight ID would you like to cancel?");
                response = scanner.nextLine();
                for (Flight myFlight : airline.getFlightList()) {
                    if (response.equals(myFlight.flightId)) {
                        airline.removeFlight(myFlight);
                        break;
                    }
                }

            }


        }



    }
}
