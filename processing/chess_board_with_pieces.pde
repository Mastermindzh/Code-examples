static String WHITE = "White";
static String BLACK = "Black";
static String PAWN = "Pawn";
static String SEPARATOR = " | ";

String [][][] board = {
  { {WHITE, "Rook"}, {BLACK, "Knight"}, {WHITE, "Bishop"}, {BLACK, "Queen"}, {WHITE, "King"}, {BLACK, "Bishop"}, {WHITE, "Knight"}, {BLACK, "Rook"} },
  { {BLACK, PAWN}, {WHITE, PAWN}, {BLACK, "Bishop"}, {WHITE, PAWN}, {BLACK, PAWN}, {WHITE, PAWN}, {BLACK, PAWN}, {WHITE, PAWN} },
  
  { {WHITE, null}, {BLACK, null}, {WHITE, null}, {BLACK, null}, {WHITE, null}, {BLACK, null}, {WHITE, null}, {BLACK, null} },
  { {BLACK, null}, {WHITE, null}, {BLACK, null}, {WHITE, null}, {BLACK, null}, {WHITE, null}, {BLACK, null}, {WHITE, null} },
  { {WHITE, null}, {BLACK, null}, {WHITE, null}, {BLACK, null}, {WHITE, null}, {BLACK, null}, {WHITE, null}, {BLACK, null} },
  { {BLACK, null}, {WHITE, null}, {BLACK, null}, {WHITE, null}, {BLACK, null}, {WHITE, null}, {BLACK, null}, {WHITE, null} },
  
  { {WHITE, PAWN}, {BLACK, PAWN}, {WHITE, "Bishop"}, {BLACK, PAWN}, {WHITE, PAWN}, {BLACK, PAWN}, {WHITE, PAWN}, {BLACK, PAWN} },
  { {BLACK, "Rook"}, {WHITE, "Knight"}, {BLACK, "Bishop"}, {WHITE, "Queen"}, {BLACK, "King"}, {WHITE, "Bishop"}, {BLACK, "Knight"}, {WHITE, "Rook"} },
};

void setup(){

  // size fix 
  size(200,200);
  
  // for every row in the double array
  for(byte row = 0; row < board.length; row++){
    for(byte squareInRow = 0; squareInRow < board[row].length; squareInRow++){
      // print square colour  
      print(board[row][squareInRow][0]);
      // print separator
      print(" - ");
      // print piece
      if(board[row][squareInRow][1] != null){
        print(board[row][squareInRow][1] + SEPARATOR);
      }else{
        print("Empty" + SEPARATOR);
      }
    }
    // print newline
    println();
  }
}
