package me.jorgemoran.semana8.threads;

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        }catch(Exception e){

        }
        System.out.println("Inside a thread");
    }

    public static void main(String[] args) throws java.lang.InterruptedException{
        System.out.println("Inicio");
        System.out.println("asdf");
        Thread.sleep(5000);
        System.out.println("ddd");
        Thread t = new Thread(new HelloRunnable());
        t.start();
        System.out.println("fin");
    }
}
