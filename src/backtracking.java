import java.util.ArrayList;

public class backtracking {

    public boolean isValid (int row, int column, int value, int[][] board) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != 0) {
                nums.add(board[row][i]);
            }
            if (board[i][column] != 0) {
                nums.add(board[i][column]);
            }
        }
        
        int startIndex = (row / 3) * 3;
        int startColumn = (column / 3) * 3;

        for(int i = startIndex; i < (startIndex + 3) ; i++) {
            for (int j = startColumn; j < (startColumn + 3) ; j++ ) {
                if (board[i][j] != 0)
                {
                    nums.add(board[i][j]);
                }
            }
        }

        nums.sort(null);
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == value) {
                return false;

            }
        }
         
        return true;



    }
    public boolean isOpen(int row, int column, int[][] board) {
       return (board[row][column] == 0);
    }


    public boolean Solve(int[][] board) {
        
        ArrayList<Integer> choices = new ArrayList<Integer>();

        //base case
        int row = -1;
        int column = -1;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    column = j;
                    break;
                }
                
            }

            if (row != -1) {
                break;
            }
           
            
        }

        if (row == -1 && column == -1) {
            return true;
        }
       
        for(int i = 1; i < 10; i++) {      
            if (isOpen(row, column, board)) {
                if (isValid(row, column, i, board)) {
                    choices.add(i);
                }
           
            } 
        }

        if (choices.size() == 0) {
            return false;
        }
     
        System.out.println(row);
        System.out.println(column);

        for (int choice: choices) {
            board[row][column] = choice;
            if (Solve(board)) {
                return true;
            }
            board[row][column] = 0;

            
        }
       
        System.out.println(choices);
        
       
       
    return false;


    }


    
}
