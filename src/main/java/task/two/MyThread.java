package task.two;

import task.one.Account;

class MyThread extends Thread {

    private int a;
    private Account ac;

    @Override
    public void run() {
        System.out.println("Hi from " + Thread.currentThread().getName());
        while (!interrupted()) {
            try {
                ac.addToBalance(a);

            } catch (InterruptedException e) {
                System.out.println("Good by from " + Thread.currentThread().getName());
                break;
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    MyThread(int a , Account ac) {
        this.a = a;
        this.ac = ac;
    }
}
