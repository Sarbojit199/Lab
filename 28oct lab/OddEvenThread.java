package javak;

public class OddEvenThread {

	public static void main(String[] args) {
		Runnable r1 = new Runnable1();				//making objects for runnable
		Runnable r2 = new Runnable2();				//making object for runnable
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}

}
class Runnable1 implements Runnable {
	public void run() {								//call run method
		for (int i = 1; i <= 100; i += 2) {				//odd value will execute first
			System.out.println(i);						//odd value will print
		}			
	}
}

class Runnable2 implements Runnable {
	public void run() {									//call run method again 
		for (int i = 0; i <=100; i += 2) {				//even number will execute first
			System.out.println(i);							//printing of even numbers
		}
	}
}
