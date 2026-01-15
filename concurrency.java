class concurrcy implements Runnable {
    Thread t;
    boolean sus = false;
    private String threadname;

    public concurrcy(String nme) {
        threadname=nme;
        System.out.println("created "+threadname);
    }

    public void run() {
        System.out.println("Running");
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(300);
                synchronized (this) {
                    while (sus) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void start() {
        System.out.println("start");
        if (t == null) {
            t = new Thread(this, threadname);
            t.start();
        }
    }

    void suspend(){
        sus=true;
    }

    synchronized void resume(){
        sus=false;
        notify();
    }
}

public class concurrency {

    public static void main(String[] args) {
        concurrcy c1 = new concurrcy("th -1");
        c1.start();

        concurrcy c2=new concurrcy("th-2");
        c2.start();

        try {
            Thread.sleep(1000);
            c1.suspend();
            System.out.println("first susupend");
            Thread.sleep(1000);
            c1.resume();
            System.out.println("resume first");

            c2.suspend();
            System.out.println("suspend thread2 ");
            Thread.sleep(1000);
            c2.resume();
            System.out.println("resume thread two");
        } catch (Exception e) {
            System.out.println("main thread interrput");
            // TODO: handle exception
        }
        try {
            System.out.println("wait to finish the threads");
            c1.t.join();
            c2.t.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("main thread xit");
    }
}
