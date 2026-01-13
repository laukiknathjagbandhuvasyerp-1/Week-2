class th extends Thread{
    public void run(){
        System.out.println("thread cls");
    }
}

class thi implements Runnable{
    public void run(){
        System.out.println("runnable threrad");
    }
}
public class jointhread {
    public static void main(String[] args) {
        th i = new th();
        i.start();

        thi ti=new thi();
        Thread t1=new Thread(ti);
        t1.start();

        try{
            i.join();
            t1.join();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
