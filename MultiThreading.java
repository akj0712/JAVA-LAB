//Write a Java program that creates three threads. First thread displays “Good Morning “every one second, the second thread displays “Hello” every two seconds and the third thread displays “Welcome” every three seconds

class ThreadOne extends Thread{
	public void run(){
		for(int i = 0; i < 4; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Good Morning");
			}
			catch(InterruptedException e){
				System.out.println("Thread Interrupted");
			}
		}
	}
}

class ThreadTwo extends Thread{
	public void run(){
		for(int i = 0; i < 4; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("Hello");
			}
			catch(InterruptedException e){
				System.out.println("Thread Interrupted");
			}
		}
	}
}

class ThreadThree extends Thread{
	public void run(){
		for(int i = 0; i < 4; i++) {
			try {
				Thread.sleep(3000);
				System.out.println("Welcome");
			}
			catch(InterruptedException e){
				System.out.println("Thread Interrupted");
			}
		}
	}
}

public class MultiThreading {
	public static void main(String[] args) {
		ThreadOne t1 = new ThreadOne ();
		ThreadTwo t2 = new ThreadTwo ();
		ThreadThree t3 = new ThreadThree ();
		t1.start ();
		t2.start ();
		t3.start ();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e){
			System.out.println("Thread Interrupted");
		}
		System.out.print("Main Thread Exits");
	}
}
