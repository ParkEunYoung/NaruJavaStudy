package eypark.chap04;

public class FlowEx27 {

	public static void main(String[] args) {
		Loop1 : for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(j==5)
//					break Loop1;
//					break;//자신이 속한 하나의 반복문
//					continue Loop1;//반복문의 끝 (Loop1의 끝)
					continue;
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}
}
