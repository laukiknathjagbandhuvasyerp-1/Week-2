public class threa extends Thread {
    public static void main(String[] args) {
        threa t1= new threa();
        t1.start();
        System.out.println("outsidr the thread");
    }
    public void run(){
        System.out.println("thread run");
        
    }
}


// public class threa implements Runnable{
// public static void main(String[] args) {
//     threa t1 =new threa();
//     Thread t = new Thread(t1);
//     t.start();
//     System.out.println("thrad out");
// }
// public void run(){
//     System.out.println("in thread but under runnable");
// }
    
// }