package Lamda;

public class LamdaRunnable {
    public static void main(String[] args){
        Runnable runner=new Runnable() {

            @Override
            public void run() {
                System.out.println("Task is running...");
            }

            
        };
        new Thread(runner).start();
    }
}
