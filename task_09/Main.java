import threads.Finisher;
import threads.MyCallable;
import threads.MyRunnable;


import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {


    public static void main(String[] args) {

    //    // TASK  9A
    //    MyRunnable myRunnable = new MyRunnable();
    //    Thread thread_one = new Thread(myRunnable);
    //    Thread thread_two = new Thread(myRunnable);
    //    thread_one.start();
    //    thread_two.start();

    //    // TASK 9B
    //    Thread scorpion_thread = new Thread(new Scorpion());
    //    Thread subZero_thread = new Thread(new SubZero());
    //    scorpion_thread.start();
    //    subZero_thread.start();

    //   // TASK 9C
    //    MyRunnable scorpion = new MyRunnable();
    //    scorpion.finisher = new Finisher() {
    //        @Override
    //        public void finishHim() {
    //            System.out.println("Scorpion attack SubZero");
    //        }
    //    };


    //    MyRunnable subZero = new MyRunnable();
    //    subZero.finisher = new Finisher() {
    //        @Override
    //        public void finishHim() {
    //            System.out.println("SubZero attacks Scorpion");
    //        }
    //    };


    //    Thread scorpion_thread = new Thread(scorpion);
    //    Thread subZero_thread = new Thread(subZero);
    //    scorpion_thread.start();
    //    subZero_thread.start();

    //    // TASK 9D
    //    MyRunnable scorpion = new MyRunnable();
    //    scorpion.finisher = () -> System.out.println("Scorpion Attack SubZero");

    //    MyRunnable subZero = new MyRunnable();
    //    subZero.finisher = () -> System.out.println("SubZero Attacks Scorpion");

    //    Thread scorpion_thread = new Thread(scorpion);
    //    Thread subZero_thread = new Thread(subZero);
    //    scorpion_thread.start();
    //    subZero_thread.start();

    //     // TASK 9E
    //     MyCallable myCallable = new MyCallable();
    //     ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
    //     Future<Double> doubleValues;
    //     try {
    //         doubleValues = executor.submit(myCallable);
    //         System.out.println(doubleValues.get());

    //     } catch (Exception e) {
    //         throw new RuntimeException(e);
    //     } finally {
    //         executor.shutdown();
    //     }

    //     //Task 9F
    //     MyCallable scorpionCallable = new MyCallable();
    //     scorpionCallable.finisherList.add(() -> System.out.println("Attack"));
    //     scorpionCallable.finisherList.add(() -> System.out.println("Bulls Eye"));


    //     MyCallable subZeroCallable = new MyCallable();
    //     subZeroCallable.finisherList.add(() -> System.out.println("Arrow of Death"));
    //     subZeroCallable.finisherList.add(() -> System.out.println("Stuck In An Arrow"));


        // try {
        //     if (doubleValues.get() >= 0.0 && doubleValues.get() >= 0.5) {
        //         scorpionCallable.finisherList.get(new Random().nextInt(scorpionCallable.finisherList.size())).finishHim();

        //     } else {
        //         subZeroCallable.finisherList.get(new Random().nextInt(subZeroCallable.finisherList.size())).finishHim();
        //     }
        // } catch (InterruptedException | ExecutionException e) {
        //     throw new RuntimeException(e);
        // }


    }
}
