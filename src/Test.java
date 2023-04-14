import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        int i1 = 8;
        char[] n;
        n = new char[]{'n','a','r','e','n','d','e','r'};
        for (int i=0;i<n.length;i++){

            for(int j=i;j>=0;j--){
                System.out.print(n[j]);

            }
            System.out.println();
        }


    }

}
@FunctionalInterface
interface UPIPayment{

    public String doPayment(String source,String dest);

    default double getScratchCard(){
        return  new Random().nextDouble();
    }

    static String datePatterns(String pattern){

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());
    }
}