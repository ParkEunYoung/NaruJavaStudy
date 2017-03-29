package eypark.chap04;

public class Example10 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		int mod = num / 10000;
		int remain = num % 10000;
		sum += mod;
		System.out.println("목 " + mod +" 나머지 " + remain + " 합 " + sum);
		
		int mod2 = remain / 1000;
		int remain2 = remain % 1000;
		sum += mod2;
		System.out.println("목 " + mod2 +" 나머지 " + remain2 + " 합 " + sum);
		
		int mod3 = remain2 / 100;
		int remain3 = remain2 % 100;
		sum += mod3;
		System.out.println("목 " + mod3 +" 나머지 " + remain3 + " 합 " + sum);
		
		int mod4 = remain3 / 10;
		int remain4 = remain3 % 10;
		sum += mod4;
		System.out.println("목 " + mod4 +" 나머지 " + remain4 + " 합 " + sum);
		
		System.out.println(sum);
	}
}
