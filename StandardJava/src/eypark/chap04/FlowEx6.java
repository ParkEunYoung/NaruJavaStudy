package eypark.chap04;

public class FlowEx6 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 10) + 1;
		System.out.println(score);
		switch (score*100) {
		case 100:
			System.out.println("점수는 100 이고 상품은 자전거");
			break;
		case 200:
			System.out.println("점수는 100 이고 상품은 tv");
			break;
		case 300:
			System.out.println("점수는 100 이고 상품은 노트북");
			break;
		case 400:
			System.out.println("점수는 100 이고 상품은 자동차");
			break;
		default:
			System.out.println("상품 없음");
			break;
		}
	}
}
