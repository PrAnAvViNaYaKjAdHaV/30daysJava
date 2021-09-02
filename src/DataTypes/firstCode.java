package DataTypes;

public class firstCode {
    public static void main(String[] args) {
        System.out.println("hellow world");
        int a = 4;
        int b = 5;
        var x = new firstCode();
        x.swap(a, b);
        int c = 0;
         System.out.println(++c);
         boolean ans = false;
        ans = !ans;
         System.out.println(ans);
       
    }
     void swap (int a ,int b){
        int tem = a;
        a = b;
        b = tem;
        System.out.println("a value: "+a+" b value :"+b);
    }
}
// comment 
// primitive types
// objects = instance of a class (Class the data type)
// statically typed = variable are given data types up front 
// dynamicaly typed   = variables do not have types
// litertals - the value
// variable
// class - contains everythig- has members
// methods - do something
// properties - store something

// access modifier(public)-Who can use?
// static - no instance of class is needed
// object - instance of class
