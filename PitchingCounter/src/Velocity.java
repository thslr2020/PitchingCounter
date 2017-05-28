
public class Velocity {
	private static double velocity;
	private static double distance;
	private double seconds;
	
	Velocity(double seconds) { ;
		this.seconds = seconds; 
	}
	
	public static double getVelocity (double seconds){
		distance = 18.44;
		velocity = 3600 * (distance / 1000 / seconds);
		return velocity;
	}
}