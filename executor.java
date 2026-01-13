import java.util.ArrayList;
import java.util.*;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Service implements Runnable  {
    int i;
    public Service(int i){
        this.i=i;
    }
    public void run(){
        System.out.println(i+"");
        try{
        Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

public class executor {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        System.out.println(new Date());
        List<Future<String>> fl = new ArrayList<>();
        for(int i=0;i<10;i++){
            fl.add((Future<String>)es.submit(new Service(i)));
        }
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        
        for(Future<String> fut : fl){
            System.out.println(fut.get());
        }
        System.out.println(new Date());
    }
}


