import java.math.BigDecimal;
import java.util.Scanner;

/**
 * scannerex
 */
public class scannerex {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String x =  sc.nextLine();
    System.out.println(x);

    System.out.println("Enter INt number");
    int c = sc.nextInt();
    System.out.println(c);

    System.out.println("Enter Bigdecimal");
    BigDecimal money = sc.nextBigDecimal();
     System.out.println(money);

    System.out.println("Enter Boolean Value like true or false");
    boolean f =   sc.nextBoolean();
    System.out.println(f);

    System.out.println("Enter Double value (conver to Int) :");
    int d = (int) sc.nextDouble();
    System.out.println(d);
    
    sc.close();
  }
}