package v48;

public class KelvinCelcius {

	public static void main(String[] args) {
		
		double x = kelvinToCelsius(100);
		System.out.printf("%.2f °C", x);	  
	   
		System.out.println();
		
		double y = cubicCmToCubicM(1000);
		System.out.printf("%.3f m^2", y);	

	}
	
	static double kelvinToCelsius(double kelvin) {
	return kelvin + (-273.15);
	}
	
	static double cubicCmToCubicM(double radius) {
		return radius * Math.pow(10,-6);
	
	}
	}

 