package eypark.chap04;

public class Example6 {

	public static void main(String[] args) {
		for (int x = 1; x < 7; x++) {
			for (int y = 1; y < 7; y++) {
				if(x+y == 6){
					System.out.println("x "+ x + " y " + y);
				}
			}
		}
	}
}
