package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Double> {

    public List<Finisher> finisherList;

    public MyCallable() {
        this.finisherList = new ArrayList<>();
    }


    @Override
    public Double call() throws Exception {
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        return 0 + Math.random() * (1);


    }


}
