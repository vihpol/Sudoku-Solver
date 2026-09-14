import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class sudoku {

    public int[][] readFromTxt() {
        int[][] puzzle = new int[9][9];

        try (BufferedReader br = new BufferedReader(new FileReader("sudoku.txt"))) {
            
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String stripped = line.replace(" ", "");
                
                int number = 0;
                
                for (int i = 0; i < stripped.length(); i++ ) {
                    number = Integer.parseInt(String.valueOf(stripped.charAt(i)));
                    puzzle[count][i] = number;
                    
                }
                count++;
                
               
            }

            
        } catch (IOException e) {
            System.out.println("Error Reading File");
           
        }
        return puzzle;

    }

    public void printPuzzle(int[][] puzzle) {
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                System.out.print(puzzle[i][j] + " ");
            }
            System.out.println();
        }

    }




}