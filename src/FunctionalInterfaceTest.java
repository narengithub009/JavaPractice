import java.util.function.Function;

public class FunctionalInterfaceTest {

    Runnable runnable= new Runnable() {
        @Override
        public void run() {

        }
    };


    public static void main(String[] args) {

            Runnable run_method = () -> System.out.println("run method");

        for (int i=0;i<=3;i++) {
            new Thread(run_method).start();

        }

        TestInterface testInterface = (i) -> System.out.println("Test method has been executed.." + i);
        testInterface.test(10);

        Function<Integer,String> function=(t)->{
            return "The output is : "+t;
        };
        System.out.println(function.apply(10));
    }
    }

