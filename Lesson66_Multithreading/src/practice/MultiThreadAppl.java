package practice;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class MultiThreadAppl {
    private static final int MAX = 10;
    private static final int SIZE = 3;

    //Чтобы новый тред стартовал, надо создать объект типа Thread передав в конструктор объект типа Runnable, и
// после этого вызвать у объекта типа Thread метод start.
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread has started");// это начал работать 1-й Thread
//        MyTaskImplements task = new MyTaskImplements("Parallel task", MAX);
//        task.run();// это запуск второго thread

        MyTaskImplements task1 = new MyTaskImplements("Parallel One", MAX);
        MyTaskExtends task2 = new MyTaskExtends("Parallel Two", MAX);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();

        MyTaskImplements[] tasks = new MyTaskImplements[SIZE]; // создаем массив параллельных задач, которые вложим в потоки
        // на основе класса, который implements Runnable
        for (int i = 0; i <tasks.length ; i++) {
            tasks[i] = new MyTaskImplements("Name #"+i, MAX);
        }

        // создаем массив потоков и добавляем туда задачи
        Thread[] threads = new Thread[SIZE];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(tasks [i]);
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
            // threads [i].join(); так делать не надо
        }

        for (int i = 0; i < MAX; i++) {
            System.out.println("Main count = "+i);
                        try {
                Thread.sleep(1); // положили поток спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        thread1.join(); // присоединение к идущему процессу к Main
        thread2.join();
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println("Main thread has finished");
    }
}
