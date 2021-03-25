package RecursionWithBacktracking;
import java.util.*;


public class FloodFill {
    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        int noOfRows = scr.nextInt();
        int noOfCols = scr.nextInt();
        int matrix [][]= new int[noOfRows][noOfCols];
        for (int i=0;i<noOfRows;i++) {
            for (int j=0;j<noOfCols;j++) {
               matrix[i][j]= scr.nextInt();
            }
        }
        boolean visitedCells [][]= new boolean[noOfRows][noOfCols];

        floodFill(matrix,0,0,"",visitedCells);

    }
    public static void floodFill(int [][] maze,int row , int col,String path, boolean [] []visitedCells ){
        if(row<0|| col<0||row==maze.length || col ==maze[0].length|| maze[row][col]==1 || visitedCells[row][col]== true){
            return;
        }
        if(row == maze.length-1 && col == maze.length-1){
            System.out.println(path);
            return;
        }
        visitedCells[row][col]= true;

        floodFill(maze,row+1,col,path+"r",visitedCells);
        floodFill(maze,row,col+1,path+"d",visitedCells);
        floodFill(maze,row-1,col,path+"l",visitedCells);
        floodFill(maze,row, col-1,path+"t",visitedCells);
        visitedCells[row][col]= false;
        //Setting false is necessary as to explore more paths from same cells.As floodfill is recursive call at each call stack we put it to false
    }
}
