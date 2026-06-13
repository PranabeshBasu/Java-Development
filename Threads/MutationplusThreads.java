class Increment {
    int count;
    public synchronized void plus() { 
        /* By using synchronized keyword we ensure that when one thread access 
           this method another do not access it
        */ 
        count++;
    }
}
public class MutationplusThreads {
    public static void main(String[] args) throws InterruptedException {
        Increment c = new Increment();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.plus();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.plus();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // The main thread waits until two threads complete and meets/returns to the main method
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
