public class StrikeOrBall {
	public static int result;
	public static int strike;
	public static int ball;
	
	StrikeOrBall(int result) {
		StrikeOrBall.result = result; 
	}
	
	public static void getResult (int result){
		if (result == 1) {
			System.out.println("STRIKE");
			strike++;
		} else {
			System.out.println("BALL");
			ball++;
		}
	}
}
/*
				System.out.println("BALL");
			} else {
				System.out.println("????");
			}
		}
	}
}
		*/