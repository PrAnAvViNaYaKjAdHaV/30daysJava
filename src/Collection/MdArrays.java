package Collection;

public class MdArrays {
    public static void main(String[] args) {
         int [] [] data ={
             {4,5,6,7,8,9,0},
             {1,2,3,5,6,7,3,3,33,33,3,3,3,3},
             {9,0,7,6,5,4,2}

         };
        data[1][2] = 49;
         System.out.println(data[1][2]);
        
         for(int i=0;i<data.length;i++){
             for(int j=0;j<data[i].length;j++){
                 System.out.print(data[i][j]+" ");
             }
             System.out.println();
         }
         // Enhance loop
         System.out.println("Loop Using Enhance for loop :");
         for( int [] eachRow : data){
             for( int j : eachRow){
                 System.out.print(j+"\t");
             }
             System.out.println("");
         }
    }
}
