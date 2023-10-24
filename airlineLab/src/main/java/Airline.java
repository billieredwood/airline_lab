import java.util.ArrayList;

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
    
}
