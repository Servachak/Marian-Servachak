package plane;

public class Main {
	public static void main(String[] args) {
		Cy cy = new Cy(new ControlPlane(0, 1000, 10, 25, 20), 700, "white");

		System.out.println("Engine is working, " + cy.engineStart()
				+ " seconds left to start");
		System.out.println("Plane will be fly " + cy.planeStart() + "km");
		cy.planeUp();
		cy.planeBack();
		cy.planeForward();
		cy.planeDown();
		cy.stells();
		cy.nuclear();
		cy.turbo();
		cy.landingPlane();
	}
}
