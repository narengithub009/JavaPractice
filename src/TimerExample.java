import java.util.concurrent.TimeUnit;

public class TimerExample {
    public static void main(String[] args) {
        int time=6;

        try {
            TimeUnit.SECONDS.sleep(time);
            System.out.println("Take a breakkkkkkkkkkkkkkkkkk");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
