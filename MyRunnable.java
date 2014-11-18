/*************************************************************************
	> File Name: MyRunnable.java
	> Author: 
	> Mail: 
	> Created Time: 2014年11月18日 星期二 19时54分20秒
 ************************************************************************/

public class MyRunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[]){
        MyRunnable t1=new MyRunnable();
        MyRunnable t2=new MyRunnable();
        Thread thread1=new Thread(t1,"Mythread1");
        Thread thread2=new Thread(t2);
        thread2.setName("Mythread2");
        thread1.start();
        thread2.start();
    }
}

