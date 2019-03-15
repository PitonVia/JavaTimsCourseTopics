package collections.sets.setsChallenge;

public class Planet extends HeavenlyBody {

	// In the constructor from superclass we want to specify the specific Planet body type
	public Planet(String name, double orbitalPeriod) {
		super(name, orbitalPeriod, BodyTypes.PLANET);
	}

	// adding a check to ensure that only MOON can be added to a Planet
	@Override
	public boolean addSatellite(HeavenlyBody moon) {
		if (moon.getBodyType() == BodyTypes.MOON) {
			return super.addSatellite(moon);
		}
		return false;
	}	
}
