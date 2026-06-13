class Threadone implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hi");
        }
    }
}
class Threadtwo implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
        }
    }
}
public class Thread2 {
    public static void main(String[] args) {
        Runnable obj1 = new Threadone(); //Runnable class 1
        Runnable obj2 = new Threadtwo(); //Runnable class 2
        Thread t1 = new Thread(obj1); //Thread 1
        Thread t2 = new Thread(obj2); //Thread 2
        t1.start();
        t2.start();
    }
}
