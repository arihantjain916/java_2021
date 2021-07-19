// Make thread by Methord1
// class mythread extends Thread {
//     @Override
//     public void run() {
//         int i = 0;
//         while (i<10) {
//             System.out.println("thread1");
//             i++;
//         }
//     }
// }

// class mythread2 extends Thread {
//     @Override
//     public void run() {
//         int i = 0;
//         while (i<10) {
//             System.out.println("thread2");
//             i++;
//         }
//     }
// }

// public class thread {
//     public static void main(String[] args) {
//         mythread myt = new mythread();
//         mythread2 myt2 = new mythread2();
//         myt.start();
//         myt2.start();
//     }
// }

// Make thread by Methord2
class thread1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("thread1");
            i++;
        }

    }
}

class thread2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("thread2");
            i++;
        }
    }
}

public class thread {
    public static void main(String[] args) {
        thread1 th1 = new thread1();
        Thread t1 = new Thread(th1);
        thread2 th2 = new thread2();
        Thread t2 = new Thread(th2);
    
        t1.start();
        t2.start();
    }
}