package eypark.chap03;

public class Excersice6 {
	public static void main(String[] args) {
		int num = 24;
		System.out.println(num % 10 != 0 ? (num/10) * 10 + 10 - num : num/10);
	}
}
