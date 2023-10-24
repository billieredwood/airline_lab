import java.util.ArrayList;
import java.util.Scanner;

public class Airline {

    private String name;
    private ArrayList<Flight> flightList;

    public Airline(String name){
        this.name = name;
        this.flightList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Flight> getFlightList() {
        return this.flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

    public void addFlight(Flight flight){
        this.flightList.add(flight);
    }

    public void removeFlight(Flight flight){
        this.flightList.remove(flight);
    }

    public void userAddFlight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which destination?");
        String destination = scanner.nextLine();
        System.out.println("What date?");
        String date = scanner.nextLine();
        System.out.println("Select a flight ID");
        String flightId = scanner.nextLine();
        Flight flight = new Flight(destination, date, flightId);
        this.addFlight(flight);
    }
    public void printFLightList(){
        for(Flight myFlight : flightList){
            System.out.println("Destination: " + myFlight.destination + ", ID: " + myFlight.flightId);
        }
    }

}
