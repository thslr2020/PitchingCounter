import java.util.Scanner; 

public class Test { 
	public static void main(String args[]){
		
		int strike;
		int ball;
		int count;
		
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.printf("�ҿ�� �ð��� �Է��ϼ���: "); 
			double seconds = input.nextDouble(); 
			Velocity.getVelocity(seconds);
			Velocity.getInfo(seconds);
			System.out.printf("������ ����� �Է��ϼ���: "); 
			int result = input.nextInt(); 
			System.out.println("");
			System.out.printf("������ ���� : %.2f km/h\n", Velocity.getVelocity(seconds));
			System.out.println(Velocity.getInfo(seconds));
			StrikeOrBall.getResult(result);
			System.out.printf("��������� ��Ʈ����ũ ���� : %d\n", StrikeOrBall.strike);
			System.out.printf("��������� �� ���� : %d\n", StrikeOrBall.ball);
			System.out.println("");
			System.out.println("");
		}
	}
}