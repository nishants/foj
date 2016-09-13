package foj;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class datafun {

  public static boolean exists(Object[] array){
    return exists(array.length);
  }
  public static boolean exists(Object bool){
    return bool.equals(new Boolean(true));
  }
  public static boolean not(Object value){
    return !exists(value);
  }

  public static <E> E create(Object...params){
  // scan class E to find a suitable constructor
  // invoke constructor and return object
   return (E)null;
  }

  public static File newFile(Object...params){
    Object fileName = params[0];
    //support both \ and / for path separator
    return null;
  }
  public static byte[] read(File file){
    return null;
  }
  public static byte[] read(Object...params){
    //facade for file or any other Readable object
    return null;
  }


  public static boolean _is_int(String value){
    return value.matches("^\\d+$");
  }

  public static Object _resolve(Object value){
    if(value instanceof String){
      String string = value.toString();
      if(_is_int(string)){
        return new Integer(value.toString());
      }
      return string.replaceAll("^'", "").replaceAll("'$", "").trim();
    }
    return value;
  }
  public static Map hash(String...keyValue){
    HashMap map = new HashMap();
    for(String entry : keyValue){
      String[] token = entry.split("\\:");
      if(token.length > 1){
        map.put(token[0].trim(), _resolve(token[1].trim()));
      }
//      Object o = exists(token) ? map.put(token[0], token[1]) : "";
    }
    return map;
  }

}
