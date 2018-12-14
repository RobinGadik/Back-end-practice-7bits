package task.two;

import task.one.Account;

class ThreadExecutor {

    public void showAccountFilling(long millis) {
        Account ac = new Account(0);

        Thread thread1 = new Thread(new MyThread(1, ac));
        Thread thread2 = new Thread(new MyThread(100, ac));
        Thread thread3 = new Thread(new MyThread(10000, ac));

        thread1.start();
        thread2.start();
        thread3.start();
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();

        try {
            thread1.join();
            System.out.println("First stoped");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
            System.out.println("Second stoped");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread3.join();
            System.out.println("Third stoped");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(ac.toString());



    }

}
