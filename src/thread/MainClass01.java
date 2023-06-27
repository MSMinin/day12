package thread;
/*
  쓰레드
   - 프로그램(process)을 구동하기 위한 최소한의 단위 
   - 기본적으로 쓰레드는 1개 존재한다.[이 뜻은 한번에 1개의 코드만 실행이 가능하다는 뜻]
*/

class A01 extends Thread{ // 쓰레드를 상속받음
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("A01 : " + i);
		}
	}
}

class B01 extends Thread{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("B01 : " + i);
		}
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		// 현재 쓰레드는 1이므로 a.run()이 끝나고 b.run()이 실행된다.
		// a가 끝날때까지 다른 행동은 하지 못하는 것
		A01 a = new A01();
		B01 b = new B01();
//		a.run();
//		b.run();
		a.start();
		b.start();
	}
}
