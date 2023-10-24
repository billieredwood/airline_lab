import java.util.Random;

public class Passenger {

    String name;
    String email;
    String phoneNumber;
    long passengerID;

    Random random = new Random();

    public Passenger(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.passengerID = random.nextInt(1, 10000);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPassengerID() {
        return this.passengerID;
    }

    public void setPassengerID(long passengerID) {
        this.passengerID = passengerID;
    }

    public Random getRandom() {
        return this.random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void printPassengerID() {
        System.out.println(passengerID);;
    }
}
