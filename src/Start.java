import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Piotrek on 2017-03-30.
 */
public class Start {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Insert a");
            double a = in.nextDouble();
            System.out.println("insert b");
            double b = in.nextDouble();

            System.out.println("Result of calculating: " + Calculate.getResult(a,b));
        }
        catch (InputMismatchException e) {
            System.out.println("You enter invalid character!! Application accepts only numbers.");
        }
        catch (ArithmeticException e) {
            System.out.println("b equals 0 and this is illegal for this operation");
        }
        catch (NegativeDomainException e) {
            System.out.println("The base of the fraction is negative");
        }


    }
}