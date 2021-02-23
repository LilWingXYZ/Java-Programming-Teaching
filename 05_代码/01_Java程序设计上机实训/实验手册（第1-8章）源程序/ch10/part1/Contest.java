package ch10.part1;

public class Contest {
	public static void main(String[] args) {
		Tickets t = new Tickets(10);
		new Consumer(t).start();
		new Producer(t).start();
	}
}

class Tickets {
	int number = 0; // 票号
	int size; // 总票数
	boolean available = false; // 表示目前是否有票可售

	public Tickets(int size) { // 构造函数，传入总票数参数
		this.size = size;
	}
}

class Producer extends Thread {
	Tickets t = null;

	public Producer(Tickets t) {
		this.t = t;
	}

	public void run() {
		while (t.number <t.size) {
			System.out.println("Producer puts ticket " + (++t.number));
			t.available = true;
		}
	}
}

class Consumer extends Thread { // 售票线程
	Tickets t = null;
	int i = 0;

	public Consumer(Tickets t) {
		this.t = t;
	}

	public void run() {
		while (i < t.size) {
			if  (i<t.number)
				System.out.println("Consumer buys ticket " + (++i));
			if (i == t.number)
				t.available = false;
		}
	}
}
