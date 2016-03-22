package agency;

import java.util.List;

public class Agency {
    private List<Travel> regTravel;
    private List<Employed> regEmployees;
    private List<Vehicles> regVeicle;
    private List<Customers> regCustomers;
    private String name,town;
    private static Agency thisInstance;
    
    private Agency(String name, String town){
	this.name = name;
	this.town = town;
    }
    
    public static Agency getInstance(String name, String town){
	if(Agency.thisInstance == null){
	    Agency.thisInstance = new Agency(name,town);
	}
	return Agency.thisInstance;
    }
    public String getName() {
	return this.name;
    }
    public String getTown() {
	return this.town;
    }
    
}