package eypark.chap03;

public class Excersice10 {
	public static void main(String[] args) {
		char ch = 'A';
//		char lowerCase = (char)(ch+32);
		char lowerCase = ch>='A' && ch<='Z' ? (char)(ch+32):ch;
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}
}
