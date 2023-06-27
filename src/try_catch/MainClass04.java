package try_catch;

import java.util.Scanner;

class TestClass04 {
	public void test() {	
		Scanner sc = new Scanner(System.in);
		int n1 = 10, n2 = 2;
		try {
			System.out.println( n1 / n2);
			return;
		}catch (Exception e) {
			System.out.println("문제 발생");
		}finally {
		// 이번에는 finally를 사용하는데 이게 붙어있으면 반드시 실행되도록 만든다.
			System.out.println("finally 실행");
			sc.close();
		}
		System.out.println("다음 문장들 실행");
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		t.test();
		
	}
}
