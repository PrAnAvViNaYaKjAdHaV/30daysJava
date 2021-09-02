package DataTypes;

public class datatypes {
    public static void main(String[] args) {
        
    // data types = 1) primitive Data types
    //              2) non-primitive Data types
    
    // primitive Data types - boolean , char , float ,int , byte, short , long , double .
    // non- primitive Data types - String , Array , etc.
    
    int x ; // Declaration of x variable. size = 4 bytes. minimum = - 2,147,483,648 and Maximum = 2,147,483,647
    x=5; // initialization of x variable.
    System.out.println(x); // print variable x.
    
    boolean l = false; // size = 1 bit.
    System.out.println(l);
                     
    byte a = 10; // size = 1 byte , Minimum = -128 and Maximum 127
    System.out.println(a+" This is byte");
    
    short b = 10; // size = 2 byte , Minimum = -32,768 and Maximum = 32,767.
    System.out.println(b+" this is short");

    long v = 100000L; // size = 8 bytes , Minimum = - 9,223,372,036,854,775,808 , Maximum = 9,223,372,036,854,775,807
    System.out.println(v+" This is long");

    float f1 = 243.5f; // size = 4 byte
    System.out.println(f1+" This is float");

    double d1 = 12.9;// size = 8 bytes.
    System.out.println(d1+" This is double");

     char letter = 'A'; // size =  .
     System.out.println(letter+" This is Char");


     
    }
}
