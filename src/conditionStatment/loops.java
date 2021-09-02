package conditionStatment;

public class loops {
    

    public static void main(String[] args) {
        // for loop
        for(int i=0;i<10;i++){
            System.out.println(i+" index and value");
        }
        // while loop
        System.out.println("while loop ");
        int i=0;
        while (i<10) {
            System.out.println(i+" index and value");
            i++;
        }
        System.out.println("while do");
        int j=0;
        do {
            System.out.println(j+" index and value");
            j++;
        } while (false);
            
    
    }
}
