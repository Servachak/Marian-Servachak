package plane;

public abstract class Plane {

	public int engineStart() {
		int toStart;
		toStart = (int) (20 + Math.random() * 68);
		return toStart;
	}
	public int planeStart(){
		return (int)(Math.random()*1000);
	}
	public void landingPlane(){
		System.out.println("Plane is landing");
	}

}
