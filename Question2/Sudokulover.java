package Question2;

public class Sudokulover {
    public void solveSudoku(char[][] board){
        if(board == null || board.length == 0){
            return
        }

        solve(board);
    }

    private boolean solve(char[][] board){
        for(int row = 0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col] == '.'){
                    for(char c = '1';c<='9';c++){
                        if(isValid(board, row, col, c)){
                            board[row][col] = c;

                            if(solve(board)){
                                return true;
                            }
                            board[row][col] = '.';
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char num){
        for(int i=0;i<9;i++){
            if(board[row][i] == num || board[i][col] == num){
                return false;
            }
        }

        int startrow = 3*(row/3);
        int startcol = 3*(row/3);
    }
}
