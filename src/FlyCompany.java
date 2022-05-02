import java.util.ArrayList;


public class FlyCompany {

    private String name;
    private ArrayList<Flights> flights = new ArrayList<>();
    private Flights flights1 = new Flights("AAAVVBB", "NATAL", "NATAL", "12121212", 2);

    public FlyCompany() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flights getFlightsByLeaving(String leaving_from) {
        flights.add(flights1);
        for (Flights f : flights) {
            if(f.getLeaving_from().compareTo(leaving_from) == 0)
                return f;
        }
        return null;
    }

    public void setNewFlight(Flights f) {
        flights.add(f);
    }

}
