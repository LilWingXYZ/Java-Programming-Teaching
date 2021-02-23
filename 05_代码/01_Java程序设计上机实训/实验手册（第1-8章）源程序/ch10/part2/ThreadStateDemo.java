package ch10.part2;

import java.io.*;
public class ThreadStateDemo{
	public static void main(String args[]){
		System.out.println("我是主线程!");

		ThreadUseExtends thread1=new ThreadUseExtends();

		//创建thread2时以实现了Runnable接口的ThreadUseRunnable类实例为参数
		Thread thread2 = new Thread(new ThreadUseRunnable(),"SecondThread");

		thread1.start(); //启动线程thread1使之处于就绪状态
		thread1.setPriority(6); //设置thread1的优先级为6
		System.out.println("主线程将挂起7秒!");
		try{
 			 Thread.sleep(7000); //主线程挂起7秒
		}catch (InterruptedException e){
		  	return;
		}

		System.out.println("又回到了主线程!");
		if(thread1.isAlive()){
	  	 thread1.stop(); //如果thread1还存在则结束它的运行
	  	System.out.println("thread1休眠过长,主线程结束了thread1的运行!");
		}else
	 	 System.out.println("主线程没发现thread1,thread1已醒顺序执行结束了!");
 
		thread2.start(); //启动thread2
		System.out.println("主线程又将挂起7秒!");
		try{
	 	 	Thread.sleep(7000); //主线程挂起7秒
		}catch (InterruptedException e){
	  		return;
		}

		System.out.println("又回到了主线程!");
		if(thread2.isAlive()){
	 		thread2.stop(); //如果thread2还存在则结束它的运行
	  		System.out.println("thread2休眠过长，主线程结束thread2的运行!");
		}else
 	 		System.out.println("主线程没发现thread2,thread2已醒顺序执行结束了!");
 	
		System.out.println("程序结束按任意键继续!");
		try{
	 		 System.in.read();
		}catch (IOException e){
	  		System.out.println(e.toString());
		}

	}//main
}//MultiThread


class ThreadUseExtends extends Thread{
	ThreadUseExtends() { }  
	public void run(){
  		System.out.println("我是Thread子类的线程实例!");
  		System.out.println("我将挂起10秒!");
 		 System.out.println("回到主线程,请稍等,刚才主线程挂起可能还没醒过来！");
 		 try{
  			  sleep(10000); 
  		}catch (InterruptedException e){
  			 return;
  		}
	 }
}


class ThreadUseRunnable  implements Runnable{ //实现Runnable接口
	ThreadUseRunnable(){}//构造函数
	public void run(){
  		System.out.println("我是Thread类的线程实例并以实现了Runnable接口的类为参数!");
  		System.out.println("我将挂起1秒!");
 		 System.out.println("回到主线程,请稍等,刚才主线程挂起可能还没醒过来！");
  		try{
    		Thread.sleep(1000); 
 		}catch (InterruptedException e){
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
    		return;
  		}
	}
}
