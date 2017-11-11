char [][] board = {
  {'W', 'B','W','B','W', 'B','W','B'},  
  {'B','W', 'B','W','B','W', 'B','W'},
  {'W', 'B','W','B','W', 'B','W','B'},  
  {'B','W', 'B','W','B','W', 'B','W'},
  {'W', 'B','W','B','W', 'B','W','B'},  
  {'B','W', 'B','W','B','W', 'B','W'},
  {'W', 'B','W','B','W', 'B','W','B'},  
  {'B','W', 'B','W','B','W', 'B','W'}
};

void setup(){

  // size fix 
  size(200,200);
  
  // for every row in the double array
  for(byte row = 0; row < board.length; row++){
    for(byte squareInRow = 0; squareInRow < board[row].length; squareInRow++){
      // print square colour  
      print(board[row][squareInRow] + " ");
    }
    // print newline
    println();
  }
}
