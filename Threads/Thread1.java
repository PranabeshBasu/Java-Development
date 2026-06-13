class A extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            }
            catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}
class B extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            }
            catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        A obj1 = new A(); //Thread 1
        B obj2 = new B(); //Thread 2
        obj1.start();
        try {
            Thread.sleep(10);
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        obj2.start();
    }
}