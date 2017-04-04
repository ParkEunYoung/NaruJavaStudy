package eypark.chap02;

public class Example1to13 {

	public static void main(String[] args) {
		//1.
			//논리형 : 1byte => boolean
			//문자형 : 2byte => char
		 	//정수형 : 1byte => byte, 2byte => short, 4byte => int, 8byte => long
			//실수형 : 4byte => float, 8byte => double
		
		//2. 
			//13자리??
		long regNo = 1234512345123L;
		
		//3.
			//리터럴 : 100, 100L, 3.14f
			//변수 : i, l
			//키워드 : int, long, final, float
			//상수 : PI
		
		//4. b
		
		//5. 
			System.out.println("1"+"2");//12
			System.out.println(true+"");//true
			System.out.println('A'+'B');//AB (정답 : )
			System.out.println('1'+2);//12 (정답 : )
			System.out.println('1'+'2');//12 (정답 : )
			System.out.println('J'+"ava");//Java
	//		System.out.println(true+null);//오류
		
		//6. b (정답 : b,c,d,e)
		
		//7. a (정답 : a,d,e,g)
		
		//8. ? (정답 : 모든 참조형 변수는 4byte)
		
		//9. a,b (정답 : d,e)
		
		//10. char => 2byte => 16bit => 65536
		
		//11. a,b,c,d,e (정답 : a,b,c,d)
		
		//12. a,b,c (정답 : a,b,c,e)
		
		//13. a,b (정답 : c,e,f)
	}
}
