package Main;

public class AVG {

	public static void main(String[] args) {
		int mass[] = {2,3,5,23,30,35,41,14};
		int suma = 0;
		int avg = 0;
		for (int i = 0; i < mass.length; i++) {
			suma = suma + mass[i];
			 avg = suma / mass.length; 
		}
		System.out.println(suma );
		System.out.println(avg);
		
		int nearestMax = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > avg){
				nearestMax =  mass[i]; 
				break;
				}
		}System.out.println(nearestMax);
			
		int nearMin = 0;
		for (int i = 0; i < mass.length; i++) {
			if( mass[i] < avg ){
				nearMin = mass[i];
			}
		}System.out.println(nearMin);
	}

}
