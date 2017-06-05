import java.util.Scanner; 

public class Test { 
	public static void main(String args[]){
		
		int strike;
		int ball;
		int count;
		
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.printf("소요된 시간을 입력하세요: "); 
			double seconds = input.nextDouble(); 
			Velocity.getVelocity(seconds);
			Velocity.getInfo(seconds);
			System.out.printf("투구의 결과를 입력하세요: "); 
			int result = input.nextInt(); 
			System.out.println("");
			System.out.printf("측정된 구속 : %.2f km/h\n", Velocity.getVelocity(seconds));
			System.out.println(Velocity.getInfo(seconds));
			StrikeOrBall.getResult(result);
			System.out.printf("현재까지의 스트라이크 개수 : %d\n", StrikeOrBall.strike);
			System.out.printf("현재까지의 볼 개수 : %d\n", StrikeOrBall.ball);
			System.out.println("");
			System.out.println("");
		}
	}
}