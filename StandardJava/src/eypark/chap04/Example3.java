package eypark.chap04;

public class Example3 {

	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			for (int j = 0; j < i; j++) {
				sum2 += j;
			}
		}
		System.out.println(sum+sum2);
	}
}
