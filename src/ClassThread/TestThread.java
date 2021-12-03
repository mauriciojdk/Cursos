package ClassThread;

import javax.swing.*;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {

        Thread threadEmail = new Thread(thread1);
        threadEmail.start();
        /*---------------------------------------------------------*/
        Thread threadNota = new Thread(thread2);
        threadNota.start();

        JOptionPane.showMessageDialog(null,"O sistema continua para o usuario");
    }



    private static Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            for (int pos = 0; pos < 10; pos++){

                System.out.println("Executando envio de email");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private static Runnable thread2 = new Runnable(){

        @Override
        public void run() {
            for (int pos = 0; pos < 10; pos++){

                System.out.println("Executando envio de nota fiscal");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };










}