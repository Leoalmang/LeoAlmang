package v48;

public class Graviation {

	public static void main(String[] args) {
		
		double massaPerson = 80;
		double massaJorden = 5.972 * Math.pow(10, 24);
		double radieJorden = 6378000;
		double gravitationsKonstant = 6.67408 * Math.pow(10, -11);

		System.out.printf("the force is = %.2f N",  gravitationsKraft(massaJorden, massaPerson, radieJorden, gravitationsKonstant));
		
		System.out.printf("jordens gravitationacceleration är  = %.2f m/s^2",  gravitation);
		
	}

	static void gravitationsKraft(double massaJorden, double massaPerson, double radieJorden,
			double gravitationsKonstant) {

		double force;
		
		force= massaPerson * massaJorden * gravitationsKonstant/ ((radieJorden * radieJorden));// Math.pow(radieJorden,2)
		
		return;
			
	}

}
