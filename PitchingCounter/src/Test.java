import java.util.Scanner; 


public class Test { 
	public static void main(String args[]){
		
		int strike;
		int ball;
		while (true) {
			Scanner input = new Scanner(System.in); 
			System.out.printf("Enter deposit amount for account1: "); 
			double seconds = input.nextDouble(); 
			Velocity.getVelocity(seconds);
			System.out.printf("Enter deposit amount for account1: "); 
			int result = input.nextInt(); 
			System.out.println(Velocity.getVelocity(seconds));
			StrikeOrBall.getResult(result);
			System.out.println(StrikeOrBall.strike);
			System.out.println(StrikeOrBall.ball);
		}
	}
}