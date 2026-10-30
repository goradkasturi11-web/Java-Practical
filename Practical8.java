class MyThread extends Thread{
    @Override 
    public void run(){
        for(int i=1;i<=6;i++){
            System.out.println(getName()+":"+Thread.currentThread()+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }   
}
class MyTask implements Runnable {
    @Override 
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() +i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    } 
}
    public class Practical8{
        public static void main(String[] args) {
         //creating Object
        MyThread t1 = new MyThread();
        t1.setName("Thread A");
        t1.setPriority(Thread.MIN_PRIORITY); 
        MyTask task = new MyTask();
        Thread t2 = new Thread(task);
        t2.setName("Thread B");
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        }
    }