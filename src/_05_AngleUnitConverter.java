import java.util.Locale;
import java.util.Scanner;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {

		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);
		 
		
		int n = input.nextInt();
		double[] values = new double[n];
		String[] units = new String[n];

		for (int i = 0; i < n; i++) {
			Scanner input2 = new Scanner(System.in);
			values[i] = input2.nextDouble();
			units[i] = input2.next();
		}
		
		for (int i = 0; i < units.length; i++) {
			double valueConvert = 0;
			
			if (units[i].equals("deg")) {
				valueConvert = degToRad(values[i]);
				System.out.printf("%.6f rad%n", valueConvert);
			}

			if (units[i].equals("rad")) {
				valueConvert = radToDeg(values[i]);
				System.out.printf("%.6f deg%n", valueConvert);
			}
		}
		

	}

	public static double degToRad(double deg) {
		double rad = deg * (Math.PI / 180);
		return rad;
	}

	public static double radToDeg(double rad) {
		double deg = rad * (180 / Math.PI);
		return deg;
	}

}
