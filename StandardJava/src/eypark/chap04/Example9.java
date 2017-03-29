package eypark.chap04;

public class Example9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			int num = (int)str.charAt(i);
			System.out.println(num);
			sum += num;
		}
		System.out.println("sum="+sum);
	}
}
