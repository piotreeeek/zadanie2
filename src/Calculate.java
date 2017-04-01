/**
 * Created by Piotrek on 2017-04-01.
 */
public class Calculate {
    public static double getResult (double a, double b){

        if (b == 0) throw new ArithmeticException();
        if (a/b <0) throw new NegativeDomainException();

        return Math.sqrt(a/b);
    }
}
