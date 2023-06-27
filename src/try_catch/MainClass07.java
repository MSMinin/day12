package try_catch;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		// 예외처리랑 관계는 없다.
		// 입력할때 next()와 nextLine()의 차이점에 대해서 알려주셨다.
		Scanner sc = new Scanner(System.in);
//		String n1, n2;
//		System.out.println("11 입력");
//		n1 = sc.nextLine();
//		System.out.println("22 입력");
//		n2 = sc.next();
//		
//		System.out.println("1. " + n1);
//		System.out.println("2. " + n2);
		
		
		// 수를 입력해야하는데 문자를 입력할때의 경우
		// 예외 처리할때 문장이 나오고 다시 try문으로 이동하는데
		// 임시공간에 문자가 남아있기때문에 계속 catch문으로 반복된다.
		// 그래서 새 String으로 변수를 만들어야한다..
		int num;
		while(true) {
			try {
				System.out.print("수 입력 : ");
				num = sc.nextInt();
				System.out.println("입력 값 : " + num);
				
			}catch(Exception e) {
				String s = sc.nextLine();
				System.out.println("수를 입력하세요.");
			}
			
		}
	}
}
