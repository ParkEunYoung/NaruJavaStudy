package eypark.chap04;

public class FlowEx2 {

	public static void main(String[] args) {
		int visitCount = 5;
		if(visitCount < 1){
			System.out.println("첫 방문 감사");
		}else{
			System.out.println("재 방문 감사");
		}
		System.out.println("방문 횟수는 " + ++visitCount +"번");
	}
}
