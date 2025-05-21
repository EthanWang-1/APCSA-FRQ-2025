public ArrayList<Match> buildMatches(){
  ArrayList<Match> result = new ArrayList<Match>();
  int size = competitorList.size();
  if(size%2 == 0){
    for(int i = 0; i < size/2; i++){
      result.add(competitorList.get(i), competitorList.get(i + (size/2));
  } else {
     for(int i = 1; i < size/2; i++){
       result.add(competitorList.get(i), competitorList.get(i + (size/2));
      }
  }
  return result;
}
