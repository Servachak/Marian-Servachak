package plane;

public class Cy extends Plane implements Opportunities {

	private ControlPlane controlPlane;
	private int maxSpeed = 700;
	private String color;

	public Cy(ControlPlane controlPlane, int maxSpeed, String color) {
		super();
		this.controlPlane = controlPlane;
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	public void planeUp() {
		System.out.println("Up to " + controlPlane.upPlane());
	}

	public void planeDown() {
		System.out.println("Down to " + controlPlane.downPlane());
	}

	public void planeForward() {
		System.out.println("Forward to " + controlPlane.forwardPlane());
	}

	public void planeBack() {
		System.out.println("Back to " + controlPlane.backPlane());
	}

	public ControlPlane getControlPlane() {
		return controlPlane;
	}

	public void setControlPlane(ControlPlane controlPlane) {
		this.controlPlane = controlPlane;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void turbo() {
		int turbo = (int) (maxSpeed + Math.random() * 500);
		System.out.println("Speed with turbo is " + turbo);

	}

	@Override
	public void stells() {
		System.out.println("Plane is not visiable for "
				+ (int) (1 + Math.random() * 20));

	}

	@Override
	public void nuclear() {
		System.out.println("Plane throw " + (int) (Math.random() * 10)
				+ " bombs");

	}

}
