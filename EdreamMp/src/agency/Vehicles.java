package agency;

import java.util.List;

public interface Vehicles {
    public String getName();
    public int getSeats();
    public List<Customers> getPassengers();
    public List<Employed> getCrew();
}
