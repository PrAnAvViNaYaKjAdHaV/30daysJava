package Collection;
import java.util.*;


/**
 * list
 */
public class list {
     Collection<String> l;
    public static void main(String[] args) {
       List<Integer> x = new ArrayList<>();
       x.add(1);
       x.add(2);
       x.add(3);
       list p = new list();
        p.l=new ArrayList <String>();
        LinkedList<String> que = new LinkedList<>();
        que.add("pranav");
        que.add("parag");
        que.add("manthan");
        que.add("rohit");
        que.add("mohit");
        que.add("anesh");
        que.add("aniket");
        //que 
       System.out.println(que.remove());
       System.out.println(que.remove());
       System.out.println(que.remove());
       System.out.println(que.remove());
       System.out.println(que.remove());
       System.out.println(que.remove());
       System.out.println(que.remove());

       //stacks
       System.out.println(que.removeLast());
       System.out.println(que.removeLast());
       System.out.println(que.removeLast());
       System.out.println(que.removeLast());
       System.out.println(que.removeLast());
       System.out.println(que.removeLast());
       System.out.println(que.removeLast());


    }
}