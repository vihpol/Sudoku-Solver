public class solve {
    public static void main(String[] args) {
        sudoku board = new sudoku();
        
        
       int[][] beforeMaze =  new int [9][9];
        beforeMaze = board.readFromTxt();
        
       
        backtracking solver = new backtracking();
        
        solver.Solve(beforeMaze);
        
        
        for (int i = 0; i < beforeMaze.length; i++) {
            for (int j = 0; j < beforeMaze[i].length; j++) {
                System.out.print(beforeMaze[i][j] + " ");
            }
            System.out.println();
        }

    }

}
