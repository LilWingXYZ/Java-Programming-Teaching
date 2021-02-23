package ch10.part1;

class FactorialThread extends Thread { // 继承Thread类
	private int num;

	public FactorialThread(int num) {
		super();// 调用其父类的构造方法
		this.num = num;
	}

	public void run() { // 重写run方法
		int i = num;
		int result = 1;
		System.out.println("new thread started");
		while (i > 0) {
			result = result * i;
			i = i - 1;
			try {
				this.sleep((long) Math.random()); // 线程睡眠1秒以内的随机时间
			} catch (InterruptedException e) {
			}
		}
		System.out.println("The factorial of " + num + " is " + result);
		System.out.println("new thread ends"); // 线程执行结束
	}
}

public class ThreadsTest {
	public static void main(String args[]) {
		System.out.println("main thread starts");
		FactorialThread thread = new FactorialThread(10); // 创建线程的名字为thread
		thread.start(); // 启动线程
		System.out.println("main thread ends ");
	}
}
