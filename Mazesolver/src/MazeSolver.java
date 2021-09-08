import java.util.LinkedList;





/**
 * MazeSolver
 */
public class MazeSolver {
    static int [] [] maze = {
        {2,0,1,1},
        {1,0,1,1},
        {1,0,0,1}
    };
    //0 = wall 
    //1 = path
    // 3 = destination
   static LinkedList<Position1> path = new LinkedList<Position1>();
 public static void main(String[] args) {
         Position1 p = new Position1(0, 3);
         path.push(p);
        
         while (true) {
            int y = path.peek().y;
            int x = path.peek().x;
            maze[y][x]=0;
             //down
           if(isValid(y+1, x)){
            if(maze[y+1][x]==2){
                System.out.println("move down.Yes you find it");
                return;
            }
            else if(maze[y+1][x]==1){
                System.out.println("move down");
                path.push(new Position1(y+1,x));
                      continue;
            }
           }
             // left
        if(isValid(y, x-1)){
            if(maze[y][x-1]==2){
                System.out.println("move left.Yes you find it");
                return;
            }
            else if(maze[y][x-1]==1){
                System.out.println("move left");
                path.push(new Position1(y,x-1));
                      continue;
            }
        }
             // right
           
            if(isValid(y, x+1)){
                if(maze[y][x+1]==2){
                    System.out.println(" move right.Yes you find it");
                    return;
                }
                else if(maze[y][x+1]==1){
                    System.out.println("move right");
                    path.push(new Position1(y,x+1));
                          continue;
                }
            }
            // up
           if(isValid(y-1, x)){
            if(maze[y-1][x]==2){
                System.out.println("move up.Yes you find it");
                return;
            }
            else if(maze[y-1][x]==1){
                System.out.println("move up");
                path.push(new Position1(y-1,x));
                      continue;
            }
           }


         path.pop();
              System.out.println("move back");
             if(path.size()<=0){
                 System.out.println("No path");
                 break;
             }
         }
         
         
         

 }
 
  public static boolean isValid(int y ,int x){
      if(y<0 || y>=maze.length || x<0 || x >=maze[y].length){
          return false;
      }
    return true;
  }
    
}