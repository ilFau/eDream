package testEDream;

import eDreamPack.Place;

public class MyPlace extends Place {

	public MyPlace(String name) {
		super(name);
	}
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof MyPlace)){
			return false;
		}
		MyPlace prod = (MyPlace)obj;
		if(this.getName().equals(prod.getName())){
			return true;
		}
		return false;
	}

}
