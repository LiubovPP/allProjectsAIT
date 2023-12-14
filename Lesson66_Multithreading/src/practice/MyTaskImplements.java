package practice;

public class MyTaskImplements implements Runnable{
    String name;
    int max;

    public MyTaskImplements(String name, int max) {
        this.name = name;
        this.max = max;
    }

    @Override
    public void run() {
        System.out.println(name + "Task has started");
        for (int i = 0; i < max; i++) {
            System.out.println(name + " count "+ i );
                        try {
                Thread.sleep(10); // положили поток спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name+ "Task has finished");
    }
}
