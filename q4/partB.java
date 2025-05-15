public boolean clearPair(int row, int col){
  int num = puzzle[row][col];
  for(int i = i; i < puzzle.length; i++){
    for(int j = 0; j < puzzle[0].length; j++){
      if (rows != row && cols != col){
        if((num == puzzle[i][j]) || ((puzzle[i][j] + num) == 10){
          return true;
        }
      }
    }
  }
  return false;
}
