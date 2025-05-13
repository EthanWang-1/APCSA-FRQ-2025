public int dogWalkShift(int startHour, int endHour){
  int sum = 0;
  for( int i = startHour; i <= endHour; i++){
    if((walkDogs(i) == maxDogs) || ( i >= 9 && i <= 17 )){
      sum += (maxDogs*3)+3;
  } else {
      sum += (maxDogs*3);
  }
  return sum;
}
