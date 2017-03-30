package eypark.chap03;

public class Excersice1 {
	public static void main(String[] args) {
		int x=2;
		int y=5;
		char c='A';//65
		
		// 1+x << 33 // 3 << 33 => 3*2 33승
		System.out.println(1+x << 33);
		// y>=5 || x<0 && x>2 => true || false => true
		System.out.println(y>=5 || x<0 && x>2);
		// y += 10 - x++ => y= y + 10 - x++ => y = 5+10-2 => 13
		System.out.println(y += 10 - x++);//x=3
		// x += 2 => x=x+2 =>5
		System.out.println(x += 2);
		//!('A' <= c && c <='Z') => !true => false
		System.out.println(!('A' <= c && c <='Z'));
		//'C'-c => 67 - 65 => 2
		System.out.println('C'-c);
		
		System.out.println("c " + c);//'A'
		//c+1 => 66
		System.out.println(c+1);
		//++c => B
		System.out.println(++c);
		//c++ => B
		System.out.println(c++);
		//c => C
		System.out.println(c);
	}
}
