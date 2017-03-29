package eypark.chap04;

public class FlowEx8 {

	public static void main(String[] args) {
		int score = 1;
		
		switch (score*100) {
		case 100:
			System.out.println("당신의 점수는 100이고 상품은 자전거이다.");
		case 200:
			System.out.println("당신의 점수는 200이고 상품은 자전거이다.");
		case 300:
			System.out.println("당신의 점수는 300이고 상품은 자전거이다.");
		case 400:
			System.out.println("당신의 점수는 400이고 상품은 자전거이다.");
		default:
			System.out.println("상품 없음");
		}
	}
}
