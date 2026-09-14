 public static void main(String[] args) {
        sudoku board = new sudoku();
        
        
       int[][] beforeMaze =  new int [9][9];
        beforeMaze = board.readFromTxt();
        
        // System.out.println(beforeMaze[1][3]);
       
        sudokusolver solver = new sudokusolver();
        // boolean valid = solver.isValid(7,4,6,beforeMaze);
         solver.Solve(beforeMaze);
        // System.out.println()''
        
        for (int i = 0; i < beforeMaze.length; i++) {
            for (int j = 0; j < beforeMaze[i].length; j++) {
                System.out.print(beforeMaze[i][j] + " ");
            }
            System.out.println();
        }

    }