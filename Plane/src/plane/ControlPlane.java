package plane;

public class ControlPlane {

	private int positionX;
	private int positionY;
	private int weight;
	private int width;
	private int length;

	public ControlPlane(int positionX, int positionY, int weight, int width,
			int length) {
		super();
		this.positionX = positionX;
		this.positionY = positionY;
		this.weight = weight;
		this.width = width;
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPosistionY() {
		return positionY;
	}

	public void setPosistionY(int positionY) {
		this.positionY = positionY;
	}

	public int upPlane() {
		positionY += (int) (Math.random() * 50);
		return positionY;
	}

	public int downPlane() {
		positionY -= (int) (Math.random() * 50);
		return positionY;
	}

	public int forwardPlane() {
		positionX += (int) (Math.random() * 50);
		return positionX;
	}

	public int backPlane() {
		positionX -= (int) (Math.random() * 50);
		return positionX;
	}
}
