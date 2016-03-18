package agency;

import java.util.List;

public interface Veicles {
    public String getName();
    public int getSeats();
    public List<Customers> getPassengers();
    public List<Employees> getCrew();
}
