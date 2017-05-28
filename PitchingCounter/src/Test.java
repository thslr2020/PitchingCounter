import java.util.Scanner; 

public class Test { 
	public static void main(String args[]){
		Scanner input = new Scanner(System.in); 
		System.out.printf("Enter deposit amount for account1: "); 
		double seconds = input.nextDouble(); 
		Velocity.getVelocity(seconds);
		System.out.println(Velocity.getVelocity(seconds));
	}
}