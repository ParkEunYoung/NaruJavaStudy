package eypark.chap03;

public class Excersice7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
//		float celcius = 5/9 * (fahrenheit-32);//셋째자리 반올림
		float celcius = (int)((5/9f * (fahrenheit-32))*100+0.5)/100f;
		
		System.out.println("fahrenheit " + fahrenheit);
		System.out.println("celcius " + celcius);
	}
}
