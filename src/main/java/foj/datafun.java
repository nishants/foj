package foj;

public class datafun {

  public static boolean iF(Object bool){
    return bool.equals(new Boolean(true));
  }
  public static boolean not(Object value){
    return !iF(value);
  }
}
