package agency;

import java.util.List;

public class Agency {
    private List<Travel> regTravel;
    private List<Employees> regEmployees;
    private List<Veicles> regVeicle;
    private List<Customers> regCustomers;
    private String name,town;
    private static Agency thisInstance;
    
    private Agency(String name, String town){
	this.name = name;
	this.town = town;
    }
    
    public static Agency getInstance(String name, String town){
	if(thisInstance == null){
	    thisInstance = new Agency(name,town);
	}
	return thisInstance;
    }
    public String getName() {
	return name;
    }
    public String getTown() {
	return town;
    }
    
}