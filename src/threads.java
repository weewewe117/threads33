import java.util.Random;


public class threads {
    public static void main(String[] args) {
        int numberOfThreads = 10;

        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(() -> {
                int randomNumber = new Random().nextInt(101);
                System.out.println("поток" + Thread.currentThread().getName() + " - число: " + randomNumber);
            });
            thread.start();
        }



        // вопросики с количеством потоков


        int largeThreadCount = 100;
        for (int i = 0; i < largeThreadCount; i++) {
            Thread thread = new Thread(() -> {
                int randomNumber = new Random().nextInt(100);
                System.out.println("поток " + Thread.currentThread().getName() + " - число: " + randomNumber);
            });
            thread.start();
        }
    }
}
