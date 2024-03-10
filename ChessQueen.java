public class ChessQueen {
  public static void NQueens(char board[][] , int row){
    if(row==board.length){
      printBoard(board);
      return;
    }
    //column range
    for(int j = 0; j<board.length; j++){
      board[row][j]='Q';
      NQueens(board, row+1); //function call
      board[row][j] = 'x';
    }
  }
    public static void printBoard(char board[][]){
      System.out.println("-------chessboard--------");
      for(int i = 0; i<board.length; i++){
        for(int j = 0; j<board[i].length; j++){
          System.out.print(board[i][j] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
    public static void main(String args[]) {
      int n=2;
      char board[][] = new char[n][n];
      for(int i = 0; i<n; i++){
        for(int j = 0; j<n; j++){
          board[i][j] ='x';
        }
      }
      NQueens(board,0);
    }
}

  
  

