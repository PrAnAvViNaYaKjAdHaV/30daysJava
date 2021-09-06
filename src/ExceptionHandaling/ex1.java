 package ExceptionHandaling;

public class ex1 {
    public static void main(String[] args) {
      
        try {
            int a = 5;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage()+" You cant divide number with 0");
        }
        System.out.println("Code is not brake now");
    }
}
