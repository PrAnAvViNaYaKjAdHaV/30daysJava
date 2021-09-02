package conditionStatment;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("Enter your name ");
        Scanner in = new Scanner(System.in);
         String name = in.nextLine();
        in.close();
         if(name.equals("pranav")){
             System.out.println("You are good to go!");
         }else if(name.equals("vinayak")){
             System.out.println("You are good to go!");
         }else{
             System.out.println("You are not allow here 🤬");
         }
    }
}
