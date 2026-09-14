System.out.println(choices);
        
        if (column < 4) {
            Solve(row, column + 1, board);
        }