public class SignedText{
  private String first;
  private String last;

  public SignedText( String x, String y){
    first = x;
    last = y;
  }

  public String getSignature{
    if(first.length()==0){
      return last;
    } else {
      return first.substring(0,1) + "-" +last;
    }
  }

  public String addSignature(String str){
    if(getSignature().equal(str.substring(0,getSignature().length()))){
      return str.substring(getSignature()-1);
    } else if( str.indexOf(getSignature()) != -1){
      return str + getSignature();
    } else {
      return str;
    }
  }
}

