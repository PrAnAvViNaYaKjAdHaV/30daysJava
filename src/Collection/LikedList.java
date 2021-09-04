package Collection;

import java.util.LinkedList;
import java.util.*;
public class LikedList {
      public static void main(String[] args) {
        //   stack implimentation on linked list
        LinkedList<Integer> Stack = new LinkedList<>();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.push(5);
        Stack.add(2, 6);
        ListIterator <Integer> is = Stack.listIterator();
        is.next();
        is.next();
        is.next();
        is.next();
        is.next();
        is.next();

        is.add(6);
        Iterator <Integer>it = Stack.iterator();
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());

          // while (it.hasNext()){
          //   System.out.println(it.next());
          // }
          for(Integer s : Stack){
               System.out.println(s);
          }

          




        // System.out.println(Stack.pop());
        // System.out.println(Stack.pop());
        // System.out.println(Stack.removeFirst());
        // System.out.println(Stack.remove());
        // System.out.println(Stack.remove());
       
      }
}
