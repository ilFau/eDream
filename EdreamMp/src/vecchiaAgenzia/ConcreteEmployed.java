package vecchiaAgenzia;

public class ConcreteEmployed implements Employed {
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
