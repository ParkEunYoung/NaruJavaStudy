package eypark.chap04;

public class Example1 {

	public static void main(String[] args) {
		//1.
		int x=10;
		if(x >= 10 && x <= 20){
			System.out.println("1 true");
		}
		
		//2.
		char ch='A';
		if(ch != ' ' || ch != '\t'){
			System.out.println("2 true");
		}
		
		//3.
		char ch1='x';
		if(ch1=='x' || ch1 == 'X'){
			System.out.println("3 true");
		}
		
		//4.
		char ch2=1;
		if(ch2 >= '0' && ch2 <= '9'){
			System.out.println("4 true");
		}
			
		//5.
		char ch3='a';
		if(ch3 >= 'A' && ch3 <= 'z'){
			System.out.println("5 true");
		}
		
		//6.
		int year = 16;
		if(year % 400 == 0 || year % 4 == 0 || year % 100 !=0){
			System.out.println("6 true");
		}
		
		//7.
		boolean powerOn = false;
		if(!powerOn){
			System.out.println("7 true");
		}
		
		//8.
		String str = "yes";
		if(str.equals("yes")){
			System.out.println("8 true");
		}
	}
}
