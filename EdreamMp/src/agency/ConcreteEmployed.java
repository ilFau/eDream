package agency;

public class ConcreteEmployed implements Employees {
    private String name, position;
    
    ConcreteEmployed(String name, String position){
	this.name = name;
	this.position = position;
    }
    
    @Override
    public String getName() {
	return name;
    }

    @Override
    public String getPosition() {
	return position;
    }

}
