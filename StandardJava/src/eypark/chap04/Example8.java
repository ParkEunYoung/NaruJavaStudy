package eypark.chap04;

public class Example8 {

	public static void main(String[] args) {
		for (int x = 0; x < 11; x++) {
			for (int y = 0; y < 11; y++) {
				if(2*x+4*y == 10){
					System.out.println("x "+ x + " y " + y);
				}
			}
		}
	}
}
