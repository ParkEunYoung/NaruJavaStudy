package eypark.chap03;

public class OperatorEx10 {
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = (ch >= 97)? (char)(ch+32):ch;
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}
}
