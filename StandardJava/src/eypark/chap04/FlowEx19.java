package eypark.chap04;

public class FlowEx19 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) {
			;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("start time " + startTime);
		System.out.println("end time " + endTime);
		System.out.println("time " + (endTime-startTime));
	}
}
