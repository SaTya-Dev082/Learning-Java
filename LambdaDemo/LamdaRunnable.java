package LambdaDemo;

public class LamdaRunnable {
    public static void main(String[] args){
        Runnable runner=new Runnable() {

            @Override
            public void run() {
                System.out.println("Task is running...");
            }

            
        };
        new Thread(runner).start();

        Runnable task = () -> System.out.println("Task running...");

        new Thread(task).start();
    }
}
