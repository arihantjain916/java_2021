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
//         // myt.setPriority(Thread.MAX_PRIORITY); //set thread priority max means int 10
//         // myt.setPriority(Thread.MIN_PRIORITY); //set thread priority min means int 1
//         // myt.setPriority(Thread.NORM_PRIORITY); //set thread priority normal means int 5
//         System.out.println(myt.getPriority()); //it give the priority of the thread by default priority is set to 5(NORM_PRIORITY())
//         System.out.println(myt2.getPriority()); //it give the priority of the thread by default priority is set to 5(NORM_PRIORITY())
//         myt.start();
//         myt2.start();
//     }
// }

// Make thread by Methord2
// class thread1 implements Runnable {
//     public void run() {
//         int i = 0;
//         while (i < 10) {
//             System.out.println("thread1");
//             i++;
//         }

//     }
// }

// class thread2 implements Runnable {
//     public void run() {
//         int i = 0;
//         while (i < 10) {
//             System.out.println("thread2");
//             i++;
//         }
//     }
// }

// public class thread {
//     public static void main(String[] args) {
//         thread1 th1 = new thread1();
//         Thread t1 = new Thread(th1);
//         thread2 th2 = new thread2();
//         Thread t2 = new Thread(th2);
    
//         t1.start();
//         t2.start();
//     }
// }

// Give name to the thread
// class thread3 extends Thread{
//     public thread3(String name){
//         super(name);
//     }
//     public void run(){
//         System.out.println("Name of thread is "+ this.getName()); 
//         /*this.getName() is used to print the name of thread 
//         and this is given by user.*/
//         System.out.println("Id of thread is "+ this.getId());
//         /*this.getId() is used to print the id of thread 
//         and this is a default value.*/ 
//     }
// }
// public class thread{
//     public static void main(String[] args) {
//         thread3 th3 = new thread3("arihant");
//         th3.start();
//     }
// }