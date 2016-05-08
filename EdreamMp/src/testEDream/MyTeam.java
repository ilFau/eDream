package testEDream;

import eDreamPack.Team;

public class MyTeam extends Team {
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof MyTeam)){
			return false;
		}
		return true;
	}
}
