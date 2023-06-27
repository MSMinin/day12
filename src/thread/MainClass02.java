package thread;

class myThread{
	public void start() {
		run(); 
	}
	public void run() {
		System.out.println("부모 run");
	}
}

class B02 extends myThread {
	public void run() {
		System.out.println("자식 run");
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		B02 b = new B02();
		b.start();
	}
}
