class A extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Hi");
        }
    }
}
class B extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        A obj1 = new A(); //Thread 1
        B obj2 = new B(); //Thread 2
        obj1.start();
        obj2.start();
    }
}