import java.util.LinkedList;



/**
 * MazeSolver
 */
public class MazeSolver {
    static int [] [] maze = {
        {2,0,1,1},
        {1,1,0,1},
        {0,1,1,1}
    };
    //0 = wall 
    //1 = path
    // 3 = destination
   static LinkedList<Position1> path = new LinkedList<Position1>();
 public static void main(String[] args) {
         Position1 p = new Position1(3, 0);
         path.push(p);
         maze[path.peek().y][path.peek().x]=0;

 }

    
}