package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wn = 0;
		while(true) {
			System.out.println("==========================");
			System.out.println("인증 프로그램입니다.");
			System.out.println("90년생 이상은 \'가입불가\'");
			System.out.println("89년생 이하은 \'가입가능\'");
			System.out.println("A,ㅁ,ㅋ 등 문자는 \'잘못 입력\'");
			System.out.print("주민번호 입력(앞 6자리) : ");
			
			try {
				wn = sc.nextInt();
				if(wn < 0) {
					throw new Exception("주민번호는 양수이여야 합니다.");
				} else if(wn >= 1000000 || wn <= 99999) {
					throw new Exception("6자리가 아닙니다.");
				}
					
				int chk = wn / 10000;
				
				if(chk <= 89) {
					System.out.println("가입 가능");
				}else {
					System.out.println("가입 불가");
				}

			}catch (InputMismatchException e) {
				String s = sc.nextLine();
				System.out.println("숫자를 입력하세요.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
	}
}
