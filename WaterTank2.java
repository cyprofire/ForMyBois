import java.util.Scanner;

public class WaterTank2 {

	public static void main(String[] args) {

		float waterLevel;
		String output;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Input the water level: ");
		waterLevel = sc.nextInt();
		
		output = (waterLevel == 10) ? "ShutDown water pump." : ((waterLevel > 8) ? "Final Alert triggered." : ((waterLevel > 5) ? "Warning Alert Triggered" : ((waterLevel < 1) ? "Starting water tank" : "Nothing to do.")));
		
		System.out.println(output);
	}

}
