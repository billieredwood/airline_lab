import java.util.ArrayList;

public class Flight {

    String destination;
    String date;
    String flightId;
    ArrayList<Passenger> passengerList;

    public Flight(String destination, String date, String flightId) {
        this.destination = destination;
        this.date = date;
        this.flightId = flightId;
        this.passengerList = new ArrayList<>();

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }


    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public void addPassenger(Passenger passenger){
        this.passengerList.add(passenger);
    }

    public void removePassenger(Passenger passenger){
        this.passengerList.remove(passenger);
    }
}
