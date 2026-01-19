import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class restro implements Runnable{ 
    public void run(){
        System.out.println("Order taken ");
        try {
            System.out.println("Food Prepared "+Thread.currentThread().getName());
            //Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}

class  discount{

    public void amount(int amt){
        System.out.println("Discount applied on the followiong biils ");
        int min_amount=amt;
        Stream<Integer> bill = Stream.of(200,500,678,123,564,908,700,44,234,345,321,123).filter(i->i>=min_amount).sorted().distinct();
        System.out.println(bill.collect(Collectors.toList()));
    }

}

public class project2 {
    
    public static void main(String[] args) throws Exception{

        restro task =new restro();
        discount d = new discount();

        ExecutorService exe =Executors.newFixedThreadPool(2);

        Thread t1= new Thread(task,"chef 1");
        Thread t2= new Thread(task,"chef 2");

        t1.start();
        Thread.sleep(1000);
        System.out.println("Food Served by "+Thread.currentThread().getName()+"\n");
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println("Food Served by "+Thread.currentThread().getName()+"\n");

        d.amount(500);
         

    }

}