package thread;

import java.util.Scanner;

class A03 extends Thread{
	public void run() {
		for(; ;) {
			System.out.println("내용이 출력된다.====");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		A03 a = new A03();
		a.setDaemon(true);
		// main메소드가 종료되면 진행중인 start 종료해준다.
		a.start();
		
		while(true) {
			System.out.println("문자열 입력");
			str = sc.next();
			System.out.println("입력한 값 : " + str);
			if(str.equals("end")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println("메인을 종료합니다.");
		//main이 종료되어도 실행되어져있는 a.start()는 계속 진행됨
	}
}
