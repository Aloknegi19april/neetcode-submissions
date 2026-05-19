class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rows = new HashSet<>();
        for(int i = 0; i < 9; i++){
            rows = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                if(rows.contains(board[i][j])){
                    return false;
                } else rows.add(board[i][j]);
            }
        }

        for(int i = 0; i < 9; i++){
            rows = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[j][i] == '.') continue;
                if(rows.contains(board[j][i])){
                    return false;
                } else rows.add(board[j][i]);
            }
        }

        for(int i = 0; i < 9; i++){
            rows = new HashSet<>();
            int row = (i/3)*3;
            int col = (i%3)*3;
            for(int j = row; j < row + 3; j++){
                for(int k = col; k < col + 3; k++){
                    if(board[j][k] == '.') continue;
                    if(rows.contains(board[j][k])){
                        return false;
                    } else rows.add(board[j][k]);
                }
            }
        }
        return true;
    }
}
